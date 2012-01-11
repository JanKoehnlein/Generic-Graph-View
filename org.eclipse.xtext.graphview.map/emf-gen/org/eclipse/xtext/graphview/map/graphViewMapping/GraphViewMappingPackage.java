/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.map.graphViewMapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.common.types.TypesPackage;

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
 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingFactory
 * @model kind="package"
 * @generated
 */
public interface GraphViewMappingPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphViewMapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/xtext/graphview/map/GraphViewMapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graphViewMapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphViewMappingPackage eINSTANCE = org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingImpl <em>Abstract Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getAbstractMapping()
	 * @generated
	 */
	int ABSTRACT_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Unless Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING__UNLESS_CONDITION = TypesPackage.JVM_IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING__HIDDEN = TypesPackage.JVM_IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING_FEATURE_COUNT = TypesPackage.JVM_IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingDefinitionImpl <em>Abstract Mapping Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingDefinitionImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getAbstractMappingDefinition()
	 * @generated
	 */
	int ABSTRACT_MAPPING_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Unless Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING_DEFINITION__UNLESS_CONDITION = ABSTRACT_MAPPING__UNLESS_CONDITION;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING_DEFINITION__HIDDEN = ABSTRACT_MAPPING__HIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING_DEFINITION__NAME = ABSTRACT_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING_DEFINITION__MAPPINGS = ABSTRACT_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Mapping Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING_DEFINITION_FEATURE_COUNT = ABSTRACT_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractExpressionMappingImpl <em>Abstract Expression Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractExpressionMappingImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getAbstractExpressionMapping()
	 * @generated
	 */
	int ABSTRACT_EXPRESSION_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Unless Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION_MAPPING__UNLESS_CONDITION = ABSTRACT_MAPPING__UNLESS_CONDITION;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION_MAPPING__HIDDEN = ABSTRACT_MAPPING__HIDDEN;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION_MAPPING__MULTI = ABSTRACT_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION_MAPPING__EXPRESSION = ABSTRACT_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Expression Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION_MAPPING_FEATURE_COUNT = ABSTRACT_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingReferenceImpl <em>Abstract Mapping Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingReferenceImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getAbstractMappingReference()
	 * @generated
	 */
	int ABSTRACT_MAPPING_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Unless Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING_REFERENCE__UNLESS_CONDITION = ABSTRACT_EXPRESSION_MAPPING__UNLESS_CONDITION;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING_REFERENCE__HIDDEN = ABSTRACT_EXPRESSION_MAPPING__HIDDEN;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING_REFERENCE__MULTI = ABSTRACT_EXPRESSION_MAPPING__MULTI;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING_REFERENCE__EXPRESSION = ABSTRACT_EXPRESSION_MAPPING__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Referenced Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING_REFERENCE__REFERENCED_MAPPING = ABSTRACT_EXPRESSION_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING_REFERENCE__CALL = ABSTRACT_EXPRESSION_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Mapping Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING_REFERENCE_FEATURE_COUNT = ABSTRACT_EXPRESSION_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.ImportImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 4;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.DiagramMappingImpl <em>Diagram Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.DiagramMappingImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getDiagramMapping()
	 * @generated
	 */
	int DIAGRAM_MAPPING = 5;

	/**
	 * The feature id for the '<em><b>Unless Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MAPPING__UNLESS_CONDITION = ABSTRACT_MAPPING_DEFINITION__UNLESS_CONDITION;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MAPPING__HIDDEN = ABSTRACT_MAPPING_DEFINITION__HIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MAPPING__NAME = ABSTRACT_MAPPING_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MAPPING__MAPPINGS = ABSTRACT_MAPPING_DEFINITION__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MAPPING__IMPORTS = ABSTRACT_MAPPING_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MAPPING__TYPE_GUARD = ABSTRACT_MAPPING_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diagram Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MAPPING_FEATURE_COUNT = ABSTRACT_MAPPING_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.NodeMappingImpl <em>Node Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.NodeMappingImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getNodeMapping()
	 * @generated
	 */
	int NODE_MAPPING = 6;

	/**
	 * The feature id for the '<em><b>Unless Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__UNLESS_CONDITION = ABSTRACT_MAPPING_DEFINITION__UNLESS_CONDITION;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__HIDDEN = ABSTRACT_MAPPING_DEFINITION__HIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__NAME = ABSTRACT_MAPPING_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__MAPPINGS = ABSTRACT_MAPPING_DEFINITION__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__MULTI = ABSTRACT_MAPPING_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING__EXPRESSION = ABSTRACT_MAPPING_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_MAPPING_FEATURE_COUNT = ABSTRACT_MAPPING_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.LabelMappingImpl <em>Label Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.LabelMappingImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getLabelMapping()
	 * @generated
	 */
	int LABEL_MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Unless Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MAPPING__UNLESS_CONDITION = ABSTRACT_MAPPING_DEFINITION__UNLESS_CONDITION;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MAPPING__HIDDEN = ABSTRACT_MAPPING_DEFINITION__HIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MAPPING__NAME = ABSTRACT_MAPPING_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MAPPING__MAPPINGS = ABSTRACT_MAPPING_DEFINITION__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MAPPING__MULTI = ABSTRACT_MAPPING_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MAPPING__EXPRESSION = ABSTRACT_MAPPING_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_MAPPING_FEATURE_COUNT = ABSTRACT_MAPPING_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeMappingImpl <em>Edge Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeMappingImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getEdgeMapping()
	 * @generated
	 */
	int EDGE_MAPPING = 8;

	/**
	 * The feature id for the '<em><b>Unless Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MAPPING__UNLESS_CONDITION = ABSTRACT_MAPPING_DEFINITION__UNLESS_CONDITION;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MAPPING__HIDDEN = ABSTRACT_MAPPING_DEFINITION__HIDDEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MAPPING__NAME = ABSTRACT_MAPPING_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MAPPING__MAPPINGS = ABSTRACT_MAPPING_DEFINITION__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MAPPING__MULTI = ABSTRACT_MAPPING_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MAPPING__EXPRESSION = ABSTRACT_MAPPING_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MAPPING__SOURCE_MAPPING = ABSTRACT_MAPPING_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MAPPING__TARGET_MAPPING = ABSTRACT_MAPPING_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Edge Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_MAPPING_FEATURE_COUNT = ABSTRACT_MAPPING_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeEndMappingImpl <em>Edge End Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeEndMappingImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getEdgeEndMapping()
	 * @generated
	 */
	int EDGE_END_MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Unless Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_END_MAPPING__UNLESS_CONDITION = ABSTRACT_MAPPING_REFERENCE__UNLESS_CONDITION;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_END_MAPPING__HIDDEN = ABSTRACT_MAPPING_REFERENCE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_END_MAPPING__MULTI = ABSTRACT_MAPPING_REFERENCE__MULTI;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_END_MAPPING__EXPRESSION = ABSTRACT_MAPPING_REFERENCE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Referenced Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_END_MAPPING__REFERENCED_MAPPING = ABSTRACT_MAPPING_REFERENCE__REFERENCED_MAPPING;

	/**
	 * The feature id for the '<em><b>Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_END_MAPPING__CALL = ABSTRACT_MAPPING_REFERENCE__CALL;

	/**
	 * The number of structural features of the '<em>Edge End Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_END_MAPPING_FEATURE_COUNT = ABSTRACT_MAPPING_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.MappingCallImpl <em>Mapping Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.MappingCallImpl
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getMappingCall()
	 * @generated
	 */
	int MAPPING_CALL = 10;

	/**
	 * The feature id for the '<em><b>Unless Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL__UNLESS_CONDITION = ABSTRACT_MAPPING_REFERENCE__UNLESS_CONDITION;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL__HIDDEN = ABSTRACT_MAPPING_REFERENCE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL__MULTI = ABSTRACT_MAPPING_REFERENCE__MULTI;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL__EXPRESSION = ABSTRACT_MAPPING_REFERENCE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Referenced Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL__REFERENCED_MAPPING = ABSTRACT_MAPPING_REFERENCE__REFERENCED_MAPPING;

	/**
	 * The feature id for the '<em><b>Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL__CALL = ABSTRACT_MAPPING_REFERENCE__CALL;

	/**
	 * The number of structural features of the '<em>Mapping Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_FEATURE_COUNT = ABSTRACT_MAPPING_REFERENCE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping <em>Abstract Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping
	 * @generated
	 */
	EClass getAbstractMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping#getUnlessCondition <em>Unless Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unless Condition</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping#getUnlessCondition()
	 * @see #getAbstractMapping()
	 * @generated
	 */
	EReference getAbstractMapping_UnlessCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping#isHidden()
	 * @see #getAbstractMapping()
	 * @generated
	 */
	EAttribute getAbstractMapping_Hidden();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingDefinition <em>Abstract Mapping Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Mapping Definition</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingDefinition
	 * @generated
	 */
	EClass getAbstractMappingDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingDefinition#getName()
	 * @see #getAbstractMappingDefinition()
	 * @generated
	 */
	EAttribute getAbstractMappingDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingDefinition#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingDefinition#getMappings()
	 * @see #getAbstractMappingDefinition()
	 * @generated
	 */
	EReference getAbstractMappingDefinition_Mappings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping <em>Abstract Expression Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Expression Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping
	 * @generated
	 */
	EClass getAbstractExpressionMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping#isMulti <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping#isMulti()
	 * @see #getAbstractExpressionMapping()
	 * @generated
	 */
	EAttribute getAbstractExpressionMapping_Multi();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping#getExpression()
	 * @see #getAbstractExpressionMapping()
	 * @generated
	 */
	EReference getAbstractExpressionMapping_Expression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingReference <em>Abstract Mapping Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Mapping Reference</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingReference
	 * @generated
	 */
	EClass getAbstractMappingReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingReference#getReferencedMapping <em>Referenced Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingReference#getReferencedMapping()
	 * @see #getAbstractMappingReference()
	 * @generated
	 */
	EReference getAbstractMappingReference_ReferencedMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingReference#isCall <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMappingReference#isCall()
	 * @see #getAbstractMappingReference()
	 * @generated
	 */
	EAttribute getAbstractMappingReference_Call();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtext.graphview.map.graphViewMapping.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping <em>Diagram Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping
	 * @generated
	 */
	EClass getDiagramMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping#getImports()
	 * @see #getDiagramMapping()
	 * @generated
	 */
	EReference getDiagramMapping_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping#getTypeGuard <em>Type Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Guard</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping#getTypeGuard()
	 * @see #getDiagramMapping()
	 * @generated
	 */
	EReference getDiagramMapping_TypeGuard();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.NodeMapping <em>Node Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.NodeMapping
	 * @generated
	 */
	EClass getNodeMapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.LabelMapping <em>Label Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.LabelMapping
	 * @generated
	 */
	EClass getLabelMapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping <em>Edge Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping
	 * @generated
	 */
	EClass getEdgeMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping#getSourceMapping <em>Source Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping#getSourceMapping()
	 * @see #getEdgeMapping()
	 * @generated
	 */
	EReference getEdgeMapping_SourceMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping#getTargetMapping <em>Target Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.EdgeMapping#getTargetMapping()
	 * @see #getEdgeMapping()
	 * @generated
	 */
	EReference getEdgeMapping_TargetMapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping <em>Edge End Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge End Mapping</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.EdgeEndMapping
	 * @generated
	 */
	EClass getEdgeEndMapping();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtext.graphview.map.graphViewMapping.MappingCall <em>Mapping Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Call</em>'.
	 * @see org.eclipse.xtext.graphview.map.graphViewMapping.MappingCall
	 * @generated
	 */
	EClass getMappingCall();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphViewMappingFactory getGraphViewMappingFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingImpl <em>Abstract Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getAbstractMapping()
		 * @generated
		 */
		EClass ABSTRACT_MAPPING = eINSTANCE.getAbstractMapping();

		/**
		 * The meta object literal for the '<em><b>Unless Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MAPPING__UNLESS_CONDITION = eINSTANCE.getAbstractMapping_UnlessCondition();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MAPPING__HIDDEN = eINSTANCE.getAbstractMapping_Hidden();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingDefinitionImpl <em>Abstract Mapping Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingDefinitionImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getAbstractMappingDefinition()
		 * @generated
		 */
		EClass ABSTRACT_MAPPING_DEFINITION = eINSTANCE.getAbstractMappingDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MAPPING_DEFINITION__NAME = eINSTANCE.getAbstractMappingDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MAPPING_DEFINITION__MAPPINGS = eINSTANCE.getAbstractMappingDefinition_Mappings();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractExpressionMappingImpl <em>Abstract Expression Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractExpressionMappingImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getAbstractExpressionMapping()
		 * @generated
		 */
		EClass ABSTRACT_EXPRESSION_MAPPING = eINSTANCE.getAbstractExpressionMapping();

		/**
		 * The meta object literal for the '<em><b>Multi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EXPRESSION_MAPPING__MULTI = eINSTANCE.getAbstractExpressionMapping_Multi();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_EXPRESSION_MAPPING__EXPRESSION = eINSTANCE.getAbstractExpressionMapping_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingReferenceImpl <em>Abstract Mapping Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.AbstractMappingReferenceImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getAbstractMappingReference()
		 * @generated
		 */
		EClass ABSTRACT_MAPPING_REFERENCE = eINSTANCE.getAbstractMappingReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MAPPING_REFERENCE__REFERENCED_MAPPING = eINSTANCE.getAbstractMappingReference_ReferencedMapping();

		/**
		 * The meta object literal for the '<em><b>Call</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MAPPING_REFERENCE__CALL = eINSTANCE.getAbstractMappingReference_Call();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.ImportImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.DiagramMappingImpl <em>Diagram Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.DiagramMappingImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getDiagramMapping()
		 * @generated
		 */
		EClass DIAGRAM_MAPPING = eINSTANCE.getDiagramMapping();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MAPPING__IMPORTS = eINSTANCE.getDiagramMapping_Imports();

		/**
		 * The meta object literal for the '<em><b>Type Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MAPPING__TYPE_GUARD = eINSTANCE.getDiagramMapping_TypeGuard();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.NodeMappingImpl <em>Node Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.NodeMappingImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getNodeMapping()
		 * @generated
		 */
		EClass NODE_MAPPING = eINSTANCE.getNodeMapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.LabelMappingImpl <em>Label Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.LabelMappingImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getLabelMapping()
		 * @generated
		 */
		EClass LABEL_MAPPING = eINSTANCE.getLabelMapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeMappingImpl <em>Edge Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeMappingImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getEdgeMapping()
		 * @generated
		 */
		EClass EDGE_MAPPING = eINSTANCE.getEdgeMapping();

		/**
		 * The meta object literal for the '<em><b>Source Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_MAPPING__SOURCE_MAPPING = eINSTANCE.getEdgeMapping_SourceMapping();

		/**
		 * The meta object literal for the '<em><b>Target Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_MAPPING__TARGET_MAPPING = eINSTANCE.getEdgeMapping_TargetMapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeEndMappingImpl <em>Edge End Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.EdgeEndMappingImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getEdgeEndMapping()
		 * @generated
		 */
		EClass EDGE_END_MAPPING = eINSTANCE.getEdgeEndMapping();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtext.graphview.map.graphViewMapping.impl.MappingCallImpl <em>Mapping Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.MappingCallImpl
		 * @see org.eclipse.xtext.graphview.map.graphViewMapping.impl.GraphViewMappingPackageImpl#getMappingCall()
		 * @generated
		 */
		EClass MAPPING_CALL = eINSTANCE.getMappingCall();

	}

} //GraphViewMappingPackage
