package org.eclipse.xtext.graphview.gestures;

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
