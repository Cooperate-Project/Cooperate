/*
 * generated by Xtext 2.10.0
 */
package de.cooperateproject.modeling.textual.cls.ui

import de.cooperateproject.modeling.textual.cls.ui.inFile.ClsLocationInFileProvider
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.resource.ILocationInFileProvider
import org.eclipse.xtext.resource.SaveOptions
import org.eclipse.xtext.ui.editor.model.edit.DefaultTextEditComposer
import org.eclipse.xtext.ui.editor.model.edit.ITextEditComposer

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class ClsUiModule extends AbstractClsUiModule {
	
	def Class<? extends ILocationInFileProvider> bindILocationInFileProvider() {
		return ClsLocationInFileProvider;
	}

	//TODO Most probably, this is not necessary. However, we should ensure this before deletion. 
	def Class<? extends ITextEditComposer> bindITextEditComposer() {
		return ClsTextEditComposer
	}
	
	public static class ClsTextEditComposer extends DefaultTextEditComposer {

		override SaveOptions getSaveOptions() {
			return SaveOptions.newBuilder.noValidation.options
		}
	}

}
