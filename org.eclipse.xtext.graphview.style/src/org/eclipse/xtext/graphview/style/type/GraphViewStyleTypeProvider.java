/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.style.type;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.graphview.style.graphViewStyle.XColorLiteral;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;

import com.google.inject.Singleton;

@Singleton
@SuppressWarnings("restriction")
public class GraphViewStyleTypeProvider extends XbaseTypeProvider {

	protected JvmTypeReference _type(XColorLiteral colorLiteral,
			boolean rawType) {
		return getTypeReferences().getTypeForName(ColorLiteral.class, colorLiteral);
	}
}
