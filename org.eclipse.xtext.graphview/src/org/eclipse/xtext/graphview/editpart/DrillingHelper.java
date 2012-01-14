/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.editpart;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.DiagramInstance;
import org.eclipse.xtext.graphview.view.GraphView;

import com.google.inject.Inject;

public class DrillingHelper {

	@Inject
	private GraphView graphView;

	public boolean drillUp(AbstractInstance model) {
		if (model.eContainer() != null) {
			DiagramInstance containerDiagram = EcoreUtil2.getContainerOfType(model.eContainer(), DiagramInstance.class);
			if (containerDiagram != null) {
				graphView.gotoDiagram(containerDiagram);
				return true;
			}
		}
		return false;
	}

	public boolean drillDown(AbstractInstance model) {
		for (AbstractInstance child : model.getChildren()) {
			if (child instanceof DiagramInstance && ((DiagramInstance) child).isOpenNewDiagram()) {
				graphView.gotoDiagram((DiagramInstance) child);
				return true;
			}
		}
		return false;
	}

}
