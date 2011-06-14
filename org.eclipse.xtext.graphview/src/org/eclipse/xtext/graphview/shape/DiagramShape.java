package org.eclipse.xtext.graphview.shape;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.XYLayout;

public class DiagramShape extends FreeformLayer {

	public DiagramShape() {
		setLayoutManager(new XYLayout());
	}
}
