package org.eclipse.xtext.graphview.editpart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.xtext.graphview.shape.LabelShape;

public class LabelEditPart extends AbstractMappingEditPart {

	@Override
	protected void createEditPolicies() {
	}

	public IFigure createDefaultFigure() {
		return new LabelShape();
	}

	@Override
	protected void refreshVisuals() {
		if (helper.getSemanticElement() != null) {
			((LabelShape) getFigure()).setText(helper.getSemanticElement().toString());
		}
		super.refreshVisuals();
	}
}
