/**
 */
package org.eclipse.xtext.graphview.map.graphViewMapping.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;

import org.eclipse.xtext.graphview.map.graphViewMapping.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage
 * @generated
 */
public class GraphViewMappingSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GraphViewMappingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphViewMappingSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = GraphViewMappingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case GraphViewMappingPackage.ABSTRACT_MAPPING:
			{
				AbstractMapping abstractMapping = (AbstractMapping)theEObject;
				T result = caseAbstractMapping(abstractMapping);
				if (result == null) result = caseJvmIdentifiableElement(abstractMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphViewMappingPackage.ABSTRACT_MAPPING_DEFINITION:
			{
				AbstractMappingDefinition abstractMappingDefinition = (AbstractMappingDefinition)theEObject;
				T result = caseAbstractMappingDefinition(abstractMappingDefinition);
				if (result == null) result = caseAbstractMapping(abstractMappingDefinition);
				if (result == null) result = caseJvmIdentifiableElement(abstractMappingDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphViewMappingPackage.ABSTRACT_EXPRESSION_MAPPING:
			{
				AbstractExpressionMapping abstractExpressionMapping = (AbstractExpressionMapping)theEObject;
				T result = caseAbstractExpressionMapping(abstractExpressionMapping);
				if (result == null) result = caseAbstractMapping(abstractExpressionMapping);
				if (result == null) result = caseJvmIdentifiableElement(abstractExpressionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphViewMappingPackage.ABSTRACT_MAPPING_REFERENCE:
			{
				AbstractMappingReference abstractMappingReference = (AbstractMappingReference)theEObject;
				T result = caseAbstractMappingReference(abstractMappingReference);
				if (result == null) result = caseAbstractExpressionMapping(abstractMappingReference);
				if (result == null) result = caseAbstractMapping(abstractMappingReference);
				if (result == null) result = caseJvmIdentifiableElement(abstractMappingReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphViewMappingPackage.DIAGRAM_MAPPING:
			{
				DiagramMapping diagramMapping = (DiagramMapping)theEObject;
				T result = caseDiagramMapping(diagramMapping);
				if (result == null) result = caseAbstractMappingDefinition(diagramMapping);
				if (result == null) result = caseAbstractMapping(diagramMapping);
				if (result == null) result = caseJvmIdentifiableElement(diagramMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphViewMappingPackage.NODE_MAPPING:
			{
				NodeMapping nodeMapping = (NodeMapping)theEObject;
				T result = caseNodeMapping(nodeMapping);
				if (result == null) result = caseAbstractMappingDefinition(nodeMapping);
				if (result == null) result = caseAbstractExpressionMapping(nodeMapping);
				if (result == null) result = caseAbstractMapping(nodeMapping);
				if (result == null) result = caseJvmIdentifiableElement(nodeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphViewMappingPackage.LABEL_MAPPING:
			{
				LabelMapping labelMapping = (LabelMapping)theEObject;
				T result = caseLabelMapping(labelMapping);
				if (result == null) result = caseAbstractMappingDefinition(labelMapping);
				if (result == null) result = caseAbstractExpressionMapping(labelMapping);
				if (result == null) result = caseAbstractMapping(labelMapping);
				if (result == null) result = caseJvmIdentifiableElement(labelMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphViewMappingPackage.EDGE_MAPPING:
			{
				EdgeMapping edgeMapping = (EdgeMapping)theEObject;
				T result = caseEdgeMapping(edgeMapping);
				if (result == null) result = caseAbstractMappingDefinition(edgeMapping);
				if (result == null) result = caseAbstractExpressionMapping(edgeMapping);
				if (result == null) result = caseAbstractMapping(edgeMapping);
				if (result == null) result = caseJvmIdentifiableElement(edgeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphViewMappingPackage.EDGE_END_MAPPING:
			{
				EdgeEndMapping edgeEndMapping = (EdgeEndMapping)theEObject;
				T result = caseEdgeEndMapping(edgeEndMapping);
				if (result == null) result = caseAbstractMappingReference(edgeEndMapping);
				if (result == null) result = caseAbstractExpressionMapping(edgeEndMapping);
				if (result == null) result = caseAbstractMapping(edgeEndMapping);
				if (result == null) result = caseJvmIdentifiableElement(edgeEndMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GraphViewMappingPackage.MAPPING_CALL:
			{
				MappingCall mappingCall = (MappingCall)theEObject;
				T result = caseMappingCall(mappingCall);
				if (result == null) result = caseAbstractMappingReference(mappingCall);
				if (result == null) result = caseAbstractExpressionMapping(mappingCall);
				if (result == null) result = caseAbstractMapping(mappingCall);
				if (result == null) result = caseJvmIdentifiableElement(mappingCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMapping(AbstractMapping object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Mapping Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Mapping Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMappingDefinition(AbstractMappingDefinition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Expression Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Expression Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractExpressionMapping(AbstractExpressionMapping object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Mapping Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Mapping Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMappingReference(AbstractMappingReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramMapping(DiagramMapping object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeMapping(NodeMapping object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelMapping(LabelMapping object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeMapping(EdgeMapping object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge End Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge End Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeEndMapping(EdgeEndMapping object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingCall(MappingCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Identifiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Identifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmIdentifiableElement(JvmIdentifiableElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //GraphViewMappingSwitch
