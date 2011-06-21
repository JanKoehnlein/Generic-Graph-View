package org.eclipse.xtext.graphview.editpart;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.xtext.graphview.instancemodel.NodeInstance;
import org.eclipse.xtext.graphview.shape.RoundedRectangleShape;

public class NodeEditPart extends AbstractMappingEditPart {

	@Override
	protected void createEditPolicies() {
		super.createEditPolicies();
	}

	public IFigure createDefaultFigure() {
		return new RoundedRectangleShape();			
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