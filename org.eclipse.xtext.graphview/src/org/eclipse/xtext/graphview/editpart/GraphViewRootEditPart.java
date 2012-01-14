/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.editpart;

import java.util.List;

import org.eclipse.draw2d.LayeredPane;
import org.eclipse.draw2d.ScalableFigure;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.GestureEvent;
import org.eclipse.xtext.graphview.gestures.IViewerGestureListener;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

public class GraphViewRootEditPart extends ScalableFreeformRootEditPart {

	public static class GestureListener implements IViewerGestureListener {
	
		@Inject
		private DrillingHelper drillingHelper; 
		
		private GraphViewRootEditPart host;

		private double initialScale;
		private Point initialCursorLocation;
		private Point initialViewLocation;
		
		public void initialize(GraphViewRootEditPart host) {
			this.host = host;
		}
		
		public void gesture(GestureEvent gestureEvent, EditPartViewer viewer) {
			Viewport viewport = (Viewport) host.getFigure();
			switch (gestureEvent.detail) {
			case SWT.GESTURE_BEGIN:
				initialScale = host.getZoomManager().getZoom();
				initialCursorLocation = new Point(gestureEvent.x, gestureEvent.y);
				initialViewLocation = viewport.getViewLocation();
				break;
			case SWT.GESTURE_MAGNIFY: {
				if(initialScale == 0)
					return;
				double zoom = initialScale * gestureEvent.magnification;
				if(zoom < host.getZoomManager().getMinZoom()) {
					DiagramEditPart diagramEditPart = getContainerDiagramEditPart();
					if(diagramEditPart != null) {
						if(drillingHelper.drillUp(diagramEditPart.getModel())) {
							consumeEventAndResetView(gestureEvent);
							return;
						}
					}
				}
				List<?> currentSelection = host.getViewer().getSelectedEditParts();
				if(gestureEvent.magnification > 1.1 
						&& currentSelection.size() == 1 
						&& currentSelection.get(0) instanceof IInstanceModelEditPart) {
					if(drillingHelper.drillDown(((IInstanceModelEditPart) currentSelection.get(0)).getModel())) {
						consumeEventAndResetView(gestureEvent);
						return; 
					}
				}
				Point relCursorLocation = initialCursorLocation.getCopy();
				host.getScaledLayers().translateToRelative(relCursorLocation);
				host.getScaledLayers().translateFromParent(relCursorLocation);
				host.getZoomManager().setZoom(zoom);
				Point newCursorLocation = relCursorLocation.getCopy();
				host.getScaledLayers().translateToParent(newCursorLocation);
				host.getScaledLayers().translateToAbsolute(newCursorLocation);
				Dimension delta = newCursorLocation.getDifference(initialCursorLocation);
				Point newViewLocation = initialViewLocation.getCopy().translate(delta);
				viewport.setViewLocation(newViewLocation);
				gestureEvent.doit = false;
				break;
			}
			case SWT.GESTURE_PAN:
				// only fired when not consumed by some parent scrollable as a FigureCanvas
				Point viewLocation = viewport.getViewLocation();
				viewLocation.translate(gestureEvent.xDirection, gestureEvent.yDirection);
				viewport.setViewLocation(viewLocation);
				gestureEvent.doit = false;
				break;
			default:
				gestureEvent.doit = true;
			}
		}
		
		protected void consumeEventAndResetView(GestureEvent gestureEvent) {
			initialScale = 0.;
			initialCursorLocation.setLocation(0, 0);
			initialViewLocation.setLocation(0, 0);
			host.getZoomManager().setZoom(1.);			
			gestureEvent.doit = false;
		}

		protected DiagramEditPart getContainerDiagramEditPart() {
			return Iterables.getFirst(Iterables.filter(host.getChildren(), DiagramEditPart.class), null);
		}
	}

	@Inject
	private GestureListener gestureListener;
	
	public GraphViewRootEditPart() {
		zoomManager = new ZoomManager((ScalableFigure) getScaledLayers(), ((Viewport) getFigure())) {
			@Override
			public double getMinZoom() {
				return Math.min(super.getMinZoom(), getFitPageZoomLevel());
			}
		};
	}
	
	// super.zoomManager is private
	private ZoomManager zoomManager;
	
	@Override
	public ZoomManager getZoomManager() {
		return zoomManager;
	}

	public LayeredPane getScaledLayers() {
		return super.getScaledLayers();
	}
	
	@Override
	public void activate() {
		super.activate();
		gestureListener.initialize(this);
		getViewer().setProperty(IViewerGestureListener.KEY, gestureListener);
	}

	@Override
	public void deactivate() {
		getViewer().setProperty(IViewerGestureListener.KEY, null);
		super.deactivate();
	}
}
