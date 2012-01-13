package org.eclipse.xtext.graphview.editpart;

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

	// super.zoomManager is private
	private ZoomManager zoomManager;
	
	@Inject
	private DrillingHelper drillingHelper; 

	public GraphViewRootEditPart() {
		zoomManager = new ZoomManager((ScalableFigure) getScaledLayers(), ((Viewport) getFigure())) {
			@Override
			public double getMinZoom() {
				return Math.min(super.getMinZoom(), getFitPageZoomLevel());
			}
		};
	}

	@Override
	public ZoomManager getZoomManager() {
		return zoomManager;
	}

	@Override
	public void activate() {
		super.activate();
		getViewer().setProperty(IViewerGestureListener.KEY, new IViewerGestureListener() {
			
			private double initialScale;

			private Point initialCursorLocation;

			private Point initialViewLocation;

			public void gesture(GestureEvent gestureEvent, EditPartViewer viewer) {
				Viewport viewport = (Viewport) getFigure();
				switch (gestureEvent.detail) {
				case SWT.GESTURE_BEGIN:
					initialScale = getZoomManager().getZoom();
					initialCursorLocation = new Point(gestureEvent.x, gestureEvent.y);
					initialViewLocation = viewport.getViewLocation();
					break;
				case SWT.GESTURE_MAGNIFY: {
					if(initialScale == 0)
						return;
					double zoom = initialScale * gestureEvent.magnification;
					if(zoom < zoomManager.getMinZoom()) {
						DiagramEditPart diagramEditPart = Iterables.getFirst(Iterables.filter(getChildren(), DiagramEditPart.class), null);
						if(diagramEditPart != null) {
							if(drillingHelper.drillUp(diagramEditPart.getModel())) {
								initialScale = 0.;
								initialCursorLocation.setLocation(0, 0);
								initialViewLocation.setLocation(0, 0);
								zoomManager.setZoom(1.);
								gestureEvent.doit = false;
							}
						}
						return;
					}
					Point relCursorLocation = initialCursorLocation.getCopy();
					getScaledLayers().translateToRelative(relCursorLocation);
					getScaledLayers().translateFromParent(relCursorLocation);
					getZoomManager().setZoom(zoom);
					Point newCursorLocation = relCursorLocation.getCopy();
					getScaledLayers().translateToParent(newCursorLocation);
					getScaledLayers().translateToAbsolute(newCursorLocation);
					Dimension delta = newCursorLocation.getDifference(initialCursorLocation);
					Point newViewLocation = initialViewLocation.getCopy().translate(delta);
					viewport.setViewLocation(newViewLocation);
					gestureEvent.doit = false;
					break;
				}
				case SWT.GESTURE_PAN:
					// only fired when not consumed by some parent
					// scrollable as a FigureCanvas
					Point viewLocation = viewport.getViewLocation();
					viewLocation.translate(gestureEvent.xDirection, gestureEvent.yDirection);
					viewport.setViewLocation(viewLocation);
					gestureEvent.doit = false;
					break;
				default:
					gestureEvent.doit = true;
				}
			}
		});
	}

	@Override
	public void deactivate() {
		getViewer().setProperty(IViewerGestureListener.KEY, null);
		super.deactivate();
	}
}
