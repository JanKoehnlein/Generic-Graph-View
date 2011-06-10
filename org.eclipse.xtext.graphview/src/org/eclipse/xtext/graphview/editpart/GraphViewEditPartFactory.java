package org.eclipse.xtext.graphview.editpart;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.LabelMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.NodeMapping;
import org.eclipse.xtext.graphview.model.InstanceMapping;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class GraphViewEditPartFactory implements EditPartFactory {

	@Inject
	private Provider<DiagramEditPart> diagramEditPartProvider;
	
	@Inject
	private Provider<NodeEditPart> nodeEditPartProvider;
	
	@Inject
	private Provider<LabelEditPart> labelEditPartProvider;

	@Override
	public EditPart createEditPart(EditPart parent, Object model) {
		EditPart editPart = null;
		if (model instanceof InstanceMapping) {
			InstanceMapping instanceMapping = (InstanceMapping) model;
			EObject mapping = instanceMapping.getMapping();
			if (mapping instanceof DiagramMapping) {
				editPart = diagramEditPartProvider.get();
			} else if (mapping instanceof NodeMapping) {
				editPart = nodeEditPartProvider.get();
			} else if (mapping instanceof LabelMapping) {
				editPart = labelEditPartProvider.get();
			}
			if (editPart != null)
				editPart.setModel(instanceMapping);
		}
		return editPart;
	}

}
