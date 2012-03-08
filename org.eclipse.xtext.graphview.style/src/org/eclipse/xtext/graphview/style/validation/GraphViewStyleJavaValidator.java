/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.validation;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.LabelMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.NodeMapping;
import org.eclipse.xtext.graphview.style.graphViewStyle.Style;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class GraphViewStyleJavaValidator extends AbstractGraphViewStyleJavaValidator {

	@Inject
	private TypeConformanceComputer typeConformanceComputer;
	
	@Inject
	private TypeReferences typeReferences;
	
	@Check
	public void checkFigureClass(Style s) {
		JvmTypeReference figureClass = s.getJavaClass();
		if(figureClass != null) {
			for(AbstractMapping mapping: s.getMappings()) {
				if (mapping instanceof DiagramMapping) {
					assertTypeConformance("org.eclipse.xtext.graphview.shape.DiagramShape", figureClass, mapping);
				} else if(mapping instanceof NodeMapping) {
					assertTypeConformance("org.eclipse.draw2d.Shape", figureClass, mapping);
				} else if(mapping instanceof LabelMapping) {
					assertTypeConformance("org.eclipse.draw2d.Label", figureClass, mapping);
				} else if(mapping instanceof EdgeMapping) {
					assertTypeConformance("org.eclipse.draw2d.Connection", figureClass, mapping);
				}
			}
		}
	}
	
	protected void assertTypeConformance(String left, JvmTypeReference rightType, AbstractMapping mapping) {
		JvmTypeReference leftType = typeReferences.getTypeForName(left, rightType);
		if(!typeConformanceComputer.isConformant(leftType, rightType)) {
			error("The figure of a " + mapping.eClass().getName() + " must be compatible with '" 
					+ left + "'", rightType, null, 0);
		}
	}
}
