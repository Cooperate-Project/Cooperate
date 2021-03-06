package de.cooperateproject.modeling.transformation.engine.executor;

import java.io.IOException;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.cooperateproject.modeling.transformation.common.ITransformationExecutor;
import de.cooperateproject.modeling.transformation.common.ITransformationFactory;
import de.cooperateproject.modeling.transformation.common.ITransformationFactoryRegistry;
import de.cooperateproject.modeling.transformation.common.registry.Transformation;

/**
 * Executor for transformations that determines the available transformations via a registry.
 * 
 * The registry will be set via OSGI declarative services but can be set manually as well. This is, however, not
 * intended nor necessary.
 */
public class TransformationExecutor implements ITransformationExecutor {
    private ITransformationFactoryRegistry transformationFactoryRegistry;

    public synchronized void setTransformationFactoryRegistry(ITransformationFactoryRegistry registry) {
        this.transformationFactoryRegistry = registry;
    }

    /**
     * Removes the given registry from the executor.
     * 
     * @param registry
     *            The registry to be removed.
     */
    public synchronized void unsetTransformationFactoryRegistry(ITransformationFactoryRegistry registry) {
        if (this.transformationFactoryRegistry == registry) {
            this.transformationFactoryRegistry = null;
        }
    }

    public void transformChanged(URI changedResource, ResourceSet resourceSet) throws IOException {
        if (transformationFactoryRegistry == null) {
            throw new IllegalStateException(
                    "No TransformationFactoryRegistry registered. Please make sure that Eclipse DS is running.");
        }
        Collection<ITransformationFactory> transformationFactories = transformationFactoryRegistry
                .getTransformationFactories();
        Collection<Transformation> transformations = transformationFactories.stream()
                .map(f -> f.create(changedResource, resourceSet)).filter(Optional::isPresent).map(Optional::get)
                .collect(Collectors.toSet());
        URI traceBaseURI = changedResource.trimFragment().trimQuery().trimSegments(1);
        for (Transformation transformation : transformations) {
            transformation.transform(traceBaseURI);
        }
    }
}
