/*
 * generated by Xtext
 */
package org.eclipse.xtext.graphview.map.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GraphViewMappingAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/xtext/graphview/map/parser/antlr/internal/InternalGraphViewMapping.tokens");
	}
}
