package org.eclipse.xtext.graphview.map.types;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage;
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
		JvmTypeReference type = _type(mapping);
		if (mapping instanceof AbstractExpressionMapping
				&& ((AbstractExpressionMapping) mapping).isMulti()) {
			if (type instanceof JvmParameterizedTypeReference
					&& !((JvmParameterizedTypeReference) type).getArguments()
							.isEmpty()) {
				return ((JvmParameterizedTypeReference) type).getArguments()
						.get(0);
			} else if (type instanceof JvmGenericArrayTypeReference) {
				return ((JvmGenericArrayTypeReference) type).getComponentType();
			}
		}
		return type;
	}
	
	protected JvmTypeReference _expectedType(AbstractMapping mapping, EReference reference, int index, boolean rawType) {
		if(reference==GraphViewMappingPackage.Literals.ABSTRACT_MAPPING__UNLESS_CONDITION)
			return getTypeReferences().getTypeForName(Boolean.TYPE, mapping);
		else
			return null;
	}
}
