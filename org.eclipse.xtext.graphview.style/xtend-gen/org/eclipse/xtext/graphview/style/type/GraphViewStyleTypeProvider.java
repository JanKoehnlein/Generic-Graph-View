package org.eclipse.xtext.graphview.style.type;

import com.google.inject.Singleton;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.graphview.style.graphViewStyle.XColorLiteral;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAbstractWhileExpression;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XIntLiteral;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;

@SuppressWarnings("all")
@Singleton
public class GraphViewStyleTypeProvider extends XbaseTypeProvider {
  protected JvmTypeReference _type(final XColorLiteral colorLiteral, final JvmTypeReference rawExpectation, final boolean rawType) {
    TypeReferences _typeReferences = this.getTypeReferences();
    JvmTypeReference _typeForName = _typeReferences.getTypeForName(org.eclipse.xtext.graphview.style.type.ColorLiteral.class, colorLiteral);
    return _typeForName;
  }
  
  public JvmTypeReference type(final XExpression colorLiteral, final JvmTypeReference rawExpectation, final boolean rawType) {
    if (colorLiteral instanceof XColorLiteral) {
      return _type((XColorLiteral)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XAbstractFeatureCall) {
      return _type((XAbstractFeatureCall)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XAbstractWhileExpression) {
      return _type((XAbstractWhileExpression)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XBlockExpression) {
      return _type((XBlockExpression)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XBooleanLiteral) {
      return _type((XBooleanLiteral)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XCastedExpression) {
      return _type((XCastedExpression)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XClosure) {
      return _type((XClosure)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XConstructorCall) {
      return _type((XConstructorCall)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XForLoopExpression) {
      return _type((XForLoopExpression)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XIfExpression) {
      return _type((XIfExpression)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XInstanceOfExpression) {
      return _type((XInstanceOfExpression)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XIntLiteral) {
      return _type((XIntLiteral)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XNullLiteral) {
      return _type((XNullLiteral)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XReturnExpression) {
      return _type((XReturnExpression)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XStringLiteral) {
      return _type((XStringLiteral)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XSwitchExpression) {
      return _type((XSwitchExpression)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XThrowExpression) {
      return _type((XThrowExpression)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XTryCatchFinallyExpression) {
      return _type((XTryCatchFinallyExpression)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XTypeLiteral) {
      return _type((XTypeLiteral)colorLiteral, rawExpectation, rawType);
    } else if (colorLiteral instanceof XVariableDeclaration) {
      return _type((XVariableDeclaration)colorLiteral, rawExpectation, rawType);
    } else {
      return _type(colorLiteral, rawExpectation, rawType);
    }
  }
}
