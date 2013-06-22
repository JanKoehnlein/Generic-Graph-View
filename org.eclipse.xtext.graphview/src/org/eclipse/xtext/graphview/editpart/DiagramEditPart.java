/*******************************************************************************
w * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.editpart;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayeredPane;
import org.eclipse.draw2d.FreeformViewport;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RangeModel;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.RootEditPart;
import org.eclipse.xtext.graphview.behavior.buttons.RapidButtonEditPolicy;
import org.eclipse.xtext.graphview.behavior.layout.DiagramLayoutEditPolicy;
import org.eclipse.xtext.graphview.behavior.layout.SpacingManager;
import org.eclipse.xtext.graphview.behavior.visibility.InstanceComponentEditPolicy;
import org.eclipse.xtext.graphview.behavior.visibility.VisibilityListener;
import org.eclipse.xtext.graphview.lib.shape.DiagramShape;

import com.google.inject.Inject;

public class DiagramEditPart extends AbstractInstanceEditPart {

	@Inject
	private DiagramLayoutEditPolicy diagramLayoutEditPolicy;

	@Inject
	private VisibilityListener visibilityListener;

	@Inject
	private InstanceComponentEditPolicy componentEditPolicy;

	@Inject
	private RapidButtonEditPolicy rapidButtonEditPolicy;

	@Inject 
	private SpacingManager spacingManager;
	
	private IFigure contentPane;

	private FreeformViewport viewport;

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, diagramLayoutEditPolicy);
		if (!isRootDiagram()) {
			installEditPolicy(EditPolicy.COMPONENT_ROLE, componentEditPolicy);
			installEditPolicy(RapidButtonEditPolicy.ROLE, rapidButtonEditPolicy);
		}
	}

	@Override
	protected IFigure createFigure() {
		contentPane = super.createFigure();
		if (contentPane instanceof FreeformLayer) {
			if (isRootDiagram()) {
				FreeformLayeredPane freeformLayeredPane = new FreeformLayeredPane();
				freeformLayeredPane.add(contentPane);
				return freeformLayeredPane;
			} else {
				viewport = new FreeformViewport();
				FreeformLayeredPane innerLayers = new FreeformLayeredPane();
				innerLayers.add(contentPane, LayerConstants.PRIMARY_LAYER);
				viewport.setContents(innerLayers);
				return viewport;
			}
		}
		return contentPane;
	}

	public IFigure createDefaultFigure() {
		return new DiagramShape();
	}

	@Override
	public IFigure getContentPane() {
		return contentPane;
	}

	@Override
	protected void refreshVisuals() {
		helper.style(contentPane);
	}

	@Override
	public void activate() {
		super.activate();
		performAutoLayout();
		if (isRootDiagram()) {
			visibilityListener.register(this);
		}
	}

	public void performAutoLayout() {
		IFigure figure = getContentPane();
		if (figure instanceof DiagramShape) {
			Rectangle diagramBounds = ((DiagramShape) figure).getAutoLayoutManager().layout(figure);
			if (!isRootDiagram()) {
				Dimension diagramSize = diagramBounds.getSize();
				Point diagramInset = diagramBounds.getTopLeft().scale(2);
				diagramSize.expand(diagramInset.x, diagramInset.y);
				viewport.setMinimumSize(diagramSize);
				viewport.setPreferredSize(diagramSize);
				centerViewport(viewport);
			} else {
				FreeformViewport freeformViewport = (FreeformViewport) ((GraphViewRootEditPart) getParent()).getFigure();
				spacingManager.respaceChildren(figure);
				centerViewport(freeformViewport);
			}
		}
	}

	@Override
	public void deactivate() {
		if (isRootDiagram()) {
			visibilityListener.deregister(this);
		}
		super.deactivate();
	}

	protected boolean isRootDiagram() {
		return getParent() instanceof RootEditPart;
	}

	public double getSpacing() {
		return spacingManager.getScale();
	}

	public void setSpacing(double spacing) {
		spacingManager.setScale(spacing);
		performAutoLayout();
	}
	
	protected void centerViewport(Viewport viewport) {
		viewport.validate();
		viewport.setViewLocation(getTopOrLeft(viewport.getHorizontalRangeModel()),
				getTopOrLeft(viewport.getVerticalRangeModel()));
		viewport.revalidate();
	}
	
	protected int getTopOrLeft(RangeModel rangeModel) {
		return (rangeModel.getMaximum() + rangeModel.getMinimum() - rangeModel.getExtent()) / 2;
	}


}
