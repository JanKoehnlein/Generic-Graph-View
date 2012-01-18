/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.behavior.visibility;

import org.eclipse.gef.DragTracker;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.graphview.behavior.buttons.AbstractRapidButton;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.NodeInstance;
import org.eclipse.xtext.graphview.instancemodel.Visibility;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

public class RevealButton extends AbstractRapidButton {

	@Inject
	private PluginImageHelper imageHelper;

	@Override
	protected Image createImage() {
		return imageHelper.getImage("elcl16/add_16.png");
	}

	@Override
	protected DragTracker createDragTracker() {
		return new RevealDragTracker(getHost(), this);
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible && hasHiddenEdge());
	}
	
	protected boolean hasHiddenEdge() {
		AbstractInstance model = getHost().getModel();
		if (model instanceof NodeInstance) {
			NodeInstance node = (NodeInstance) model;
			return Iterables.any(Iterables.concat(node.getOutgoingEdges(), node.getIncomingEdges()), new Predicate<EdgeInstance>() {
				public boolean apply(EdgeInstance input) {
					return input.getVisibility() == Visibility.HIDDEN;
				}
			});
		} else {
			return false;
		}
	}
}
