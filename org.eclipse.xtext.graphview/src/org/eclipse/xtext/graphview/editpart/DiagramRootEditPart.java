package org.eclipse.xtext.graphview.editpart;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayeredPane;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.RootEditPart;
import org.eclipse.xtext.graphview.editpolicy.DiagramLayoutEditPolicy;
import org.eclipse.xtext.graphview.shape.DiagramShape;

import com.google.inject.Inject;

public class DiagramRootEditPart extends AbstractMappingEditPart {

	@Inject
	private DiagramLayoutEditPolicy diagramLayoutEditPolicy;

	@Inject
	private VisibilityListener visibilityListener;

	private IFigure contentPane;
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, diagramLayoutEditPolicy);
	}

	public void setTransparent(boolean isTransparent) {
	}

	@Override
	protected IFigure createFigure() {
		contentPane = super.createFigure();
		if(contentPane instanceof FreeformLayer) {
			FreeformLayeredPane freeformLayeredPane = new FreeformLayeredPane();
			freeformLayeredPane.add(contentPane);
			return freeformLayeredPane;
		}
		return contentPane;
	}
	
	public IFigure createDefaultFigure() {
		return new DiagramShape();
	}
	
	@Override
	public IFigure getContentPane() {
		return contentPane;
	}

	@Override
	protected void refreshVisuals() {
		helper.style(contentPane);
	}

	@Override
	public void activate() {
		super.activate();
		IFigure figure = getContentPane();
		if (figure instanceof DiagramShape) {
			((DiagramShape) figure).getAutoLayoutManager().layout(figure);
		}
		if (getParent() instanceof RootEditPart)
			visibilityListener.register(this);
	}

	@Override
	public void deactivate() {
		if (getParent() instanceof RootEditPart)
			visibilityListener.deregister(this);
		super.deactivate();
	}
}
