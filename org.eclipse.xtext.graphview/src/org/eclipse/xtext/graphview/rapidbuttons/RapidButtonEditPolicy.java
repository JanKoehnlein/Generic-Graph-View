/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.rapidbuttons;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editparts.FreeformGraphicalRootEditPart;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.xtext.graphview.editpart.AbstractInstanceEditPart;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class RapidButtonEditPolicy extends AbstractEditPolicy {

	public static final String ROLE = "Rapid Button Role";

	private List<AbstractRapidButton> buttons;

	@Inject
	private DeleteButton deleteButton;

	@Inject
	private ExpandButton expandButton;

	@Inject
	private DrillDownButton drillDownButton;

	@Inject
	private Provider<RevealButton> revealButtonProvider;

	@Override
	public void showTargetFeedback(Request request) {
		if (request.getType() == RequestConstants.REQ_SELECTION_HOVER)
			showButtons();
		super.showTargetFeedback(request);
	}

	@Override
	public void eraseTargetFeedback(Request request) {
		if (request.getType() == RequestConstants.REQ_SELECTION_HOVER) {
			new UIJob("Hide buttons") {
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) {
					if (getHost().isActive())
						hideButtons();
					return Status.OK_STATUS;
				}
			}.schedule(5000);
		}
		super.eraseTargetFeedback(request);
	}

	protected List<AbstractRapidButton> getRapidButtons() {
		if (buttons == null) {
			buttons = Lists.newArrayList();
			addButton(revealButtonProvider.get(), PositionConstants.NORTH, true);
			addButton(revealButtonProvider.get(), PositionConstants.EAST, true);
			addButton(revealButtonProvider.get(), PositionConstants.SOUTH, true);
			addButton(revealButtonProvider.get(), PositionConstants.WEST, true);
			addButton(expandButton, PositionConstants.NORTH_WEST, false);
			addButton(drillDownButton, PositionConstants.NORTH, false);
			addButton(deleteButton, PositionConstants.NORTH_EAST, false);
		}
		return buttons;
	}

	protected void addButton(AbstractRapidButton button, int position, boolean isOutside) {
		button.init(this, position, isOutside);
		buttons.add(button);
		getHandleLayer().add(button);
	}

	protected void showButtons() {
		for (AbstractRapidButton button : getRapidButtons()) {
			button.setVisible(true);
		}
	}

	protected void hideButtons() {
		for (AbstractRapidButton button : getRapidButtons()) {
			button.setVisible(false);
		}
	}

	private IFigure getHandleLayer() {
		return ((FreeformGraphicalRootEditPart) getHost().getRoot()).getLayer(LayerConstants.HANDLE_LAYER);
	}

	@Override
	public AbstractInstanceEditPart getHost() {
		return (AbstractInstanceEditPart) super.getHost();
	}

	@Override
	public void deactivate() {
		if (buttons != null) {
			for (AbstractRapidButton button : getRapidButtons())
				getHandleLayer().remove(button);
		}
		super.deactivate();
	}
}
