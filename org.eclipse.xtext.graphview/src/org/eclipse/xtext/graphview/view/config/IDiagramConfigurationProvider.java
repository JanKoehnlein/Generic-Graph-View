package org.eclipse.xtext.graphview.view.config;

import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet;

import com.google.inject.ImplementedBy;

@ImplementedBy(DefaultDiagramConfigurationProvider.class)
public interface IDiagramConfigurationProvider {

	interface Listener {
		public void graphViewDefinitionChanged();
	}
	
	DiagramMapping getDiagramMapping();
	
	StyleSheet getStyleSheet();
	
	public void addConfigurationListener(Listener listener);
	
	public void removeConfigurationListener(Listener listener);
}
