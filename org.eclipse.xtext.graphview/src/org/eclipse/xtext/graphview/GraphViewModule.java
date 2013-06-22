/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.graphview;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
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
import org.eclipse.xtext.resource.impl.LiveShadowedResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;
import org.eclipse.xtext.ui.shared.Access;

import com.google.inject.AbstractModule;
import com.google.inject.Provider;
import com.google.inject.name.Names;

@SuppressWarnings("restriction")
public class GraphViewModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IResourceDescriptions.class).toProvider(Access.getIResourceDescriptions());
		bind(IResourceDescriptions.class).annotatedWith(Names.named(ResourceDescriptionsProvider.LIVE_SCOPE)).to(LiveShadowedResourceDescriptions.class);
		bind(IResourceDescriptions.class).annotatedWith(Names.named(ResourceDescriptionsProvider.NAMED_BUILDER_SCOPE)).toProvider(Access.getIResourceDescriptions());

		bind(IJvmTypeProvider.Factory.class).to(JdtTypeProviderFactory.class);
		bind(IResourceSetProvider.class).to(XtextResourceSetProvider.class);

		bind(IInstanceMapper.class).toProvider(new Provider<IInstanceMapper>() {
			public IInstanceMapper get() {
				return GraphViewMappingActivator.getInstance().getInjector("org.eclipse.xtext.graphview.map.GraphViewMapping")
						.getInstance(IInstanceMapper.class);
			}
		});
		bind(IStyler.class).toProvider(new Provider<IStyler>() {
			public IStyler get() {
				return GraphViewStyleActivator.getInstance().getInjector("org.eclipse.xtext.graphview.style.GraphViewStyle")
						.getInstance(IStyler.class);
			}
		});
		bind(IWorkbench.class).toProvider(new Provider<IWorkbench>() {
			public IWorkbench get() {
				return PlatformUI.getWorkbench();
			}
		});
		bind(IExtensionRegistry.class).toProvider(new Provider<IExtensionRegistry>() {
			public IExtensionRegistry get() {
				return Platform.getExtensionRegistry();
			}
		});
		bind(AbstractUIPlugin.class).toInstance(Activator.getDefault());
	}

}
