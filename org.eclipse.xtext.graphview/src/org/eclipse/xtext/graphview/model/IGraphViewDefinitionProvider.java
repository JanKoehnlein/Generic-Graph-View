package org.eclipse.xtext.graphview.model;

import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet;

import com.google.inject.ImplementedBy;

@ImplementedBy(DefaultGraphViewDefinitionProvider.class)
public interface IGraphViewDefinitionProvider {

	interface Listener {
		public void graphViewDefinitionChanged();
	}
	
	DiagramMapping getDiagramMapping();
	
	StyleSheet getStyleSheet();
	
	public void addModelChangedListener(Listener listener);
	
	public void removeModelChangedListener(Listener listener);
}
