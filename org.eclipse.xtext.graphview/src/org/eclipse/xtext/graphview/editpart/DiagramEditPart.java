/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.editpart;

import org.eclipse.draw2d.FreeformLayeredPane;
import org.eclipse.draw2d.FreeformViewport;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.LayerConstants;
import org.eclipse.xtext.graphview.editpolicy.DiagramLayoutEditPolicy;
import org.eclipse.xtext.graphview.shape.DiagramShape;

import com.google.inject.Inject;

public class DiagramEditPart extends AbstractMappingEditPart {

	@Inject
	private DiagramLayoutEditPolicy diagramLayoutEditPolicy;

	private IFigure contentPane;

	private FreeformViewport viewport;

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, diagramLayoutEditPolicy);
	}

	@Override
	protected IFigure createFigure() {
		contentPane = super.createFigure();
		if(contentPane instanceof Layer) {
			viewport = new FreeformViewport();
			FreeformLayeredPane innerLayers = new FreeformLayeredPane();
			innerLayers.add(contentPane, LayerConstants.PRIMARY_LAYER);
			viewport.setContents(innerLayers);
			return viewport;
		}
		return contentPane;
	}

	public IFigure createDefaultFigure() {
		return new DiagramShape();
	}

	@Override
	protected void refreshVisuals() {
		helper.style(contentPane);
	}

	@Override
	public IFigure getContentPane() {
		return contentPane;
	}
	
	@Override
	public void activate() {
		super.activate();
		IFigure figure = getContentPane();
		if (figure instanceof DiagramShape) {
			Dimension size = ((DiagramShape) figure).getAutoLayoutManager().layout(figure);
			viewport.setSize(size);
		}
	}
}
