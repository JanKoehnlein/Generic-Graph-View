/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.behavior.gestures;

import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.ui.parts.DomainEventDispatcher;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;

public class GestureGraphicalViewer extends ScrollingGraphicalViewer {
	@Override
	protected LightweightSystem createLightweightSystem() {
		return new GestureLightweightSystem();
	}

	@Override
	public void setEditDomain(EditDomain domain) {
		super.setEditDomain(domain);
		// there is no way to avoid the super implementation to create a
		// dangling event dispatcher
		getLightweightSystem().setEventDispatcher(eventDispatcher = new GestureDomainEventDispatcher(domain, this));
	}

	// super.eventDispatcher is private
	private GestureDomainEventDispatcher eventDispatcher;

	@Override
	protected DomainEventDispatcher getEventDispatcher() {
		return eventDispatcher;
	}
}
