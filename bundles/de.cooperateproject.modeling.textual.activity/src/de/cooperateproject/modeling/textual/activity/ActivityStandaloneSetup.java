/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.activity;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ActivityStandaloneSetup extends ActivityStandaloneSetupGenerated{

	public static void doSetup() {
		new ActivityStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

