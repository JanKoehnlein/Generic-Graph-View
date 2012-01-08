package org.eclipse.xtext.graphview.rapidbuttons;

import org.eclipse.draw2d.Graphics;
import org.eclipse.gef.handles.AbstractHandle;
import org.eclipse.swt.graphics.Image;

public abstract class AbstractRapidButton extends AbstractHandle {

	private Image image;
	
	private RapidButtonEditPolicy editPolicy;
	
	public void init(RapidButtonEditPolicy editPolicy) {
		this.editPolicy = editPolicy;
		image = editPolicy.getImage(getImagePath());
		setPreferredSize(image.getBounds().width, image.getBounds().height);
		setOwner(editPolicy.getHost());
		RapidButtonLocator locator = editPolicy.getLocator();
		setLocator(locator);
		locator.add(this);
	}
	
	abstract protected String getImagePath(); 
	
	@Override
	public void paintFigure(Graphics g) {
		g.drawImage(image, getBounds().getLocation());
	}
	
	protected RapidButtonEditPolicy getEditPolicy() {
		return editPolicy;
	}
	
}
