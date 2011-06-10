package org.eclipse.xtext.graphview.map.scoping;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.IterableUnpacker;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;

@SuppressWarnings("restriction")
public class GraphViewMappingIdentifiableSimpleNameProvider extends
		IdentifiableSimpleNameProvider {

	@Override
	public String getSimpleName(JvmIdentifiableElement element) {
		if (element instanceof AbstractMapping
				|| element instanceof IterableUnpacker) {
			return "this";
		}
		return super.getSimpleName(element);
	}
}
