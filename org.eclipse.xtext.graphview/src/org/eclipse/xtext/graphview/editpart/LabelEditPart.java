package org.eclipse.xtext.graphview.editpart;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.xtext.graphview.figure.LabelNode;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;

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

	@Override
	protected List<AbstractExpressionMapping> getChildMappings() {
		return Collections.emptyList();
	}
}
