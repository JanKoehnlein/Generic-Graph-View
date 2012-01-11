package org.eclipse.xtext.graphview.rapidbuttons;

import org.eclipse.gef.tools.SimpleDragTracker;
import org.eclipse.xtext.graphview.editpart.IInstanceModelEditPart;

public abstract class AbstractRapidButtonDragTracker extends SimpleDragTracker {

	private final IInstanceModelEditPart hostEditPart;

	protected IInstanceModelEditPart getHostEditPart() {
		return hostEditPart;
	}

	protected AbstractRapidButtonDragTracker(IInstanceModelEditPart hostEditPart) {
		this.hostEditPart = hostEditPart;
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
}
