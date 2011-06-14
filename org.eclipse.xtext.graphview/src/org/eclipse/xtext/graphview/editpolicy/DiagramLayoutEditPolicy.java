package org.eclipse.xtext.graphview.editpolicy;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

public class DiagramLayoutEditPolicy extends XYLayoutEditPolicy {

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		return null;
	}
	
	@Override
	protected Command createChangeConstraintCommand(
			final ChangeBoundsRequest request, final EditPart child, Object constraint) {
		return new Command() {
			private Dimension initialSize;
			private IFigure figure;
			
			@Override
			public void execute() {
				figure = ((GraphicalEditPart) child).getFigure();
				initialSize = figure.getPreferredSize().getCopy();
				Dimension newSize = initialSize.getCopy().getExpanded(request.getSizeDelta());
				figure.setPreferredSize(newSize);
			}
			
			@Override
			public void undo() {
				figure.setPreferredSize(initialSize);
			}
		};
	}

}
