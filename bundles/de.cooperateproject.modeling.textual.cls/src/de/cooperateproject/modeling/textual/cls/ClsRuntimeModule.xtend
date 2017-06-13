/*
 * generated by Xtext 2.10.0
 */
package de.cooperateproject.modeling.textual.cls

import com.google.inject.Binder
import com.google.inject.name.Names
import de.cooperateproject.modeling.textual.cls.derivedstate.calculator.ClsDerivedStateElementComparator
import de.cooperateproject.modeling.textual.cls.services.ClsLazyLinker
import de.cooperateproject.modeling.textual.cls.services.ClsValueConverter
import de.cooperateproject.modeling.textual.common.scoping.CooperateImportedNamespaceAwareLocalScopeProvider
import de.cooperateproject.modeling.textual.common.services.BasicCooperateTransientValueService
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateModuleMixin
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IDerivedStateComputerSorter
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.InitializingStateAwareResource
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.CooperateGlobalScopeProvider
import de.cooperateproject.modeling.textual.xtext.runtime.scoping.IGlobalScopeTypeQueryProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.serializer.sequencer.ITransientValueService
import de.cooperateproject.modeling.textual.xtext.runtime.service.transientstatus.TransientStatusProviderModuleMixin
import de.cooperateproject.modeling.textual.xtext.runtime.editor.FeatureFilterMixin

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class ClsRuntimeModule extends AbstractClsRuntimeModule implements DerivedStateModuleMixin, TransientStatusProviderModuleMixin, FeatureFilterMixin {
		
	override bindILinker() {
		return ClsLazyLinker
	}
	
	override bindITransientValueService() {
		 BasicCooperateTransientValueService
	}
	
	def configureITransientValueService(Binder binder) {
		binder.bind(ITransientValueService).to(BasicCooperateTransientValueService)
	}
	
    override configureIScopeProviderDelegate(Binder binder) {
        binder.bind(IScopeProvider)
                .annotatedWith(Names
                        .named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
                .to(CooperateImportedNamespaceAwareLocalScopeProvider);
    }
    
    override Class<? extends XtextResource> bindXtextResource() {
		return InitializingStateAwareResource;
	}
	
	def Class<? extends IGlobalScopeTypeQueryProvider> bindIGlobalScopeTypeQueryProvider() {
		return CooperateGlobalScopeProvider
	}
	
	override bindIValueConverterService() {
        return ClsValueConverter;
    }

    def Class<? extends IDerivedStateComputerSorter> bindIDerivedStateComputerSorter() {
        return ClsDerivedStateElementComparator
    }

}
