/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.cooperateproject.modeling.textual.cls.ui.internal.ClsActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ClsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ClsActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ClsActivator.getInstance().getInjector(ClsActivator.DE_COOPERATEPROJECT_MODELING_TEXTUAL_CLS_CLS);
	}
	
}
