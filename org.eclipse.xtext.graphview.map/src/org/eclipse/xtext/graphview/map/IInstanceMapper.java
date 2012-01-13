/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.map;

import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;

import com.google.inject.ImplementedBy;

@ImplementedBy(InstanceMapper.class)
public interface IInstanceMapper {

	void setClassLoader(ClassLoader classLoader);

	Object map(AbstractExpressionMapping mapping, Object thisElement);

}