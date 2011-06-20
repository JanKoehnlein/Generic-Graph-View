package org.eclipse.xtext.graphview.editpart;

import org.eclipse.gef.DefaultEditDomain;

public class GraphViewEditDomain extends DefaultEditDomain {

	private ClassLoader classLoader;
	
	public GraphViewEditDomain() {
		super(null);
	}

	public ClassLoader getClassLoader() {
		return classLoader;
	}
	
	public void setClassLoader(ClassLoader classLoader) {
		this.classLoader = classLoader;
	}
	
}
