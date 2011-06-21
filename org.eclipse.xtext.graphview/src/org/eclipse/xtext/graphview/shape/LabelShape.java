package org.eclipse.xtext.graphview.shape;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.MidpointLocator;

public class LabelShape extends Label implements IConnectionChild {

	private int connectionAlignment;

	public LabelShape() {
		setText("unnamed");
		setForegroundColor(ColorConstants.black);
	}

	/**
	 * Possible values are {@link ConnectionLocator#SOURCE},
	 * {@link ConnectionLocator#MIDDLE} or {@link ConnectionLocator#TARGET}
	 * 
	 * @return
	 */
	public int getConnectionAlignment() {
		return connectionAlignment;
	}

	public void setConnectionAlignment(int connectionAlignment) {
		this.connectionAlignment = connectionAlignment;
		if (getParent() instanceof Connection) {
			Connection parent = (Connection) getParent();
			Locator constraint;
			switch (connectionAlignment) {
			case ConnectionLocator.SOURCE:
				constraint = new ConnectionEndpointLocator(parent, false);
				break;
			case ConnectionLocator.TARGET:
				constraint = new ConnectionEndpointLocator(parent, true);
				break;
			case ConnectionLocator.MIDDLE:
			default:
				constraint = new MidpointLocator(parent, 0);
			}
			getParent().setConstraint(this, constraint);
		}
	}
}
