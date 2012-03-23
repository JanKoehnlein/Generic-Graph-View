package org.eclipse.xtext.graphview.shape;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.LayeredPane;

public class FigureUtil {

	public static Layer getConnectionLayer(IFigure container) {
		if (container != null) {
			LayeredPane layeredPane = findParentOfType(container, LayeredPane.class);
			if (layeredPane != null) {
				Layer layer = layeredPane.getLayer("Connection Layer");
				if (layer == null)
					return getConnectionLayer(layeredPane.getParent());
				else
					return layer;
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public static <T> T findParentOfType(IFigure figure, Class<T> type) {
		if (type.isInstance(figure))
			return (T) figure;
		if (figure.getParent() != null)
			return findParentOfType(figure.getParent(), type);
		return null;
	}

}
