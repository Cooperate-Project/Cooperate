package de.cooperateproject.ui.editors.launcher.extensions;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.Optional;

import org.apache.commons.lang3.Validate;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;

import com.google.common.collect.Iterables;

import de.cooperateproject.cdo.util.connection.CDOConnectionManager;
import de.cooperateproject.ui.constants.UIConstants;
import de.cooperateproject.ui.editors.launcher.DisposedListener;
import de.cooperateproject.ui.editors.launcher.extensions.TransformationManager.TransformationException;
import de.cooperateproject.ui.launchermodel.Launcher.ConcreteSyntaxModel;
import de.cooperateproject.ui.launchermodel.Launcher.Diagram;
import de.cooperateproject.ui.util.ConversionUtils;

public abstract class EditorLauncher implements IEditorLauncher {
	
	private static final Logger LOGGER = Logger.getLogger(EditorLauncher.class);
	private final CDOCheckout cdoCheckout;
	private final CDOView cdoView;
	private final ConcreteSyntaxModel concreteSyntaxModel;
	private final IFile launcherFile;
	private final TransformationManager transformationManager;
	private DisposedListener disposeListener;
	
	public EditorLauncher(IFile launcherFile, EditorType editorType) throws IOException, ConcreteSyntaxTypeNotAvailableException {
		cdoCheckout = CDOConnectionManager.getInstance().createCDOCheckout(launcherFile.getProject(), true);
		cdoCheckout.open();
		cdoView = cdoCheckout.openView(true);
		this.launcherFile = launcherFile;
		Diagram launcherModel = loadDiagram(cdoView, launcherFile);
		concreteSyntaxModel = selectConcreteSyntaxModel(launcherModel, editorType);
		transformationManager = new TransformationManager(cdoCheckout);
	}
	
	@Override
	public IEditorPart openEditor() throws PartInitException {
		IEditorPart newEditorPart = doOpenEditor();
		registerListener(newEditorPart);			
		return newEditorPart;
	}

	protected abstract IEditorPart doOpenEditor() throws PartInitException;
	
	protected CDOView getCDOView() {
		return cdoView;
	}
	
	protected ConcreteSyntaxModel getConcreteSyntaxModel() {
		return concreteSyntaxModel;
	}
	
	protected IFile getLauncherFile() {
		return launcherFile;
	}
	
	protected void registerListener(IEditorPart editorPart) {
		Validate.notNull(editorPart);
		
		disposeListener = createDisposeListener(editorPart);
		editorPart.getSite().getPage().addPartListener(disposeListener);
	}
	
	protected DisposedListener createDisposeListener(IEditorPart editorPart) {
		return new DisposedListener(editorPart, this::editorClosed);
	}
	
	protected void editorClosed(IWorkbenchPage p) {
		Validate.notNull(p);
		
		p.removePartListener(disposeListener);
		cdoCheckout.close();
		CDOConnectionManager.getInstance().deleteCDOCheckout(cdoCheckout);
	}
	
	protected void handleEditorSave(IEditorPart editorPart) {
		Validate.notNull(editorPart);
		
		try {
			transformationManager.handleEditorSave(editorPart.getEditorInput());
		} catch (TransformationException e) {
			// TODO inform user
			LOGGER.error("Failed to handle editor save event.", e);
		}
	}
	
	private static Diagram loadDiagram(CDOView cdoView, IFile launcherFile) throws IOException {
		Validate.notNull(cdoView);
		Validate.notNull(launcherFile);
		
		ResourceSet rs = cdoView.getResourceSet();
		URI fileUri = URI.createPlatformResourceURI(launcherFile.getFullPath().toString(), true);
		Resource r = rs.createResource(fileUri, UIConstants.LAUNCHER_EXTENSION);
		r.load(Collections.emptyMap());
		EObject rootObject = r.getContents().get(0);
		if (!(rootObject instanceof Diagram)) {
			throw new IllegalArgumentException("");
		}
		return (Diagram) rootObject;
	}
	
	protected static ConcreteSyntaxModel selectConcreteSyntaxModel(Diagram launcherModel,
			EditorType editorType) throws ConcreteSyntaxTypeNotAvailableException {
		Validate.notNull(launcherModel);
		Validate.notNull(editorType);
		
		Optional<ConcreteSyntaxModel> model = ConversionUtils.convert(Iterables.tryFind(launcherModel.getConcreteSyntaxModels(), m -> editorType.getSupportedSyntaxModels()
				.stream().anyMatch(t -> t.isAssignableFrom(m.getClass()))));
		
		if (!model.isPresent()) {
			throw new ConcreteSyntaxTypeNotAvailableException(
					"The concrete syntax type " + editorType + " is not available.");
		}
		
		return model.get();
	}
	
	protected static LauncherModelWrapper loadLauncherModelReadOnly(IFile launcherFile) throws IOException {
		return new LauncherModelWrapper(launcherFile);
	}
	
	protected static class LauncherModelWrapper implements Closeable {

		private final CDOView cdoView;
		private final Diagram launcherDiagram;
		
		public LauncherModelWrapper(IFile launcherFile) throws IOException {
			cdoView = openCDOView(launcherFile.getProject());
			try {
				launcherDiagram = loadDiagram(cdoView, launcherFile);
			} catch (Exception e) {
				closeCDOView(cdoView);
				throw e;
			}
		}
		
		public Diagram getDiagram() {
			return launcherDiagram;
		}
		
		@Override
		public void close() throws IOException {
			closeCDOView(cdoView);
		}
		
		private static CDOView openCDOView(IProject project) {
			CDOSession session = CDOConnectionManager.getInstance().acquireSession(project);
			try {
				return session.openView();
			} catch (Exception e) {
				CDOConnectionManager.getInstance().releaseSession(session);
				throw e;
			}
		}
		
		private static void closeCDOView(CDOView cdoView) {
			CDOSession session = cdoView.getSession();
			IOUtil.closeSilent(cdoView);
			CDOConnectionManager.getInstance().releaseSession(session);
		}
		

		
	}

}
