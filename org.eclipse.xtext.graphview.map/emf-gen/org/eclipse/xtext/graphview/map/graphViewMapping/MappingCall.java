/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.xtext.graphview.map.graphViewMapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.MappingCall#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getMappingCall()
 * @model
 * @generated
 */
public interface MappingCall extends AbstractExpressionMapping {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' reference.
	 * @see #setMapping(AbstractMapping)
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getMappingCall_Mapping()
	 * @model
	 * @generated
	 */
	AbstractMapping getMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.MappingCall#getMapping <em>Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(AbstractMapping value);

} // MappingCall
