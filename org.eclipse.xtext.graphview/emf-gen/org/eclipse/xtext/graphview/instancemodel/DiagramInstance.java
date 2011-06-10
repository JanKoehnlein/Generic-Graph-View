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
 * A representation of the model object '<em><b>Diagram Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.instancemodel.DiagramInstance#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage#getDiagramInstance()
 * @model
 * @generated
 */
public interface DiagramInstance extends AbstractInstance {

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.graphview.instancemodel.EdgeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage#getDiagramInstance_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<EdgeInstance> getEdges();
} // DiagramInstance
