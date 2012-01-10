/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.map.graphViewMapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping#getSourceMapping <em>Source Mapping</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping#getTargetMapping <em>Target Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getEdgeMapping()
 * @model
 * @generated
 */
public interface EdgeMapping extends AbstractMappingDefinition, AbstractExpressionMapping
{
	/**
	 * Returns the value of the '<em><b>Source Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Mapping</em>' containment reference.
	 * @see #setSourceMapping(EdgeEndMapping)
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getEdgeMapping_SourceMapping()
	 * @model containment="true"
	 * @generated
	 */
	EdgeEndMapping getSourceMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping#getSourceMapping <em>Source Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Mapping</em>' containment reference.
	 * @see #getSourceMapping()
	 * @generated
	 */
	void setSourceMapping(EdgeEndMapping value);

	/**
	 * Returns the value of the '<em><b>Target Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Mapping</em>' containment reference.
	 * @see #setTargetMapping(EdgeEndMapping)
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getEdgeMapping_TargetMapping()
	 * @model containment="true"
	 * @generated
	 */
	EdgeEndMapping getTargetMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping#getTargetMapping <em>Target Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Mapping</em>' containment reference.
	 * @see #getTargetMapping()
	 * @generated
	 */
	void setTargetMapping(EdgeEndMapping value);

} // EdgeMapping
