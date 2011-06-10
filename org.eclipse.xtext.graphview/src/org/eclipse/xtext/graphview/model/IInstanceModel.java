package org.eclipse.xtext.graphview.model;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.graphview.map.InstanceMapper;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;

import com.google.inject.Inject;

public interface IInstanceModel {

	List<InstanceModel> getChildren();

	IInstanceModel getParent();

	Object getSemanticElement();

	EObject getMappingElement();

	class Factory {

		@Inject
		private InstanceMapper instanceMapper;

		public InstanceModel create(EObject mapping, Object semanticElement) {
			InstanceModel newModel = new InstanceModel(mapping, semanticElement);
			for (EObject child : mapping.eContents()) {
				if (child instanceof AbstractExpressionMapping) {
					AbstractExpressionMapping childMapping = (AbstractExpressionMapping) child;
					Object mapResult = instanceMapper.map(childMapping,
							semanticElement);
					if (((AbstractExpressionMapping) childMapping).isMulti()) {
						for (Object semanticChild : (Iterable<?>) mapResult) {
							newModel.addChild(create(childMapping,
									semanticChild));
						}
					} else if (mapResult != null) {
						newModel.addChild(create(childMapping, mapResult));
					}
				}
			}
			return newModel;
		}
	}

}
