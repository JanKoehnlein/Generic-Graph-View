package org.eclipse.xtext.graphview.behavior.buttons;

import org.eclipse.draw2d.RelativeLocator;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;

public class ViewportLocator extends RelativeLocator {

	private Viewport viewport;

	public ViewportLocator(Viewport viewport, int position) {
		super(viewport, position);
		this.viewport = viewport;
	}

	@Override
	protected Rectangle getReferenceBox() {
		Rectangle clientArea = viewport.getClientArea().getCopy();
		clientArea.translate(-clientArea.x, -clientArea.y);
		clientArea.shrink(new Insets(16,16,16,16));
		return clientArea;
	}
}
