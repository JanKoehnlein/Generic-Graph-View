package org.eclipse.xtext.graphview.rapidbuttons;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.geometry.Rectangle;

import com.google.common.collect.Lists;

public class RapidButtonLocator implements Locator {

	private List<IFigure> buttons = Lists.newArrayList();

	private IFigure owner;

	public void init(IFigure owner) {
		this.owner = owner;
	}

	public void add(IFigure button) {
		this.buttons.add(button);
	}

	public void relocate(IFigure target) {
		Rectangle ownerBounds = owner.getBounds().getCopy();
		owner.translateToAbsolute(ownerBounds);
		target.translateToRelative(ownerBounds);
		int x = ownerBounds.getRight().x;
		int y = ownerBounds.getTop().y;
		for (int i = 0; i <= buttons.indexOf(target); ++i) {
			x -= buttons.get(i).getPreferredSize().width;
		}
		target.setBounds(new Rectangle(x, y, target.getPreferredSize().width, target
				.getPreferredSize().height));
	}

}
