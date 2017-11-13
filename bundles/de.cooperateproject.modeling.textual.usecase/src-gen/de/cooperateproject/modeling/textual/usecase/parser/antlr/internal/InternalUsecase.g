/*
 * generated by Xtext 2.12.0
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
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getUseCaseDiagramAccess().getUseCaseDiagramAction_0(),
					$current);
			}
		)
		otherlv_1='@start-uscd'
		{
			newLeafNode(otherlv_1, grammarAccess.getUseCaseDiagramAccess().getStartUscdKeyword_1());
		}
		(
			(
				lv_title_2_0=RULE_STRING
				{
					newLeafNode(lv_title_2_0, grammarAccess.getUseCaseDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUseCaseDiagramRule());
					}
					setWithLastConsumed(
						$current,
						"title",
						lv_title_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getUseCaseDiagramAccess().getRootPackageRootPackageParserRuleCall_3_0());
				}
				lv_rootPackage_3_0=ruleRootPackage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUseCaseDiagramRule());
					}
					set(
						$current,
						"rootPackage",
						lv_rootPackage_3_0,
						"de.cooperateproject.modeling.textual.usecase.Usecase.RootPackage");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='@end-uscd'
		{
			newLeafNode(otherlv_4, grammarAccess.getUseCaseDiagramAccess().getEndUscdKeyword_4());
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
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRootPackageAccess().getRootPackageAction_0(),
					$current);
			}
		)
		(
			otherlv_1='rootPackage'
			{
				newLeafNode(otherlv_1, grammarAccess.getRootPackageAccess().getRootPackageKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_1_0());
					}
					lv_name_2_0=ruleFQN
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootPackageRule());
						}
						set(
							$current,
							"name",
							lv_name_2_0,
							"de.cooperateproject.modeling.textual.usecase.Usecase.FQN");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getRootPackageAccess().getActorsActorParserRuleCall_2_0());
				}
				lv_actors_3_0=ruleActor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootPackageRule());
					}
					add(
						$current,
						"actors",
						lv_actors_3_0,
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
				lv_systems_4_0=ruleSystem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootPackageRule());
					}
					add(
						$current,
						"systems",
						lv_systems_4_0,
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
				lv_relationships_5_0=ruleRelationship
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRootPackageRule());
					}
					add(
						$current,
						"relationships",
						lv_relationships_5_0,
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
						lv_alias_4_0=RULE_ID
						{
							newLeafNode(lv_alias_4_0, grammarAccess.getActorAccess().getAliasIDTerminalRuleCall_3_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getActorRule());
							}
							setWithLastConsumed(
								$current,
								"alias",
								lv_alias_4_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				otherlv_5='as'
				{
					newLeafNode(otherlv_5, grammarAccess.getActorAccess().getAsKeyword_3_1_1());
				}
				(
					(
						lv_name_6_0=RULE_STRING
						{
							newLeafNode(lv_name_6_0, grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_3_1_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getActorRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_6_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)
		)
		(
			otherlv_7='role'
			{
				newLeafNode(otherlv_7, grammarAccess.getActorAccess().getRoleKeyword_4_0());
			}
			otherlv_8='['
			{
				newLeafNode(otherlv_8, grammarAccess.getActorAccess().getLeftSquareBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActorAccess().getTypeActorTypeEnumRuleCall_4_2_0());
					}
					lv_type_9_0=ruleActorType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActorRule());
						}
						set(
							$current,
							"type",
							lv_type_9_0,
							"de.cooperateproject.modeling.textual.usecase.Usecase.ActorType");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_10=']'
			{
				newLeafNode(otherlv_10, grammarAccess.getActorAccess().getRightSquareBracketKeyword_4_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getActorAccess().getCommentsCommentParserRuleCall_5_0());
				}
				lv_comments_11_0=ruleComment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActorRule());
					}
					add(
						$current,
						"comments",
						lv_comments_11_0,
						"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
					afterParserOrEnumRuleCall();
				}
			)
		)?
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
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSystemAccess().getCommentsCommentParserRuleCall_2_0_0());
					}
					lv_comments_2_0=ruleComment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSystemRule());
						}
						add(
							$current,
							"comments",
							lv_comments_2_0,
							"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			    |
			(
				otherlv_3='{'
				{
					newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSystemAccess().getCommentsCommentParserRuleCall_2_1_1_0());
						}
						lv_comments_4_0=ruleComment
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSystemRule());
							}
							add(
								$current,
								"comments",
								lv_comments_4_0,
								"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
							afterParserOrEnumRuleCall();
						}
					)
				)?
				(
					(
						{
							newCompositeNode(grammarAccess.getSystemAccess().getUsecasesUseCaseParserRuleCall_2_1_2_0());
						}
						lv_usecases_5_0=ruleUseCase
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSystemRule());
							}
							add(
								$current,
								"usecases",
								lv_usecases_5_0,
								"de.cooperateproject.modeling.textual.usecase.Usecase.UseCase");
							afterParserOrEnumRuleCall();
						}
					)
				)*
				otherlv_6='}'
				{
					newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_2_1_3());
				}
			)
		)
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
						lv_alias_4_0=RULE_ID
						{
							newLeafNode(lv_alias_4_0, grammarAccess.getUseCaseAccess().getAliasIDTerminalRuleCall_3_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getUseCaseRule());
							}
							setWithLastConsumed(
								$current,
								"alias",
								lv_alias_4_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				otherlv_5='as'
				{
					newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getAsKeyword_3_1_1());
				}
				(
					(
						lv_name_6_0=RULE_STRING
						{
							newLeafNode(lv_name_6_0, grammarAccess.getUseCaseAccess().getNameSTRINGTerminalRuleCall_3_1_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getUseCaseRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_6_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getUseCaseAccess().getCommentsCommentParserRuleCall_4_0_0());
					}
					lv_comments_7_0=ruleComment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUseCaseRule());
						}
						add(
							$current,
							"comments",
							lv_comments_7_0,
							"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			    |
			(
				otherlv_8='{'
				{
					newLeafNode(otherlv_8, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_4_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getUseCaseAccess().getCommentsCommentParserRuleCall_4_1_1_0());
						}
						lv_comments_9_0=ruleComment
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getUseCaseRule());
							}
							add(
								$current,
								"comments",
								lv_comments_9_0,
								"de.cooperateproject.modeling.textual.usecase.Usecase.Comment");
							afterParserOrEnumRuleCall();
						}
					)
				)?
				(
					(
						{
							newCompositeNode(grammarAccess.getUseCaseAccess().getExtensionPointsExtensionPointParserRuleCall_4_1_2_0());
						}
						lv_extensionPoints_10_0=ruleExtensionPoint
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getUseCaseRule());
							}
							add(
								$current,
								"extensionPoints",
								lv_extensionPoints_10_0,
								"de.cooperateproject.modeling.textual.usecase.Usecase.ExtensionPoint");
							afterParserOrEnumRuleCall();
						}
					)
				)*
				otherlv_11='}'
				{
					newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_4_1_3());
				}
			)
		)
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
						lv_alias_2_0=RULE_ID
						{
							newLeafNode(lv_alias_2_0, grammarAccess.getExtensionPointAccess().getAliasIDTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExtensionPointRule());
							}
							setWithLastConsumed(
								$current,
								"alias",
								lv_alias_2_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				otherlv_3='as'
				{
					newLeafNode(otherlv_3, grammarAccess.getExtensionPointAccess().getAsKeyword_1_1_1());
				}
				(
					(
						lv_name_4_0=RULE_STRING
						{
							newLeafNode(lv_name_4_0, grammarAccess.getExtensionPointAccess().getNameSTRINGTerminalRuleCall_1_1_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getExtensionPointRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_4_0,
								"org.eclipse.xtext.common.Terminals.STRING");
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
		otherlv_0='iac'
		{
			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getIacKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getActorActorCrossReference_2_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=','
		{
			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getCommaKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getUsecaseUseCaseCrossReference_4_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getRightParenthesisKeyword_5());
		}
		(
			otherlv_6='card'
			{
				newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getCardKeyword_6_0());
			}
			otherlv_7='['
			{
				newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAssociationAccess().getActorCardinalityCardinalityParserRuleCall_6_2_0());
					}
					lv_actorCardinality_8_0=ruleCardinality
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAssociationRule());
						}
						set(
							$current,
							"actorCardinality",
							lv_actorCardinality_8_0,
							"de.cooperateproject.modeling.textual.usecase.Usecase.Cardinality");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_9=':'
				{
					newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getColonKeyword_6_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAssociationAccess().getUseCaseCardinalityCardinalityParserRuleCall_6_3_1_0());
						}
						lv_useCaseCardinality_10_0=ruleCardinality
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAssociationRule());
							}
							set(
								$current,
								"useCaseCardinality",
								lv_useCaseCardinality_10_0,
								"de.cooperateproject.modeling.textual.usecase.Usecase.Cardinality");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
			otherlv_11=']'
			{
				newLeafNode(otherlv_11, grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_6_4());
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
		otherlv_0='isa'
		{
			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getIsaKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGeneralizationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGeneralizationAccess().getSpecificBehavioredClassifierCrossReference_2_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=','
		{
			newLeafNode(otherlv_3, grammarAccess.getGeneralizationAccess().getCommaKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGeneralizationRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getGeneralizationAccess().getGeneralBehavioredClassifierCrossReference_4_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getGeneralizationAccess().getRightParenthesisKeyword_5());
		}
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
		otherlv_0='inc'
		{
			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIncludeRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getIncludeAccess().getIncludingCaseUseCaseCrossReference_2_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=','
		{
			newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getCommaKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIncludeRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getIncludeAccess().getAdditionUseCaseCrossReference_4_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getIncludeAccess().getRightParenthesisKeyword_5());
		}
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
		otherlv_0='ext'
		{
			newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getExtendAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExtendRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getExtendAccess().getExtensionUseCaseCrossReference_2_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=','
		{
			newLeafNode(otherlv_3, grammarAccess.getExtendAccess().getCommaKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExtendRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getExtendAccess().getExtendedCaseUseCaseCrossReference_4_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getExtendAccess().getRightParenthesisKeyword_5());
		}
		otherlv_6='ep'
		{
			newLeafNode(otherlv_6, grammarAccess.getExtendAccess().getEpKeyword_6());
		}
		otherlv_7='['
		{
			newLeafNode(otherlv_7, grammarAccess.getExtendAccess().getLeftSquareBracketKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExtendRule());
					}
				}
				otherlv_8=RULE_ID
				{
					newLeafNode(otherlv_8, grammarAccess.getExtendAccess().getExtensionLocationExtensionPointCrossReference_8_0());
				}
			)
		)
		otherlv_9=']'
		{
			newLeafNode(otherlv_9, grammarAccess.getExtendAccess().getRightSquareBracketKeyword_9());
		}
		(
			otherlv_10='cond'
			{
				newLeafNode(otherlv_10, grammarAccess.getExtendAccess().getCondKeyword_10_0());
			}
			otherlv_11='['
			{
				newLeafNode(otherlv_11, grammarAccess.getExtendAccess().getLeftSquareBracketKeyword_10_1());
			}
			(
				(
					lv_condition_12_0=RULE_STRING
					{
						newLeafNode(lv_condition_12_0, grammarAccess.getExtendAccess().getConditionSTRINGTerminalRuleCall_10_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExtendRule());
						}
						setWithLastConsumed(
							$current,
							"condition",
							lv_condition_12_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_13=']'
			{
				newLeafNode(otherlv_13, grammarAccess.getExtendAccess().getRightSquareBracketKeyword_10_3());
			}
		)?
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
		otherlv_0='note'
		{
			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getNoteKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCommentAccess().getBodyCommentBodyParserRuleCall_1_0());
				}
				lv_body_1_0=ruleCommentBody
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommentRule());
					}
					set(
						$current,
						"body",
						lv_body_1_0,
						"de.cooperateproject.modeling.textual.usecase.Usecase.CommentBody");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCommentBody
entryRuleCommentBody returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCommentBodyRule()); }
	iv_ruleCommentBody=ruleCommentBody
	{ $current=$iv_ruleCommentBody.current.getText(); }
	EOF;

// Rule CommentBody
ruleCommentBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getCommentBodyAccess().getSTRINGTerminalRuleCall());
	}
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
			enumLiteral_0='+'
			{
				$current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='public'
			{
				$current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='-'
			{
				$current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='private'
			{
				$current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='#'
			{
				$current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='protected'
			{
				$current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='~'
			{
				$current = grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_6());
			}
		)
	)
;

// Rule ActorType
ruleActorType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='human'
			{
				$current = grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getActorTypeAccess().getHUMANEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='machine'
			{
				$current = grammarAccess.getActorTypeAccess().getMACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getActorTypeAccess().getMACHINEEnumLiteralDeclaration_1());
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
