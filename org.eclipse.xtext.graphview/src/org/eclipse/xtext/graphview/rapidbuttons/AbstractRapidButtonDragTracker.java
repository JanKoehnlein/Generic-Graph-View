/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.rapidbuttons;

import org.eclipse.gef.tools.SimpleDragTracker;
import org.eclipse.xtext.graphview.editpart.IInstanceModelEditPart;

public abstract class AbstractRapidButtonDragTracker extends SimpleDragTracker {

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

}
