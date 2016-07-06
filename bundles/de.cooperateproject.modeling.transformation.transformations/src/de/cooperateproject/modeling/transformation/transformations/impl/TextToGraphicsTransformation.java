package de.cooperateproject.modeling.transformation.transformations.impl;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.qvt.oml.ModelExtent;

import de.cooperateproject.modeling.transformation.transformations.registry.ConcreteSyntaxTypes;
import de.cooperateproject.modeling.transformation.transformations.registry.DiagramTypes;
import de.cooperateproject.modeling.transformation.transformations.registry.TransformationCharacteristic;

public class TextToGraphicsTransformation extends TransformationBase {

	private static final String NOTATION_MODEL_FILE_EXTENSION = "notation";
	
	public TextToGraphicsTransformation(DiagramTypes diagramType, String textualFileExtension, String fileExtension, ResourceSet rs, URI source, URI target) {
		super(createCharacteristics(diagramType), textualFileExtension, rs, source, target);
	}

	@Override
	protected void saveTransformationResources(List<Pair<ModelExtent, Resource>> transformationResources)
			throws IOException {
		List<Pair<ModelExtent, Resource>> textualDiagramResources = transformationResources.stream().filter(r -> NOTATION_MODEL_FILE_EXTENSION.equals(r.getSecond().getURI().fileExtension())).collect(Collectors.toList());
		save(textualDiagramResources);
	}

	@Override
	protected URI getGraphicalModelURI(URI from, URI to) {
		return to;
	}

	private static TransformationCharacteristic createCharacteristics(DiagramTypes diagramType) {
		return new TransformationCharacteristic(diagramType, ConcreteSyntaxTypes.TEXTUAL,
				ConcreteSyntaxTypes.GRAPHICAL);
	}
}