package org.eclipse.xtext.graphview;

import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.access.jdt.JdtTypeProviderFactory;
import org.eclipse.xtext.graphview.map.IInstanceMapper;
import org.eclipse.xtext.graphview.map.ui.internal.GraphViewMappingActivator;
import org.eclipse.xtext.graphview.style.IStyler;
import org.eclipse.xtext.graphview.style.ui.internal.GraphViewStyleActivator;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;
import org.eclipse.xtext.ui.shared.Access;

import com.google.inject.AbstractModule;
import com.google.inject.Provider;

@SuppressWarnings("restriction")
public class GraphViewModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IResourceDescriptions.class).toProvider(
				Access.getIResourceDescriptions());
		bind(IJvmTypeProvider.Factory.class).to(JdtTypeProviderFactory.class);
		bind(IResourceSetProvider.class).to(XtextResourceSetProvider.class);

		bind(IInstanceMapper.class).toProvider(new Provider<IInstanceMapper>() {
			@Override
			public IInstanceMapper get() {
				return GraphViewMappingActivator
						.getInstance()
						.getInjector(
								"org.eclipse.xtext.graphview.map.GraphViewMapping")
						.getInstance(IInstanceMapper.class);
			}
		});
		bind(IStyler.class).toProvider(new Provider<IStyler>() {
			@Override
			public IStyler get() {
				return GraphViewStyleActivator
						.getInstance()
						.getInjector(
								"org.eclipse.xtext.graphview.style.GraphViewStyle")
						.getInstance(IStyler.class);
			}
		});
		bind(IWorkbench.class).toProvider(new Provider<IWorkbench>() {
			@Override
			public IWorkbench get() {
				return PlatformUI.getWorkbench();
			}
		});
		bind(AbstractUIPlugin.class).toInstance(Activator.getDefault());
	}

}
