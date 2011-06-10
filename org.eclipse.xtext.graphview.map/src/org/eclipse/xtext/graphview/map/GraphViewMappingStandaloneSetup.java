
package org.eclipse.xtext.graphview.map;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GraphViewMappingStandaloneSetup extends GraphViewMappingStandaloneSetupGenerated{

	public static void doSetup() {
		new GraphViewMappingStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

