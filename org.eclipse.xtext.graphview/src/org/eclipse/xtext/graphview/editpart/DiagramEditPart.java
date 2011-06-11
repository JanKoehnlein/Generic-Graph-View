package org.eclipse.xtext.graphview.editpart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.xtext.graphview.editpolicy.DiagramLayoutEditPolicy;
import org.eclipse.xtext.graphview.shape.DiagramShape;

public class DiagramEditPart extends AbstractMappingEditPart {

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new DiagramLayoutEditPolicy());
	}

	@Override
	public IFigure createDefaultFigure() {
		return new DiagramShape();
	}

}
