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
 *   <li>{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping#isCall <em>Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getEdgeEndMapping()
 * @model
 * @generated
 */
public interface EdgeEndMapping extends AbstractMappingReference {
	/**
	 * Returns the value of the '<em><b>Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call</em>' attribute.
	 * @see #setCall(boolean)
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#getEdgeEndMapping_Call()
	 * @model
	 * @generated
	 */
	boolean isCall();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping#isCall <em>Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call</em>' attribute.
	 * @see #isCall()
	 * @generated
	 */
	void setCall(boolean value);

} // EdgeEndMapping
