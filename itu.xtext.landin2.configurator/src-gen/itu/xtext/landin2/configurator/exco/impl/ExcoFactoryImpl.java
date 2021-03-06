/**
 * generated by Xtext 2.10.0
 */
package itu.xtext.landin2.configurator.exco.impl;

import itu.xtext.landin2.configurator.exco.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcoFactoryImpl extends EFactoryImpl implements ExcoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExcoFactory init()
  {
    try
    {
      ExcoFactory theExcoFactory = (ExcoFactory)EPackage.Registry.INSTANCE.getEFactory(ExcoPackage.eNS_URI);
      if (theExcoFactory != null)
      {
        return theExcoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExcoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExcoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ExcoPackage.MODEL: return createModel();
      case ExcoPackage.CONFIGURATOR: return createConfigurator();
      case ExcoPackage.TITLE: return createTitle();
      case ExcoPackage.EXPRESSION: return createExpression();
      case ExcoPackage.FREE_TEXT: return createFreeText();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Configurator createConfigurator()
  {
    ConfiguratorImpl configurator = new ConfiguratorImpl();
    return configurator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Title createTitle()
  {
    TitleImpl title = new TitleImpl();
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreeText createFreeText()
  {
    FreeTextImpl freeText = new FreeTextImpl();
    return freeText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExcoPackage getExcoPackage()
  {
    return (ExcoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExcoPackage getPackage()
  {
    return ExcoPackage.eINSTANCE;
  }

} //ExcoFactoryImpl
