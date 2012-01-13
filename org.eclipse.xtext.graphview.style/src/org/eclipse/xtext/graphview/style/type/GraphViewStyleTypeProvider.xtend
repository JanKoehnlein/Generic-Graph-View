/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.type

import org.eclipse.xtext.xbase.typing.XbaseTypeProvider
import org.eclipse.xtext.graphview.style.graphViewStyle.XColorLiteral
import org.eclipse.xtext.common.types.JvmTypeReference
import com.google.inject.Singleton

@Singleton
class GraphViewStyleTypeProvider extends XbaseTypeProvider {
	
	def dispatch type(XColorLiteral colorLiteral, JvmTypeReference rawExpectation, boolean rawType) {
		typeReferences.getTypeForName(typeof(ColorLiteral), colorLiteral)
	}
}