/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.gestures;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.swt.events.GestureEvent;

public interface IViewerGestureListener {

	public static final String KEY = IViewerGestureListener.class.getName();

	public void gesturePerformed(GestureEvent gestureEvent, EditPartViewer viewer);
}
