package org.eclipse.xtext.graphview.style.scoping;

import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;

@SuppressWarnings("restriction")
public class GraphViewStyleIdentifiableSimpleNameProvider extends
		IdentifiableSimpleNameProvider {

	@Override
	public String getSimpleName(JvmIdentifiableElement element) {
		if (element instanceof JvmGenericType) {
			return "this";
		}
		return super.getSimpleName(element);
	}
}
