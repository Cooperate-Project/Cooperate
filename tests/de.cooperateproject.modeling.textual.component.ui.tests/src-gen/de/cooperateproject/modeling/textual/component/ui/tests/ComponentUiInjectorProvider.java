/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.component.ui.tests;

import com.google.inject.Injector;
import de.cooperateproject.modeling.textual.component.ui.internal.ComponentActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class ComponentUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ComponentActivator.getInstance().getInjector("de.cooperateproject.modeling.textual.component.Component");
	}

}
