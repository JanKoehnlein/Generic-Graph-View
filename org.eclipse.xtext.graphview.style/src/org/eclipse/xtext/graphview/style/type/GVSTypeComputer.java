/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.type;

import org.eclipse.xtext.graphview.lib.literals.ColorLiteral;
import org.eclipse.xtext.graphview.style.graphViewStyle.XColorLiteral;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState;
import org.eclipse.xtext.xbase.typesystem.computation.XbaseTypeComputer;

public class GVSTypeComputer extends XbaseTypeComputer {

	@Override
	public void computeTypes(XExpression expression, ITypeComputationState state) {
		if (expression instanceof XColorLiteral) 
			_computeTypes((XColorLiteral) expression, state);
		else 
			super.computeTypes(expression, state);
	}
	
	protected void _computeTypes(XColorLiteral literal, ITypeComputationState state) {
		state.acceptActualType(getTypeForName(ColorLiteral.class, state));
	}
}
