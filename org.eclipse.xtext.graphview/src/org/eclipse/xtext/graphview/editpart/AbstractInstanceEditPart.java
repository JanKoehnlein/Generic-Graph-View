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
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.xtext.graphview.editpolicy.ExpandEditPolicy;
import org.eclipse.xtext.graphview.editpolicy.OpenNewDiagramEditPolicy;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.Visibility;
import org.eclipse.xtext.graphview.shape.TransparencyHelper;

import com.google.inject.Inject;

public abstract class AbstractInstanceEditPart extends AbstractGraphicalEditPart implements IInstanceModelEditPart {

	@Inject
	protected InstanceModelEditPartHelper helper;
	
	@Inject
	protected DrillingHelper drillingHelper;

	@Inject
	protected NonResizableEditPolicy nonResizableEditPolicy;

	@Inject
	private TransparencyHelper transparencyHelper;

	@Inject
	private ExpandEditPolicy expandEditPolicy;

	@Inject
	private OpenNewDiagramEditPolicy openNewDiagramEditPolicy;

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, nonResizableEditPolicy);
		installEditPolicy(ExpandEditPolicy.ROLE, expandEditPolicy);
		installEditPolicy(OpenNewDiagramEditPolicy.ROLE, openNewDiagramEditPolicy);
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		return drillingHelper.newDragTracker(this, request);
	}

	@Override
	public void performRequest(Request request) {
		helper.performRequest(request);
	}

	@Override
	public void setModel(Object model) {
		super.setModel(model);
		helper.initialize(this);
	}

	@Override
	protected List<AbstractInstance> getModelChildren() {
		return helper.getVisibleModelChildren();
	}

	@Override
	protected IFigure createFigure() {
		IFigure createFigure = helper.createFigure();
		transparencyHelper.setFigure(createFigure);
		return createFigure;
	}

	@Override
	protected void refreshVisuals() {
		helper.style(getFigure());
	}

	@Override
	public AbstractInstance getModel() {
		return (AbstractInstance) super.getModel();
	}

	public void setTransparent(boolean isTransparent) {
		transparencyHelper.setTransparent(isTransparent);
	}

	@Override
	public void activate() {
		super.activate();
		Rectangle bounds = new Rectangle(new Point(10, 10), getFigure().getPreferredSize());
		getFigure().setBounds(bounds);
		if (getModel().getVisibility() == Visibility.TRANSPARENT)
			setTransparent(true);
	}

}
