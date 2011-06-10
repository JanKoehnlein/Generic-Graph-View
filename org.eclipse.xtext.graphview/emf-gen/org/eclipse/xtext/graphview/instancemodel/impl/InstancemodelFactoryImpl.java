/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.xtext.graphview.instancemodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.graphview.instancemodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstancemodelFactoryImpl extends EFactoryImpl implements InstancemodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstancemodelFactory init() {
		try {
			InstancemodelFactory theInstancemodelFactory = (InstancemodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/graphView/instancemodel"); 
			if (theInstancemodelFactory != null) {
				return theInstancemodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InstancemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancemodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InstancemodelPackage.DIAGRAM_INSTANCE: return createDiagramInstance();
			case InstancemodelPackage.NODE_INSTANCE: return createNodeInstance();
			case InstancemodelPackage.LABEL_INSTANCE: return createLabelInstance();
			case InstancemodelPackage.EDGE_INSTANCE: return createEdgeInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramInstance createDiagramInstance() {
		DiagramInstanceImpl diagramInstance = new DiagramInstanceImpl();
		return diagramInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeInstance createNodeInstance() {
		NodeInstanceImpl nodeInstance = new NodeInstanceImpl();
		return nodeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelInstance createLabelInstance() {
		LabelInstanceImpl labelInstance = new LabelInstanceImpl();
		return labelInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeInstance createEdgeInstance() {
		EdgeInstanceImpl edgeInstance = new EdgeInstanceImpl();
		return edgeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancemodelPackage getInstancemodelPackage() {
		return (InstancemodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InstancemodelPackage getPackage() {
		return InstancemodelPackage.eINSTANCE;
	}

} //InstancemodelFactoryImpl
