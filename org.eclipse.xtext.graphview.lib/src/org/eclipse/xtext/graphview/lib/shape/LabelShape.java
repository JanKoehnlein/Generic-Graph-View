/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.lib.shape;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.MidpointLocator;

public class LabelShape extends Label implements IConnectionChild {

	private int connectionAlignment;

	public LabelShape() {
		setText("unnamed");
		setForegroundColor(ColorConstants.black);
		setBorder(new MarginBorder(5, 5, 5, 5));
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
	}

	@Override
	public void setParent(IFigure parent) {
		super.setParent(parent);
		if (parent instanceof Connection) {
			Locator constraint;
			switch (getConnectionAlignment()) {
			case ConnectionLocator.SOURCE:
				constraint = new ConnectionEndpointLocator((Connection) parent, false);
				break;
			case ConnectionLocator.TARGET:
				constraint = new ConnectionEndpointLocator((Connection) parent, true);
				break;
			case ConnectionLocator.MIDDLE:
			default:
				constraint = new MidpointLocator((Connection) parent, 0);
			}
			parent.setConstraint(this, constraint);
		}
	}
}
