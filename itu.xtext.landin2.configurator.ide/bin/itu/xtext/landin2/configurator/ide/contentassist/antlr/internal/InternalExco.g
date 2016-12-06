/*
 * generated by Xtext 2.10.0
 */
grammar InternalExco;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package itu.xtext.landin2.configurator.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package itu.xtext.landin2.configurator.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import itu.xtext.landin2.configurator.services.ExcoGrammarAccess;

}
@parser::members {
	private ExcoGrammarAccess grammarAccess;

	public void setGrammarAccess(ExcoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getConfiguratorAssignment()); }
		(rule__Model__ConfiguratorAssignment)
		{ after(grammarAccess.getModelAccess().getConfiguratorAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConfigurator
entryRuleConfigurator
:
{ before(grammarAccess.getConfiguratorRule()); }
	 ruleConfigurator
{ after(grammarAccess.getConfiguratorRule()); } 
	 EOF 
;

// Rule Configurator
ruleConfigurator 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConfiguratorAccess().getGroup()); }
		(rule__Configurator__Group__0)
		{ after(grammarAccess.getConfiguratorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTitle
entryRuleTitle
:
{ before(grammarAccess.getTitleRule()); }
	 ruleTitle
{ after(grammarAccess.getTitleRule()); } 
	 EOF 
;

// Rule Title
ruleTitle 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTitleAccess().getGroup()); }
		(rule__Title__Group__0)
		{ after(grammarAccess.getTitleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getAlternatives()); }
		(rule__Expression__Alternatives)
		{ after(grammarAccess.getExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParenthesisExpression
entryRuleParenthesisExpression
:
{ before(grammarAccess.getParenthesisExpressionRule()); }
	 ruleParenthesisExpression
{ after(grammarAccess.getParenthesisExpressionRule()); } 
	 EOF 
;

// Rule ParenthesisExpression
ruleParenthesisExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParenthesisExpressionAccess().getGroup()); }
		(rule__ParenthesisExpression__Group__0)
		{ after(grammarAccess.getParenthesisExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtomicExpression
entryRuleAtomicExpression
:
{ before(grammarAccess.getAtomicExpressionRule()); }
	 ruleAtomicExpression
{ after(grammarAccess.getAtomicExpressionRule()); } 
	 EOF 
;

// Rule AtomicExpression
ruleAtomicExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtomicExpressionAccess().getGroup()); }
		(rule__AtomicExpression__Group__0)
		{ after(grammarAccess.getAtomicExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSep
entryRuleSep
:
{ before(grammarAccess.getSepRule()); }
	 ruleSep
{ after(grammarAccess.getSepRule()); } 
	 EOF 
;

// Rule Sep
ruleSep 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSepAccess().getAlternatives()); }
		(rule__Sep__Alternatives)
		{ after(grammarAccess.getSepAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOperation
entryRuleOperation
:
{ before(grammarAccess.getOperationRule()); }
	 ruleOperation
{ after(grammarAccess.getOperationRule()); } 
	 EOF 
;

// Rule Operation
ruleOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOperationAccess().getAlternatives()); }
		(rule__Operation__Alternatives)
		{ after(grammarAccess.getOperationAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBinop
entryRuleBinop
:
{ before(grammarAccess.getBinopRule()); }
	 ruleBinop
{ after(grammarAccess.getBinopRule()); } 
	 EOF 
;

// Rule Binop
ruleBinop 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBinopAccess().getAlternatives()); }
		(rule__Binop__Alternatives)
		{ after(grammarAccess.getBinopAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnop
entryRuleUnop
:
{ before(grammarAccess.getUnopRule()); }
	 ruleUnop
{ after(grammarAccess.getUnopRule()); } 
	 EOF 
;

// Rule Unop
ruleUnop 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnopAccess().getNotKeyword()); }
		'not'
		{ after(grammarAccess.getUnopAccess().getNotKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTitleAccess().getSpaceKeyword_1_0()); }
		' '
		{ after(grammarAccess.getTitleAccess().getSpaceKeyword_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getTitleAccess().getIDTerminalRuleCall_1_1()); }
		RULE_ID
		{ after(grammarAccess.getTitleAccess().getIDTerminalRuleCall_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getGroup_0()); }
		(rule__Expression__Group_0__0)
		{ after(grammarAccess.getExpressionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getParanthesisAssignment_1()); }
		(rule__Expression__ParanthesisAssignment_1)
		{ after(grammarAccess.getExpressionAccess().getParanthesisAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sep__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSepAccess().getCommaKeyword_0()); }
		','
		{ after(grammarAccess.getSepAccess().getCommaKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getSepAccess().getGroup_1()); }
		(rule__Sep__Group_1__0)
		{ after(grammarAccess.getSepAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperationAccess().getBinopParserRuleCall_0()); }
		ruleBinop
		{ after(grammarAccess.getOperationAccess().getBinopParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getOperationAccess().getUnopParserRuleCall_1()); }
		ruleUnop
		{ after(grammarAccess.getOperationAccess().getUnopParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binop__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinopAccess().getAndKeyword_0()); }
		'and'
		{ after(grammarAccess.getBinopAccess().getAndKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getBinopAccess().getOrKeyword_1()); }
		'or'
		{ after(grammarAccess.getBinopAccess().getOrKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getBinopAccess().getEqualsKeyword_2()); }
		'equals'
		{ after(grammarAccess.getBinopAccess().getEqualsKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getBinopAccess().getRequiresKeyword_3()); }
		'requires'
		{ after(grammarAccess.getBinopAccess().getRequiresKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getBinopAccess().getIsKeyword_4()); }
		'is'
		{ after(grammarAccess.getBinopAccess().getIsKeyword_4()); }
	)
	|
	(
		{ before(grammarAccess.getBinopAccess().getAreKeyword_5()); }
		'are'
		{ after(grammarAccess.getBinopAccess().getAreKeyword_5()); }
	)
	|
	(
		{ before(grammarAccess.getBinopAccess().getExcludesKeyword_6()); }
		'excludes'
		{ after(grammarAccess.getBinopAccess().getExcludesKeyword_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Configurator__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Configurator__Group__0__Impl
	rule__Configurator__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Configurator__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfiguratorAccess().getTitleAssignment_0()); }
	(rule__Configurator__TitleAssignment_0)
	{ after(grammarAccess.getConfiguratorAccess().getTitleAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Configurator__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Configurator__Group__1__Impl
	rule__Configurator__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Configurator__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfiguratorAccess().getControl000dControl000aKeyword_1()); }
	'\r\n'
	{ after(grammarAccess.getConfiguratorAccess().getControl000dControl000aKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Configurator__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Configurator__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Configurator__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getConfiguratorAccess().getExpressionAssignment_2()); }
		(rule__Configurator__ExpressionAssignment_2)
		{ after(grammarAccess.getConfiguratorAccess().getExpressionAssignment_2()); }
	)
	(
		{ before(grammarAccess.getConfiguratorAccess().getExpressionAssignment_2()); }
		(rule__Configurator__ExpressionAssignment_2)*
		{ after(grammarAccess.getConfiguratorAccess().getExpressionAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Title__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Title__Group__0__Impl
	rule__Title__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTitleAccess().getNameAssignment_0()); }
	(rule__Title__NameAssignment_0)
	{ after(grammarAccess.getTitleAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Title__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTitleAccess().getAlternatives_1()); }
	(rule__Title__Alternatives_1)*
	{ after(grammarAccess.getTitleAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_0__0__Impl
	rule__Expression__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getLeftAssignment_0_0()); }
	(rule__Expression__LeftAssignment_0_0)
	{ after(grammarAccess.getExpressionAccess().getLeftAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getGroup_0_1()); }
	(rule__Expression__Group_0_1__0)*
	{ after(grammarAccess.getExpressionAccess().getGroup_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_0_1__0__Impl
	rule__Expression__Group_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getOperationAssignment_0_1_0()); }
	(rule__Expression__OperationAssignment_0_1_0)
	{ after(grammarAccess.getExpressionAccess().getOperationAssignment_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getRightAssignment_0_1_1()); }
	(rule__Expression__RightAssignment_0_1_1)
	{ after(grammarAccess.getExpressionAccess().getRightAssignment_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParenthesisExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParenthesisExpression__Group__0__Impl
	rule__ParenthesisExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesisExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesisExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParenthesisExpression__Group__1__Impl
	rule__ParenthesisExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesisExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); }
	ruleExpression
	{ after(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesisExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParenthesisExpression__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesisExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpression__Group__0__Impl
	rule__AtomicExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExpressionAccess().getNameAssignment_0()); }
	(rule__AtomicExpression__NameAssignment_0)
	{ after(grammarAccess.getAtomicExpressionAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExpressionAccess().getGroup_1()); }
	(rule__AtomicExpression__Group_1__0)*
	{ after(grammarAccess.getAtomicExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpression__Group_1__0__Impl
	rule__AtomicExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExpressionAccess().getSepParserRuleCall_1_0()); }
	ruleSep
	{ after(grammarAccess.getAtomicExpressionAccess().getSepParserRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomicExpression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicExpressionAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getAtomicExpressionAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Sep__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sep__Group_1__0__Impl
	rule__Sep__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sep__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSepAccess().getCommaKeyword_1_0()); }
	','
	{ after(grammarAccess.getSepAccess().getCommaKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sep__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sep__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sep__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSepAccess().getWSTerminalRuleCall_1_1()); }
	RULE_WS
	{ after(grammarAccess.getSepAccess().getWSTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ConfiguratorAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getConfiguratorConfiguratorParserRuleCall_0()); }
		ruleConfigurator
		{ after(grammarAccess.getModelAccess().getConfiguratorConfiguratorParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Configurator__TitleAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfiguratorAccess().getTitleTitleParserRuleCall_0_0()); }
		ruleTitle
		{ after(grammarAccess.getConfiguratorAccess().getTitleTitleParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Configurator__ExpressionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfiguratorAccess().getExpressionExpressionParserRuleCall_2_0()); }
		ruleExpression
		{ after(grammarAccess.getConfiguratorAccess().getExpressionExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Title__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTitleAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getTitleAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__LeftAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getLeftAtomicExpressionParserRuleCall_0_0_0()); }
		ruleAtomicExpression
		{ after(grammarAccess.getExpressionAccess().getLeftAtomicExpressionParserRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__OperationAssignment_0_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getOperationOperationParserRuleCall_0_1_0_0()); }
		ruleOperation
		{ after(grammarAccess.getExpressionAccess().getOperationOperationParserRuleCall_0_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__RightAssignment_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_0_1_1_0()); }
		ruleExpression
		{ after(grammarAccess.getExpressionAccess().getRightExpressionParserRuleCall_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__ParanthesisAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getParanthesisParenthesisExpressionParserRuleCall_1_0()); }
		ruleParenthesisExpression
		{ after(grammarAccess.getExpressionAccess().getParanthesisParenthesisExpressionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpression__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExpressionAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getAtomicExpressionAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
