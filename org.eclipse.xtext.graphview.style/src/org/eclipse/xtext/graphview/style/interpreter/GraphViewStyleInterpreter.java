package org.eclipse.xtext.graphview.style.interpreter;

import org.eclipse.xtext.graphview.style.graphViewStyle.XColorLiteral;
import org.eclipse.xtext.graphview.style.type.ColorLiteral;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;

@SuppressWarnings("restriction")
public class GraphViewStyleInterpreter extends XbaseInterpreter {
	
	protected Object _evaluateColorLiteral(XColorLiteral literal,
			IEvaluationContext context, CancelIndicator indicator) {
		return new ColorLiteral(literal.getColor());
	}
}
