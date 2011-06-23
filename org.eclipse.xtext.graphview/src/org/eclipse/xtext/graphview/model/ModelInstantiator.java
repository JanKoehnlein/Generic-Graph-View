package org.eclipse.xtext.graphview.model;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.DiagramInstance;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.InstancemodelFactory;
import org.eclipse.xtext.graphview.instancemodel.NodeInstance;
import org.eclipse.xtext.graphview.map.IInstanceMapper;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingDefinition;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.LabelMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.MappingCall;
import org.eclipse.xtext.graphview.map.graphViewMapping.NodeMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.util.GraphViewMappingSwitch;
import org.eclipse.xtext.util.Strings;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.inject.Inject;

public class ModelInstantiator {

	private static final Logger LOG = Logger.getLogger(ModelInstantiator.class);

	@Inject
	private IInstanceMapper instanceMapper;

	protected boolean isType(JvmTypeReference type, Object object,
			ClassLoader classLoader) {
		try {
			Class<?> typeGuard = classLoader.loadClass(type.getIdentifier());
			return typeGuard.isInstance(object);
		} catch (ClassNotFoundException e) {
			LOG.error("Cannot resolve type guard for diagram type "
					+ Strings.notNull(type));
		}
		return false;
	}

	public DiagramInstance createInstance(DiagramMapping mapping,
			Object semanticElement, ClassLoader classLoader) {
		if (mapping == null
				|| !isType(mapping.getTypeGuard(), semanticElement, classLoader)) {
			return null;
		}
		instanceMapper.setClassLoader(classLoader);
		Multimap<Object, AbstractInstance> semantic2instance = HashMultimap
				.create();
		DiagramInstance diagramInstance = (DiagramInstance) internalCreateInstance(
				mapping, semanticElement, semantic2instance, null);
		List<EdgeInstance> allEdges = Lists.newArrayList();
		List<EdgeInstance> orphanedEdges = Lists.newArrayList();
		for (TreeIterator<EObject> i = diagramInstance.eAllContents(); i
				.hasNext();) {
			EObject content = i.next();
			if (content instanceof EdgeInstance) {
				EdgeInstance edgeInstance = (EdgeInstance) content;
				connectSourceAndTargetInstance(semantic2instance, edgeInstance);
				if (edgeInstance.getTarget() == null
						|| edgeInstance.getSource() == null) {
					edgeInstance.setSource(null);
					edgeInstance.setTarget(null);
					orphanedEdges.add(edgeInstance);
				} else {
					allEdges.add(edgeInstance);
				}
			}
		}
		diagramInstance.getEdges().addAll(allEdges);
		for (EdgeInstance orphanedEdge : orphanedEdges)
			EcoreUtil.remove(orphanedEdge);
		return diagramInstance;
	}

	protected AbstractInstance internalCreateInstance(AbstractMapping mapping,
			final Object semanticElement,
			final Multimap<Object, AbstractInstance> semantic2instance,
			AbstractInstance parentInstance) {
		if (mapping instanceof MappingCall) {
			return internalCreateInstance(
					((MappingCall) mapping).getReferencedMapping(),
					semanticElement, semantic2instance, parentInstance);
		}
		if (semantic2instance.containsKey(semanticElement)) {
			for (AbstractInstance instance : semantic2instance
					.get(semanticElement)) {
				if (instance.getMapping() == mapping) {
					return instance;
				}
			}
		}
		AbstractInstance instanceModel = newInstance(semanticElement, mapping);
		if (instanceModel != null) {
			semantic2instance.put(semanticElement, instanceModel);
			if (parentInstance != null)
				parentInstance.getChildren().add(instanceModel);
			if (instanceModel instanceof EdgeInstance)
				connectSourceAndTargetInstance(semantic2instance,
						(EdgeInstance) instanceModel);
			if (mapping instanceof AbstractMappingDefinition) {
				for (AbstractExpressionMapping childMapping : ((AbstractMappingDefinition) mapping)
						.getMappings()) {
					Object mapResult = instanceMapper.map(childMapping,
							semanticElement);
					if (mapResult != null) {
						if (((AbstractExpressionMapping) childMapping)
								.isMulti()) {
							for (Object semanticChild : (Iterable<?>) mapResult) {
								internalCreateInstance(childMapping,
										semanticChild, semantic2instance,
										instanceModel);
							}
						} else {
							internalCreateInstance(childMapping, mapResult,
									semantic2instance, instanceModel);
						}
					}
				}
			}
		}
		return instanceModel;
	}

	protected AbstractInstance newInstance(Object semanticElement,
			AbstractMapping mapping) {
		AbstractInstance instanceModel = new GraphViewMappingSwitch<AbstractInstance>() {
			@Override
			public AbstractInstance caseDiagramMapping(DiagramMapping object) {
				return InstancemodelFactory.eINSTANCE.createDiagramInstance();
			}

			@Override
			public AbstractInstance caseNodeMapping(NodeMapping object) {
				return InstancemodelFactory.eINSTANCE.createNodeInstance();
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
		}
		return instanceModel;
	}

	protected void connectSourceAndTargetInstance(
			Multimap<Object, AbstractInstance> semantic2instance,
			EdgeInstance edgeInstance) {
		EdgeMapping edgeMapping = (EdgeMapping) edgeInstance.getMapping();
		if (edgeMapping.getSourceMapping() == null) {
			edgeInstance.setSource((NodeInstance) edgeInstance.getParent());
		} else {
			edgeInstance.setSource(findInstanceForEdgeEnd(semantic2instance,
					edgeMapping.getSourceMapping(), edgeInstance));
		}
		if (edgeInstance.getSource() != null) {
			if (edgeMapping.getTargetMapping() == null) {
				edgeInstance.setTarget((NodeInstance) edgeInstance.getParent());
			} else {
				edgeInstance.setTarget(findInstanceForEdgeEnd(
						semantic2instance, edgeMapping.getTargetMapping(),
						edgeInstance));
			}
		}
	}

	protected NodeInstance findInstanceForEdgeEnd(
			Multimap<Object, AbstractInstance> semantic2instance,
			EdgeEndMapping edgeEndMapping, EdgeInstance edgeInstance) {
		Object semanticElement = instanceMapper.map(edgeEndMapping,
				edgeInstance.getSemanticElement());
		for (AbstractInstance instance : semantic2instance.get(semanticElement)) {
			if (instance instanceof NodeInstance
					&& instance.getMapping() == edgeEndMapping.getReferencedMapping()) {
				return (NodeInstance) instance;
			}
		}
		if (edgeEndMapping.isCall()) {
			EObject containerMapping = edgeEndMapping.getReferencedMapping().eContainer();
			if (containerMapping instanceof AbstractMapping) {
				AbstractInstance parentInstance = findParentInstanceWithMapping(
						edgeInstance, (AbstractMapping) containerMapping);
				if (parentInstance != null) {
					AbstractInstance edgeEndInstance = internalCreateInstance(
							edgeEndMapping.getReferencedMapping(), semanticElement,
							semantic2instance, parentInstance);
					if (edgeEndInstance instanceof NodeInstance) {
						return (NodeInstance) edgeEndInstance;
					}
				}
			}
		}
		return null;
	}

	protected AbstractInstance findParentInstanceWithMapping(
			AbstractInstance instance, AbstractMapping mapping) {
		if (instance.getMapping() == mapping)
			return instance;
		else if (instance.getParent() != null)
			return findParentInstanceWithMapping(instance.getParent(), mapping);
		else
			return null;
	}
}
