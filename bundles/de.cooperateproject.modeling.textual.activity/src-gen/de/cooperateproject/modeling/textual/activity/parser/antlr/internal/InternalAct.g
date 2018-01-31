/*
 * generated by Xtext 2.12.0
 */
grammar InternalAct;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.cooperateproject.modeling.textual.activity.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.cooperateproject.modeling.textual.activity.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cooperateproject.modeling.textual.activity.services.ActGrammarAccess;

}

@parser::members {

 	private ActGrammarAccess grammarAccess;

    public InternalActParser(TokenStream input, ActGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ActivityDiagram";
   	}

   	@Override
   	protected ActGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleActivityDiagram
entryRuleActivityDiagram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActivityDiagramRule()); }
	iv_ruleActivityDiagram=ruleActivityDiagram
	{ $current=$iv_ruleActivityDiagram.current; }
	EOF;

// Rule ActivityDiagram
ruleActivityDiagram returns [EObject current=null]
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
					grammarAccess.getActivityDiagramAccess().getActivityDiagramAction_0(),
					$current);
			}
		)
		otherlv_1='@start-actd'
		{
			newLeafNode(otherlv_1, grammarAccess.getActivityDiagramAccess().getStartActdKeyword_1());
		}
		(
			(
				lv_title_2_0=RULE_STRING
				{
					newLeafNode(lv_title_2_0, grammarAccess.getActivityDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActivityDiagramRule());
					}
					setWithLastConsumed(
						$current,
						"title",
						lv_title_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='@end-actd'
		{
			newLeafNode(otherlv_3, grammarAccess.getActivityDiagramAccess().getEndActdKeyword_3());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;