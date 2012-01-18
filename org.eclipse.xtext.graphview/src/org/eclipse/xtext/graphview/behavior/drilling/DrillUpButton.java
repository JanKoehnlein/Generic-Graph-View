/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.behavior.drilling;

import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.graphview.behavior.buttons.AbstractRapidButton;
import org.eclipse.xtext.graphview.behavior.buttons.AbstractRapidButtonDragTracker;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.inject.Inject;

public class DrillUpButton extends AbstractRapidButton {

	@Inject
	private PluginImageHelper imageHelper;

	@Inject
	private DrillingHelper drillingHelper;
	
	@Override
	protected Image createImage() {
		return imageHelper.getImage("elcl16/zoom_out.png");
	}

	@Override
	protected DragTracker createDragTracker() {
		return new AbstractRapidButtonDragTracker(getHost()) {
			@Override
			protected String getCommandName() {
				return "Go to to parent digram";
			}

			@Override
			protected Request createSourceRequest() {
				return new Request(DrillingEditPolicy.REQ_DRILL_UP);
			}
		};
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible && drillingHelper.canDrillUp(getHost().getModel()));
	}
}
