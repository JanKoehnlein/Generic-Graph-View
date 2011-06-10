/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.xtext.graphview.instancemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage
 * @generated
 */
public interface InstancemodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstancemodelFactory eINSTANCE = org.eclipse.xtext.graphview.instancemodel.impl.InstancemodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Diagram Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Instance</em>'.
	 * @generated
	 */
	DiagramInstance createDiagramInstance();

	/**
	 * Returns a new object of class '<em>Node Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Instance</em>'.
	 * @generated
	 */
	NodeInstance createNodeInstance();

	/**
	 * Returns a new object of class '<em>Label Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Instance</em>'.
	 * @generated
	 */
	LabelInstance createLabelInstance();

	/**
	 * Returns a new object of class '<em>Edge Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Instance</em>'.
	 * @generated
	 */
	EdgeInstance createEdgeInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InstancemodelPackage getInstancemodelPackage();

} //InstancemodelFactory
