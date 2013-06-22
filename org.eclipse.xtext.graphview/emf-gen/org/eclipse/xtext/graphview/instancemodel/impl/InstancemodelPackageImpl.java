/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.xtext.graphview.instancemodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtext.graphview.instancemodel.AbstractInstance;
import org.eclipse.xtext.graphview.instancemodel.DiagramInstance;
import org.eclipse.xtext.graphview.instancemodel.EdgeInstance;
import org.eclipse.xtext.graphview.instancemodel.InstancemodelFactory;
import org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage;
import org.eclipse.xtext.graphview.instancemodel.LabelInstance;
import org.eclipse.xtext.graphview.instancemodel.NodeInstance;
import org.eclipse.xtext.graphview.instancemodel.Visibility;
import org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstancemodelPackageImpl extends EPackageImpl implements InstancemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.xtext.graphview.instancemodel.InstancemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InstancemodelPackageImpl() {
		super(eNS_URI, InstancemodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link InstancemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InstancemodelPackage init() {
		if (isInited) return (InstancemodelPackage)EPackage.Registry.INSTANCE.getEPackage(InstancemodelPackage.eNS_URI);

		// Obtain or create and register package
		InstancemodelPackageImpl theInstancemodelPackage = (InstancemodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InstancemodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InstancemodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GraphViewMappingPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInstancemodelPackage.createPackageContents();

		// Initialize created meta-data
		theInstancemodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInstancemodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InstancemodelPackage.eNS_URI, theInstancemodelPackage);
		return theInstancemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractInstance() {
		return abstractInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractInstance_Parent() {
		return (EReference)abstractInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractInstance_Children() {
		return (EReference)abstractInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractInstance_SemanticElement() {
		return (EAttribute)abstractInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractInstance_Mapping() {
		return (EReference)abstractInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractInstance_Visibility() {
		return (EAttribute)abstractInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramInstance() {
		return diagramInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramInstance_Edges() {
		return (EReference)diagramInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagramInstance_OpenNewDiagram() {
		return (EAttribute)diagramInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeInstance() {
		return nodeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeInstance_OutgoingEdges() {
		return (EReference)nodeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeInstance_IncomingEdges() {
		return (EReference)nodeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelInstance() {
		return labelInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeInstance() {
		return edgeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeInstance_Source() {
		return (EReference)edgeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeInstance_Target() {
		return (EReference)edgeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancemodelFactory getInstancemodelFactory() {
		return (InstancemodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractInstanceEClass = createEClass(ABSTRACT_INSTANCE);
		createEReference(abstractInstanceEClass, ABSTRACT_INSTANCE__PARENT);
		createEReference(abstractInstanceEClass, ABSTRACT_INSTANCE__CHILDREN);
		createEAttribute(abstractInstanceEClass, ABSTRACT_INSTANCE__SEMANTIC_ELEMENT);
		createEReference(abstractInstanceEClass, ABSTRACT_INSTANCE__MAPPING);
		createEAttribute(abstractInstanceEClass, ABSTRACT_INSTANCE__VISIBILITY);

		diagramInstanceEClass = createEClass(DIAGRAM_INSTANCE);
		createEReference(diagramInstanceEClass, DIAGRAM_INSTANCE__EDGES);
		createEAttribute(diagramInstanceEClass, DIAGRAM_INSTANCE__OPEN_NEW_DIAGRAM);

		nodeInstanceEClass = createEClass(NODE_INSTANCE);
		createEReference(nodeInstanceEClass, NODE_INSTANCE__OUTGOING_EDGES);
		createEReference(nodeInstanceEClass, NODE_INSTANCE__INCOMING_EDGES);

		labelInstanceEClass = createEClass(LABEL_INSTANCE);

		edgeInstanceEClass = createEClass(EDGE_INSTANCE);
		createEReference(edgeInstanceEClass, EDGE_INSTANCE__SOURCE);
		createEReference(edgeInstanceEClass, EDGE_INSTANCE__TARGET);

		// Create enums
		visibilityEEnum = createEEnum(VISIBILITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GraphViewMappingPackage theGraphViewMappingPackage = (GraphViewMappingPackage)EPackage.Registry.INSTANCE.getEPackage(GraphViewMappingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		diagramInstanceEClass.getESuperTypes().add(this.getAbstractInstance());
		nodeInstanceEClass.getESuperTypes().add(this.getAbstractInstance());
		labelInstanceEClass.getESuperTypes().add(this.getAbstractInstance());
		edgeInstanceEClass.getESuperTypes().add(this.getAbstractInstance());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractInstanceEClass, AbstractInstance.class, "AbstractInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractInstance_Parent(), this.getAbstractInstance(), this.getAbstractInstance_Children(), "parent", null, 0, 1, AbstractInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractInstance_Children(), this.getAbstractInstance(), this.getAbstractInstance_Parent(), "children", null, 0, -1, AbstractInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractInstance_SemanticElement(), ecorePackage.getEJavaObject(), "semanticElement", null, 0, 1, AbstractInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractInstance_Mapping(), theGraphViewMappingPackage.getAbstractMapping(), null, "mapping", null, 0, 1, AbstractInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractInstance_Visibility(), this.getVisibility(), "visibility", null, 0, 1, AbstractInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramInstanceEClass, DiagramInstance.class, "DiagramInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramInstance_Edges(), this.getEdgeInstance(), null, "edges", null, 0, -1, DiagramInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagramInstance_OpenNewDiagram(), ecorePackage.getEBoolean(), "openNewDiagram", null, 0, 1, DiagramInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeInstanceEClass, NodeInstance.class, "NodeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeInstance_OutgoingEdges(), this.getEdgeInstance(), this.getEdgeInstance_Source(), "outgoingEdges", null, 0, -1, NodeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeInstance_IncomingEdges(), this.getEdgeInstance(), this.getEdgeInstance_Target(), "incomingEdges", null, 0, -1, NodeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelInstanceEClass, LabelInstance.class, "LabelInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeInstanceEClass, EdgeInstance.class, "EdgeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeInstance_Source(), this.getNodeInstance(), this.getNodeInstance_OutgoingEdges(), "source", null, 0, 1, EdgeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeInstance_Target(), this.getNodeInstance(), this.getNodeInstance_IncomingEdges(), "target", null, 0, 1, EdgeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.VISIBLE);
		addEEnumLiteral(visibilityEEnum, Visibility.TRANSPARENT);
		addEEnumLiteral(visibilityEEnum, Visibility.HIDDEN);

		// Create resource
		createResource(eNS_URI);
	}

} //InstancemodelPackageImpl
