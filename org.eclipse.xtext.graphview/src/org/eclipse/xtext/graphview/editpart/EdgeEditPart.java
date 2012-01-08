/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.editpart;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.eclipse.xtext.graphview.editpolicy.EdgeBendpointEditPolicy;
import org.eclipse.xtext.graphview.editpolicy.HideEditPolicy;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.shape.ConnectionShape;
import org.eclipse.xtext.graphview.shape.TransparencyHelper;

import com.google.inject.Inject;

public class EdgeEditPart extends AbstractConnectionEditPart implements
		IInstanceModelEditPart {
	@Inject
	private InstanceModelEditPartHelper helper;

	@Inject
	private ConnectionEndpointEditPolicy connectionEndpointEditPolicy;

	@Inject
	private EdgeBendpointEditPolicy edgeBendpointEditPolicy;
	
	@Inject
	private HideEditPolicy hideEditPolicy;
	
	@Inject 
	private TransparencyHelper transparencyHelper;
	
	@Override
	public void setModel(Object model) {
		super.setModel(model);
		helper.initialize(this);
	}

	@Override
	public AbstractInstance getModel() {
		return (AbstractInstance) super.getModel();
	}
	
	@Override
	protected List<?> getModelChildren() {
		return helper.getInstanceModel().getChildren();
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,
				connectionEndpointEditPolicy);
		installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE,
				edgeBendpointEditPolicy);
		installEditPolicy(HideEditPolicy.ROLE, hideEditPolicy);
	}

	@Override
	public void performRequest(Request request) {
		helper.performRequest(request);
	}
	
	@Override
	protected IFigure createFigure() {
		IFigure createFigure = helper.createFigure();
		transparencyHelper.setFigure(createFigure);
		return createFigure;
	}

	public IFigure createDefaultFigure() {
		return new ConnectionShape();
	}

	@Override
	protected void refreshVisuals() {
		helper.style(getFigure());
	}
	
	public void setTransparent(boolean isTransparent) {
		transparencyHelper.setTransparent(isTransparent);
	}
}
