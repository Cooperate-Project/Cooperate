package de.cooperateproject.modeling.transformation.transformations.tests.transforms.plain;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.utils.EMFComparePrettyPrinter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.util.Trace;

import de.cooperateproject.modeling.transformation.transformations.tests.util.ModelComparator;


public abstract class PlainTransformationTestBase extends TransformationTestBase {

	private static final URI UML_PRIMITIVE_TYPES = URI.createURI("pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml");
	
	protected ModelExtent runTransformation(URI transformationURI, URI sourceModelURI, URI umlModelURI) throws IOException {
		return runTransformation(transformationURI, sourceModelURI, umlModelURI, new BasicModelExtent(), new Trace(Collections.emptyList()));
	}
	
	protected ModelExtent runTransformation(URI transformationURI, URI sourceModelURI, URI umlModelURI, Trace traceModel) throws IOException {
		return runTransformation(transformationURI, sourceModelURI, umlModelURI, new BasicModelExtent(), traceModel);
	}
	
	protected ModelExtent runTransformation(URI transformationURI, URI sourceModelURI, URI umlModelURI, ModelExtent destination, Trace traceModel) throws IOException {
		ModelExtent source = createModelExtent(createResource(getResourceSet(), sourceModelURI));
		ModelExtent uml = createModelExtent(createResource(getResourceSet(), umlModelURI));
		return runTransformation(transformationURI, source, uml, destination, traceModel);
	}
	
	protected ModelExtent runTransformation(URI transformationURI, ModelExtent sourceModel, ModelExtent umlModel, ModelExtent destination, Trace traceModel) throws IOException {
		ModelExtent umlPrimitives = createModelExtent(createResource(getResourceSet(), UML_PRIMITIVE_TYPES));
		Collection<ModelExtent> transformationParameters = Arrays.asList(sourceModel, destination, umlModel, umlPrimitives);
		
		runTransformation(transformationURI, transformationParameters, traceModel);

		URI virtualResultModelURI = umlModel.getContents().get(0).eResource().getURI().trimFileExtension().trimFragment().trimQuery().trimSegments(1).appendSegment("resultModel").appendFileExtension("xmi");
		Resource resultResource = createResource(getResourceSet(), virtualResultModelURI);
		resultResource.getContents().addAll(destination.getContents());
		
		return destination;
	}
	
	protected EObject getRootElement(URI modelUri) throws IOException {
		Resource r = createResource(getResourceSet(), modelUri);
		return r.getContents().get(0);
	}
	
	protected void assertModelEquals(EObject expected, EObject actual) throws UnsupportedEncodingException {
		assertModelEquals(expected, actual, (c -> Collections.emptyList()));
	}
	
	protected static void assertModelEqualsStrict(EObject expected, EObject actual) throws UnsupportedEncodingException {
		Comparison result = ModelComparator.compareStrict(expected, actual);
		assertComparison(result);
	}
	
	protected static void assertModelEquals(EObject expected, EObject actual,
			Function<Collection<Diff>, Collection<Diff>> diffProcessor) throws UnsupportedEncodingException {
		Comparison result = ModelComparator.compare(expected, actual);
		Collection<Diff> ignoredDiffs = diffProcessor.apply(result.getDifferences());
		ignoredDiffs.stream().forEach(PlainTransformationTestBase::removeDifference);
		assertComparison(result);
	}
	
	private static void assertComparison(Comparison comparisionResult) throws UnsupportedEncodingException {
		assertTrue(prettyPrint(comparisionResult), comparisionResult.getDifferences().isEmpty());
	}
	
	// Utility methods
	

	
	public static URI createTemporaryModelURI() throws IOException {
		File tmpFile = File.createTempFile(PlainTransformationTestBase.class.getSimpleName(), ".xmi");
		tmpFile.deleteOnExit();
		return URI.createFileURI(tmpFile.getAbsolutePath());
	}
	
	public static boolean isPluginEnvironment() {
		return ResourcesPlugin.getPlugin() != null;
	}
	
	protected static String prettyPrint(Comparison comparison) throws UnsupportedEncodingException {
		ByteArrayOutputStream baos = null;
		PrintStream ps = null;
		try {
			baos = new ByteArrayOutputStream();
			ps = new PrintStream(baos);
			EMFComparePrettyPrinter.printDifferences(comparison, ps);
			return new String(baos.toByteArray(), "UTF-8");
		} finally {
			IOUtils.closeQuietly(ps);
			IOUtils.closeQuietly(baos);
		}
	}
	

	
	protected static Resource createResource(ResourceSet resourceSet, URI modelUri) throws IOException {
		Resource resource = resourceSet.getResource(modelUri, false);
		if (resource == null) {
			resource = resourceSet.createResource(modelUri);
		}
		if (resourceSet.getURIConverter().exists(modelUri, Collections.emptyMap())) {
			resource.load(Collections.emptyMap());			
		}
		return resource;
	}
	
	private static ModelExtent createModelExtent(Resource r) {
		return new BasicModelExtent(r.getContents());
	}
	
	private static void removeDifference(Diff difference) {
		difference.getMatch().getDifferences().remove(difference);
	}
	
	protected ModelExtent createModelExtent(URI resourceURI) throws IOException {
		Resource r = createResource(getResourceSet(), resourceURI);
		return createModelExtent(r);
	}
}
