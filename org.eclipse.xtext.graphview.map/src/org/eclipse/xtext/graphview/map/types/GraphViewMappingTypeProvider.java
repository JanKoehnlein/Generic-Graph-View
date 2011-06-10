package org.eclipse.xtext.graphview.map.types;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.IterableUnpacker;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;

import com.google.inject.Singleton;

@SuppressWarnings("restriction")
@Singleton
public class GraphViewMappingTypeProvider extends XbaseTypeProvider {

	protected JvmTypeReference _type(DiagramMapping diagramMapping) {
		return diagramMapping.getTypeGuard();
	}

	protected JvmTypeReference _type(AbstractExpressionMapping mapping) {
		return getType(mapping.getExpression());
	}

	protected JvmTypeReference _typeForIdentifiable(DiagramMapping mapping,
			boolean rawType) {
		return _type(mapping);
	}

	protected JvmTypeReference _typeForIdentifiable(
			AbstractExpressionMapping mapping, boolean rawType) {
		return _type(mapping);
	}
	
	protected JvmTypeReference _typeForIdentifiable(
			IterableUnpacker unpacker, boolean rawType) {
		return ((JvmParameterizedTypeReference)_type(unpacker.getMapping())).getArguments().get(0);
	}
}
