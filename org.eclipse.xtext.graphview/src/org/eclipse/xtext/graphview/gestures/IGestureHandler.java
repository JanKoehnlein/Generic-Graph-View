package org.eclipse.xtext.graphview.gestures;

import org.eclipse.swt.events.GestureEvent;

public interface IGestureHandler {

	boolean handleGesture(GestureEvent gestureEvent);
}
