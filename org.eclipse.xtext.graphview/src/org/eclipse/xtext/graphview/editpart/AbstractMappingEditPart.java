package org.eclipse.xtext.graphview.editpart;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.xtext.graphview.model.InstanceModel;

public abstract class AbstractMappingEditPart extends AbstractGraphicalEditPart {

	@Override
	public void setModel(Object model) {
		if (!(model instanceof InstanceModel))
			throw new RuntimeException("Model must be an InstanceMapping");
		super.setModel(model);
	}

	protected Object getSemanticElement() {
		return getInstanceModel().getSemanticElement();
	}

	protected EObject getMapping() {
		return getInstanceModel().getMappingElement();
	}

	private InstanceModel getInstanceModel() {
		return (InstanceModel) getModel();
	}

	@Override
	protected List<?> getModelChildren() {
		return getInstanceModel().getChildren();
	}

	
}
