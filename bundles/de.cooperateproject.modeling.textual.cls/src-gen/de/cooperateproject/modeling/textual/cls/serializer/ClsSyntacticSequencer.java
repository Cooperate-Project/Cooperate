/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.cls.serializer;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.cls.services.ClsGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ClsSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ClsGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Class___LeftCurlyBracketKeyword_5_1_0_RightCurlyBracketKeyword_5_1_3__q;
	protected AbstractElementAlias match_Interface___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ClsGrammarAccess) access;
		match_Class___LeftCurlyBracketKeyword_5_1_0_RightCurlyBracketKeyword_5_1_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1_0()), new TokenAlias(false, false, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_1_3()));
		match_Interface___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_1_0()), new TokenAlias(false, false, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_1_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getSTEREOTYPE_CRule())
			return getSTEREOTYPE_CToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTEREOTYPE_ORule())
			return getSTEREOTYPE_OToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal STEREOTYPE_C : ('»'|'>>');
	 */
	protected String getSTEREOTYPE_CToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\u00BB";
	}
	
	/**
	 * terminal STEREOTYPE_O : ('«'|'<<');
	 */
	protected String getSTEREOTYPE_OToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\u00AB";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Class___LeftCurlyBracketKeyword_5_1_0_RightCurlyBracketKeyword_5_1_3__q.equals(syntax))
				emit_Class___LeftCurlyBracketKeyword_5_1_0_RightCurlyBracketKeyword_5_1_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Interface___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_3__q.equals(syntax))
				emit_Interface___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     alias=ID (ambiguity) (rule end)
	 *     appliedStereotypes+=StereotypeApplication (ambiguity) (rule end)
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_Class___LeftCurlyBracketKeyword_5_1_0_RightCurlyBracketKeyword_5_1_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     alias=ID (ambiguity) (rule end)
	 *     appliedStereotypes+=StereotypeApplication (ambiguity) (rule end)
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_Interface___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
