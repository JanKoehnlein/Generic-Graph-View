package org.eclipse.xtext.graphview.editpart;

import java.util.List;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.xtext.graphview.editpolicy.DiagramLayoutEditPolicy;
import org.eclipse.xtext.graphview.figure.DiagramLayout;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;

public class DiagramEditPart extends AbstractMappingEditPart {

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new DiagramLayoutEditPolicy());
	}

	@Override
	protected IFigure createFigure() {
		FreeformLayer freeformLayer = new FreeformLayer();
		freeformLayer.setLayoutManager(new DiagramLayout());
		return freeformLayer;
	}

	@Override
	protected List<AbstractExpressionMapping> getChildMappings() {
		return ((DiagramMapping) getMapping()).getMappings();
	}

}
