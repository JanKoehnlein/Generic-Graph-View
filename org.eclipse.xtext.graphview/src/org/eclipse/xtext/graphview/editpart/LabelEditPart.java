package org.eclipse.xtext.graphview.editpart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.xtext.graphview.figure.LabelNode;

public class LabelEditPart extends AbstractMappingEditPart {

	@Override
	protected void createEditPolicies() {
	}

	@Override
	protected IFigure createFigure() {
		return new LabelNode();
	}

	@Override
	protected void refreshVisuals() {
		if (getSemanticElement() != null) {
			System.out.println(getSemanticElement().toString());
			((LabelNode) getFigure()).setText(getSemanticElement().toString());
		}
	}
}
