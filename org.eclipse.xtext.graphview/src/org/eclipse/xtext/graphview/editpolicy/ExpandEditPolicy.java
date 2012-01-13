package org.eclipse.xtext.graphview.editpolicy;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.graphview.editpart.AbstractInstanceEditPart;
import org.eclipse.xtext.graphview.editpolicy.request.SetVisibilityCommand;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.Visibility;

public class ExpandEditPolicy extends AbstractEditPolicy {

	public static final String REQ_EXPAND = "Expand this part";

	public static final String ROLE = "Expand role";

	@Override
	public Command getCommand(Request request) {
		if (request.getType() == REQ_EXPAND) {
			CompoundCommand command = new CompoundCommand();
			for (EObject modelChild : EcoreUtil2.eAllContents(getHost().getModel())) {
				if (modelChild instanceof AbstractInstance && ((AbstractInstance) modelChild).getVisibility() == Visibility.HIDDEN)
					command.add(new SetVisibilityCommand((AbstractInstance) modelChild, Visibility.VISIBLE));
			}
			return command;
		}
		return super.getCommand(request);
	}

	@Override
	public AbstractInstanceEditPart getHost() {
		return (AbstractInstanceEditPart) super.getHost();
	}
}
