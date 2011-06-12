/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.graphview.style.graphViewStyle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage;
import org.eclipse.xtext.graphview.style.graphViewStyle.Style;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleImpl#getNames <em>Names</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleImpl#getJavaClass <em>Java Class</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.impl.StyleImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleImpl extends MinimalEObjectImpl.Container implements Style
{
  /**
   * The cached value of the '{@link #getNames() <em>Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNames()
   * @generated
   * @ordered
   */
  protected EList<String> names;

  /**
   * The cached value of the '{@link #getJavaClass() <em>Java Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaClass()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference javaClass;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected XExpression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StyleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GraphViewStylePackage.Literals.STYLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getNames()
  {
    if (names == null)
    {
      names = new EDataTypeEList<String>(String.class, this, GraphViewStylePackage.STYLE__NAMES);
    }
    return names;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmParameterizedTypeReference getJavaClass()
  {
    return javaClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJavaClass(JvmParameterizedTypeReference newJavaClass, NotificationChain msgs)
  {
    JvmParameterizedTypeReference oldJavaClass = javaClass;
    javaClass = newJavaClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphViewStylePackage.STYLE__JAVA_CLASS, oldJavaClass, newJavaClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaClass(JvmParameterizedTypeReference newJavaClass)
  {
    if (newJavaClass != javaClass)
    {
      NotificationChain msgs = null;
      if (javaClass != null)
        msgs = ((InternalEObject)javaClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphViewStylePackage.STYLE__JAVA_CLASS, null, msgs);
      if (newJavaClass != null)
        msgs = ((InternalEObject)newJavaClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphViewStylePackage.STYLE__JAVA_CLASS, null, msgs);
      msgs = basicSetJavaClass(newJavaClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphViewStylePackage.STYLE__JAVA_CLASS, newJavaClass, newJavaClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(XExpression newExpression, NotificationChain msgs)
  {
    XExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphViewStylePackage.STYLE__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(XExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphViewStylePackage.STYLE__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphViewStylePackage.STYLE__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphViewStylePackage.STYLE__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GraphViewStylePackage.STYLE__JAVA_CLASS:
        return basicSetJavaClass(null, msgs);
      case GraphViewStylePackage.STYLE__EXPRESSION:
        return basicSetExpression(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GraphViewStylePackage.STYLE__NAMES:
        return getNames();
      case GraphViewStylePackage.STYLE__JAVA_CLASS:
        return getJavaClass();
      case GraphViewStylePackage.STYLE__EXPRESSION:
        return getExpression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GraphViewStylePackage.STYLE__NAMES:
        getNames().clear();
        getNames().addAll((Collection<? extends String>)newValue);
        return;
      case GraphViewStylePackage.STYLE__JAVA_CLASS:
        setJavaClass((JvmParameterizedTypeReference)newValue);
        return;
      case GraphViewStylePackage.STYLE__EXPRESSION:
        setExpression((XExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GraphViewStylePackage.STYLE__NAMES:
        getNames().clear();
        return;
      case GraphViewStylePackage.STYLE__JAVA_CLASS:
        setJavaClass((JvmParameterizedTypeReference)null);
        return;
      case GraphViewStylePackage.STYLE__EXPRESSION:
        setExpression((XExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GraphViewStylePackage.STYLE__NAMES:
        return names != null && !names.isEmpty();
      case GraphViewStylePackage.STYLE__JAVA_CLASS:
        return javaClass != null;
      case GraphViewStylePackage.STYLE__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (names: ");
    result.append(names);
    result.append(')');
    return result.toString();
  }

} //StyleImpl
