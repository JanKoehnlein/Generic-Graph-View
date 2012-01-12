package org.eclipse.xtext.graphview.rapidbuttons;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.tools.SimpleDragTracker;
import org.eclipse.swt.events.GestureEvent;
import org.eclipse.xtext.graphview.editpart.IInstanceModelEditPart;
import org.eclipse.xtext.graphview.gestures.IGestureHandler;
import org.eclipse.xtext.graphview.gestures.IViewerGestureListener;

public abstract class AbstractRapidButtonDragTracker extends SimpleDragTracker implements IGestureHandler, IViewerGestureListener {

	private final IInstanceModelEditPart hostEditPart;

	protected AbstractRapidButtonDragTracker(IInstanceModelEditPart hostEditPart) {
		this.hostEditPart = hostEditPart;
	}

	protected IInstanceModelEditPart getHostEditPart() {
		return hostEditPart;
	}

	protected boolean handleButtonDown(int button) {
		if (stateTransition(STATE_INITIAL, STATE_DRAG_IN_PROGRESS)) {
			setCurrentCommand(getHostEditPart().getCommand(getSourceRequest()));
			return true;
		} else {
			return false;
		}
	}

	protected boolean handleButtonUp(int button) {
		if (stateTransition(STATE_DRAG_IN_PROGRESS, STATE_TERMINAL)) {
			executeCurrentCommand();
			return true;
		} else {
			return false;
		}
	}
	
	public void gesture(GestureEvent gestureEvent, EditPartViewer viewer) {
		handleGesture(gestureEvent);
	}
	
	public boolean handleGesture(GestureEvent gestureEvent) {
		return false;
	}
}
