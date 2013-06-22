/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.lib.layout;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.xtext.graphview.lib.shape.FigureUtil;

import com.google.common.collect.Lists;

public class GridAutoLayout extends AbstractAutoLayout {

	private int offset = 20;

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	public Rectangle layout(IFigure container) {
		@SuppressWarnings("unchecked")
		List<IFigure> children = Lists.newArrayList(container.getChildren());
		for (IFigure child : children) {
			Dimension childSize = child.getPreferredSize();
			child.setBounds(new Rectangle(0, 0, childSize.width, childSize.height));
		}
		Collections.sort(children, new Comparator<IFigure>() {
			public int compare(IFigure arg0, IFigure arg1) {
				return arg1.getBounds().height - arg0.getBounds().height;
			}
		});
		int numColumns = (int) Math.sqrt(children.size());
		int numRows = children.size() / numColumns + ((children.size() % numColumns != 0) ? 1 : 0);
		int currentRowHeight = 0;
		int currentY = getOffset();
		int maxX = 0;
		for (int row = 0; row < numRows; ++row) {
			int currentX = getOffset();
			currentRowHeight = 0;
			for (int index = row * numColumns; index < (row + 1) * numColumns && index < children.size(); ++index) {
				IFigure child = children.get(index);
				currentRowHeight = Math.max(currentRowHeight, child.getPreferredSize().height);
				child.setLocation(new Point(currentX, currentY));
				currentX += child.getBounds().width + getOffset();
			}
			maxX = Math.max(currentX, maxX);
			currentY += currentRowHeight + getOffset();
		}
		int maxY = currentY;
		Layer connectionLayer = FigureUtil.getConnectionLayer(container);
		ConnectionRouter connectionRouter = getConnectionRouter(container);
		if (connectionLayer != null && connectionRouter != null) {
			for (Object child : connectionLayer.getChildren()) {
				if (child instanceof Connection) {
					((Connection) child).setConnectionRouter(connectionRouter);
				}
			}
		}
		return new Rectangle(0, 0, maxX, maxY);
	}

}
