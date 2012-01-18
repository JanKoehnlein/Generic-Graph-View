/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.behavior.drilling;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Viewport;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.xtext.graphview.behavior.buttons.ViewportLocator;
import org.eclipse.xtext.graphview.editpart.AbstractInstanceEditPart;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;

import com.google.inject.Inject;

public class DrillingEditPolicy extends AbstractEditPolicy implements PropertyChangeListener {

	public static final String ROLE = "Drilling role";

	public static final String REQ_DRILL_DOWN = "drill down";
	public static final String REQ_DRILL_UP = "drill up";

	@Inject
	private DrillingHelper drillingHelper;

	@Inject
	private DrillUpButton drillUpButton;
	
	@Override
	public Command getCommand(Request request) {
		if (request.getType() == REQ_DRILL_DOWN) {
			drillingHelper.drillDown((AbstractInstance) getHost().getModel());
		} else if (request.getType() == REQ_DRILL_UP) {
			drillingHelper.drillUp((AbstractInstance) getHost().getModel());
		}
		return super.getCommand(request);
	}

	@Override
	public void activate() {
		super.activate();
		if (getHost().getParent() instanceof RootEditPart) {
			final IFigure viewport = ((GraphicalEditPart) getHost().getParent()).getFigure();
			if (viewport instanceof Viewport && drillingHelper.canDrillUp((AbstractInstance) getHost().getModel())) {
				drillUpButton.init((AbstractInstanceEditPart) getHost(), 
						new ViewportLocator((Viewport) viewport, PositionConstants.NORTH_EAST));
				viewport.add(drillUpButton);
				viewport.addPropertyChangeListener(this);
			}
		}
	}
	
	@Override
	public void deactivate() {
		if (getHost().getParent() instanceof RootEditPart) {
			IFigure viewport = ((GraphicalEditPart) getHost().getParent()).getFigure();
			if (viewport instanceof Viewport && drillingHelper.canDrillUp((AbstractInstance) getHost().getModel())) {
				viewport.remove(drillUpButton);
				viewport.removePropertyChangeListener(this);
			}
		}
		super.deactivate();
	}
	
	public void propertyChange(PropertyChangeEvent evt) {
		drillUpButton.revalidate();
	}
}
