/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ClsStandaloneSetup extends ClsStandaloneSetupGenerated{

	public static void doSetup() {
		new ClsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

