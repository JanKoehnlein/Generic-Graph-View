/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.editpart;

import java.lang.reflect.Method;

import org.eclipse.draw2d.IFigure;
import org.eclipse.xtext.graphview.shape.LabelShape;

public class LabelEditPart extends AbstractMappingEditPart {

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
	}

	public IFigure createDefaultFigure() {
		return new LabelShape();
	}

	@Override
	protected void refreshVisuals() {
		((LabelShape) getFigure()).setText(calculateText());
		super.refreshVisuals();
	}

	protected String calculateText() {
		Object semanticElement = helper.getSemanticElement();
		if (semanticElement == null)
			return "<null>";
		if (semanticElement instanceof CharSequence) {
			return semanticElement.toString();
		}
		try {
			Method method = semanticElement.getClass().getMethod("getName",
					new Class<?>[0]);
			return method.invoke(semanticElement, new Object[0]).toString();
		} catch (Exception e) {
			// ignore
		}
		return semanticElement.toString();
	}
}
