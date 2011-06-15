package org.eclipse.xtext.graphview.shape;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.swt.SWT;

public class DiagramShape extends FreeformLayer {

	public DiagramShape() {
		setLayoutManager(new XYLayout());
		setFont(FontLiterals.font("Helvetica", 11, SWT.None));
	}
}
