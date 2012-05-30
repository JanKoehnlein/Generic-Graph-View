package org.eclipse.xtext.graphview.map.types;

import com.google.common.base.Objects;
import com.google.inject.Singleton;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractExpressionMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.AbstractMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;
import org.eclipse.xtext.graphview.map.graphViewMapping.GraphViewMappingPackage.Literals;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAbstractWhileExpression;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;

@Singleton
@SuppressWarnings("all")
public class GraphViewMappingTypeProvider extends XbaseTypeProvider {
  protected JvmTypeReference _typeForIdentifiable(final DiagramMapping it, final boolean rawType) {
    JvmTypeReference _typeGuard = it.getTypeGuard();
    return _typeGuard;
  }
  
  protected JvmTypeReference _typeForIdentifiable(final AbstractExpressionMapping it, final boolean rawType) {
    JvmTypeReference _xblockexpression = null;
    {
      XExpression _expression = it.getExpression();
      final JvmTypeReference expressionType = this.type(_expression, null, rawType);
      boolean _isMulti = it.isMulti();
      if (_isMulti) {
        boolean _matched = false;
        if (!_matched) {
          if (expressionType instanceof JvmParameterizedTypeReference) {
            final JvmParameterizedTypeReference _jvmParameterizedTypeReference = (JvmParameterizedTypeReference)expressionType;
            EList<JvmTypeReference> _arguments = _jvmParameterizedTypeReference.getArguments();
            boolean _isEmpty = _arguments.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              _matched=true;
              EList<JvmTypeReference> _arguments_1 = _jvmParameterizedTypeReference.getArguments();
              return IterableExtensions.<JvmTypeReference>head(_arguments_1);
            }
          }
        }
        if (!_matched) {
          if (expressionType instanceof JvmGenericArrayTypeReference) {
            final JvmGenericArrayTypeReference _jvmGenericArrayTypeReference = (JvmGenericArrayTypeReference)expressionType;
            _matched=true;
            return _jvmGenericArrayTypeReference.getComponentType();
          }
        }
      }
      _xblockexpression = (expressionType);
    }
    return _xblockexpression;
  }
  
  protected JvmTypeReference _expectedType(final AbstractMapping mapping, final EReference reference, final int index, final boolean rawType) {
    JvmTypeReference _xifexpression = null;
    boolean _equals = Objects.equal(reference, Literals.ABSTRACT_MAPPING__UNLESS_CONDITION);
    if (_equals) {
      TypeReferences _typeReferences = this.getTypeReferences();
      JvmTypeReference _typeForName = _typeReferences.getTypeForName(Boolean.TYPE, mapping);
      _xifexpression = _typeForName;
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  public JvmTypeReference typeForIdentifiable(final JvmIdentifiableElement constructor, final boolean rawType) {
    if (constructor instanceof JvmConstructor) {
      return _typeForIdentifiable((JvmConstructor)constructor, rawType);
    } else if (constructor instanceof JvmGenericType) {
      return _typeForIdentifiable((JvmGenericType)constructor, rawType);
    } else if (constructor instanceof JvmOperation) {
      return _typeForIdentifiable((JvmOperation)constructor, rawType);
    } else if (constructor instanceof JvmField) {
      return _typeForIdentifiable((JvmField)constructor, rawType);
    } else if (constructor instanceof DiagramMapping) {
      return _typeForIdentifiable((DiagramMapping)constructor, rawType);
    } else if (constructor instanceof AbstractExpressionMapping) {
      return _typeForIdentifiable((AbstractExpressionMapping)constructor, rawType);
    } else if (constructor instanceof JvmFormalParameter) {
      return _typeForIdentifiable((JvmFormalParameter)constructor, rawType);
    } else if (constructor instanceof JvmType) {
      return _typeForIdentifiable((JvmType)constructor, rawType);
    } else if (constructor instanceof XCasePart) {
      return _typeForIdentifiable((XCasePart)constructor, rawType);
    } else if (constructor instanceof XSwitchExpression) {
      return _typeForIdentifiable((XSwitchExpression)constructor, rawType);
    } else if (constructor instanceof XVariableDeclaration) {
      return _typeForIdentifiable((XVariableDeclaration)constructor, rawType);
    } else if (constructor != null) {
      return _typeForIdentifiable(constructor, rawType);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(constructor, rawType).toString());
    }
  }
  
  public JvmTypeReference expectedType(final EObject assignment, final EReference reference, final int index, final boolean rawType) {
    if (assignment instanceof XAssignment) {
      return _expectedType((XAssignment)assignment, reference, index, rawType);
    } else if (assignment instanceof XBinaryOperation) {
      return _expectedType((XBinaryOperation)assignment, reference, index, rawType);
    } else if (assignment instanceof AbstractMapping) {
      return _expectedType((AbstractMapping)assignment, reference, index, rawType);
    } else if (assignment instanceof XAbstractFeatureCall) {
      return _expectedType((XAbstractFeatureCall)assignment, reference, index, rawType);
    } else if (assignment instanceof XAbstractWhileExpression) {
      return _expectedType((XAbstractWhileExpression)assignment, reference, index, rawType);
    } else if (assignment instanceof XBlockExpression) {
      return _expectedType((XBlockExpression)assignment, reference, index, rawType);
    } else if (assignment instanceof XCasePart) {
      return _expectedType((XCasePart)assignment, reference, index, rawType);
    } else if (assignment instanceof XCastedExpression) {
      return _expectedType((XCastedExpression)assignment, reference, index, rawType);
    } else if (assignment instanceof XClosure) {
      return _expectedType((XClosure)assignment, reference, index, rawType);
    } else if (assignment instanceof XConstructorCall) {
      return _expectedType((XConstructorCall)assignment, reference, index, rawType);
    } else if (assignment instanceof XForLoopExpression) {
      return _expectedType((XForLoopExpression)assignment, reference, index, rawType);
    } else if (assignment instanceof XIfExpression) {
      return _expectedType((XIfExpression)assignment, reference, index, rawType);
    } else if (assignment instanceof XReturnExpression) {
      return _expectedType((XReturnExpression)assignment, reference, index, rawType);
    } else if (assignment instanceof XSwitchExpression) {
      return _expectedType((XSwitchExpression)assignment, reference, index, rawType);
    } else if (assignment instanceof XThrowExpression) {
      return _expectedType((XThrowExpression)assignment, reference, index, rawType);
    } else if (assignment instanceof XTryCatchFinallyExpression) {
      return _expectedType((XTryCatchFinallyExpression)assignment, reference, index, rawType);
    } else if (assignment instanceof XVariableDeclaration) {
      return _expectedType((XVariableDeclaration)assignment, reference, index, rawType);
    } else if (assignment instanceof XCatchClause) {
      return _expectedType((XCatchClause)assignment, reference, index, rawType);
    } else if (assignment != null) {
      return _expectedType(assignment, reference, index, rawType);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(assignment, reference, index, rawType).toString());
    }
  }
}
