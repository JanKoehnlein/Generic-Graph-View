/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.editpolicy;

import java.util.List;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
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
				Point location = request.getLocation();
				request.getSource().getFigure().translateToRelative(location);
				getBendPoints().add(request.getIndex(), new AbsoluteBendpoint(location));
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
				Point location = request.getLocation().getCopy();
				request.getSource().getFigure().translateToRelative(location);
				bendPoints.set(request.getIndex(), new AbsoluteBendpoint(location));
			}
			
			@Override
			public void undo() {
				List<AbsoluteBendpoint> bendPoints = getBendPoints();
				bendPoints.set(request.getIndex(), original);
			}
		};
	}

}
