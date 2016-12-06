/*
 * generated by Xtext 2.10.0
 */
package itu.xtext.landin2.configurator.serializer;

import com.google.inject.Inject;
import itu.xtext.landin2.configurator.exco.Configurator;
import itu.xtext.landin2.configurator.exco.ExcoPackage;
import itu.xtext.landin2.configurator.exco.Expression;
import itu.xtext.landin2.configurator.exco.FreeText;
import itu.xtext.landin2.configurator.exco.Model;
import itu.xtext.landin2.configurator.exco.Title;
import itu.xtext.landin2.configurator.services.ExcoGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ExcoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExcoGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ExcoPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ExcoPackage.CONFIGURATOR:
				sequence_Configurator(context, (Configurator) semanticObject); 
				return; 
			case ExcoPackage.EXPRESSION:
				if (rule == grammarAccess.getAtomicExpressionRule()) {
					sequence_AtomicExpression(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExpressionRule()
						|| rule == grammarAccess.getParenthesisExpressionRule()) {
					sequence_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case ExcoPackage.FREE_TEXT:
				sequence_FreeText(context, (FreeText) semanticObject); 
				return; 
			case ExcoPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ExcoPackage.TITLE:
				sequence_Title(context, (Title) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AtomicExpression returns Expression
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_AtomicExpression(ISerializationContext context, Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExcoPackage.Literals.EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExcoPackage.Literals.EXPRESSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicExpressionAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Configurator returns Configurator
	 *
	 * Constraint:
	 *     (title=Title expression+=Expression+)
	 */
	protected void sequence_Configurator(ISerializationContext context, Configurator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *     ParenthesisExpression returns Expression
	 *
	 * Constraint:
	 *     ((left=AtomicExpression (operation+=Operation right+=Expression)*) | paranthesis=ParenthesisExpression)
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FreeText returns FreeText
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_FreeText(ISerializationContext context, FreeText semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExcoPackage.Literals.FREE_TEXT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExcoPackage.Literals.FREE_TEXT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFreeTextAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     configurator+=Configurator
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Title returns Title
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Title(ISerializationContext context, Title semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExcoPackage.Literals.TITLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExcoPackage.Literals.TITLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTitleAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}