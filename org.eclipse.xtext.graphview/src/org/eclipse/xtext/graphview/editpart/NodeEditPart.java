package org.eclipse.xtext.graphview.editpart;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.xtext.graphview.figure.RectangleNode;
import org.eclipse.xtext.graphview.instancemodel.NodeInstance;

public class NodeEditPart extends AbstractMappingEditPart {

	@Override
	protected void createEditPolicies() {
	}

	@Override
	protected IFigure createFigure() {
		return new RectangleNode();
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected List getModelSourceConnections() {
		return ((NodeInstance)getModel()).getOutgoingEdges();
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected List getModelTargetConnections() {
		return ((NodeInstance)getModel()).getIncomingEdges();
	}
}