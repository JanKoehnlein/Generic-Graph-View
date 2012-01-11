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
import org.eclipse.xtext.graphview.editpolicy.InstanceComponentEditPolicy;
import org.eclipse.xtext.graphview.editpolicy.RevealEditPolicy;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.NodeInstance;
import org.eclipse.xtext.graphview.rapidbuttons.RapidButtonEditPolicy;
import org.eclipse.xtext.graphview.shape.RoundedRectangleShape;

import com.google.inject.Inject;

public class NodeEditPart extends AbstractInstanceEditPart {

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
		return helper.filterVisible(((NodeInstance) getModel())
				.getOutgoingEdges());
	}

	@Override
	protected List<EdgeInstance> getModelTargetConnections() {
		return helper.filterVisible(((NodeInstance) getModel())
				.getIncomingEdges());
	}
}