/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview.lib.shape;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.PrecisionPoint;

/**
 * A cubic B-spline connection.
 * 
 * @author Jan Koehnlein
 */
public class SplineConnectionShape extends ConnectionShape {

	// basis function
	protected double b(int i, double t) {
		switch (i) {
		case -2:
			return (((-t + 3) * t - 3) * t + 1) / 6;
		case -1:
			return (((3 * t - 6) * t) * t + 4) / 6;
		case 0:
			return (((-3 * t + 3) * t + 3) * t + 1) / 6;
		case 1:
			return (t * t * t) / 6;
		}
		return 0;
	}

	protected PrecisionPoint p(PointList controlPoints, int i, double t) {
		float px = 0;
		float py = 0;
		for (int j = -2; j <= 1; j++) {
			Point controlPoint = controlPoints.getPoint(i + j);
			px += b(j, t) * controlPoint.preciseX();
			py += b(j, t) * controlPoint.preciseY();
		}
		return new PrecisionPoint(px, py);
	}

	protected PointList getControlPoints(double tolerance) {
		PointList controlPoints = new PointList();
		PointList bendPoints = getPoints().getCopy();
		Point previousPoint = bendPoints.getFirstPoint();
		controlPoints.addPoint(previousPoint);
		controlPoints.addPoint(previousPoint);
		controlPoints.addPoint(previousPoint);
		for (int i = 1; i < bendPoints.size(); ++i) {
			Point nextPoint = bendPoints.getPoint(i);
			double deltaX = nextPoint.preciseX() - previousPoint.preciseX();
			double deltaY = nextPoint.preciseY() - previousPoint.preciseY();
			if (deltaX * deltaX + deltaY * deltaY > tolerance) {
				controlPoints.addPoint(nextPoint);
				previousPoint = nextPoint;
			}
		}
		controlPoints.addPoint(previousPoint);
		controlPoints.addPoint(previousPoint);
		return controlPoints;
	}

	@Override
	protected void outlineShape(Graphics g) {
		double scale = g.getAbsoluteScale();
		double tolerance = scale * getLineWidthFloat() * scale * getLineWidthFloat();
		PointList controlPoints = getControlPoints(scale);
		PointList polylinePoints = new PointList();
		PrecisionPoint segmentStart = p(controlPoints, 2, 0.);
		polylinePoints.addPoint(segmentStart);
		for (int i = 2; i < controlPoints.size() - 1; i++) {
			PrecisionPoint segmentEnd = p(controlPoints, i, 1.);
			polylinePoints.addPoint((int) Math.floor(segmentEnd.preciseX()), (int) Math.floor(segmentEnd.preciseY()));
			calculateMiddlePoints(controlPoints, i, 0., segmentStart, 1., segmentEnd, polylinePoints.size() - 1, polylinePoints, tolerance);
			segmentStart = segmentEnd;
		}
		g.drawPolyline(polylinePoints);
	}

	protected void calculateMiddlePoints(PointList controlPoints, int segment, double tStart, PrecisionPoint segmentStart, double tEnd,
			PrecisionPoint segmentEnd, int endIndex, PointList points, double tolerance) {
		double tMid = (tStart + tEnd) / 2.;
		PrecisionPoint midPoint = p(controlPoints, segment, tMid);
		double distance = distanceSqr(segmentStart, segmentEnd, midPoint, tolerance);
		points.insertPoint(new Point((int) Math.floor(midPoint.preciseX()), (int) Math.floor(midPoint.preciseY())), endIndex);
		if (distance > 3) {
			calculateMiddlePoints(controlPoints, segment, tMid, midPoint, tEnd, segmentEnd, endIndex + 1, points, tolerance);
			calculateMiddlePoints(controlPoints, segment, tStart, segmentStart, tMid, midPoint, endIndex, points, tolerance);
		}
	}

	protected double distanceSqr(PrecisionPoint segmentStart, PrecisionPoint segmentEnd, PrecisionPoint midPoint, double tolerance) {
		double deltaX = segmentEnd.preciseX() - segmentStart.preciseX();
		double deltaY = segmentEnd.preciseY() - segmentStart.preciseY();
		double deltaLengthSqr = deltaX * deltaX + deltaY * deltaY;
		if (deltaLengthSqr < tolerance) {
			return 0.;
		}
		double relativeMidX = midPoint.preciseX() - segmentStart.preciseX();
		double relativeMidY = midPoint.preciseY() - segmentStart.preciseY();
		double scalarProd = (deltaX * relativeMidX + deltaY * relativeMidY) / deltaLengthSqr;
		double normalX = relativeMidX - deltaX * scalarProd;
		double normalY = relativeMidY - deltaY * scalarProd;
		return normalX * normalX + normalY * normalY;
	}

}
