/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.xtext.graphview.instancemodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.NodeInstance#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.NodeInstance#getIncomingEdges <em>Incoming Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage#getNodeInstance()
 * @model
 * @generated
 */
public interface NodeInstance extends AbstractInstance {

	/**
	 * Returns the value of the '<em><b>Outgoing Edges</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.xtext.graphview.instancemodel.EdgeInstance}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtext.graphview.instancemodel.EdgeInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edges</em>' reference list.
	 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage#getNodeInstance_OutgoingEdges()
	 * @see org.eclipse.xtext.graphview.instancemodel.EdgeInstance#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<EdgeInstance> getOutgoingEdges();

	/**
	 * Returns the value of the '<em><b>Incoming Edges</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.xtext.graphview.instancemodel.EdgeInstance}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.xtext.graphview.instancemodel.EdgeInstance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Edges</em>' reference list.
	 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage#getNodeInstance_IncomingEdges()
	 * @see org.eclipse.xtext.graphview.instancemodel.EdgeInstance#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<EdgeInstance> getIncomingEdges();
} // NodeInstance
