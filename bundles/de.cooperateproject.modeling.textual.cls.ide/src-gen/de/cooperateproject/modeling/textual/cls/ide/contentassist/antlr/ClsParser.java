/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls.ide.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.cls.services.ClsGrammarAccess;

public class ClsParser extends AbstractContentAssistParser {
	
	@Inject
	private ClsGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.cooperateproject.modeling.textual.cls.ide.contentassist.antlr.internal.InternalClsParser createParser() {
		de.cooperateproject.modeling.textual.cls.ide.contentassist.antlr.internal.InternalClsParser result = new de.cooperateproject.modeling.textual.cls.ide.contentassist.antlr.internal.InternalClsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getClassifierAccess().getAlternatives(), "rule__Classifier__Alternatives");
					put(grammarAccess.getClassAccess().getLongNameAlternatives_3_0_0(), "rule__Class__LongNameAlternatives_3_0_0");
					put(grammarAccess.getInterfaceAccess().getLongNameAlternatives_2_0_0(), "rule__Interface__LongNameAlternatives_2_0_0");
					put(grammarAccess.getTypeReferenceAccess().getAlternatives(), "rule__TypeReference__Alternatives");
					put(grammarAccess.getMemberAccess().getAlternatives(), "rule__Member__Alternatives");
					put(grammarAccess.getConnectorAccess().getAlternatives(), "rule__Connector__Alternatives");
					put(grammarAccess.getCardinalityBoundAccess().getAlternatives(), "rule__CardinalityBound__Alternatives");
					put(grammarAccess.getVisibilityAccess().getAlternatives(), "rule__Visibility__Alternatives");
					put(grammarAccess.getPrimitiveTypeAccess().getAlternatives(), "rule__PrimitiveType__Alternatives");
					put(grammarAccess.getAggregationKindAccess().getAlternatives(), "rule__AggregationKind__Alternatives");
					put(grammarAccess.getClassDiagramAccess().getGroup(), "rule__ClassDiagram__Group__0");
					put(grammarAccess.getPackageImportAccess().getGroup(), "rule__PackageImport__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getClassAccess().getGroup_3(), "rule__Class__Group_3__0");
					put(grammarAccess.getClassAccess().getGroup_5(), "rule__Class__Group_5__0");
					put(grammarAccess.getInterfaceAccess().getGroup(), "rule__Interface__Group__0");
					put(grammarAccess.getInterfaceAccess().getGroup_2(), "rule__Interface__Group_2__0");
					put(grammarAccess.getInterfaceAccess().getGroup_4(), "rule__Interface__Group_4__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodAccess().getGroup_6(), "rule__Method__Group_6__0");
					put(grammarAccess.getMethodAccess().getGroup_6_1(), "rule__Method__Group_6_1__0");
					put(grammarAccess.getMethodAccess().getGroup_8(), "rule__Method__Group_8__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getGeneralizationAccess().getGroup(), "rule__Generalization__Group__0");
					put(grammarAccess.getImplementationAccess().getGroup(), "rule__Implementation__Group__0");
					put(grammarAccess.getCommentLinkAccess().getGroup(), "rule__CommentLink__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup(), "rule__Association__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup_5(), "rule__Association__Group_5__0");
					put(grammarAccess.getMultiAssociationAccess().getGroup(), "rule__MultiAssociation__Group__0");
					put(grammarAccess.getMultiAssociationAccess().getGroup_3(), "rule__MultiAssociation__Group_3__0");
					put(grammarAccess.getMemberEndAccess().getGroup(), "rule__MemberEnd__Group__0");
					put(grammarAccess.getAssociationPropertiesAccess().getGroup(), "rule__AssociationProperties__Group__0");
					put(grammarAccess.getAssociationPropertiesAccess().getGroup_2(), "rule__AssociationProperties__Group_2__0");
					put(grammarAccess.getCardinalityAccess().getGroup(), "rule__Cardinality__Group__0");
					put(grammarAccess.getCardinalityAccess().getGroup_1(), "rule__Cardinality__Group_1__0");
					put(grammarAccess.getClassDiagramAccess().getNameAssignment_2(), "rule__ClassDiagram__NameAssignment_2");
					put(grammarAccess.getClassDiagramAccess().getPackageImportsAssignment_3(), "rule__ClassDiagram__PackageImportsAssignment_3");
					put(grammarAccess.getClassDiagramAccess().getClassifiersAssignment_4(), "rule__ClassDiagram__ClassifiersAssignment_4");
					put(grammarAccess.getClassDiagramAccess().getConnectorsAssignment_5(), "rule__ClassDiagram__ConnectorsAssignment_5");
					put(grammarAccess.getPackageImportAccess().getPackageAssignment_1(), "rule__PackageImport__PackageAssignment_1");
					put(grammarAccess.getClassAccess().getVisibilityAssignment_0(), "rule__Class__VisibilityAssignment_0");
					put(grammarAccess.getClassAccess().getAbstractAssignment_1(), "rule__Class__AbstractAssignment_1");
					put(grammarAccess.getClassAccess().getLongNameAssignment_3_0(), "rule__Class__LongNameAssignment_3_0");
					put(grammarAccess.getClassAccess().getReferencedElementAssignment_4(), "rule__Class__ReferencedElementAssignment_4");
					put(grammarAccess.getClassAccess().getMembersAssignment_5_1(), "rule__Class__MembersAssignment_5_1");
					put(grammarAccess.getInterfaceAccess().getVisibilityAssignment_0(), "rule__Interface__VisibilityAssignment_0");
					put(grammarAccess.getInterfaceAccess().getLongNameAssignment_2_0(), "rule__Interface__LongNameAssignment_2_0");
					put(grammarAccess.getInterfaceAccess().getReferencedElementAssignment_3(), "rule__Interface__ReferencedElementAssignment_3");
					put(grammarAccess.getInterfaceAccess().getMembersAssignment_4_1(), "rule__Interface__MembersAssignment_4_1");
					put(grammarAccess.getDataTypeReferenceAccess().getTypeAssignment(), "rule__DataTypeReference__TypeAssignment");
					put(grammarAccess.getUMLTypeReferenceAccess().getTypeAssignment(), "rule__UMLTypeReference__TypeAssignment");
					put(grammarAccess.getAttributeAccess().getVisibilityAssignment_1(), "rule__Attribute__VisibilityAssignment_1");
					put(grammarAccess.getAttributeAccess().getStaticAssignment_2(), "rule__Attribute__StaticAssignment_2");
					put(grammarAccess.getAttributeAccess().getFinalAssignment_3(), "rule__Attribute__FinalAssignment_3");
					put(grammarAccess.getAttributeAccess().getReferencedElementAssignment_4(), "rule__Attribute__ReferencedElementAssignment_4");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_6(), "rule__Attribute__TypeAssignment_6");
					put(grammarAccess.getMethodAccess().getVisibilityAssignment_0(), "rule__Method__VisibilityAssignment_0");
					put(grammarAccess.getMethodAccess().getAbstractAssignment_1(), "rule__Method__AbstractAssignment_1");
					put(grammarAccess.getMethodAccess().getStaticAssignment_2(), "rule__Method__StaticAssignment_2");
					put(grammarAccess.getMethodAccess().getFinalAssignment_3(), "rule__Method__FinalAssignment_3");
					put(grammarAccess.getMethodAccess().getReferencedElementAssignment_4(), "rule__Method__ReferencedElementAssignment_4");
					put(grammarAccess.getMethodAccess().getParametersAssignment_6_0(), "rule__Method__ParametersAssignment_6_0");
					put(grammarAccess.getMethodAccess().getParametersAssignment_6_1_1(), "rule__Method__ParametersAssignment_6_1_1");
					put(grammarAccess.getMethodAccess().getTypeAssignment_8_1(), "rule__Method__TypeAssignment_8_1");
					put(grammarAccess.getParameterAccess().getVisibilityAssignment_0(), "rule__Parameter__VisibilityAssignment_0");
					put(grammarAccess.getParameterAccess().getStaticAssignment_1(), "rule__Parameter__StaticAssignment_1");
					put(grammarAccess.getParameterAccess().getFinalAssignment_2(), "rule__Parameter__FinalAssignment_2");
					put(grammarAccess.getParameterAccess().getReferencedElementAssignment_3(), "rule__Parameter__ReferencedElementAssignment_3");
					put(grammarAccess.getParameterAccess().getTypeAssignment_5(), "rule__Parameter__TypeAssignment_5");
					put(grammarAccess.getGeneralizationAccess().getLeftAssignment_0(), "rule__Generalization__LeftAssignment_0");
					put(grammarAccess.getGeneralizationAccess().getRightAssignment_2(), "rule__Generalization__RightAssignment_2");
					put(grammarAccess.getImplementationAccess().getLeftAssignment_0(), "rule__Implementation__LeftAssignment_0");
					put(grammarAccess.getImplementationAccess().getRightAssignment_2(), "rule__Implementation__RightAssignment_2");
					put(grammarAccess.getCommentLinkAccess().getLeftAssignment_0(), "rule__CommentLink__LeftAssignment_0");
					put(grammarAccess.getCommentLinkAccess().getCommentAssignment_2(), "rule__CommentLink__CommentAssignment_2");
					put(grammarAccess.getAssociationAccess().getAggregationKindAssignment_0(), "rule__Association__AggregationKindAssignment_0");
					put(grammarAccess.getAssociationAccess().getLeftAssignment_1(), "rule__Association__LeftAssignment_1");
					put(grammarAccess.getAssociationAccess().getReferencedElementAssignment_2(), "rule__Association__ReferencedElementAssignment_2");
					put(grammarAccess.getAssociationAccess().getRightAssignment_3(), "rule__Association__RightAssignment_3");
					put(grammarAccess.getAssociationAccess().getPropertiesAssignment_4(), "rule__Association__PropertiesAssignment_4");
					put(grammarAccess.getAssociationAccess().getCommentAssignment_5_1(), "rule__Association__CommentAssignment_5_1");
					put(grammarAccess.getMultiAssociationAccess().getReferencedElementAssignment_1(), "rule__MultiAssociation__ReferencedElementAssignment_1");
					put(grammarAccess.getMultiAssociationAccess().getConnectorEndsAssignment_3_0(), "rule__MultiAssociation__ConnectorEndsAssignment_3_0");
					put(grammarAccess.getMemberEndAccess().getTypeAssignment_0(), "rule__MemberEnd__TypeAssignment_0");
					put(grammarAccess.getMemberEndAccess().getReferencedElementAssignment_1(), "rule__MemberEnd__ReferencedElementAssignment_1");
					put(grammarAccess.getMemberEndAccess().getCardinalityAssignment_2(), "rule__MemberEnd__CardinalityAssignment_2");
					put(grammarAccess.getAssociationPropertiesAccess().getCardinalityLeftAssignment_1(), "rule__AssociationProperties__CardinalityLeftAssignment_1");
					put(grammarAccess.getAssociationPropertiesAccess().getCardinalityRightAssignment_2_1(), "rule__AssociationProperties__CardinalityRightAssignment_2_1");
					put(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_0(), "rule__Cardinality__LowerBoundAssignment_0");
					put(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_1_1(), "rule__Cardinality__UpperBoundAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.cooperateproject.modeling.textual.cls.ide.contentassist.antlr.internal.InternalClsParser typedParser = (de.cooperateproject.modeling.textual.cls.ide.contentassist.antlr.internal.InternalClsParser) parser;
			typedParser.entryRuleClassDiagram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ClsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ClsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
