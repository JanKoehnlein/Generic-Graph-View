package org.eclipse.xtext.graphview.gestures;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.swt.events.GestureEvent;

public interface IViewerGestureListener {
	
	public static final String KEY = IViewerGestureListener.class.getName();	

	public void gesture(GestureEvent gestureEvent, EditPartViewer viewer);
}
