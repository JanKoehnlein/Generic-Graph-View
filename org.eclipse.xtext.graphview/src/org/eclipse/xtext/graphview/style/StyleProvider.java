package org.eclipse.xtext.graphview.style;

import java.util.Collection;

import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.style.graphViewStyle.Style;
import org.eclipse.xtext.graphview.view.config.IDiagramConfigurationProvider;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class StyleProvider {

	@Inject
	private IStyler styler;
	
	private Multimap<AbstractMapping, Style> mapping2style = HashMultimap.create();

	public void setClassLoader(ClassLoader classLoader) {
		styler.setClassLoader(classLoader);
	}
	
	@Inject
	public void setGraphViewDefinitionProvider(
			final IDiagramConfigurationProvider graphViewDefinitionProvider) {
		graphViewDefinitionProvider
				.addConfigurationListener(new IDiagramConfigurationProvider.Listener() {
					public void graphViewDefinitionChanged() {
						mapping2style = loadStyles(graphViewDefinitionProvider);
					}
				});
		mapping2style = loadStyles(graphViewDefinitionProvider);
	}

	protected Multimap<AbstractMapping, Style> loadStyles(
			IDiagramConfigurationProvider graphViewDefinitionProvider) {
		Multimap<AbstractMapping, Style> mapping2style = HashMultimap.create();
		if (graphViewDefinitionProvider.getStyleSheet() != null) {
			for (Style style : graphViewDefinitionProvider.getStyleSheet()
					.getStyles()) {
				for (AbstractMapping mapping: style.getMappings())
					mapping2style.put(mapping, style);
			}
		}
		return mapping2style;
	}

	public Collection<Style> getStyles(AbstractMapping mapping) {
		return mapping2style.get(mapping);
	}

	public void style(Object figure, Object semanticElement, Style style) {
		styler.style(figure, semanticElement, style);
	}
}
