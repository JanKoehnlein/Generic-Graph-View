package org.eclipse.xtext.graphview.style;

import java.util.Map;

import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.model.IGraphViewDefinitionProvider;
import org.eclipse.xtext.graphview.style.graphViewStyle.Style;

import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class StyleProvider {

	private IStyler styler;

	private IGraphViewDefinitionProvider graphViewDefinitionProvider;

	private Map<String, Style> name2style = Maps.newHashMap();

	@Inject
	public void setStyler(IStyler styler) {
		this.styler = styler;
		styler.setClassLoader(getClass().getClassLoader());
	}
	
	@Inject
	public void setGraphViewDefinitionProvider(
			final IGraphViewDefinitionProvider graphViewDefinitionProvider) {
		this.graphViewDefinitionProvider = graphViewDefinitionProvider;
		graphViewDefinitionProvider
				.addModelChangedListener(new IGraphViewDefinitionProvider.Listener() {
					@Override
					public void graphViewDefinitionChanged() {
						name2style = loadStyles(graphViewDefinitionProvider);
					}
				});
		name2style = loadStyles(graphViewDefinitionProvider);
	}

	protected Map<String, Style> loadStyles(
			IGraphViewDefinitionProvider graphViewDefinitionProvider) {
		Map<String, Style> name2style = Maps.newHashMap();
		if (graphViewDefinitionProvider.getStyleSheet() != null) {
			for (Style style : graphViewDefinitionProvider.getStyleSheet()
					.getStyles()) {
				name2style.put(style.getName(), style);
			}
		}
		return name2style;
	}

	public Style getStyle(AbstractMapping mapping) {
		return name2style.get(mapping.getName());
	}

	public void style(Object o, Style style) {
		styler.style(o, style);
	}
}
