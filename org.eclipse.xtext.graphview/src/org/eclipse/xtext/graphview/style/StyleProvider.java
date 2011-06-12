package org.eclipse.xtext.graphview.style;

import java.util.Collection;

import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.model.IGraphViewDefinitionProvider;
import org.eclipse.xtext.graphview.style.graphViewStyle.Style;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class StyleProvider {

	private IStyler styler;

	private IGraphViewDefinitionProvider graphViewDefinitionProvider;

	private Multimap<String, Style> name2style = HashMultimap.create();

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

	protected Multimap<String, Style> loadStyles(
			IGraphViewDefinitionProvider graphViewDefinitionProvider) {
		Multimap<String, Style> name2style = HashMultimap.create();
		if (graphViewDefinitionProvider.getStyleSheet() != null) {
			for (Style style : graphViewDefinitionProvider.getStyleSheet()
					.getStyles()) {
				for (String name : style.getNames())
					name2style.put(name, style);
			}
		}
		return name2style;
	}

	public Collection<Style> getStyles(AbstractMapping mapping) {
		return name2style.get(mapping.getName());
	}

	public void style(Object o, Style style) {
		styler.style(o, style);
	}
}
