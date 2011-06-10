package org.eclipse.xtext.graphview.editpart;

import java.util.List;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;

public class EdgeEditPart extends AbstractConnectionEditPart {

	@Override
	public void setModel(Object model) {
		if (!(model instanceof AbstractInstance))
			throw new RuntimeException("Model must be an AbstractInstance");
		super.setModel(model);
	}

	protected Object getSemanticElement() {
		return getInstanceModel().getSemanticElement();
	}

	private AbstractInstance getInstanceModel() {
		return (AbstractInstance) getModel();
	}

	@Override
	protected List<?> getModelChildren() {
		return getInstanceModel().getChildren();
	}

	@Override
	protected void createEditPolicies() {
	}

	protected IFigure createFigure() {
		PolylineConnection conn =(PolylineConnection)super.createFigure();
		conn.setConnectionRouter(new BendpointConnectionRouter());
		conn.setTargetDecoration(new PolygonDecoration());
		return conn;
	}


}
