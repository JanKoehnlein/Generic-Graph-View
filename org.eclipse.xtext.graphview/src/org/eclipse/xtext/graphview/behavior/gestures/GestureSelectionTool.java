/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.behavior.gestures;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.tools.SelectionTool;
import org.eclipse.swt.events.GestureEvent;

public class GestureSelectionTool extends SelectionTool implements IViewerGestureListener {

	public void gesturePerformed(GestureEvent gestureEvent, EditPartViewer viewer) {
		if (getDragTracker() instanceof IViewerGestureListener) {
			((IViewerGestureListener) getDragTracker()).gesturePerformed(gestureEvent, viewer);
			gestureEvent.doit = false;
		}
		if (isInState(STATE_INITIAL))
			performViewerGesture(gestureEvent, viewer);
	}

	protected void performViewerGesture(GestureEvent gestureEvent, EditPartViewer viewer) {
		IViewerGestureListener handler = (IViewerGestureListener) viewer.getProperty(IViewerGestureListener.KEY);
		if (handler != null)
			handler.gesturePerformed(gestureEvent, viewer);
	}

}
