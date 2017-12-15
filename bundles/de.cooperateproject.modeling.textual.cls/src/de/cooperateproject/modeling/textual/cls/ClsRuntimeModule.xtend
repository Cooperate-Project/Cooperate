/*
 * generated by Xtext 2.10.0
 */
package de.cooperateproject.modeling.textual.cls

import de.cooperateproject.modeling.textual.cls.services.ClsLazyLinker

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class ClsRuntimeModule extends AbstractClsRuntimeModule {
		
	override bindILinker() {
		return ClsLazyLinker
	}
	
}
