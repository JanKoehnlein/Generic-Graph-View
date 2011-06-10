package org.eclipse.xtext.graphview.model;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.DiagramInstance;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.InstancemodelFactory;
import org.eclipse.xtext.graphview.instancemodel.NodeInstance;
import org.eclipse.xtext.graphview.map.InstanceMapper;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.LabelMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.NodeMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.util.GraphViewMappingSwitch;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.inject.Inject;

public class ModelInstantiator {

	@Inject
	private InstanceMapper instanceMapper;

	public DiagramInstance createInstance(DiagramMapping mapping,
			Object semanticElement) {
		Multimap<Object, NodeInstance> semantic2instance = HashMultimap
				.create();
		DiagramInstance diagramInstance = (DiagramInstance) internalCreateInstance(
				mapping, semanticElement, semantic2instance, null);
		for (EdgeInstance edgeInstance : diagramInstance.getEdges()) {
			EdgeMapping edgeMapping = (EdgeMapping) edgeInstance.getMapping();
			if (edgeInstance.getSource() == null) {
				Object semanticSource = instanceMapper.map(
						edgeMapping.getSourceMapping(),
						edgeInstance.getSemanticElement());
				for (NodeInstance instance : semantic2instance
						.get(semanticSource)) {
					if (instance.getMapping() == edgeMapping.getSourceMapping()
							.getMapping()) {
						edgeInstance.setSource(instance);
					}
				}
			}
			if (edgeInstance.getSource() != null) {
				Object semanticTarget = instanceMapper.map(
						edgeMapping.getTargetMapping(),
						edgeInstance.getSemanticElement());
				for (NodeInstance instance : semantic2instance
						.get(semanticTarget)) {
					if (instance.getMapping() == edgeMapping.getTargetMapping()
							.getMapping()) {
						edgeInstance.setTarget(instance);
					}
				}
			}
			if (edgeInstance.getTarget() == null) {
				EcoreUtil.remove(edgeInstance);
			}
		}
		return diagramInstance;
	}

	protected AbstractInstance internalCreateInstance(AbstractMapping mapping,
			final Object semanticElement,
			final Multimap<Object, NodeInstance> semantic2instance,
			DiagramInstance diagramInstance) {
		AbstractInstance instanceModel = new GraphViewMappingSwitch<AbstractInstance>() {
			@Override
			public AbstractInstance caseDiagramMapping(DiagramMapping object) {
				return InstancemodelFactory.eINSTANCE.createDiagramInstance();
			}

			@Override
			public AbstractInstance caseNodeMapping(NodeMapping object) {
				NodeInstance nodeInstance = InstancemodelFactory.eINSTANCE
						.createNodeInstance();
				semantic2instance.put(semanticElement, nodeInstance);
				return nodeInstance;
			}

			@Override
			public AbstractInstance caseLabelMapping(LabelMapping object) {
				return InstancemodelFactory.eINSTANCE.createLabelInstance();
			}

			@Override
			public AbstractInstance caseEdgeMapping(EdgeMapping object) {
				return InstancemodelFactory.eINSTANCE.createEdgeInstance();
			}
		}.doSwitch(mapping);
		if (instanceModel != null) {
			instanceModel.setSemanticElement(semanticElement);
			instanceModel.setMapping(mapping);
			if (instanceModel instanceof DiagramInstance)
				diagramInstance = (DiagramInstance) instanceModel;
			for (AbstractExpressionMapping childMapping : mapping.getMappings()) {
				Object mapResult = instanceMapper.map(childMapping,
						semanticElement);
				if (((AbstractExpressionMapping) childMapping).isMulti()) {
					for (Object semanticChild : (Iterable<?>) mapResult) {
						addAsChild(
								instanceModel,
								diagramInstance,
								internalCreateInstance(childMapping,
										semanticChild, semantic2instance,
										diagramInstance));
					}
				} else if (mapResult != null) {
					addAsChild(
							instanceModel,
							diagramInstance,
							internalCreateInstance(childMapping, mapResult,
									semantic2instance, diagramInstance));
				}
			}
		}
		return instanceModel;
	}

	protected void addAsChild(AbstractInstance parent,
			DiagramInstance diagramInstance, AbstractInstance child) {
		if (child != null) {
			if (child instanceof EdgeInstance && diagramInstance != null) {
				diagramInstance.getEdges().add((EdgeInstance) child);
				if (parent instanceof NodeInstance)
					((EdgeInstance) child).setSource((NodeInstance) parent);
				return;
			}
			parent.getChildren().add(child);
		}
	}

}
