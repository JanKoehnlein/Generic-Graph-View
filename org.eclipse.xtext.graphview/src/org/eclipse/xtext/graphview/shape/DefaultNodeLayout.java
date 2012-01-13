package org.eclipse.xtext.graphview.shape;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;

public class DefaultNodeLayout extends ToolbarLayout {

	public DefaultNodeLayout() {
		super(false);
	}

	@Override
	public void layout(IFigure parent) {
		super.layout(parent);
		Rectangle bounds = null;
		for (Object child : parent.getChildren()) {
			if (child instanceof IFigure) {
				if (bounds == null)
					bounds = ((IFigure) child).getBounds().getCopy();
				else
					bounds.union(((IFigure) child).getBounds());
			}
		}
		if (bounds == null)
			return;
		Insets insets = parent.getInsets();
		if (insets != null)
			bounds.expand(insets);
		preferredSize = bounds.getSize();
		parent.setSize(preferredSize);
	}
}
