/*
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.sequence.ide.contentassist.antlr.internal.InternalSequenceParser;
import de.cooperateproject.modeling.textual.sequence.services.SequenceGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class SequenceParser extends AbstractContentAssistParser {

	@Inject
	private SequenceGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSequenceParser createParser() {
		InternalSequenceParser result = new InternalSequenceParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSequenceDiagramAccess().getFragmentsAlternatives_6_0(), "rule__SequenceDiagram__FragmentsAlternatives_6_0");
					put(grammarAccess.getActorAccess().getAlternatives_2(), "rule__Actor__Alternatives_2");
					put(grammarAccess.getFragmentAccess().getAlternatives(), "rule__Fragment__Alternatives");
					put(grammarAccess.getOrderedFragmentContainerAccess().getAlternatives(), "rule__OrderedFragmentContainer__Alternatives");
					put(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getAlternatives_1(), "rule__OrderedFragmentContainerWithCondition__Alternatives_1");
					put(grammarAccess.getMessageAccess().getAlternatives_0(), "rule__Message__Alternatives_0");
					put(grammarAccess.getMessageAccess().getAlternatives_3(), "rule__Message__Alternatives_3");
					put(grammarAccess.getResponseMessageAccess().getAlternatives_3(), "rule__ResponseMessage__Alternatives_3");
					put(grammarAccess.getResponseMessageAccess().getAlternatives_5(), "rule__ResponseMessage__Alternatives_5");
					put(grammarAccess.getLostMessageAccess().getAlternatives_1(), "rule__LostMessage__Alternatives_1");
					put(grammarAccess.getOccurenceSpecificationAccess().getAlternatives(), "rule__OccurenceSpecification__Alternatives");
					put(grammarAccess.getCombinedFragmentAccess().getAlternatives(), "rule__CombinedFragment__Alternatives");
					put(grammarAccess.getSingleRegionContainerAccess().getAlternatives(), "rule__SingleRegionContainer__Alternatives");
					put(grammarAccess.getMultipleRegionContainerAccess().getAlternatives(), "rule__MultipleRegionContainer__Alternatives");
					put(grammarAccess.getConstraintAccess().getAlternatives_1(), "rule__Constraint__Alternatives_1");
					put(grammarAccess.getObservationAccess().getAlternatives_1(), "rule__Observation__Alternatives_1");
					put(grammarAccess.getTimeIntervalSelectorAccess().getAlternatives(), "rule__TimeIntervalSelector__Alternatives");
					put(grammarAccess.getUnescapedStringAccess().getAlternatives(), "rule__UnescapedString__Alternatives");
					put(grammarAccess.getMessageTypeAccess().getAlternatives(), "rule__MessageType__Alternatives");
					put(grammarAccess.getActorTypeAccess().getAlternatives(), "rule__ActorType__Alternatives");
					put(grammarAccess.getSequenceDiagramAccess().getGroup(), "rule__SequenceDiagram__Group__0");
					put(grammarAccess.getRootPackageAccess().getGroup(), "rule__RootPackage__Group__0");
					put(grammarAccess.getActorAccess().getGroup(), "rule__Actor__Group__0");
					put(grammarAccess.getActorAccess().getGroup_2_0(), "rule__Actor__Group_2_0__0");
					put(grammarAccess.getActorAccess().getGroup_2_1(), "rule__Actor__Group_2_1__0");
					put(grammarAccess.getActorAccess().getGroup_2_2(), "rule__Actor__Group_2_2__0");
					put(grammarAccess.getActorAccess().getGroup_3(), "rule__Actor__Group_3__0");
					put(grammarAccess.getActorClassifierMappingAccess().getGroup(), "rule__ActorClassifierMapping__Group__0");
					put(grammarAccess.getOrderedFragmentContainerAccess().getGroup_0(), "rule__OrderedFragmentContainer__Group_0__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getGroup(), "rule__OrderedFragmentContainerWithCondition__Group__0");
					put(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getGroup_1_0(), "rule__OrderedFragmentContainerWithCondition__Group_1_0__0");
					put(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getGroup(), "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__Group__0");
					put(grammarAccess.getMessageAccess().getGroup(), "rule__Message__Group__0");
					put(grammarAccess.getMessageAccess().getGroup_1(), "rule__Message__Group_1__0");
					put(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getGroup(), "rule__ExplicitArrivalOccurenceReference__Group__0");
					put(grammarAccess.getExplicitArrivalOccurenceSpecificationAccess().getGroup(), "rule__ExplicitArrivalOccurenceSpecification__Group__0");
					put(grammarAccess.getStandardMessageAccess().getGroup(), "rule__StandardMessage__Group__0");
					put(grammarAccess.getResponseMessageAccess().getGroup(), "rule__ResponseMessage__Group__0");
					put(grammarAccess.getFoundMessageAccess().getGroup(), "rule__FoundMessage__Group__0");
					put(grammarAccess.getLostMessageAccess().getGroup(), "rule__LostMessage__Group__0");
					put(grammarAccess.getLostMessageAccess().getGroup_1_0(), "rule__LostMessage__Group_1_0__0");
					put(grammarAccess.getLostMessageAccess().getGroup_1_1(), "rule__LostMessage__Group_1_1__0");
					put(grammarAccess.getCreateMessageAccess().getGroup(), "rule__CreateMessage__Group__0");
					put(grammarAccess.getDestructionMessageAccess().getGroup(), "rule__DestructionMessage__Group__0");
					put(grammarAccess.getDestructionOccurenceSpecificationAccess().getGroup(), "rule__DestructionOccurenceSpecification__Group__0");
					put(grammarAccess.getParallelAccess().getGroup(), "rule__Parallel__Group__0");
					put(grammarAccess.getAlternativeAccess().getGroup(), "rule__Alternative__Group__0");
					put(grammarAccess.getLoopAccess().getGroup(), "rule__Loop__Group__0");
					put(grammarAccess.getOptionAccess().getGroup(), "rule__Option__Group__0");
					put(grammarAccess.getCriticalAccess().getGroup(), "rule__Critical__Group__0");
					put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
					put(grammarAccess.getReferenceAccess().getGroup_2(), "rule__Reference__Group_2__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getTimeConstraintAccess().getGroup(), "rule__TimeConstraint__Group__0");
					put(grammarAccess.getDurationConstraintAccess().getGroup(), "rule__DurationConstraint__Group__0");
					put(grammarAccess.getObservationAccess().getGroup(), "rule__Observation__Group__0");
					put(grammarAccess.getTimeObservationAccess().getGroup(), "rule__TimeObservation__Group__0");
					put(grammarAccess.getDurationObservationAccess().getGroup(), "rule__DurationObservation__Group__0");
					put(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getGroup(), "rule__BiPointInTimeTimeIntervalSelector__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getInlineCommentAccess().getGroup(), "rule__InlineComment__Group__0");
					put(grammarAccess.getCommentAccess().getGroup(), "rule__Comment__Group__0");
					put(grammarAccess.getSequenceDiagramAccess().getTitleAssignment_2(), "rule__SequenceDiagram__TitleAssignment_2");
					put(grammarAccess.getSequenceDiagramAccess().getRootPackageAssignment_3(), "rule__SequenceDiagram__RootPackageAssignment_3");
					put(grammarAccess.getSequenceDiagramAccess().getActorsAssignment_4(), "rule__SequenceDiagram__ActorsAssignment_4");
					put(grammarAccess.getSequenceDiagramAccess().getFragmentsAssignment_5(), "rule__SequenceDiagram__FragmentsAssignment_5");
					put(grammarAccess.getSequenceDiagramAccess().getFragmentsAssignment_6(), "rule__SequenceDiagram__FragmentsAssignment_6");
					put(grammarAccess.getRootPackageAccess().getNameAssignment_1(), "rule__RootPackage__NameAssignment_1");
					put(grammarAccess.getActorAccess().getDeferredAssignment_0(), "rule__Actor__DeferredAssignment_0");
					put(grammarAccess.getActorAccess().getNameAssignment_2_0_0(), "rule__Actor__NameAssignment_2_0_0");
					put(grammarAccess.getActorAccess().getTypeMappingAssignment_2_0_1(), "rule__Actor__TypeMappingAssignment_2_0_1");
					put(grammarAccess.getActorAccess().getTypeMappingAssignment_2_1_0(), "rule__Actor__TypeMappingAssignment_2_1_0");
					put(grammarAccess.getActorAccess().getAliasAssignment_2_1_2(), "rule__Actor__AliasAssignment_2_1_2");
					put(grammarAccess.getActorAccess().getNameAssignment_2_2_0(), "rule__Actor__NameAssignment_2_2_0");
					put(grammarAccess.getActorAccess().getTypeMappingAssignment_2_2_1(), "rule__Actor__TypeMappingAssignment_2_2_1");
					put(grammarAccess.getActorAccess().getAliasAssignment_2_2_3(), "rule__Actor__AliasAssignment_2_2_3");
					put(grammarAccess.getActorAccess().getActorTypeAssignment_3_1(), "rule__Actor__ActorTypeAssignment_3_1");
					put(grammarAccess.getActorAccess().getCommentsAssignment_4(), "rule__Actor__CommentsAssignment_4");
					put(grammarAccess.getActorClassifierMappingAccess().getClassifierAssignment_1(), "rule__ActorClassifierMapping__ClassifierAssignment_1");
					put(grammarAccess.getOneFragmentAccess().getFragmentsAssignment(), "rule__OneFragment__FragmentsAssignment");
					put(grammarAccess.getOneOrMultipleFragmentsAccess().getFragmentsAssignment(), "rule__OneOrMultipleFragments__FragmentsAssignment");
					put(grammarAccess.getConditionAccess().getConditionAssignment_1(), "rule__Condition__ConditionAssignment_1");
					put(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getConditionAssignment_0(), "rule__OrderedFragmentContainerWithCondition__ConditionAssignment_0");
					put(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsAssignment_1_0_1(), "rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_0_1");
					put(grammarAccess.getOrderedFragmentContainerWithConditionAccess().getFragmentsAssignment_1_1(), "rule__OrderedFragmentContainerWithCondition__FragmentsAssignment_1_1");
					put(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getConditionAssignment_0(), "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__ConditionAssignment_0");
					put(grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsAccess().getFragmentsAssignment_2(), "rule__OrderedFragmentContainerWithConditionMandatoryBrackets__FragmentsAssignment_2");
					put(grammarAccess.getMessageAccess().getAliasAssignment_1_1(), "rule__Message__AliasAssignment_1_1");
					put(grammarAccess.getMessageAccess().getSendEventAssignment_2(), "rule__Message__SendEventAssignment_2");
					put(grammarAccess.getMessageAccess().getArrivalEventAssignment_3_0(), "rule__Message__ArrivalEventAssignment_3_0");
					put(grammarAccess.getMessageAccess().getArrivalEventAssignment_3_1(), "rule__Message__ArrivalEventAssignment_3_1");
					put(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getOccurenceSpecificationAssignment_2(), "rule__ExplicitArrivalOccurenceReference__OccurenceSpecificationAssignment_2");
					put(grammarAccess.getExplicitArrivalOccurenceSpecificationAccess().getNameAssignment_1(), "rule__ExplicitArrivalOccurenceSpecification__NameAssignment_1");
					put(grammarAccess.getStandardMessageAccess().getTypeAssignment_0(), "rule__StandardMessage__TypeAssignment_0");
					put(grammarAccess.getStandardMessageAccess().getNameAssignment_1(), "rule__StandardMessage__NameAssignment_1");
					put(grammarAccess.getStandardMessageAccess().getLeftAssignment_3(), "rule__StandardMessage__LeftAssignment_3");
					put(grammarAccess.getStandardMessageAccess().getRightAssignment_5(), "rule__StandardMessage__RightAssignment_5");
					put(grammarAccess.getResponseMessageAccess().getNameAssignment_1(), "rule__ResponseMessage__NameAssignment_1");
					put(grammarAccess.getResponseMessageAccess().getLeftAssignment_3_0(), "rule__ResponseMessage__LeftAssignment_3_0");
					put(grammarAccess.getResponseMessageAccess().getRightAssignment_5_0(), "rule__ResponseMessage__RightAssignment_5_0");
					put(grammarAccess.getFoundMessageAccess().getTypeAssignment_1(), "rule__FoundMessage__TypeAssignment_1");
					put(grammarAccess.getFoundMessageAccess().getNameAssignment_2(), "rule__FoundMessage__NameAssignment_2");
					put(grammarAccess.getFoundMessageAccess().getRightAssignment_6(), "rule__FoundMessage__RightAssignment_6");
					put(grammarAccess.getLostMessageAccess().getTypeAssignment_1_1_1(), "rule__LostMessage__TypeAssignment_1_1_1");
					put(grammarAccess.getLostMessageAccess().getNameAssignment_2(), "rule__LostMessage__NameAssignment_2");
					put(grammarAccess.getLostMessageAccess().getLeftAssignment_4(), "rule__LostMessage__LeftAssignment_4");
					put(grammarAccess.getCreateMessageAccess().getNameAssignment_1(), "rule__CreateMessage__NameAssignment_1");
					put(grammarAccess.getCreateMessageAccess().getLeftAssignment_3(), "rule__CreateMessage__LeftAssignment_3");
					put(grammarAccess.getCreateMessageAccess().getRightAssignment_5(), "rule__CreateMessage__RightAssignment_5");
					put(grammarAccess.getDestructionMessageAccess().getNameAssignment_1(), "rule__DestructionMessage__NameAssignment_1");
					put(grammarAccess.getDestructionMessageAccess().getLeftAssignment_3(), "rule__DestructionMessage__LeftAssignment_3");
					put(grammarAccess.getDestructionMessageAccess().getRightAssignment_5(), "rule__DestructionMessage__RightAssignment_5");
					put(grammarAccess.getDestructionOccurenceSpecificationAccess().getTargetAssignment_1(), "rule__DestructionOccurenceSpecification__TargetAssignment_1");
					put(grammarAccess.getParallelAccess().getRegionsAssignment_2(), "rule__Parallel__RegionsAssignment_2");
					put(grammarAccess.getAlternativeAccess().getRegionsAssignment_2(), "rule__Alternative__RegionsAssignment_2");
					put(grammarAccess.getLoopAccess().getRegionAssignment_1(), "rule__Loop__RegionAssignment_1");
					put(grammarAccess.getOptionAccess().getRegionAssignment_1(), "rule__Option__RegionAssignment_1");
					put(grammarAccess.getCriticalAccess().getRegionAssignment_2(), "rule__Critical__RegionAssignment_2");
					put(grammarAccess.getReferenceAccess().getReferenceAssignment_1(), "rule__Reference__ReferenceAssignment_1");
					put(grammarAccess.getReferenceAccess().getAliasAssignment_2_1(), "rule__Reference__AliasAssignment_2_1");
					put(grammarAccess.getTimeConstraintAccess().getEventAssignment_1(), "rule__TimeConstraint__EventAssignment_1");
					put(grammarAccess.getTimeConstraintAccess().getTimeAssignment_5(), "rule__TimeConstraint__TimeAssignment_5");
					put(grammarAccess.getDurationConstraintAccess().getIntervalAssignment_1(), "rule__DurationConstraint__IntervalAssignment_1");
					put(grammarAccess.getDurationConstraintAccess().getDurationAssignment_5(), "rule__DurationConstraint__DurationAssignment_5");
					put(grammarAccess.getTimeObservationAccess().getEventAssignment_1(), "rule__TimeObservation__EventAssignment_1");
					put(grammarAccess.getTimeObservationAccess().getTimeAssignment_5(), "rule__TimeObservation__TimeAssignment_5");
					put(grammarAccess.getDurationObservationAccess().getIntervalAssignment_1(), "rule__DurationObservation__IntervalAssignment_1");
					put(grammarAccess.getDurationObservationAccess().getDurationAssignment_5(), "rule__DurationObservation__DurationAssignment_5");
					put(grammarAccess.getPointInTimeSelectorAccess().getPointInTimeAssignment(), "rule__PointInTimeSelector__PointInTimeAssignment");
					put(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getStartAssignment_0(), "rule__BiPointInTimeTimeIntervalSelector__StartAssignment_0");
					put(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getEndAssignment_2(), "rule__BiPointInTimeTimeIntervalSelector__EndAssignment_2");
					put(grammarAccess.getFragmentTimeIntervalSelectorAccess().getNonInstantaneousFragmentAssignment(), "rule__FragmentTimeIntervalSelector__NonInstantaneousFragmentAssignment");
					put(grammarAccess.getInlineCommentAccess().getBodyAssignment_2(), "rule__InlineComment__BodyAssignment_2");
					put(grammarAccess.getCommentAccess().getBodyAssignment_1(), "rule__Comment__BodyAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SequenceGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SequenceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
