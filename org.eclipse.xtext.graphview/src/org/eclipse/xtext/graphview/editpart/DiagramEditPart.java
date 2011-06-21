package org.eclipse.xtext.graphview.editpart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.xtext.graphview.editpolicy.DiagramLayoutEditPolicy;
import org.eclipse.xtext.graphview.shape.DiagramShape;

import com.google.inject.Inject;

public class DiagramEditPart extends AbstractMappingEditPart {

	@Inject
	private DiagramLayoutEditPolicy diagramLayoutEditPolicy;
	
	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
		installEditPolicy(EditPolicy.LAYOUT_ROLE, diagramLayoutEditPolicy);
	}

	public IFigure createDefaultFigure() {
		return new DiagramShape();
	}

	@Override
	public void activate() {
		super.activate();
		IFigure figure = getFigure();
		if (figure instanceof DiagramShape) {
			((DiagramShape) figure).getAutoLayoutManager().layout(figure);
		}
	}
}
