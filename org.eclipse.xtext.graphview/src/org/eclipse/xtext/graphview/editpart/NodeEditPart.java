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
import org.eclipse.xtext.graphview.editpolicy.HideEditPolicy;
import org.eclipse.xtext.graphview.editpolicy.RevealEditPolicy;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.NodeInstance;
import org.eclipse.xtext.graphview.rapidbuttons.RapidButtonEditPolicy;
import org.eclipse.xtext.graphview.shape.RoundedRectangleShape;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

public class NodeEditPart extends AbstractMappingEditPart {

	@Inject 
	private RapidButtonEditPolicy rapidButtonEditPolicy;
	
	@Inject
	private HideEditPolicy hideEditPolicy;
	
	@Inject
	private RevealEditPolicy revealEditPolicy;
	
	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(RapidButtonEditPolicy.ROLE, rapidButtonEditPolicy);
		installEditPolicy(HideEditPolicy.ROLE, hideEditPolicy);
		installEditPolicy(RevealEditPolicy.ROLE, revealEditPolicy);
	}

	public IFigure createDefaultFigure() {
		return new RoundedRectangleShape();			
	}

	@Override
	protected List<EdgeInstance> getModelSourceConnections() {
		return filterVisible(((NodeInstance)getModel()).getOutgoingEdges());
	}

	@Override
	protected List<EdgeInstance> getModelTargetConnections() {
		return filterVisible(((NodeInstance)getModel()).getIncomingEdges());
	}
	
	protected Iterable<EdgeInstance> getModelAllConnections() {
		return Iterables.concat(getModelSourceConnections(), getModelTargetConnections());
	}
}