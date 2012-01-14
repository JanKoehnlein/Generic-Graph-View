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
import org.eclipse.gef.RequestConstants;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.DiagramInstance;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.inject.Inject;

public class DrillDownButton extends AbstractRapidButton {

	@Inject
	private PluginImageHelper imageHelper;

	@Override
	protected Image createImage() {
		return imageHelper.getImage("elcl16/zoom_in.png");
	}

	@Override
	protected DragTracker createDragTracker() {
		return new AbstractRapidButtonDragTracker(getEditPolicy().getHost()) {
			@Override
			protected String getCommandName() {
				return "Hide element";
			}

			@Override
			protected Request createSourceRequest() {
				return new Request(RequestConstants.REQ_OPEN);
			}
		};
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible && hasOpenDiagram());
	}

	protected boolean hasOpenDiagram() {
		for (AbstractInstance child : getEditPolicy().getHost().getModel().getChildren()) {
			if (child instanceof DiagramInstance && ((DiagramInstance) child).isOpenNewDiagram())
				return true;
		}
		return false;
	}
}
