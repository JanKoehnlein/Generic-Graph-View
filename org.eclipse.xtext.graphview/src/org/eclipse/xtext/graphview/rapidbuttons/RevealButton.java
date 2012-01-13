package org.eclipse.xtext.graphview.rapidbuttons;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.DragTracker;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.NodeInstance;
import org.eclipse.xtext.graphview.instancemodel.Visibility;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

public class RevealButton extends AbstractRapidButton {

	@Inject
	private PluginImageHelper imageHelper;

	@Override
	protected Image createImage() {
		return imageHelper.getImage("elcl16/add_16.png");
	}

	@Override
	protected DragTracker createDragTracker() {
		return new RevealDragTracker(getEditPolicy().getHost(), getRelativeLocation());
	}
	
	protected Dimension getRelativeLocation() {
		Point center = getBounds().getCenter();
		if(getParent() != null)
			getParent().translateToAbsolute(center);
		IFigure hostFigure = getEditPolicy().getHost().getFigure();
		Point hostCenter = hostFigure.getBounds().getCenter();
		if(hostFigure.getParent() != null)
			hostFigure.getParent().translateToAbsolute(hostCenter);
		return center.getDifference(hostCenter);
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible && hasHiddenEdge());
	}

	protected boolean hasHiddenEdge() {
		AbstractInstance model = getEditPolicy().getHost().getModel();
		if (model instanceof NodeInstance) {
			NodeInstance node = (NodeInstance) model;
			return Iterables.any(
					Iterables.concat(node.getOutgoingEdges(),
							node.getIncomingEdges()),
					new Predicate<EdgeInstance>() {
						public boolean apply(EdgeInstance input) {
							return input.getVisibility() == Visibility.HIDDEN;
						}
					});
		} else {
			return false;
		}
	}
}
