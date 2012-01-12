package org.eclipse.xtext.graphview.rapidbuttons;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RelativeLocator;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;

public class RapidButtonLocator extends RelativeLocator {

	public static final int OFFSET = 10;
	
	private boolean isOutside;

	public RapidButtonLocator(IFigure reference, int direction,
			boolean isOutside) {
		super(reference, direction);
		this.isOutside = isOutside;
	}

	@Override
	protected Rectangle getReferenceBox() {
		Rectangle box = super.getReferenceBox().getCopy();
		Insets insets = new Insets(OFFSET, OFFSET, OFFSET, OFFSET);
		if (isOutside)
			box.expand(insets);
		else
			box.shrink(insets);
		return box;
	}

}
