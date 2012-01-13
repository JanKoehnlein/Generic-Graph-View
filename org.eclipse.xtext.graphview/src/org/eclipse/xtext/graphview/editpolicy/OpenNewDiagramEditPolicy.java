package org.eclipse.xtext.graphview.editpolicy;

import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.xtext.graphview.editpart.DrillingHelper;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;

import com.google.inject.Inject;

public class OpenNewDiagramEditPolicy extends AbstractEditPolicy {

	public static final String ROLE = "Open new diagram role";

	@Inject
	private DrillingHelper drillingHelper;

	@Override
	public Command getCommand(Request request) {
		if (request.getType() == RequestConstants.REQ_OPEN) {
			drillingHelper.drillDown((AbstractInstance) getHost().getModel());
		}
		return super.getCommand(request);
	}
}
