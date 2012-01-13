package org.eclipse.xtext.graphview.rapidbuttons;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.graphview.editpolicy.ExpandEditPolicy;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.Visibility;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.inject.Inject;

public class ExpandButton extends AbstractRapidButton {

	@Inject
	private PluginImageHelper imageHelper;

	@Override
	protected Image createImage() {
		return imageHelper.getImage("elcl16/expandall.gif");
	}

	@Override
	protected DragTracker createDragTracker() {
		return new AbstractRapidButtonDragTracker(getEditPolicy().getHost()) {
			@Override
			protected String getCommandName() {
				return "Hide element";
			}

			@Override
			protected Request createSourceRequest() {
				Request expandRequest = new Request(ExpandEditPolicy.REQ_EXPAND);
				return expandRequest;
			}
		};
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible && hasHiddenChildren());
	}

	protected boolean hasHiddenChildren() {
		for (EObject modelChild : EcoreUtil2.eAllContents(getEditPolicy().getHost().getModel())) {
			if (modelChild instanceof AbstractInstance && ((AbstractInstance) modelChild).getVisibility() == Visibility.HIDDEN)
				return true;
		}
		return false;
	}
}
