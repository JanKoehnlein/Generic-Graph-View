package org.eclipse.xtext.graphview.model;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Lists;

public class InstanceModel implements IInstanceModel {
	
	private EObject mappingElement;
	
	private Object semanticElement;
	
	private IInstanceModel parent;
	
	private List<InstanceModel> children = Lists.newArrayList();
	
	public InstanceModel(EObject mappingElement, Object semanticElement) {
		super();
		this.mappingElement = mappingElement;
		this.semanticElement = semanticElement;
	}

	@Override
	public EObject getMappingElement() {
		return mappingElement;
	}

	@Override
	public Object getSemanticElement() {
		return semanticElement;
	}
	
	@Override
	public IInstanceModel getParent() {
		return parent;
	}
	
	@Override
	public List<InstanceModel> getChildren() {
		return Collections.unmodifiableList(children);
	}
	
	public void addChild(InstanceModel child) {
		children.add(child);
		child.setParent(this);
	}
	
	public void setParent(InstanceModel parent) {
		this.parent = parent;
	}
	
}
