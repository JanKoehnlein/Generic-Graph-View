/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.lib.shape;

import org.eclipse.draw2d.PolygonDecoration;

/**
 * @author Jan Koehnlein
 */
public class ClosedArrowDecoration extends PolygonDecoration {

	public ClosedArrowDecoration() {
		setScale(10,8);
		setLineWidth(2);
	}
}
