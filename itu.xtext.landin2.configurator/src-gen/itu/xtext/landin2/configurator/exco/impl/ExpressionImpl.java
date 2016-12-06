/**
 * generated by Xtext 2.10.0
 */
package itu.xtext.landin2.configurator.exco.impl;

import itu.xtext.landin2.configurator.exco.ExcoPackage;
import itu.xtext.landin2.configurator.exco.Expression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link itu.xtext.landin2.configurator.exco.impl.ExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link itu.xtext.landin2.configurator.exco.impl.ExpressionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link itu.xtext.landin2.configurator.exco.impl.ExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link itu.xtext.landin2.configurator.exco.impl.ExpressionImpl#getParanthesis <em>Paranthesis</em>}</li>
 *   <li>{@link itu.xtext.landin2.configurator.exco.impl.ExpressionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Expression left;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected EList<String> operation;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected EList<Expression> right;

  /**
   * The cached value of the '{@link #getParanthesis() <em>Paranthesis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParanthesis()
   * @generated
   * @ordered
   */
  protected Expression paranthesis;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return ExcoPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs)
  {
    Expression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExcoPackage.EXPRESSION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Expression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExcoPackage.EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExcoPackage.EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExcoPackage.EXPRESSION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOperation()
  {
    if (operation == null)
    {
      operation = new EDataTypeEList<String>(String.class, this, ExcoPackage.EXPRESSION__OPERATION);
    }
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getRight()
  {
    if (right == null)
    {
      right = new EObjectContainmentEList<Expression>(Expression.class, this, ExcoPackage.EXPRESSION__RIGHT);
    }
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getParanthesis()
  {
    return paranthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParanthesis(Expression newParanthesis, NotificationChain msgs)
  {
    Expression oldParanthesis = paranthesis;
    paranthesis = newParanthesis;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExcoPackage.EXPRESSION__PARANTHESIS, oldParanthesis, newParanthesis);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParanthesis(Expression newParanthesis)
  {
    if (newParanthesis != paranthesis)
    {
      NotificationChain msgs = null;
      if (paranthesis != null)
        msgs = ((InternalEObject)paranthesis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExcoPackage.EXPRESSION__PARANTHESIS, null, msgs);
      if (newParanthesis != null)
        msgs = ((InternalEObject)newParanthesis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExcoPackage.EXPRESSION__PARANTHESIS, null, msgs);
      msgs = basicSetParanthesis(newParanthesis, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExcoPackage.EXPRESSION__PARANTHESIS, newParanthesis, newParanthesis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExcoPackage.EXPRESSION__NAME, oldName, name));
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
      case ExcoPackage.EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case ExcoPackage.EXPRESSION__RIGHT:
        return ((InternalEList<?>)getRight()).basicRemove(otherEnd, msgs);
      case ExcoPackage.EXPRESSION__PARANTHESIS:
        return basicSetParanthesis(null, msgs);
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
      case ExcoPackage.EXPRESSION__LEFT:
        return getLeft();
      case ExcoPackage.EXPRESSION__OPERATION:
        return getOperation();
      case ExcoPackage.EXPRESSION__RIGHT:
        return getRight();
      case ExcoPackage.EXPRESSION__PARANTHESIS:
        return getParanthesis();
      case ExcoPackage.EXPRESSION__NAME:
        return getName();
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
      case ExcoPackage.EXPRESSION__LEFT:
        setLeft((Expression)newValue);
        return;
      case ExcoPackage.EXPRESSION__OPERATION:
        getOperation().clear();
        getOperation().addAll((Collection<? extends String>)newValue);
        return;
      case ExcoPackage.EXPRESSION__RIGHT:
        getRight().clear();
        getRight().addAll((Collection<? extends Expression>)newValue);
        return;
      case ExcoPackage.EXPRESSION__PARANTHESIS:
        setParanthesis((Expression)newValue);
        return;
      case ExcoPackage.EXPRESSION__NAME:
        setName((String)newValue);
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
      case ExcoPackage.EXPRESSION__LEFT:
        setLeft((Expression)null);
        return;
      case ExcoPackage.EXPRESSION__OPERATION:
        getOperation().clear();
        return;
      case ExcoPackage.EXPRESSION__RIGHT:
        getRight().clear();
        return;
      case ExcoPackage.EXPRESSION__PARANTHESIS:
        setParanthesis((Expression)null);
        return;
      case ExcoPackage.EXPRESSION__NAME:
        setName(NAME_EDEFAULT);
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
      case ExcoPackage.EXPRESSION__LEFT:
        return left != null;
      case ExcoPackage.EXPRESSION__OPERATION:
        return operation != null && !operation.isEmpty();
      case ExcoPackage.EXPRESSION__RIGHT:
        return right != null && !right.isEmpty();
      case ExcoPackage.EXPRESSION__PARANTHESIS:
        return paranthesis != null;
      case ExcoPackage.EXPRESSION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (operation: ");
    result.append(operation);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl