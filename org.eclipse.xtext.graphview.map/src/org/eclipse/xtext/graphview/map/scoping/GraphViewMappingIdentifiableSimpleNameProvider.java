package org.eclipse.xtext.graphview.map.scoping;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;

@SuppressWarnings("restriction")
public class GraphViewMappingIdentifiableSimpleNameProvider extends
		IdentifiableSimpleNameProvider {
	
	@Override
	public String getSimpleName(JvmIdentifiableElement element) {
		if (element instanceof AbstractExpressionMapping || element instanceof DiagramMapping) {
			return "this";
		}
		return super.getSimpleName(element);
	}
}
