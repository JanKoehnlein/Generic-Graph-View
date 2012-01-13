/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.map.types

import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage
import com.google.inject.Singleton

@Singleton
class GraphViewMappingTypeProvider extends XbaseTypeProvider {
	
	def dispatch JvmTypeReference typeForIdentifiable(DiagramMapping it, boolean rawType) {
		typeGuard
	} 
	
	def dispatch JvmTypeReference typeForIdentifiable(AbstractExpressionMapping it, boolean rawType) {
		val expressionType = type(expression, null, rawType)
		if(multi) {
			switch(expressionType) {
				JvmParameterizedTypeReference case !expressionType.arguments.empty: 
					return expressionType.arguments.head
				JvmGenericArrayTypeReference:
					return expressionType.componentType
			}
		}
		expressionType
	}
	
	def dispatch expectedType(AbstractMapping mapping, EReference reference, int index, boolean rawType) {
		if(reference == GraphViewMappingPackage$Literals::ABSTRACT_MAPPING__UNLESS_CONDITION) 
			typeReferences.getTypeForName(Boolean::TYPE, mapping)
		else
			null
	}
	
}