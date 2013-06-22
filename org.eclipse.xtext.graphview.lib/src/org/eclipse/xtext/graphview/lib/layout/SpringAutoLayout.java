package org.eclipse.xtext.graphview.lib.layout;
///*******************************************************************************
// * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
// * All rights reserved. This program and the accompanying materials
// * are made available under the terms of the Eclipse Public License v1.0
// * which accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// *******************************************************************************/
//package org.eclipse.xtext.graphview.behavior.layout;
//
//import java.util.Map;
//
//import org.apache.log4j.Logger;
//import org.eclipse.draw2d.Connection;
//import org.eclipse.draw2d.ConnectionRouter;
//import org.eclipse.draw2d.IFigure;
//import org.eclipse.draw2d.Layer;
//import org.eclipse.draw2d.geometry.Dimension;
//import org.eclipse.draw2d.geometry.Rectangle;
//import org.eclipse.xtext.graphview.shape.FigureUtil;
//import org.eclipse.zest.layouts.InvalidLayoutConfiguration;
//import org.eclipse.zest.layouts.LayoutEntity;
//import org.eclipse.zest.layouts.LayoutRelationship;
//import org.eclipse.zest.layouts.LayoutStyles;
//import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
//import org.eclipse.zest.layouts.exampleStructures.SimpleNode;
//import org.eclipse.zest.layouts.exampleStructures.SimpleRelationship;
//
//import com.google.common.collect.Iterables;
//import com.google.common.collect.Maps;
//
//public class SpringAutoLayout extends AbstractAutoLayout {
//
//	private double blankToNodeAreaRatio = 3.1;
//
//	private double aspectRatio = 4. / 3.;
//
//	private static final Logger LOG = Logger.getLogger(SpringAutoLayout.class);
//
//	private int iterations = 200;
//
//	public Rectangle layout(IFigure container) {
//		SpringLayoutAlgorithm layoutAlgorithm = new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
//		Map<ILayoutNode, LayoutEntity> childrenToNodes = Maps.newHashMap();
//		Map<Connection, LayoutRelationship> connectionToEdges = Maps.newHashMap();
//		for (Object child : container.getChildren()) {
//			if (child instanceof ILayoutNode) {
//				ILayoutNode childFigure = (ILayoutNode) child;
//				Dimension childPreferredSize = childFigure.getPreferredSize();
//				SimpleNode graphNode = new SimpleNode(childFigure, 0, 0, childPreferredSize.width, childPreferredSize.height);
//				childrenToNodes.put(childFigure, graphNode);
//			}
//		}
//		Layer connectionLayer = FigureUtil.getConnectionLayer(container);
//		ConnectionRouter connectionRouter = getConnectionRouter(container);
//		if (connectionLayer != null) {
//			for (Object child : connectionLayer.getChildren()) {
//				if (child instanceof Connection) {
//					Connection connection = (Connection) child;
//					connection.setConnectionRouter(connectionRouter);
//					LayoutEntity sourceNode = childrenToNodes.get(connection.getSourceAnchor().getOwner());
//					LayoutEntity targetNode = childrenToNodes.get(connection.getSourceAnchor().getOwner());
//					if (targetNode != null && sourceNode != null) {
//						SimpleRelationship edge = new SimpleRelationship(sourceNode, targetNode, false);
//						connectionToEdges.put(connection, edge);
//					}
//				}
//			}
//		}
//		try {
//			Dimension estimatedSize = getPeferredSize(container);
//			layoutAlgorithm.setIterations(getIterations());
//			layoutAlgorithm.setRandom(false);
//			layoutAlgorithm.applyLayout(Iterables.toArray(childrenToNodes.values(), LayoutEntity.class),
//					Iterables.toArray(connectionToEdges.values(), LayoutRelationship.class), 0, 0, estimatedSize.width,
//					estimatedSize.height, false, false);
//			for (Map.Entry<ILayoutNode, LayoutEntity> entry : childrenToNodes.entrySet()) {
//				LayoutEntity node = entry.getValue();
//				ILayoutNode figure = entry.getKey();
//				Rectangle bounds = new Rectangle((int) node.getXInLayout(), (int) node.getYInLayout(), (int) node.getWidthInLayout(),
//						(int) node.getHeightInLayout());
//				figure.setBounds(bounds);
//				container.setConstraint((IFigure) figure, bounds);
//			}
//			return new Rectangle(0, 0, estimatedSize.width, estimatedSize.height);
//		} catch (InvalidLayoutConfiguration e) {
//			LOG.error("Error in layout config", e);
//			return new Rectangle();
//		}
//	}
//
//	protected Dimension getPeferredSize(IFigure container) {
//		int area = 0;
//		for (Object child : container.getChildren()) {
//			if (child instanceof IFigure) {
//				IFigure childFigure = (IFigure) child;
//				area += childFigure.getPreferredSize().getArea();
//			}
//		}
//		double completeArea = getBlankToNodeAreaRatio() * area;
//		return new Dimension((int) Math.sqrt(completeArea * getAspectRatio()), (int) Math.sqrt(completeArea / getAspectRatio()));
//	}
//
//	public double getAspectRatio() {
//		return aspectRatio;
//	}
//
//	public void setAspectRatio(double aspectRatio) {
//		this.aspectRatio = aspectRatio;
//	}
//
//	public double getBlankToNodeAreaRatio() {
//		return blankToNodeAreaRatio;
//	}
//
//	public void setBlankToNodeAreaRatio(double blankToNodeAreaRatio) {
//		this.blankToNodeAreaRatio = blankToNodeAreaRatio;
//	}
//
//	public int getIterations() {
//		return iterations;
//	}
//
//	public void setIterations(int iterations) {
//		this.iterations = iterations;
//	}
//}
