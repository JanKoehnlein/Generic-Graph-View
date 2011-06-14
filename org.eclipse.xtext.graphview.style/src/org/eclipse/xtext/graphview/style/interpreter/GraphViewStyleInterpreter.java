package org.eclipse.xtext.graphview.style.interpreter;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.graphview.style.graphViewStyle.XColorLiteral;
import org.eclipse.xtext.graphview.style.type.ColorLiteral;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;

@SuppressWarnings("restriction")
public class GraphViewStyleInterpreter extends XbaseInterpreter {
	
	protected Object _evaluateColorLiteral(XColorLiteral literal,
			IEvaluationContext context, CancelIndicator indicator) {
		return new ColorLiteral(literal.getColor());
	}
	
	protected Object _featureCallJvmIdentifyableElement(JvmIdentifiableElement identifiable, XFeatureCall featureCall, Object receiver,
			IEvaluationContext context, CancelIndicator indicator) {
		if (receiver != null)
			throw new IllegalStateException("feature was simple feature call but got receiver instead of null. Receiver: " + receiver);
		Object value = context.getValue(QualifiedName.create(featureCall.getConcreteSyntaxFeatureName()));
		if(value == null) { 
			super._featureCallJvmIdentifyableElement(identifiable, featureCall, receiver, context, indicator);
		}
		return value;
	}
}
