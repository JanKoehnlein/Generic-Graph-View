package org.eclipse.xtext.graphview.model;

import org.eclipse.emf.ecore.EObject;

public class InstanceMapping {
	
	private EObject mapping;
	
	private Object semanticElement;
	
	public InstanceMapping(EObject mapping, Object semanticElement) {
		super();
		this.mapping = mapping;
		this.semanticElement = semanticElement;
	}

	public EObject getMapping() {
		return mapping;
	}

	public Object getSemanticElement() {
		return semanticElement;
	}
	
}
