package org.eclipse.xtext.graphview.editpolicy;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.xtext.graphview.editpart.IInstanceModelEditPart;
import org.eclipse.xtext.graphview.editpolicy.request.RevealRequest;
import org.eclipse.xtext.graphview.editpolicy.request.SetVisibilityCommand;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.Visibility;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

public class RevealEditPolicy extends AbstractEditPolicy {

	public static final String ROLE = "Reveal role";

	@Inject
	private SetVisibilityCommand.Provider visibilityCommandProvider;

	private List<IInstanceModelEditPart> revealedEditParts;

	@Override
	public Command getCommand(Request request) {
		if (request instanceof RevealRequest) {
			CompoundCommand compoundCommand = new CompoundCommand();
			for (AbstractInstance instance : ((RevealRequest) request)
					.getToBeRevealed()) {
				compoundCommand.add(visibilityCommandProvider.get(instance,
						Visibility.VISIBLE));
			}
			return compoundCommand;
		}
		return super.getCommand(request);
	}

	@Override
	public void showSourceFeedback(Request request) {
		if (request instanceof RevealRequest) {
			if (revealedEditParts == null) {
				System.out.println("create showFeedback");
				revealedEditParts = Lists.newArrayList();
				for (AbstractInstance toBeRevealed : ((RevealRequest) request)
						.getToBeRevealed()) {
					toBeRevealed.setVisibility(Visibility.TRANSPARENT);
				}
				for (AbstractInstance toBeRevealed : ((RevealRequest) request)
						.getToBeRevealed()) {
					if(!(toBeRevealed instanceof EdgeInstance))
						revealedEditParts.add((IInstanceModelEditPart) getHost()
								.getViewer().getEditPartRegistry()
								.get(toBeRevealed));
				}
			}
			layoutNewEditParts((RevealRequest) request, revealedEditParts);
		}
		super.showSourceFeedback(request);
	}

	@Override
	public void eraseSourceFeedback(Request request) {
		if (request instanceof RevealRequest) {
			revealedEditParts = null;
		}
		super.eraseSourceFeedback(request);
	}
	
	protected void layoutNewEditParts(RevealRequest revealRequest, List<IInstanceModelEditPart> toBeRevealed) {
		if(!toBeRevealed.isEmpty()) {
			Point currentMouseLocation = revealRequest.getCurrentMouseLocation();
			IFigure hostFigure = ((IInstanceModelEditPart) getHost()).getFigure();
			Point center = hostFigure.getBounds().getCenter();
			if(hostFigure.getParent() != null)
				hostFigure.getParent().translateToAbsolute(center);
			Dimension dragDifference =  currentMouseLocation.getDifference(center); 
			double dist = diameter(dragDifference);
			double angle = Math.atan2(dragDifference.preciseHeight(), dragDifference.preciseWidth());
			double deltaAngle = 2 * Math.PI / toBeRevealed.size();
			for(IInstanceModelEditPart editPart: toBeRevealed) {
				System.out.println(angle);
				IFigure figure = editPart.getFigure();
				Point newCenter = new Point(center);
				Dimension figureSize = figure.getSize();
				double centerDist = dist;
				newCenter.translate((int) (Math.cos(angle) * centerDist), (int) (Math.sin(angle) * centerDist));
				newCenter.translate(-figureSize.width/2, -figureSize.height/2);
				if(figure.getParent() != null) {
					figure.getParent().translateToRelative(newCenter);
				}
				figure.setBounds(new Rectangle(newCenter.x , newCenter.y, figureSize.width, figureSize.height));
				angle += deltaAngle;
			}
		}
	}

	
	protected double diameter(Dimension dimension) {
		return Math.sqrt(dimension.width * dimension.width +dimension.height * dimension.height);
	}
}
