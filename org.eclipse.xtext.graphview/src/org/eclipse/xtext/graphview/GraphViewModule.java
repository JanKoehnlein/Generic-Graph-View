package org.eclipse.xtext.graphview;

import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.access.jdt.JdtTypeProviderFactory;
import org.eclipse.xtext.graphview.map.InstanceMapper;
import org.eclipse.xtext.graphview.map.ui.internal.GraphViewMappingActivator;
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
		bind(IResourceDescriptions.class).toProvider(Access.getIResourceDescriptions());
		bind(IJvmTypeProvider.Factory.class).to(JdtTypeProviderFactory.class);
		bind(IResourceSetProvider.class).to(XtextResourceSetProvider.class);
		
		bind(InstanceMapper.class).toProvider(new Provider<InstanceMapper>() {
			@Override
			public InstanceMapper get() {
				return GraphViewMappingActivator.getInstance().getInjector("org.eclipse.xtext.graphview.map.GraphViewMapping").getInstance(InstanceMapper.class);
			}
		});
	}

}
