package org.eclipse.xtext.graphview.map.names;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;

@SuppressWarnings("restriction")
public class GVMQualifiedNameProvider extends XbaseQualifiedNameProvider {

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if(obj instanceof JvmFormalParameter || obj instanceof JvmTypeParameter)
			return null;
		else
			return super.getFullyQualifiedName(obj);
	}
}
