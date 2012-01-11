package org.eclipse.xtext.graphview.rapidbuttons;

import org.eclipse.draw2d.Graphics;
import org.eclipse.gef.handles.AbstractHandle;
import org.eclipse.swt.graphics.Image;

public abstract class AbstractRapidButton extends AbstractHandle {

	private Image image;
	
	private RapidButtonEditPolicy editPolicy;
	
	public void init(RapidButtonEditPolicy editPolicy, int position) {
		this.editPolicy = editPolicy;
		image = editPolicy.getImage(getImagePath());
		setPreferredSize(image.getBounds().width, image.getBounds().height);
		setOwner(editPolicy.getHost());
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
