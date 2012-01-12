package org.eclipse.xtext.graphview.editpart;

import org.eclipse.draw2d.ScalableFigure;
import org.eclipse.draw2d.Viewport;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.GestureEvent;
import org.eclipse.xtext.graphview.gestures.IViewerGestureListener;

public class GraphViewRootEditPart extends ScalableFreeformRootEditPart {

	private double initialScale;

	// super.zoomManager is private
	private ZoomManager zoomManager;
	
	public GraphViewRootEditPart() {
		zoomManager = new ZoomManager((ScalableFigure) getScaledLayers(),
				((Viewport) getFigure())) {
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
			public void gesture(GestureEvent gestureEvent, EditPartViewer viewer) {
				switch (gestureEvent.detail) {
				case SWT.GESTURE_BEGIN:
					initialScale = getZoomManager().getZoom();
					break;
				case SWT.GESTURE_MAGNIFY:
					getZoomManager().setZoom(initialScale * gestureEvent.magnification);
					gestureEvent.doit = false;
					break;
				default:
					gestureEvent.doit = false;
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
