package org.eclipse.xtext.graphview.view;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.inject.Inject;

public class RefreshAction extends Action {

	@Inject
	private GraphView graphView;

	public RefreshAction() {
		super();
		setText("Redraw");
		setToolTipText("Redraw this diagram");
	}
	
	@Inject 
	protected void setImages(PluginImageHelper imageHelper) {
		setImageDescriptor(ImageDescriptor.createFromImage(imageHelper
				.getImage("elcl16/refresh_nav.gif")));
		setDisabledImageDescriptor(ImageDescriptor.createFromImage(imageHelper
				.getImage("elcl16/refresh_nav.gif")));
	}

	@Override
	public void run() {
		graphView.refresh();
	}
}