
package org.eclipse.xtext.graphview.style;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GraphViewStyleStandaloneSetup extends GraphViewStyleStandaloneSetupGenerated{

	public static void doSetup() {
		new GraphViewStyleStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

