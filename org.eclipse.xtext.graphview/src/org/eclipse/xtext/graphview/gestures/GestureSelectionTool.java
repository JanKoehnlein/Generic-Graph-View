package org.eclipse.xtext.graphview.gestures;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.tools.SelectionTool;
import org.eclipse.swt.events.GestureEvent;

public class GestureSelectionTool extends SelectionTool implements IViewerGestureListener {

	public void gesture(GestureEvent gestureEvent, EditPartViewer viewer) {
		if (getDragTracker() instanceof IViewerGestureListener) {
			((IViewerGestureListener) getDragTracker()).gesture(gestureEvent, viewer);
			gestureEvent.doit = false;
		}
		if (isInState(STATE_INITIAL))
			performViewerGesture(gestureEvent, viewer);
	}

	protected void performViewerGesture(GestureEvent gestureEvent,
			EditPartViewer viewer) {
		IViewerGestureListener handler = (IViewerGestureListener) viewer
				.getProperty(IViewerGestureListener.KEY);
		if (handler != null)
			handler.gesture(gestureEvent, viewer);
	}
	
}
