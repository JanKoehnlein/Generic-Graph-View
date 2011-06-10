/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.xtext.graphview.instancemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelFactory
 * @model kind="package"
 * @generated
 */
public interface InstancemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instancemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xtext.org/graphView/instancemodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "instancemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstancemodelPackage eINSTANCE = org.eclipse.xtext.graphview.instancemodel.impl.InstancemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.instancemodel.impl.AbstractInstanceImpl <em>Abstract Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.instancemodel.impl.AbstractInstanceImpl
	 * @see org.eclipse.xtext.graphview.instancemodel.impl.InstancemodelPackageImpl#getAbstractInstance()
	 * @generated
	 */
	int ABSTRACT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INSTANCE__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INSTANCE__CHILDREN = 1;

	/**
	 * The feature id for the '<em><b>Semantic Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INSTANCE__SEMANTIC_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INSTANCE__MAPPING = 3;

	/**
	 * The number of structural features of the '<em>Abstract Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.instancemodel.impl.DiagramInstanceImpl <em>Diagram Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.instancemodel.impl.DiagramInstanceImpl
	 * @see org.eclipse.xtext.graphview.instancemodel.impl.InstancemodelPackageImpl#getDiagramInstance()
	 * @generated
	 */
	int DIAGRAM_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_INSTANCE__PARENT = ABSTRACT_INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_INSTANCE__CHILDREN = ABSTRACT_INSTANCE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Semantic Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_INSTANCE__SEMANTIC_ELEMENT = ABSTRACT_INSTANCE__SEMANTIC_ELEMENT;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_INSTANCE__MAPPING = ABSTRACT_INSTANCE__MAPPING;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_INSTANCE__EDGES = ABSTRACT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_INSTANCE_FEATURE_COUNT = ABSTRACT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.instancemodel.impl.NodeInstanceImpl <em>Node Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.instancemodel.impl.NodeInstanceImpl
	 * @see org.eclipse.xtext.graphview.instancemodel.impl.InstancemodelPackageImpl#getNodeInstance()
	 * @generated
	 */
	int NODE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE__PARENT = ABSTRACT_INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE__CHILDREN = ABSTRACT_INSTANCE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Semantic Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE__SEMANTIC_ELEMENT = ABSTRACT_INSTANCE__SEMANTIC_ELEMENT;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE__MAPPING = ABSTRACT_INSTANCE__MAPPING;

	/**
	 * The feature id for the '<em><b>Outgoing Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE__OUTGOING_EDGES = ABSTRACT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE__INCOMING_EDGES = ABSTRACT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE_FEATURE_COUNT = ABSTRACT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.instancemodel.impl.LabelInstanceImpl <em>Label Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.instancemodel.impl.LabelInstanceImpl
	 * @see org.eclipse.xtext.graphview.instancemodel.impl.InstancemodelPackageImpl#getLabelInstance()
	 * @generated
	 */
	int LABEL_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_INSTANCE__PARENT = ABSTRACT_INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_INSTANCE__CHILDREN = ABSTRACT_INSTANCE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Semantic Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_INSTANCE__SEMANTIC_ELEMENT = ABSTRACT_INSTANCE__SEMANTIC_ELEMENT;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_INSTANCE__MAPPING = ABSTRACT_INSTANCE__MAPPING;

	/**
	 * The number of structural features of the '<em>Label Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_INSTANCE_FEATURE_COUNT = ABSTRACT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.instancemodel.impl.EdgeInstanceImpl <em>Edge Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.instancemodel.impl.EdgeInstanceImpl
	 * @see org.eclipse.xtext.graphview.instancemodel.impl.InstancemodelPackageImpl#getEdgeInstance()
	 * @generated
	 */
	int EDGE_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_INSTANCE__PARENT = ABSTRACT_INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_INSTANCE__CHILDREN = ABSTRACT_INSTANCE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Semantic Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_INSTANCE__SEMANTIC_ELEMENT = ABSTRACT_INSTANCE__SEMANTIC_ELEMENT;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_INSTANCE__MAPPING = ABSTRACT_INSTANCE__MAPPING;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_INSTANCE__SOURCE = ABSTRACT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_INSTANCE__TARGET = ABSTRACT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Edge Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_INSTANCE_FEATURE_COUNT = ABSTRACT_INSTANCE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance <em>Abstract Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Instance</em>'.
	 * @see org.eclipse.xtext.graphview.instancemodel.AbstractInstance
	 * @generated
	 */
	EClass getAbstractInstance();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getParent()
	 * @see #getAbstractInstance()
	 * @generated
	 */
	EReference getAbstractInstance_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getChildren()
	 * @see #getAbstractInstance()
	 * @generated
	 */
	EReference getAbstractInstance_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getSemanticElement <em>Semantic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Element</em>'.
	 * @see org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getSemanticElement()
	 * @see #getAbstractInstance()
	 * @generated
	 */
	EAttribute getAbstractInstance_SemanticElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.instancemodel.AbstractInstance#getMapping()
	 * @see #getAbstractInstance()
	 * @generated
	 */
	EReference getAbstractInstance_Mapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.instancemodel.DiagramInstance <em>Diagram Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Instance</em>'.
	 * @see org.eclipse.xtext.graphview.instancemodel.DiagramInstance
	 * @generated
	 */
	EClass getDiagramInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.graphview.instancemodel.DiagramInstance#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see org.eclipse.xtext.graphview.instancemodel.DiagramInstance#getEdges()
	 * @see #getDiagramInstance()
	 * @generated
	 */
	EReference getDiagramInstance_Edges();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.instancemodel.NodeInstance <em>Node Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Instance</em>'.
	 * @see org.eclipse.xtext.graphview.instancemodel.NodeInstance
	 * @generated
	 */
	EClass getNodeInstance();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xtext.graphview.instancemodel.NodeInstance#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Edges</em>'.
	 * @see org.eclipse.xtext.graphview.instancemodel.NodeInstance#getOutgoingEdges()
	 * @see #getNodeInstance()
	 * @generated
	 */
	EReference getNodeInstance_OutgoingEdges();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xtext.graphview.instancemodel.NodeInstance#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Edges</em>'.
	 * @see org.eclipse.xtext.graphview.instancemodel.NodeInstance#getIncomingEdges()
	 * @see #getNodeInstance()
	 * @generated
	 */
	EReference getNodeInstance_IncomingEdges();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.instancemodel.LabelInstance <em>Label Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Instance</em>'.
	 * @see org.eclipse.xtext.graphview.instancemodel.LabelInstance
	 * @generated
	 */
	EClass getLabelInstance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.instancemodel.EdgeInstance <em>Edge Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Instance</em>'.
	 * @see org.eclipse.xtext.graphview.instancemodel.EdgeInstance
	 * @generated
	 */
	EClass getEdgeInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtext.graphview.instancemodel.EdgeInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.xtext.graphview.instancemodel.EdgeInstance#getSource()
	 * @see #getEdgeInstance()
	 * @generated
	 */
	EReference getEdgeInstance_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtext.graphview.instancemodel.EdgeInstance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.xtext.graphview.instancemodel.EdgeInstance#getTarget()
	 * @see #getEdgeInstance()
	 * @generated
	 */
	EReference getEdgeInstance_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstancemodelFactory getInstancemodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.instancemodel.impl.AbstractInstanceImpl <em>Abstract Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.instancemodel.impl.AbstractInstanceImpl
		 * @see org.eclipse.xtext.graphview.instancemodel.impl.InstancemodelPackageImpl#getAbstractInstance()
		 * @generated
		 */
		EClass ABSTRACT_INSTANCE = eINSTANCE.getAbstractInstance();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_INSTANCE__PARENT = eINSTANCE.getAbstractInstance_Parent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_INSTANCE__CHILDREN = eINSTANCE.getAbstractInstance_Children();

		/**
		 * The meta object literal for the '<em><b>Semantic Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_INSTANCE__SEMANTIC_ELEMENT = eINSTANCE.getAbstractInstance_SemanticElement();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_INSTANCE__MAPPING = eINSTANCE.getAbstractInstance_Mapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.instancemodel.impl.DiagramInstanceImpl <em>Diagram Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.instancemodel.impl.DiagramInstanceImpl
		 * @see org.eclipse.xtext.graphview.instancemodel.impl.InstancemodelPackageImpl#getDiagramInstance()
		 * @generated
		 */
		EClass DIAGRAM_INSTANCE = eINSTANCE.getDiagramInstance();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_INSTANCE__EDGES = eINSTANCE.getDiagramInstance_Edges();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.instancemodel.impl.NodeInstanceImpl <em>Node Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.instancemodel.impl.NodeInstanceImpl
		 * @see org.eclipse.xtext.graphview.instancemodel.impl.InstancemodelPackageImpl#getNodeInstance()
		 * @generated
		 */
		EClass NODE_INSTANCE = eINSTANCE.getNodeInstance();

		/**
		 * The meta object literal for the '<em><b>Outgoing Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_INSTANCE__OUTGOING_EDGES = eINSTANCE.getNodeInstance_OutgoingEdges();

		/**
		 * The meta object literal for the '<em><b>Incoming Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_INSTANCE__INCOMING_EDGES = eINSTANCE.getNodeInstance_IncomingEdges();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.instancemodel.impl.LabelInstanceImpl <em>Label Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.instancemodel.impl.LabelInstanceImpl
		 * @see org.eclipse.xtext.graphview.instancemodel.impl.InstancemodelPackageImpl#getLabelInstance()
		 * @generated
		 */
		EClass LABEL_INSTANCE = eINSTANCE.getLabelInstance();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.instancemodel.impl.EdgeInstanceImpl <em>Edge Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.instancemodel.impl.EdgeInstanceImpl
		 * @see org.eclipse.xtext.graphview.instancemodel.impl.InstancemodelPackageImpl#getEdgeInstance()
		 * @generated
		 */
		EClass EDGE_INSTANCE = eINSTANCE.getEdgeInstance();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_INSTANCE__SOURCE = eINSTANCE.getEdgeInstance_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_INSTANCE__TARGET = eINSTANCE.getEdgeInstance_Target();

	}

} //InstancemodelPackage
