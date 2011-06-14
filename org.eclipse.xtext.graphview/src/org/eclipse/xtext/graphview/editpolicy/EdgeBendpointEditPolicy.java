package org.eclipse.xtext.graphview.editpolicy;

import java.util.List;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;

import com.google.common.collect.Lists;

public class EdgeBendpointEditPolicy extends BendpointEditPolicy {

	protected static class AbstractBendpointCommand extends Command {
		protected BendpointRequest request;

		protected AbstractBendpointCommand(BendpointRequest request) {
			this.request = request;
		}
		
		@SuppressWarnings("unchecked")
		protected List<AbsoluteBendpoint> getBendPoints() {
			PolylineConnection connection = getConnection();
			List<AbsoluteBendpoint> routingConstraint = (List<AbsoluteBendpoint>) connection.getRoutingConstraint();
			if(routingConstraint == null) {
				routingConstraint = Lists.newArrayList();
				connection.getConnectionRouter().setConstraint(connection, routingConstraint);
			}
			return routingConstraint;
		}
		
		protected PolylineConnection getConnection() {
			return (PolylineConnection) request.getSource().getFigure();
		}
	}
	
	@Override
	protected Command getCreateBendpointCommand(BendpointRequest request) {
		return new AbstractBendpointCommand(request) {
			@Override
			public void execute() {
				getBendPoints().add(request.getIndex(), new AbsoluteBendpoint(request.getLocation()));
			}
			
			@Override
			public void undo() {
				getBendPoints().remove(request.getIndex());
			}
		};
	}

	@Override
	protected Command getDeleteBendpointCommand(BendpointRequest request) {
		return new AbstractBendpointCommand(request) {
			private AbsoluteBendpoint removed;

			@Override
			public void execute() {
				removed = getBendPoints().remove(request.getIndex());
			}
			
			@Override
			public void undo() {
				getBendPoints().add(request.getIndex(), removed);
			}
		};
	}

	@Override
	protected Command getMoveBendpointCommand(BendpointRequest request) {
		return new AbstractBendpointCommand(request) {
			private AbsoluteBendpoint original;

			@Override
			public void execute() {
				List<AbsoluteBendpoint> bendPoints = getBendPoints();
				original = bendPoints.get(request.getIndex());
				bendPoints.set(request.getIndex(), new AbsoluteBendpoint(request.getLocation()));
			}
			
			@Override
			public void undo() {
				List<AbsoluteBendpoint> bendPoints = getBendPoints();
				bendPoints.set(request.getIndex(), original);
			}
		};
	}

}
