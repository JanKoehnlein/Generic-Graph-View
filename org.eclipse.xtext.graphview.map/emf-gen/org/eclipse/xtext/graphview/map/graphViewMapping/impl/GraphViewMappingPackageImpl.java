/**
 */
package org.eclipse.xtext.graphview.map.graphViewMapping.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingDefinition;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingReference;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingFactory;
import org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage;
import org.eclipse.xtext.graphview.map.graphViewMapping.LabelMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.MappingCall;
import org.eclipse.xtext.graphview.map.graphViewMapping.NodeMapping;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipse.xtext.xtype.XtypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphViewMappingPackageImpl extends EPackageImpl implements GraphViewMappingPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMappingDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractExpressionMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMappingReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEndMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingCallEClass = null;

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
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraphViewMappingPackageImpl()
	{
		super(eNS_URI, GraphViewMappingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GraphViewMappingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraphViewMappingPackage init()
	{
		if (isInited) return (GraphViewMappingPackage)EPackage.Registry.INSTANCE.getEPackage(GraphViewMappingPackage.eNS_URI);

		// Obtain or create and register package
		GraphViewMappingPackageImpl theGraphViewMappingPackage = (GraphViewMappingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GraphViewMappingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GraphViewMappingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XbasePackage.eINSTANCE.eClass();
		XtypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGraphViewMappingPackage.createPackageContents();

		// Initialize created meta-data
		theGraphViewMappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraphViewMappingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraphViewMappingPackage.eNS_URI, theGraphViewMappingPackage);
		return theGraphViewMappingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMapping()
	{
		return abstractMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMapping_UnlessCondition()
	{
		return (EReference)abstractMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMapping_Hidden()
	{
		return (EAttribute)abstractMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMappingDefinition()
	{
		return abstractMappingDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMappingDefinition_Name()
	{
		return (EAttribute)abstractMappingDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMappingDefinition_Mappings()
	{
		return (EReference)abstractMappingDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractExpressionMapping()
	{
		return abstractExpressionMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractExpressionMapping_Multi()
	{
		return (EAttribute)abstractExpressionMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractExpressionMapping_Expression()
	{
		return (EReference)abstractExpressionMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMappingReference()
	{
		return abstractMappingReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMappingReference_ReferencedMapping()
	{
		return (EReference)abstractMappingReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMappingReference_Call()
	{
		return (EAttribute)abstractMappingReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagramMapping()
	{
		return diagramMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramMapping_ImportSection()
	{
		return (EReference)diagramMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagramMapping_TypeGuard()
	{
		return (EReference)diagramMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeMapping()
	{
		return nodeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelMapping()
	{
		return labelMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeMapping()
	{
		return edgeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeMapping_SourceMapping()
	{
		return (EReference)edgeMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeMapping_TargetMapping()
	{
		return (EReference)edgeMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeEndMapping()
	{
		return edgeEndMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingCall()
	{
		return mappingCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphViewMappingFactory getGraphViewMappingFactory()
	{
		return (GraphViewMappingFactory)getEFactoryInstance();
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
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractMappingEClass = createEClass(ABSTRACT_MAPPING);
		createEReference(abstractMappingEClass, ABSTRACT_MAPPING__UNLESS_CONDITION);
		createEAttribute(abstractMappingEClass, ABSTRACT_MAPPING__HIDDEN);

		abstractMappingDefinitionEClass = createEClass(ABSTRACT_MAPPING_DEFINITION);
		createEAttribute(abstractMappingDefinitionEClass, ABSTRACT_MAPPING_DEFINITION__NAME);
		createEReference(abstractMappingDefinitionEClass, ABSTRACT_MAPPING_DEFINITION__MAPPINGS);

		abstractExpressionMappingEClass = createEClass(ABSTRACT_EXPRESSION_MAPPING);
		createEAttribute(abstractExpressionMappingEClass, ABSTRACT_EXPRESSION_MAPPING__MULTI);
		createEReference(abstractExpressionMappingEClass, ABSTRACT_EXPRESSION_MAPPING__EXPRESSION);

		abstractMappingReferenceEClass = createEClass(ABSTRACT_MAPPING_REFERENCE);
		createEReference(abstractMappingReferenceEClass, ABSTRACT_MAPPING_REFERENCE__REFERENCED_MAPPING);
		createEAttribute(abstractMappingReferenceEClass, ABSTRACT_MAPPING_REFERENCE__CALL);

		diagramMappingEClass = createEClass(DIAGRAM_MAPPING);
		createEReference(diagramMappingEClass, DIAGRAM_MAPPING__IMPORT_SECTION);
		createEReference(diagramMappingEClass, DIAGRAM_MAPPING__TYPE_GUARD);

		nodeMappingEClass = createEClass(NODE_MAPPING);

		labelMappingEClass = createEClass(LABEL_MAPPING);

		edgeMappingEClass = createEClass(EDGE_MAPPING);
		createEReference(edgeMappingEClass, EDGE_MAPPING__SOURCE_MAPPING);
		createEReference(edgeMappingEClass, EDGE_MAPPING__TARGET_MAPPING);

		edgeEndMappingEClass = createEClass(EDGE_END_MAPPING);

		mappingCallEClass = createEClass(MAPPING_CALL);
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
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);
		XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractMappingEClass.getESuperTypes().add(theTypesPackage.getJvmIdentifiableElement());
		abstractMappingDefinitionEClass.getESuperTypes().add(this.getAbstractMapping());
		abstractExpressionMappingEClass.getESuperTypes().add(this.getAbstractMapping());
		abstractMappingReferenceEClass.getESuperTypes().add(this.getAbstractExpressionMapping());
		diagramMappingEClass.getESuperTypes().add(this.getAbstractMappingDefinition());
		nodeMappingEClass.getESuperTypes().add(this.getAbstractMappingDefinition());
		nodeMappingEClass.getESuperTypes().add(this.getAbstractExpressionMapping());
		labelMappingEClass.getESuperTypes().add(this.getAbstractMappingDefinition());
		labelMappingEClass.getESuperTypes().add(this.getAbstractExpressionMapping());
		edgeMappingEClass.getESuperTypes().add(this.getAbstractMappingDefinition());
		edgeMappingEClass.getESuperTypes().add(this.getAbstractExpressionMapping());
		edgeEndMappingEClass.getESuperTypes().add(this.getAbstractMappingReference());
		mappingCallEClass.getESuperTypes().add(this.getAbstractMappingReference());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractMappingEClass, AbstractMapping.class, "AbstractMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractMapping_UnlessCondition(), theXbasePackage.getXExpression(), null, "unlessCondition", null, 0, 1, AbstractMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMapping_Hidden(), ecorePackage.getEBoolean(), "hidden", null, 0, 1, AbstractMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMappingDefinitionEClass, AbstractMappingDefinition.class, "AbstractMappingDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractMappingDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractMappingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractMappingDefinition_Mappings(), this.getAbstractExpressionMapping(), null, "mappings", null, 0, -1, AbstractMappingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractExpressionMappingEClass, AbstractExpressionMapping.class, "AbstractExpressionMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractExpressionMapping_Multi(), ecorePackage.getEBoolean(), "multi", null, 0, 1, AbstractExpressionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractExpressionMapping_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, AbstractExpressionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMappingReferenceEClass, AbstractMappingReference.class, "AbstractMappingReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractMappingReference_ReferencedMapping(), this.getAbstractMappingDefinition(), null, "referencedMapping", null, 0, 1, AbstractMappingReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMappingReference_Call(), ecorePackage.getEBoolean(), "call", null, 0, 1, AbstractMappingReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramMappingEClass, DiagramMapping.class, "DiagramMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagramMapping_ImportSection(), theXtypePackage.getXImportSection(), null, "importSection", null, 0, 1, DiagramMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagramMapping_TypeGuard(), theTypesPackage.getJvmTypeReference(), null, "typeGuard", null, 0, 1, DiagramMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeMappingEClass, NodeMapping.class, "NodeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelMappingEClass, LabelMapping.class, "LabelMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeMappingEClass, EdgeMapping.class, "EdgeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeMapping_SourceMapping(), this.getEdgeEndMapping(), null, "sourceMapping", null, 0, 1, EdgeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeMapping_TargetMapping(), this.getEdgeEndMapping(), null, "targetMapping", null, 0, 1, EdgeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEndMappingEClass, EdgeEndMapping.class, "EdgeEndMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mappingCallEClass, MappingCall.class, "MappingCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GraphViewMappingPackageImpl
