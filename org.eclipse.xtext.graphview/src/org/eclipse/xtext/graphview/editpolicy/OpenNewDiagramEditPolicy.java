package org.eclipse.xtext.graphview.editpolicy;

import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.DiagramInstance;
import org.eclipse.xtext.graphview.view.GraphView;

import com.google.inject.Inject;

public class OpenNewDiagramEditPolicy extends AbstractEditPolicy {

	public static final String ROLE = "Open new diagram role";
	
	@Inject
	private GraphView graphView;

	@Override
	public Command getCommand(Request request) {
		if(request.getType() == RequestConstants.REQ_OPEN) {
			DiagramInstance newDiagram = getContainedOpeanbleDiagram();
			if(newDiagram != null) {
				graphView.drillDown(newDiagram);
			}
		}
		return super.getCommand(request);
	}
	
	protected DiagramInstance getContainedOpeanbleDiagram() {
		for(AbstractInstance child: ((AbstractInstance) getHost().getModel()).getChildren()) {
			if(child instanceof DiagramInstance && ((DiagramInstance) child).isOpenNewDiagram()) 
				return (DiagramInstance) child;
		}
		return null;
	}
}
