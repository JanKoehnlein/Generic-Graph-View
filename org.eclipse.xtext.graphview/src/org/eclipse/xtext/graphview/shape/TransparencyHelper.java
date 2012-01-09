package org.eclipse.xtext.graphview.shape;

import org.eclipse.draw2d.IFigure;
import org.eclipse.swt.graphics.Color;

public class TransparencyHelper {

	private ColorMemento colorMemento;

	private IFigure figure;

	public void setFigure(IFigure figure) {
		this.figure = figure;
	}

	public void setTransparent(boolean isTransparent) {
		if (isTransparent) {
			if (colorMemento == null) {
				colorMemento = new ColorMemento(figure);
				makeTransparent(figure);
			}
		} else {
			if (colorMemento != null) {
				colorMemento.restore();
				colorMemento = null;
			}
		}
	}

	public void makeTransparent(IFigure figure) {
		figure.setForegroundColor(makeTransparent(figure.getForegroundColor()));
		figure.setBackgroundColor(makeTransparent(figure.getBackgroundColor()));
		for (Object child : figure.getChildren())
			if (child instanceof IFigure)
				makeTransparent((IFigure) child);
	}

	protected Color makeTransparent(Color c) {
		int red = c.getRed() + 192;
		int green = c.getGreen() + 192;
		int blue = c.getBlue() + 192;
		int max = Math.max(red, Math.max(green, blue));
		if (max > 255) {
			int delta = max - 255;
			red -= delta;
			green -= delta;
			blue -= delta;
		}
		return ColorLiterals.color(red, green, blue);
	}

	protected int makeTransparent(int color) {
		return Math.min(color + 64, 255);
	}

}
