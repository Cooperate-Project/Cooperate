package de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer;

import java.util.Collection;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

/**
 * Base class for {@link IAtomicDerivedStateProcessor} implementations.
 * 
 * This class allows client implementations to handle calculation requests for elements in a type-safe way. The default
 * implementations of {@link IAtomicDerivedStateProcessor#getReplacements()} and
 * {@link IAtomicDerivedStateProcessor#getRequirements()} return empty collections.
 * 
 * @param <T>
 *            The type of the supported element.
 */
public abstract class AtomicDerivedStateProcessorBase<T extends EObject> implements IAtomicDerivedStateProcessor<T> {

    private static final Logger LOGGER = Logger.getLogger(AtomicDerivedStateProcessorBase.class);
    private final Class<T> clazz;

    /**
     * Instantiates the processor.
     * 
     * @param clazz
     *            The type that can be handled by the processor.
     */
    public AtomicDerivedStateProcessorBase(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void accept(EObject object) {
        if (clazz.isInstance(object)) {
            applyTyped((T) object);
            return;
        }
        if (object != null) {
            LOGGER.error(String.format("An element compatible to %s was expected but got %s", clazz.getSimpleName(),
                    object.getClass().getSimpleName()));
        }
    }

    protected abstract void applyTyped(T object);

    @Override
    public Class<T> getType() {
        return clazz;
    }

    @Override
    public Collection<Class<? extends EObject>> getRequirements() {
        return Collections.emptyList();
    }

    @Override
    public Collection<Class<? extends EObject>> getReplacements() {
        return Collections.emptyList();
    }

}
