package org.eclipse.xtext.graphview.style.type

import org.eclipse.xtext.xbase.typing.XbaseTypeProvider
import org.eclipse.xtext.graphview.style.graphViewStyle.XColorLiteral
import org.eclipse.xtext.common.types.JvmTypeReference
import com.google.inject.Singleton

@Singleton
class GraphViewStyleTypeProvider extends XbaseTypeProvider {
	
	def dispatch type(XColorLiteral colorLiteral, JvmTypeReference rawExpectation, boolean rawType) {
		typeReferences.getTypeForName(typeof(ColorLiteral), colorLiteral)
	}
}