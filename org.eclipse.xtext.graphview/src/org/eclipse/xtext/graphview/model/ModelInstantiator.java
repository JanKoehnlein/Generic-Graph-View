/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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
import org.eclipse.xtext.graphview.instancemodel.Visibility;
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

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class ModelInstantiator {

	private static final Logger LOG = Logger.getLogger(ModelInstantiator.class);

	@Inject
	private IInstanceMapper instanceMapper;

	@Inject
	private Provider<InstanceCache> cacheProvider;

	protected boolean isType(JvmTypeReference type, Object object, ClassLoader classLoader) {
		try {
			Class<?> typeGuard = classLoader.loadClass(type.getIdentifier());
			return typeGuard.isInstance(object);
		} catch (ClassNotFoundException e) {
			LOG.error("Cannot resolve type guard for diagram type " + Strings.notNull(type));
		}
		return false;
	}

	public DiagramInstance createInstance(DiagramMapping mapping, Object semanticElement, ClassLoader classLoader) {
		if (mapping == null || !isType(mapping.getTypeGuard(), semanticElement, classLoader)) {
			return null;
		}
		instanceMapper.setClassLoader(classLoader);
		InstanceCache instanceCache = cacheProvider.get();
		DiagramInstance diagramInstance = (DiagramInstance) internalCreateInstance(semanticElement, null, mapping, instanceCache, false);
		List<EdgeInstance> allEdges = Lists.newArrayList();
		List<EdgeInstance> orphanedEdges = Lists.newArrayList();
		for (TreeIterator<EObject> i = diagramInstance.eAllContents(); i.hasNext();) {
			EObject content = i.next();
			if (content instanceof EdgeInstance) {
				EdgeInstance edgeInstance = (EdgeInstance) content;
				connectSourceAndTargetInstance(edgeInstance, instanceCache);
				if (edgeInstance.getTarget() == null || edgeInstance.getSource() == null) {
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

	protected AbstractInstance internalCreateInstance(final Object semanticElement, AbstractInstance parentInstance,
			AbstractMapping mapping, final InstanceCache instanceCache, boolean isHiddenCaller) {
		if (mapping instanceof MappingCall) {
			AbstractInstance referencedInstance = internalCreateInstance(semanticElement, parentInstance,
					((MappingCall) mapping).getReferencedMapping(), instanceCache, mapping.isHidden() || isHiddenCaller);
			if (!((MappingCall) mapping).isCall() && referencedInstance instanceof DiagramInstance) {
				((DiagramInstance) referencedInstance).setOpenNewDiagram(true);
			}
			return referencedInstance;
		}
		AbstractInstance cachedInstance = instanceCache.get(semanticElement, parentInstance, mapping);
		if (cachedInstance != null) {
			if (!isHiddenCaller)
				cachedInstance.setVisibility(Visibility.VISIBLE);
			return cachedInstance;
		}
		AbstractInstance instanceModel = newInstance(semanticElement, mapping, parentInstance, isHiddenCaller);
		if (instanceModel != null) {
			instanceCache.put(semanticElement, parentInstance, mapping, instanceModel);
			if (instanceModel instanceof EdgeInstance)
				connectSourceAndTargetInstance((EdgeInstance) instanceModel, instanceCache);
			if (mapping instanceof AbstractMappingDefinition) {
				for (AbstractExpressionMapping childMapping : ((AbstractMappingDefinition) mapping).getMappings()) {
					Object mapResult = instanceMapper.map(childMapping, semanticElement);
					if (mapResult != null) {
						if (((AbstractExpressionMapping) childMapping).isMulti()) {
							for (Object semanticChild : (Iterable<?>) mapResult) {
								internalCreateInstance(semanticChild, instanceModel, childMapping, instanceCache, childMapping.isHidden());
							}
						} else {
							internalCreateInstance(mapResult, instanceModel, childMapping, instanceCache, childMapping.isHidden());
						}
					}
				}
			}
		}
		return instanceModel;
	}

	protected AbstractInstance newInstance(Object semanticElement, AbstractMapping mapping, AbstractInstance parentInstance,
			boolean isRevealCaller) {
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
			instanceModel.setParent(parentInstance);
			if (mapping.isHidden() || isRevealCaller) {
				instanceModel.setVisibility(Visibility.HIDDEN);
			}
		}
		return instanceModel;
	}

	protected void connectSourceAndTargetInstance(EdgeInstance edgeInstance, InstanceCache instanceCache) {
		EdgeMapping edgeMapping = (EdgeMapping) edgeInstance.getMapping();
		if (edgeMapping.getSourceMapping() == null) {
			edgeInstance.setSource((NodeInstance) edgeInstance.getParent());
		} else {
			edgeInstance.setSource(findInstanceForEdgeEnd(edgeMapping.getSourceMapping(), edgeInstance, instanceCache));
		}
		if (edgeInstance.getSource() != null) {
			if (edgeMapping.getTargetMapping() == null) {
				edgeInstance.setTarget((NodeInstance) edgeInstance.getParent());
			} else {
				edgeInstance.setTarget(findInstanceForEdgeEnd(edgeMapping.getTargetMapping(), edgeInstance, instanceCache));
			}
		}
	}

	protected NodeInstance findInstanceForEdgeEnd(EdgeEndMapping edgeEndMapping, EdgeInstance edgeInstance, InstanceCache instanceCache) {
		Object semanticElement = instanceMapper.map(edgeEndMapping, edgeInstance.getSemanticElement());
		if (semanticElement == null)
			return null;
		EObject containerMapping = edgeEndMapping.getReferencedMapping().eContainer();
		if (containerMapping instanceof AbstractMapping) {
			AbstractInstance parentInstance = findParentInstanceWithMapping(edgeInstance, (AbstractMapping) containerMapping);
			AbstractInstance cachedInstance = instanceCache.get(semanticElement, parentInstance, edgeEndMapping.getReferencedMapping());
			if (cachedInstance != null)
				return (NodeInstance) cachedInstance;
			if (edgeEndMapping.isCall()) {
				if (parentInstance != null) {
					AbstractInstance edgeEndInstance = internalCreateInstance(semanticElement, parentInstance,
							edgeEndMapping.getReferencedMapping(), instanceCache, edgeEndMapping.isHidden());
					edgeEndInstance.setVisibility(edgeInstance.getVisibility());
					if (edgeEndInstance instanceof NodeInstance)
						return (NodeInstance) edgeEndInstance;
				}
			}
		}
		return null;
	}

	protected AbstractInstance findParentInstanceWithMapping(AbstractInstance instance, AbstractMapping mapping) {
		if (instance.getMapping() == mapping)
			return instance;
		else if (instance.getParent() != null)
			return findParentInstanceWithMapping(instance.getParent(), mapping);
		else
			return null;
	}
}
