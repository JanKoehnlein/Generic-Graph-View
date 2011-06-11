package org.eclipse.xtext.graphview.editpart;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.google.inject.Inject;

public abstract class AbstractMappingEditPart extends AbstractGraphicalEditPart
		implements IInstanceModelEditPart {

	@Inject
	protected InstanceModelEditPartHelper helper;

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
