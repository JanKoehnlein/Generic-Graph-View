package org.eclipse.xtext.graphview.style.type;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.graphview.style.graphViewStyle.XColorLiteral;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;

import com.google.inject.Singleton;

@Singleton
@SuppressWarnings("restriction")
public class GraphViewStyleTypeProvider extends XbaseTypeProvider {

	protected JvmTypeReference _type(XColorLiteral colorLiteral,
			boolean rawType) {
		return getTypeReferences().getTypeForName(ColorLiteral.class, colorLiteral);
	}
}
