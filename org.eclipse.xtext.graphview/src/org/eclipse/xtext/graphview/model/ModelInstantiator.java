package org.eclipse.xtext.graphview.model;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.DiagramInstance;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.InstancemodelFactory;
import org.eclipse.xtext.graphview.instancemodel.NodeInstance;
import org.eclipse.xtext.graphview.map.IInstanceMapper;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.LabelMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.NodeMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.util.GraphViewMappingSwitch;
import org.eclipse.xtext.util.Strings;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.inject.Inject;

public class ModelInstantiator {

	private static final Logger LOG = Logger.getLogger(ModelInstantiator.class);
	
	@Inject
	private IInstanceMapper instanceMapper;

	protected boolean isType(JvmTypeReference type, Object object, ClassLoader classLoader) {
		try {
			Class<?> typeGuard = classLoader.loadClass(type.getIdentifier());
			return typeGuard.isInstance(object);
		} catch (ClassNotFoundException e) {
			LOG.error("Cannot resolve type guard for diagram type " + Strings.notNull(type));
		}
		return false;
	}
	
	public DiagramInstance createInstance(DiagramMapping mapping,
			Object semanticElement, ClassLoader classLoader) {
		if (mapping == null || !isType(mapping.getTypeGuard(), semanticElement, classLoader)) {
			return null;
		}
		instanceMapper.setClassLoader(classLoader);
		Multimap<Object, NodeInstance> semantic2instance = HashMultimap
				.create();
		DiagramInstance diagramInstance = (DiagramInstance) internalCreateInstance(
				mapping, semanticElement, semantic2instance, null);
		for (Iterator<EdgeInstance> i = diagramInstance.getEdges().iterator(); i
				.hasNext();) {
			EdgeInstance edgeInstance = i.next();
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
				edgeInstance.setSource(null);
				i.remove();
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
				if (mapResult != null) {
					if (((AbstractExpressionMapping) childMapping).isMulti()) {
						for (Object semanticChild : (Iterable<?>) mapResult) {
							addAsChild(
									instanceModel,
									diagramInstance,
									internalCreateInstance(childMapping,
											semanticChild, semantic2instance,
											diagramInstance));
						}
					} else {
						addAsChild(
								instanceModel,
								diagramInstance,
								internalCreateInstance(childMapping, mapResult,
										semantic2instance, diagramInstance));
					}
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
