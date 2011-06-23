package org.eclipse.xtext.graphview.layout;

import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.IFigure;

public interface IAutoLayout {

	void layout(IFigure container);

	ConnectionRouter getConnectionRouter(IFigure container);

	void setConnectionRouter(ConnectionRouter connectionRouter);
	
}
