package org.eclipse.xtext.graphview.layout;

import java.util.List;

import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.LayeredPane;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

public abstract class AbstractDiagramLayout extends AbstractLayout {


	protected Dimension calculatePreferredSize(IFigure container, int wHint,
			int hHint) {
		container.validate();
		List<?> children = container.getChildren();
		Rectangle result = new Rectangle().setLocation(container
				.getClientArea().getLocation());
		for (int i = 0; i < children.size(); i++)
			result.union(((IFigure) children.get(i)).getBounds());
		result.resize(container.getInsets().getWidth(), container.getInsets()
				.getHeight());
		return result.getSize();
	}

	protected Layer getConnectionLayer(IFigure container) {
		if (container instanceof LayeredPane) {
			Layer layer = ((LayeredPane) container)
					.getLayer("Connection Layer");
			if (layer != null)
				return layer;
		}
		if (container != null)
			return getConnectionLayer(container.getParent());
		return null;
	}

}
