/**
 */
package org.eclipse.xtext.graphview.map.graphViewMapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage
 * @generated
 */
public interface GraphViewMappingFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphViewMappingFactory eINSTANCE = org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Abstract Mapping Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Mapping Definition</em>'.
	 * @generated
	 */
	AbstractMappingDefinition createAbstractMappingDefinition();

	/**
	 * Returns a new object of class '<em>Abstract Expression Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Expression Mapping</em>'.
	 * @generated
	 */
	AbstractExpressionMapping createAbstractExpressionMapping();

	/**
	 * Returns a new object of class '<em>Abstract Mapping Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Mapping Reference</em>'.
	 * @generated
	 */
	AbstractMappingReference createAbstractMappingReference();

	/**
	 * Returns a new object of class '<em>Diagram Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Mapping</em>'.
	 * @generated
	 */
	DiagramMapping createDiagramMapping();

	/**
	 * Returns a new object of class '<em>Node Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Mapping</em>'.
	 * @generated
	 */
	NodeMapping createNodeMapping();

	/**
	 * Returns a new object of class '<em>Label Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Mapping</em>'.
	 * @generated
	 */
	LabelMapping createLabelMapping();

	/**
	 * Returns a new object of class '<em>Edge Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Mapping</em>'.
	 * @generated
	 */
	EdgeMapping createEdgeMapping();

	/**
	 * Returns a new object of class '<em>Edge End Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge End Mapping</em>'.
	 * @generated
	 */
	EdgeEndMapping createEdgeEndMapping();

	/**
	 * Returns a new object of class '<em>Mapping Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Call</em>'.
	 * @generated
	 */
	MappingCall createMappingCall();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GraphViewMappingPackage getGraphViewMappingPackage();

} //GraphViewMappingFactory
