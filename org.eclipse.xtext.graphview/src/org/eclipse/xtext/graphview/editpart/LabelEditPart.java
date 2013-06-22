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
import org.eclipse.draw2d.Label;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.xtext.graphview.behavior.visibility.InstanceComponentEditPolicy;
import org.eclipse.xtext.graphview.lib.shape.LabelShape;

import com.google.inject.Inject;

public class LabelEditPart extends AbstractInstanceEditPart {

	@Inject
	private InstanceComponentEditPolicy componentEditPolicy;

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.COMPONENT_ROLE, componentEditPolicy);
	}

	public IFigure createDefaultFigure() {
		return new LabelShape();
	}

	@Override
	protected void refreshVisuals() {
		((Label) getFigure()).setText(calculateText());
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
			Method method = semanticElement.getClass().getMethod("getName", new Class<?>[0]);
			return method.invoke(semanticElement, new Object[0]).toString();
		} catch (Exception e) {
			// ignore
		}
		return semanticElement.toString();
	}

	protected boolean isDescriptionLabel() {
		if (getParent() instanceof AbstractInstanceEditPart) {
			return ((AbstractInstanceEditPart) getParent()).helper.getSemanticElement() == helper.getSemanticElement();
		}
		return false;
	}

	@Override
	public EditPart getTargetEditPart(Request request) {
		if (isDescriptionLabel())
			return getParent().getTargetEditPart(request);
		else
			return super.getTargetEditPart(request);
	}
}
