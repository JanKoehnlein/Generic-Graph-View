package org.eclipse.xtext.graphview.editpart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.xtext.graphview.editpolicy.DiagramLayoutEditPolicy;
import org.eclipse.xtext.graphview.layout.MyDiagramLayout;
import org.eclipse.xtext.graphview.shape.DiagramShape;

import com.google.inject.Inject;

public class DiagramEditPart extends AbstractMappingEditPart {

	@Inject
	private DiagramLayoutEditPolicy diagramLayoutEditPolicy;
	
	@Inject
	private MyDiagramLayout diagramLayout;
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, diagramLayoutEditPolicy);
	}

	@Override
	public IFigure createDefaultFigure() {
		return new DiagramShape();
	}

	@Override
	public void activate() {
		super.activate();
		diagramLayout.layout(getFigure());
	}
}
