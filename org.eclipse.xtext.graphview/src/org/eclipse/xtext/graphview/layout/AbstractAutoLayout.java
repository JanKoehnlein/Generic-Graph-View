package org.eclipse.xtext.graphview.layout;

import java.util.List;

import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.LayeredPane;
import org.eclipse.draw2d.ShortestPathConnectionRouter;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

public abstract class AbstractAutoLayout extends AbstractLayout {

	private ConnectionRouter connectionRouter;
	
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
		LayeredPane layeredPane = findParentOfType(container, LayeredPane.class);
		if (layeredPane != null)
			return layeredPane.getLayer("Connection Layer");
		return null;
	}

	@SuppressWarnings("unchecked")
	protected <T> T findParentOfType(IFigure figure, Class<T> type) {
		if (type.isInstance(figure))
			return (T) figure;
		if (figure.getParent() != null)
			return findParentOfType(figure.getParent(), type);
		return null;
	}
	
	
	public void setConnectionRouter(ConnectionRouter connectionRouter) {
		this.connectionRouter = connectionRouter;
	}
	
	public ConnectionRouter getConnectionRouter(IFigure container) {
		return (connectionRouter == null) ? new ShortestPathConnectionRouter(container) : connectionRouter;
	}
}
