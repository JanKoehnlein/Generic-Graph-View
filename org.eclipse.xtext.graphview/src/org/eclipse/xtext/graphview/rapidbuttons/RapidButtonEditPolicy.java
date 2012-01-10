package org.eclipse.xtext.graphview.rapidbuttons;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editparts.FreeformGraphicalRootEditPart;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.xtext.graphview.editpart.AbstractMappingEditPart;
import org.eclipse.xtext.ui.PluginImageHelper;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

public class RapidButtonEditPolicy extends AbstractEditPolicy {

	public static final String ROLE = "Rapid Button Role";
	
	private List<AbstractRapidButton> buttons;

	@Inject
	private HideButton hideButton;
	
	@Inject
	private RevealButton revealButton;
	
	@Inject
	private RapidButtonLocator locator;

	@Inject
	private PluginImageHelper imageHelper;

	@Override
	public void showTargetFeedback(Request request) {
		if (request.getType() == RequestConstants.REQ_SELECTION_HOVER)
			showButtons();
		super.showTargetFeedback(request);
	}
	
	@Override
	public void eraseTargetFeedback(Request request) {
		if (request.getType() == RequestConstants.REQ_SELECTION_HOVER) {
			new UIJob("Hide buttons") {
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) {
					hideButtons();
					return Status.OK_STATUS;
				}
			}.schedule(1000);
		}
		super.eraseTargetFeedback(request);
	}

	protected List<AbstractRapidButton> getRapidButtons() {
		if (buttons == null) {
			locator.init(getHost().getFigure());
			buttons = Lists.newArrayList();
			if(getHost().hasHiddenEdge()) 
				addButton(revealButton);
			addButton(hideButton);
		}
		return buttons;
	}

	protected void addButton(AbstractRapidButton button) {
		button.init(this);
		buttons.add(button);
		getHandleLayer().add(button);
	}
	
	protected void showButtons() {
		for (AbstractRapidButton button : getRapidButtons()) {
			button.setVisible(true);
		}
	}

	protected void hideButtons() {
		for (AbstractRapidButton button : getRapidButtons()) {
			button.setVisible(false);
		}
	}

	private IFigure getHandleLayer() {
		return ((FreeformGraphicalRootEditPart) getHost().getRoot())
				.getLayer(LayerConstants.HANDLE_LAYER);
	}
	
	public Image getImage(String path) {
		return imageHelper.getImage(path);
	}
	
	public RapidButtonLocator getLocator() {
		return locator;
	}
	
	@Override
	public AbstractMappingEditPart getHost() {
		return (AbstractMappingEditPart) super.getHost();
	}
}
