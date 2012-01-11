package org.eclipse.xtext.graphview.rapidbuttons;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RelativeLocator;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;

public class CompassOutsideBorderLocator extends RelativeLocator {

	public static final int OFFSET = 10;

	public CompassOutsideBorderLocator(IFigure reference, int direction) {
		super(reference, direction);
	}
	
	@Override
	protected Rectangle getReferenceBox() {
		Rectangle box = super.getReferenceBox().getCopy();
		box.expand(new Insets(OFFSET, OFFSET, OFFSET, OFFSET));
		return box;
	}
}
