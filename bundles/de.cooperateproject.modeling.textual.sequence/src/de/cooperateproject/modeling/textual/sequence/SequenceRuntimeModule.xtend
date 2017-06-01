/*
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence

import com.google.inject.Binder
import com.google.inject.name.Names
import de.cooperateproject.modeling.textual.common.generator.CommonDerivedStateModuleExtension
import de.cooperateproject.modeling.textual.common.scoping.CooperateValueConverterBase
import de.cooperateproject.modeling.textual.common.services.BasicCooperateTransientValueService
import de.cooperateproject.modeling.textual.sequence.generator.SequenceDerivedStateComputer
import de.cooperateproject.modeling.textual.sequence.naming.SequenceDiagramQualifiedNameProvider
import de.cooperateproject.modeling.textual.sequence.scoping.SequenceDiagramImportedNamespaceAwareLocalScopeProvider
import de.cooperateproject.modeling.textual.xtext.runtime.cdotext.TextualStateCalculator
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateGlobalScopeProvider
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider
import net.winklerweb.cdoxtext.runtime.ICDOResourceStateCalculator
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class SequenceRuntimeModule extends AbstractSequenceRuntimeModule implements CommonDerivedStateModuleExtension {
    
    override bindITransientValueService() {
        BasicCooperateTransientValueService
    }
    
    def Class<? extends ICDOResourceStateCalculator> bindICDOResourceStateCalculator() {
        TextualStateCalculator;
    }
    
    def Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
        return SequenceDerivedStateComputer;
    }
    
    override Class<? extends XtextResource> bindXtextResource() {
        return DerivedStateAwareResource;
    }
    
    override bindIValueConverterService() {
        CooperateValueConverterBase
    }
    
    override bindIQualifiedNameProvider() {
        SequenceDiagramQualifiedNameProvider
    }
    
    def Class<? extends IGlobalScopeTypeQueryProvider> bindIGlobalScopeTypeQueryProvider() {
        return CooperateGlobalScopeProvider
    }
    
    override configureIScopeProviderDelegate(Binder binder) {
        binder.bind(IScopeProvider)
                .annotatedWith(Names
                        .named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
                .to(SequenceDiagramImportedNamespaceAwareLocalScopeProvider);
    }
}
