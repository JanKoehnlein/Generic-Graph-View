package org.eclipse.xtext.graphview.editpart;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.xtext.graphview.map.InstanceMapper;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;
import org.eclipse.xtext.graphview.model.InstanceMapping;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

public abstract class AbstractMappingEditPart extends AbstractGraphicalEditPart {

	@Inject
	private InstanceMapper instanceMapper;

	@Override
	public void setModel(Object model) {
		if (!(model instanceof InstanceMapping))
			throw new RuntimeException("Model must be an InstanceMapping");
		super.setModel(model);
	}

	protected Object getSemanticElement() {
		return ((InstanceMapping) getModel()).getSemanticElement();
	}

	protected EObject getMapping() {
		return ((InstanceMapping) getModel()).getMapping();
	}

	@Override
	protected List<?> getModelChildren() {
		List<InstanceMapping> modelChildren = Lists.newArrayList();
		for (AbstractExpressionMapping childMapping : getChildMappings()) {
			Object mapResult = instanceMapper.map(childMapping,
					getSemanticElement());
			if (((AbstractExpressionMapping) childMapping).isMulti()) {
				for (Object semanticChild : (Iterable<?>) mapResult) {
					modelChildren.add(new InstanceMapping(childMapping,
							semanticChild));
				}
			} else if (mapResult != null) {
				modelChildren.add(new InstanceMapping(childMapping, mapResult));
			}
		}
		return modelChildren;
	}

	protected abstract List<AbstractExpressionMapping> getChildMappings();
	
}
