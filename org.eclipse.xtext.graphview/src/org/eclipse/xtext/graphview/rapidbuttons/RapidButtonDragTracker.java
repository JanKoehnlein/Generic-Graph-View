package org.eclipse.xtext.graphview.rapidbuttons;

import org.eclipse.gef.tools.SimpleDragTracker;

public class RapidButtonDragTracker extends SimpleDragTracker {

	@Override
	protected String getCommandName() {
		return "Add hidden";
	}

	protected boolean handleButtonDown(int button) {
		stateTransition(STATE_INITIAL, STATE_DRAG_IN_PROGRESS);
		showSourceFeedback();
		return true;
	}

	protected boolean handleButtonUp(int button) {
		if (stateTransition(STATE_DRAG_IN_PROGRESS, STATE_TERMINAL)) {
			setCurrentCommand(getCommand());
			executeCurrentCommand();
		}
		return true;
	}

}
