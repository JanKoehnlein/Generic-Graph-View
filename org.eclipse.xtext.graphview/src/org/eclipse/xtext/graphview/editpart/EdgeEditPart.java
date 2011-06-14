package org.eclipse.xtext.graphview.editpart;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.eclipse.xtext.graphview.editpolicy.EdgeBendpointEditPolicy;
import org.eclipse.xtext.graphview.shape.ConnectionShape;

import com.google.inject.Inject;

public class EdgeEditPart extends AbstractConnectionEditPart implements
		IInstanceModelEditPart {
	@Inject
	private InstanceModelEditPartHelper helper;

	@Override
	public void setModel(Object model) {
		super.setModel(model);
		helper.initialize(this);
	}

	@Override
	protected List<?> getModelChildren() {
		return helper.getInstanceModel().getChildren();
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE,
				new ConnectionEndpointEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE,
				new EdgeBendpointEditPolicy());
	}

	@Override
	protected IFigure createFigure() {
		return helper.createFigure();
	}

	public IFigure createDefaultFigure() {
		return new ConnectionShape();
	}

	@Override
	protected void refreshVisuals() {
		helper.style(getFigure());
	}

}
