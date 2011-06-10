/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.xtext.graphview.instancemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.EdgeInstance#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.EdgeInstance#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage#getEdgeInstance()
 * @model
 * @generated
 */
public interface EdgeInstance extends AbstractInstance {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtext.graphview.instancemodel.NodeInstance#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NodeInstance)
	 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage#getEdgeInstance_Source()
	 * @see org.eclipse.xtext.graphview.instancemodel.NodeInstance#getOutgoingEdges
	 * @model opposite="outgoingEdges"
	 * @generated
	 */
	NodeInstance getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.instancemodel.EdgeInstance#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NodeInstance value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtext.graphview.instancemodel.NodeInstance#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NodeInstance)
	 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage#getEdgeInstance_Target()
	 * @see org.eclipse.xtext.graphview.instancemodel.NodeInstance#getIncomingEdges
	 * @model opposite="incomingEdges"
	 * @generated
	 */
	NodeInstance getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.instancemodel.EdgeInstance#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NodeInstance value);

} // EdgeInstance
