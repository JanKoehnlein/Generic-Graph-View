package org.eclipse.xtext.graphview.style.type;

import java.util.List;
import java.util.Map;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.Primitives;
import org.eclipse.xtext.common.types.util.SuperTypeCollector;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticMethodsFeatureForTypeProvider;

import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class GVSStaticMethodsFeatureForTypeProvider extends
		StaticMethodsFeatureForTypeProvider {

	private static final Map<String, String> extensionClasses = Maps
			.newHashMap();

	static {
		extensionClasses.put("org.eclipse.draw2d.IFigure",
				"org.eclipse.xtext.graphview.shape.FigureExtensions");
	}

	@Inject
	private SuperTypeCollector superTypeCollector;

	@Inject
	private Primitives primitives;

	@Override
	protected Iterable<String> getVisibleTypesContainingStaticMethods(
			JvmTypeReference reference) {
		Iterable<String> resultFromSuper = super
				.getVisibleTypesContainingStaticMethods(reference);
		if (reference != null && reference.getType() != null
				&& !primitives.isPrimitive(reference)) {
			List<String> typeNames = Lists.newArrayList(reference.getType()
					.getIdentifier());
			typeNames.addAll(superTypeCollector.collectSuperTypeNames(reference
					.getType()));
			Iterable<String> result = Iterables.filter(Iterables.transform(
					typeNames, new Function<String, String>() {
						public String apply(String from) {
							return extensionClasses.get(from);
						}
					}), Predicates.notNull());
			return Iterables.concat(resultFromSuper, result);
		}
		return resultFromSuper;
	}

}
