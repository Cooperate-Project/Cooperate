/*
 * generated by Xtext 2.10.0
 */
grammar InternalUsecase;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.cooperateproject.modeling.textual.usecase.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.cooperateproject.modeling.textual.usecase.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cooperateproject.modeling.textual.usecase.services.UsecaseGrammarAccess;

}

@parser::members {

 	private UsecaseGrammarAccess grammarAccess;

    public InternalUsecaseParser(TokenStream input, UsecaseGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "UseCaseDiagram";
   	}

   	@Override
   	protected UsecaseGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleUseCaseDiagram
entryRuleUseCaseDiagram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUseCaseDiagramRule()); }
	iv_ruleUseCaseDiagram=ruleUseCaseDiagram
	{ $current=$iv_ruleUseCaseDiagram.current; }
	EOF;

// Rule UseCaseDiagram
ruleUseCaseDiagram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@start-uc'
		{
			newLeafNode(otherlv_0, grammarAccess.getUseCaseDiagramAccess().getStartUcKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUseCaseDiagramAccess().getRootPackageRootPackageParserRuleCall_1_0());
				}
				lv_rootPackage_1_0=ruleRootPackage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUseCaseDiagramRule());
					}
					set(
						$current,
						"rootPackage",
						lv_rootPackage_1_0,
						"de.cooperateproject.modeling.textual.usecase.Usecase.RootPackage");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='@end-uc'
		{
			newLeafNode(otherlv_2, grammarAccess.getUseCaseDiagramAccess().getEndUcKeyword_2());
		}
	)
;

// Entry rule entryRuleRootPackage
entryRuleRootPackage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootPackageRule()); }
	iv_ruleRootPackage=ruleRootPackage
	{ $current=$iv_ruleRootPackage.current; }
	EOF;

// Rule RootPackage
ruleRootPackage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='rootElement'
		{
			newLeafNode(otherlv_0, grammarAccess.getRootPackageAccess().getRootElementKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_0());
				}
				lv_name_1_0=ruleFQN
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootPackageRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"de.cooperateproject.modeling.textual.usecase.Usecase.FQN");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRootPackageAccess().getActorsActorParserRuleCall_2_0());
				}
				lv_actors_2_0=ruleActor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootPackageRule());
					}
					add(
						$current,
						"actors",
						lv_actors_2_0,
						"de.cooperateproject.modeling.textual.usecase.Usecase.Actor");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getRootPackageAccess().getSystemsSystemParserRuleCall_3_0());
				}
				lv_systems_3_0=ruleSystem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootPackageRule());
					}
					add(
						$current,
						"systems",
						lv_systems_3_0,
						"de.cooperateproject.modeling.textual.usecase.Usecase.System");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getRootPackageAccess().getRelationshipsRelationshipParserRuleCall_4_0());
				}
				lv_relationships_4_0=ruleRelationship
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootPackageRule());
					}
					add(
						$current,
						"relationships",
						lv_relationships_4_0,
						"de.cooperateproject.modeling.textual.usecase.Usecase.Relationship");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleActor
entryRuleActor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActorRule()); }
	iv_ruleActor=ruleActor
	{ $current=$iv_ruleActor.current; }
	EOF;

// Rule Actor
ruleActor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getActorAccess().getVisibilityVisibilityEnumRuleCall_0_0());
				}
				lv_visibility_0_0=ruleVisibility
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActorRule());
					}
					set(
						$current,
						"visibility",
						lv_visibility_0_0,
						"de.cooperateproject.modeling.textual.usecase.Usecase.Visibility");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_abstract_1_0='abstract'
				{
					newLeafNode(lv_abstract_1_0, grammarAccess.getActorAccess().getAbstractAbstractKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActorRule());
					}
					setWithLastConsumed($current, "abstract", true, "abstract");
				}
			)
		)?
		otherlv_2='act'
		{
			newLeafNode(otherlv_2, grammarAccess.getActorAccess().getActKeyword_2());
		}
		(
			(
				(
					lv_name_3_0=RULE_ID
					{
						newLeafNode(lv_name_3_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getActorRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			(
				(
					(
						lv_name_4_0=RULE_STRING
						{
							newLeafNode(lv_name_4_0, grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_3_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getActorRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_4_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
				otherlv_5='as'
				{
					newLeafNode(otherlv_5, grammarAccess.getActorAccess().getAsKeyword_3_1_1());
				}
				(
					(
						lv_alias_6_0=RULE_ID
						{
							newLeafNode(lv_alias_6_0, grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_3_1_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getActorRule());
							}
							setWithLastConsumed(
								$current,
								"alias",
								lv_alias_6_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleSystem
entryRuleSystem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemRule()); }
	iv_ruleSystem=ruleSystem
	{ $current=$iv_ruleSystem.current; }
	EOF;

// Rule System
ruleSystem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='sys'
		{
			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSysKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSystemAccess().getNameFQNParserRuleCall_1_0());
				}
				lv_name_1_0=ruleFQN
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSystemRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"de.cooperateproject.modeling.textual.usecase.Usecase.FQN");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSystemAccess().getUsecasesUseCaseParserRuleCall_3_0());
				}
				lv_usecases_3_0=ruleUseCase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSystemRule());
					}
					add(
						$current,
						"usecases",
						lv_usecases_3_0,
						"de.cooperateproject.modeling.textual.usecase.Usecase.UseCase");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleUseCase
entryRuleUseCase returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUseCaseRule()); }
	iv_ruleUseCase=ruleUseCase
	{ $current=$iv_ruleUseCase.current; }
	EOF;

// Rule UseCase
ruleUseCase returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getUseCaseAccess().getVisibilityVisibilityEnumRuleCall_0_0());
				}
				lv_visibility_0_0=ruleVisibility
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUseCaseRule());
					}
					set(
						$current,
						"visibility",
						lv_visibility_0_0,
						"de.cooperateproject.modeling.textual.usecase.Usecase.Visibility");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_abstract_1_0='abstract'
				{
					newLeafNode(lv_abstract_1_0, grammarAccess.getUseCaseAccess().getAbstractAbstractKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUseCaseRule());
					}
					setWithLastConsumed($current, "abstract", true, "abstract");
				}
			)
		)?
		otherlv_2='uc'
		{
			newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getUcKeyword_2());
		}
		(
			(
				(
					lv_name_3_0=RULE_ID
					{
						newLeafNode(lv_name_3_0, grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getUseCaseRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			(
				(
					(
						lv_name_4_0=RULE_STRING
						{
							newLeafNode(lv_name_4_0, grammarAccess.getUseCaseAccess().getNameSTRINGTerminalRuleCall_3_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getUseCaseRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_4_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
				otherlv_5='as'
				{
					newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getAsKeyword_3_1_1());
				}
				(
					(
						lv_alias_6_0=RULE_ID
						{
							newLeafNode(lv_alias_6_0, grammarAccess.getUseCaseAccess().getAliasIDTerminalRuleCall_3_1_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getUseCaseRule());
							}
							setWithLastConsumed(
								$current,
								"alias",
								lv_alias_6_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)
		(
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getUseCaseAccess().getExtensionPointsExtensionPointParserRuleCall_4_1_0());
					}
					lv_extensionPoints_8_0=ruleExtensionPoint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUseCaseRule());
						}
						add(
							$current,
							"extensionPoints",
							lv_extensionPoints_8_0,
							"de.cooperateproject.modeling.textual.usecase.Usecase.ExtensionPoint");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_4_2());
			}
		)?
	)
;

// Entry rule entryRuleExtensionPoint
entryRuleExtensionPoint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExtensionPointRule()); }
	iv_ruleExtensionPoint=ruleExtensionPoint
	{ $current=$iv_ruleExtensionPoint.current; }
	EOF;

// Rule ExtensionPoint
ruleExtensionPoint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ep'
		{
			newLeafNode(otherlv_0, grammarAccess.getExtensionPointAccess().getEpKeyword_0());
		}
		(
			(
				(
					lv_name_1_0=RULE_ID
					{
						newLeafNode(lv_name_1_0, grammarAccess.getExtensionPointAccess().getNameIDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExtensionPointRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			(
				(
					(
						lv_name_2_0=RULE_STRING
						{
							newLeafNode(lv_name_2_0, grammarAccess.getExtensionPointAccess().getNameSTRINGTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExtensionPointRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_2_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
				otherlv_3='as'
				{
					newLeafNode(otherlv_3, grammarAccess.getExtensionPointAccess().getAsKeyword_1_1_1());
				}
				(
					(
						lv_alias_4_0=RULE_ID
						{
							newLeafNode(lv_alias_4_0, grammarAccess.getExtensionPointAccess().getAliasIDTerminalRuleCall_1_1_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExtensionPointRule());
							}
							setWithLastConsumed(
								$current,
								"alias",
								lv_alias_4_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleRelationship
entryRuleRelationship returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationshipRule()); }
	iv_ruleRelationship=ruleRelationship
	{ $current=$iv_ruleRelationship.current; }
	EOF;

// Rule Relationship
ruleRelationship returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRelationshipAccess().getAssociationParserRuleCall_0());
		}
		this_Association_0=ruleAssociation
		{
			$current = $this_Association_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRelationshipAccess().getGeneralizationParserRuleCall_1());
		}
		this_Generalization_1=ruleGeneralization
		{
			$current = $this_Generalization_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRelationshipAccess().getIncludeParserRuleCall_2());
		}
		this_Include_2=ruleInclude
		{
			$current = $this_Include_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRelationshipAccess().getExtendParserRuleCall_3());
		}
		this_Extend_3=ruleExtend
		{
			$current = $this_Extend_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRelationshipAccess().getCommentParserRuleCall_4());
		}
		this_Comment_4=ruleComment
		{
			$current = $this_Comment_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAssociation
entryRuleAssociation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssociationRule()); }
	iv_ruleAssociation=ruleAssociation
	{ $current=$iv_ruleAssociation.current; }
	EOF;

// Rule Association
ruleAssociation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getActorActorCrossReference_0_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='uses'
		{
			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getUsesKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getUsecaseUseCaseCrossReference_2_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='['
			{
				newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAssociationAccess().getLeftCardinalityCardinalityParserRuleCall_3_1_0());
					}
					lv_leftCardinality_4_0=ruleCardinality
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAssociationRule());
						}
						set(
							$current,
							"leftCardinality",
							lv_leftCardinality_4_0,
							"de.cooperateproject.modeling.textual.usecase.Usecase.Cardinality");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5='|'
			{
				newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getVerticalLineKeyword_3_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAssociationAccess().getRightCardinalityCardinalityParserRuleCall_3_3_0());
					}
					lv_rightCardinality_6_0=ruleCardinality
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAssociationRule());
						}
						set(
							$current,
							"rightCardinality",
							lv_rightCardinality_6_0,
							"de.cooperateproject.modeling.textual.usecase.Usecase.Cardinality");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_7=']'
			{
				newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_3_4());
			}
		)?
	)
;

// Entry rule entryRuleGeneralization
entryRuleGeneralization returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGeneralizationRule()); }
	iv_ruleGeneralization=ruleGeneralization
	{ $current=$iv_ruleGeneralization.current; }
	EOF;

// Rule Generalization
ruleGeneralization returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGeneralizationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGeneralizationAccess().getClientBehavioredClassifierCrossReference_0_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='isA'
		{
			newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getIsAKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGeneralizationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGeneralizationAccess().getSupplierBehavioredClassifierCrossReference_2_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInclude
entryRuleInclude returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIncludeRule()); }
	iv_ruleInclude=ruleInclude
	{ $current=$iv_ruleInclude.current; }
	EOF;

// Rule Include
ruleInclude returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIncludeRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getIncludeAccess().getClientUseCaseCrossReference_0_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='inc'
		{
			newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getIncKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIncludeRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getIncludeAccess().getSupplierUseCaseCrossReference_2_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExtend
entryRuleExtend returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExtendRule()); }
	iv_ruleExtend=ruleExtend
	{ $current=$iv_ruleExtend.current; }
	EOF;

// Rule Extend
ruleExtend returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExtendRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getExtendAccess().getClientUseCaseCrossReference_0_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='ext'
		{
			newLeafNode(otherlv_1, grammarAccess.getExtendAccess().getExtKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExtendRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getExtendAccess().getSupplierUseCaseCrossReference_2_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='['
		{
			newLeafNode(otherlv_3, grammarAccess.getExtendAccess().getLeftSquareBracketKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExtendRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getExtendAccess().getExtensionPointExtensionPointCrossReference_4_0());
				}
			)
		)
		(
			otherlv_5='|'
			{
				newLeafNode(otherlv_5, grammarAccess.getExtendAccess().getVerticalLineKeyword_5_0());
			}
			(
				(
					lv_condition_6_0=RULE_STRING
					{
						newLeafNode(lv_condition_6_0, grammarAccess.getExtendAccess().getConditionSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExtendRule());
						}
						setWithLastConsumed(
							$current,
							"condition",
							lv_condition_6_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_7=']'
		{
			newLeafNode(otherlv_7, grammarAccess.getExtendAccess().getRightSquareBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleComment
entryRuleComment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommentRule()); }
	iv_ruleComment=ruleComment
	{ $current=$iv_ruleComment.current; }
	EOF;

// Rule Comment
ruleComment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommentRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getCommentAccess().getCommentedElementCommentableCrossReference_0_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='note'
		{
			newLeafNode(otherlv_1, grammarAccess.getCommentAccess().getNoteKeyword_1());
		}
		(
			(
				lv_comment_2_0=RULE_STRING
				{
					newLeafNode(lv_comment_2_0, grammarAccess.getCommentAccess().getCommentSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCommentRule());
					}
					setWithLastConsumed(
						$current,
						"comment",
						lv_comment_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleCardinality
entryRuleCardinality returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCardinalityRule()); }
	iv_ruleCardinality=ruleCardinality
	{ $current=$iv_ruleCardinality.current; }
	EOF;

// Rule Cardinality
ruleCardinality returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getCardinalityAccess().getLowerBoundCardinalityBoundParserRuleCall_0_0());
				}
				lv_lowerBound_0_0=ruleCardinalityBound
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCardinalityRule());
					}
					set(
						$current,
						"lowerBound",
						lv_lowerBound_0_0,
						"de.cooperateproject.modeling.textual.usecase.Usecase.CardinalityBound");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='..'
			{
				newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCardinalityAccess().getUpperBoundCardinalityBoundParserRuleCall_1_1_0());
					}
					lv_upperBound_2_0=ruleCardinalityBound
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCardinalityRule());
						}
						set(
							$current,
							"upperBound",
							lv_upperBound_2_0,
							"de.cooperateproject.modeling.textual.usecase.Usecase.CardinalityBound");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleCardinalityBound
entryRuleCardinalityBound returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCardinalityBoundRule()); }
	iv_ruleCardinalityBound=ruleCardinalityBound
	{ $current=$iv_ruleCardinalityBound.current.getText(); }
	EOF;

// Rule CardinalityBound
ruleCardinalityBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCardinalityBoundAccess().getAsteriskKeyword_0());
		}
		    |
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getCardinalityBoundAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFQNRule()); }
	iv_ruleFQN=ruleFQN
	{ $current=$iv_ruleFQN.current.getText(); }
	EOF;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Rule Visibility
ruleVisibility returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='UNDEFINED'
			{
				$current = grammarAccess.getVisibilityAccess().getUNDEFINEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getUNDEFINEDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='+'
			{
				$current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='public'
			{
				$current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='-'
			{
				$current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='private'
			{
				$current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='#'
			{
				$current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='protected'
			{
				$current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='~'
			{
				$current = grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getVisibilityAccess().getPACKAGEEnumLiteralDeclaration_7());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;