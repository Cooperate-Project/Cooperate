/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.activity.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.activity.ide.contentassist.antlr.internal.InternalActParser;
import de.cooperateproject.modeling.textual.activity.services.ActGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ActParser extends AbstractContentAssistParser {

	@Inject
	private ActGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalActParser createParser() {
		InternalActParser result = new InternalActParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getNodeAccess().getAlternatives(), "rule__Node__Alternatives");
					put(grammarAccess.getActionNodeAccess().getAlternatives_1(), "rule__ActionNode__Alternatives_1");
					put(grammarAccess.getControlNodeAccess().getAlternatives(), "rule__ControlNode__Alternatives");
					put(grammarAccess.getActivityDiagramAccess().getGroup(), "rule__ActivityDiagram__Group__0");
					put(grammarAccess.getRootPackageAccess().getGroup(), "rule__RootPackage__Group__0");
					put(grammarAccess.getRootPackageAccess().getGroup_1(), "rule__RootPackage__Group_1__0");
					put(grammarAccess.getRootPackageAccess().getGroup_2(), "rule__RootPackage__Group_2__0");
					put(grammarAccess.getActionNodeAccess().getGroup(), "rule__ActionNode__Group__0");
					put(grammarAccess.getActionNodeAccess().getGroup_1_1(), "rule__ActionNode__Group_1_1__0");
					put(grammarAccess.getInitialNodeAccess().getGroup(), "rule__InitialNode__Group__0");
					put(grammarAccess.getFinalNodeAccess().getGroup(), "rule__FinalNode__Group__0");
					put(grammarAccess.getFlowFinalNodeAccess().getGroup(), "rule__FlowFinalNode__Group__0");
					put(grammarAccess.getDecisionNodeAccess().getGroup(), "rule__DecisionNode__Group__0");
					put(grammarAccess.getMergeNodeAccess().getGroup(), "rule__MergeNode__Group__0");
					put(grammarAccess.getFlowAccess().getGroup(), "rule__Flow__Group__0");
					put(grammarAccess.getFlowAccess().getGroup_3(), "rule__Flow__Group_3__0");
					put(grammarAccess.getFlowAccess().getGroup_5(), "rule__Flow__Group_5__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getActivityDiagramAccess().getTitleAssignment_2(), "rule__ActivityDiagram__TitleAssignment_2");
					put(grammarAccess.getActivityDiagramAccess().getRootPackageAssignment_3(), "rule__ActivityDiagram__RootPackageAssignment_3");
					put(grammarAccess.getRootPackageAccess().getNameAssignment_1_1(), "rule__RootPackage__NameAssignment_1_1");
					put(grammarAccess.getRootPackageAccess().getActivityNameAssignment_2_1(), "rule__RootPackage__ActivityNameAssignment_2_1");
					put(grammarAccess.getRootPackageAccess().getNodesAssignment_3(), "rule__RootPackage__NodesAssignment_3");
					put(grammarAccess.getRootPackageAccess().getRelationsAssignment_4(), "rule__RootPackage__RelationsAssignment_4");
					put(grammarAccess.getActionNodeAccess().getNameAssignment_1_0(), "rule__ActionNode__NameAssignment_1_0");
					put(grammarAccess.getActionNodeAccess().getNameAssignment_1_1_0(), "rule__ActionNode__NameAssignment_1_1_0");
					put(grammarAccess.getActionNodeAccess().getAliasAssignment_1_1_2(), "rule__ActionNode__AliasAssignment_1_1_2");
					put(grammarAccess.getInitialNodeAccess().getNameAssignment_2(), "rule__InitialNode__NameAssignment_2");
					put(grammarAccess.getFinalNodeAccess().getNameAssignment_2(), "rule__FinalNode__NameAssignment_2");
					put(grammarAccess.getFlowFinalNodeAccess().getNameAssignment_2(), "rule__FlowFinalNode__NameAssignment_2");
					put(grammarAccess.getDecisionNodeAccess().getNameAssignment_1(), "rule__DecisionNode__NameAssignment_1");
					put(grammarAccess.getMergeNodeAccess().getNameAssignment_1(), "rule__MergeNode__NameAssignment_1");
					put(grammarAccess.getFlowAccess().getRelatedElementsAssignment_2(), "rule__Flow__RelatedElementsAssignment_2");
					put(grammarAccess.getFlowAccess().getRelatedElementsAssignment_3_1(), "rule__Flow__RelatedElementsAssignment_3_1");
					put(grammarAccess.getFlowAccess().getConditionAssignment_5_1(), "rule__Flow__ConditionAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ActGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ActGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
