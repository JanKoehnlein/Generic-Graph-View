package org.eclipse.xtext.graphview.editpart;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;

import com.google.inject.Inject;

public abstract class AbstractMappingEditPart extends AbstractGraphicalEditPart
		implements IInstanceModelEditPart {

	@Inject
	protected InstanceModelEditPartHelper helper;

	@Inject
	protected NonResizableEditPolicy nonResizableEditPolicy;
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, nonResizableEditPolicy);
	}

	@Override
	public void performRequest(Request request) {
		helper.performRequest(request);
	}
	
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
	protected IFigure createFigure() {
		return helper.createFigure();
	}

	@Override
	protected void refreshVisuals() {
		helper.style(getFigure());
	}
}
