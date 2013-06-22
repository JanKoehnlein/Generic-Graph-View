/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.editpart;

import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.xtext.graphview.behavior.buttons.RapidButtonEditPolicy;
import org.eclipse.xtext.graphview.behavior.visibility.InstanceComponentEditPolicy;
import org.eclipse.xtext.graphview.behavior.visibility.RevealEditPolicy;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.NodeInstance;
import org.eclipse.xtext.graphview.lib.shape.RoundedRectangleShape;
import org.eclipse.xtext.graphview.shape.ShapeAnchor;

import com.google.inject.Inject;

public class NodeEditPart extends AbstractInstanceEditPart implements org.eclipse.gef.NodeEditPart {

	@Inject
	private RapidButtonEditPolicy rapidButtonEditPolicy;

	@Inject
	private InstanceComponentEditPolicy componentEditPolicy;

	@Inject
	private RevealEditPolicy revealEditPolicy;

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(RapidButtonEditPolicy.ROLE, rapidButtonEditPolicy);
		installEditPolicy(EditPolicy.COMPONENT_ROLE, componentEditPolicy);
		installEditPolicy(RevealEditPolicy.ROLE, revealEditPolicy);
	}

	public IFigure createDefaultFigure() {
		return new RoundedRectangleShape();
	}

	@Override
	protected List<EdgeInstance> getModelSourceConnections() {
		return helper.filterVisible(((NodeInstance) getModel()).getOutgoingEdges());
	}

	@Override
	protected List<EdgeInstance> getModelTargetConnections() {
		return helper.filterVisible(((NodeInstance) getModel()).getIncomingEdges());
	}

	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
		return new ShapeAnchor(getFigure());
	}

	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
		return new ShapeAnchor(getFigure());
	}

	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return new ShapeAnchor(getFigure());
	}

	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return new ShapeAnchor(getFigure());
	}
	
	@Override
	public void showTargetFeedback(Request request) {
		if(getParent() instanceof DiagramEditPart && request.getType() == REQ_SELECTION) {
			IFigure figure = getFigure();
			IFigure parent = figure.getParent();
			parent.remove(figure);
			parent.add(figure);
		}
		super.showTargetFeedback(request);
	}
}