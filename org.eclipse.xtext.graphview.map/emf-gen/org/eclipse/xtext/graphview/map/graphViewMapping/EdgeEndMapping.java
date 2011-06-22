/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.xtext.graphview.map.graphViewMapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge End Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping#isCreate <em>Create</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getEdgeEndMapping()
 * @model
 * @generated
 */
public interface EdgeEndMapping extends AbstractExpressionMapping {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' reference.
	 * @see #setMapping(AbstractExpressionMapping)
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getEdgeEndMapping_Mapping()
	 * @model
	 * @generated
	 */
	AbstractExpressionMapping getMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping#getMapping <em>Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(AbstractExpressionMapping value);

	/**
	 * Returns the value of the '<em><b>Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create</em>' attribute.
	 * @see #setCreate(boolean)
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getEdgeEndMapping_Create()
	 * @model
	 * @generated
	 */
	boolean isCreate();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping#isCreate <em>Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create</em>' attribute.
	 * @see #isCreate()
	 * @generated
	 */
	void setCreate(boolean value);

} // EdgeEndMapping
