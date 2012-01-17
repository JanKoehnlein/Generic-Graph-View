/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.rapidbuttons;

import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.graphview.editpart.DrillingHelper;
import org.eclipse.xtext.graphview.editpolicy.DrillingEditPolicy;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.inject.Inject;

public class DrillDownButton extends AbstractRapidButton {

	@Inject
	private PluginImageHelper imageHelper;

	@Inject
	private DrillingHelper drillingHelper;
	
	@Override
	protected Image createImage() {
		return imageHelper.getImage("elcl16/zoom_in.png");
	}

	@Override
	protected DragTracker createDragTracker() {
		return new AbstractRapidButtonDragTracker(getHost()) {
			@Override
			protected String getCommandName() {
				return "Open diagram";
			}

			@Override
			protected Request createSourceRequest() {
				return new Request(DrillingEditPolicy.REQ_DRILL_DOWN);
			}
		};
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible && drillingHelper.canDrillDown(getHost().getModel()));
	}
}
