package org.eclipse.xtext.graphview.editpart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.GraphicalEditPart;

public interface IInstanceModelEditPart extends GraphicalEditPart {

	IFigure createDefaultFigure();
}
