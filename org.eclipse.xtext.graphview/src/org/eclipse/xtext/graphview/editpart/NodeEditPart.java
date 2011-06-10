package org.eclipse.xtext.graphview.editpart;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.xtext.graphview.figure.RectangleNode;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.NodeMapping;

public class NodeEditPart extends AbstractMappingEditPart {

	@Override
	protected void createEditPolicies() {
	}

	@Override
	protected IFigure createFigure() {
		return new RectangleNode();
	}

	@Override
	protected List<AbstractExpressionMapping> getChildMappings() {
		return ((NodeMapping)getMapping()).getContents();
	}
}