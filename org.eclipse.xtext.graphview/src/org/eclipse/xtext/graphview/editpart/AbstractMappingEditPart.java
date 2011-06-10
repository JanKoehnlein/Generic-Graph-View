package org.eclipse.xtext.graphview.editpart;

import java.util.List;

import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;

public abstract class AbstractMappingEditPart extends AbstractGraphicalEditPart {

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

	
}
