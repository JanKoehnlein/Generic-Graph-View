/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.interpreter;

import org.eclipse.xtext.graphview.lib.literals.ColorLiteral;
import org.eclipse.xtext.graphview.style.graphViewStyle.XColorLiteral;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;

public class GraphViewStyleInterpreter extends XbaseInterpreter {

	@Override
	protected Object doEvaluate(XExpression expression, IEvaluationContext context, CancelIndicator indicator) {
		if(expression instanceof XColorLiteral) {
			return _evaluateColorLiteral((XColorLiteral) expression, context, indicator);
		} 
		return super.doEvaluate(expression, context, indicator);
	}
	
	protected Object _evaluateColorLiteral(XColorLiteral literal, IEvaluationContext context, CancelIndicator indicator) {
		return new ColorLiteral(literal.getColor());
	}

}
