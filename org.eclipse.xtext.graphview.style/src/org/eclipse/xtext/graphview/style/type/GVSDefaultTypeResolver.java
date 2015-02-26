package org.eclipse.xtext.graphview.style.type;

import static java.util.Collections.singletonList;
import static org.eclipse.emf.ecore.util.EcoreUtil.getRootContainer;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.typesystem.internal.DefaultBatchTypeResolver;

public class GVSDefaultTypeResolver extends DefaultBatchTypeResolver {

	@Override
	protected List<EObject> getEntryPoints(EObject object) {
		return singletonList(getRootContainer(object));
	}
}
