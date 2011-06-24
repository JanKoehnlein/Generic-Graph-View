/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.editpart;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.DiagramInstance;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.LabelInstance;
import org.eclipse.xtext.graphview.instancemodel.NodeInstance;
import org.eclipse.xtext.graphview.instancemodel.util.InstancemodelSwitch;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class GraphViewEditPartFactory implements EditPartFactory {

	@Inject
	private Provider<DiagramEditPart> diagramEditPartProvider;

	@Inject
	private Provider<NodeEditPart> nodeEditPartProvider;

	@Inject
	private Provider<LabelEditPart> labelEditPartProvider;

	@Inject
	private Provider<EdgeEditPart> edgeEditPartProvider;

	public EditPart createEditPart(EditPart parent, Object model) {
		if (model instanceof AbstractInstance) {
			EditPart editPart = new InstancemodelSwitch<EditPart>() {
				public EditPart caseDiagramInstance(DiagramInstance object) {
					return diagramEditPartProvider.get();
				}
				public EditPart caseNodeInstance(NodeInstance object) {
					return nodeEditPartProvider.get();
				}
				public EditPart caseLabelInstance(LabelInstance object) {
					return labelEditPartProvider.get();
				}
				public EditPart caseEdgeInstance(EdgeInstance object) {
					return edgeEditPartProvider.get();
				}
			}.doSwitch((AbstractInstance) model);
			if (editPart != null) {
				editPart.setModel(model);
			}
			return editPart;
		}
		return null;
	}
}
