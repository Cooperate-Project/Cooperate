/*
 * generated by Xtext
 */
package de.cooperateproject.modeling.textual.cls.serializer;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationProperties;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.Cardinality;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.CommentLink;
import de.cooperateproject.modeling.textual.cls.cls.DataTypeReference;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.Interface;
import de.cooperateproject.modeling.textual.cls.cls.MemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.cls.cls.MultiAssociation;
import de.cooperateproject.modeling.textual.cls.cls.PackageImport;
import de.cooperateproject.modeling.textual.cls.cls.UMLTypeReference;
import de.cooperateproject.modeling.textual.cls.services.ClsGrammarAccess;
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
public class ClsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ClsGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ClsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ClsPackage.ASSOCIATION:
				sequence_Association(context, (Association) semanticObject); 
				return; 
			case ClsPackage.ASSOCIATION_PROPERTIES:
				sequence_AssociationProperties(context, (AssociationProperties) semanticObject); 
				return; 
			case ClsPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case ClsPackage.CARDINALITY:
				sequence_Cardinality(context, (Cardinality) semanticObject); 
				return; 
			case ClsPackage.CLASS:
				sequence_Class(context, (de.cooperateproject.modeling.textual.cls.cls.Class) semanticObject); 
				return; 
			case ClsPackage.CLASS_DIAGRAM:
				sequence_ClassDiagram(context, (ClassDiagram) semanticObject); 
				return; 
			case ClsPackage.COMMENT_LINK:
				sequence_CommentLink(context, (CommentLink) semanticObject); 
				return; 
			case ClsPackage.DATA_TYPE_REFERENCE:
				sequence_DataTypeReference(context, (DataTypeReference) semanticObject); 
				return; 
			case ClsPackage.GENERALIZATION:
				sequence_Generalization(context, (Generalization) semanticObject); 
				return; 
			case ClsPackage.IMPLEMENTATION:
				sequence_Implementation(context, (Implementation) semanticObject); 
				return; 
			case ClsPackage.INTERFACE:
				sequence_Interface(context, (Interface) semanticObject); 
				return; 
			case ClsPackage.MEMBER_END:
				sequence_MemberEnd(context, (MemberEnd) semanticObject); 
				return; 
			case ClsPackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case ClsPackage.MULTI_ASSOCIATION:
				sequence_MultiAssociation(context, (MultiAssociation) semanticObject); 
				return; 
			case ClsPackage.PACKAGE_IMPORT:
				sequence_PackageImport(context, (PackageImport) semanticObject); 
				return; 
			case ClsPackage.PARAMETER:
				sequence_Parameter(context, (de.cooperateproject.modeling.textual.cls.cls.Parameter) semanticObject); 
				return; 
			case ClsPackage.UML_TYPE_REFERENCE:
				sequence_UMLTypeReference(context, (UMLTypeReference) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AssociationProperties returns AssociationProperties
	 *
	 * Constraint:
	 *     (cardinalityLeft=Cardinality cardinalityRight=Cardinality?)
	 */
	protected void sequence_AssociationProperties(ISerializationContext context, AssociationProperties semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns Association
	 *     Association returns Association
	 *
	 * Constraint:
	 *     (
	 *         aggregationKind=AggregationKind 
	 *         left=ClassifierAssociationEnd 
	 *         referencedElement=[Association|ID] 
	 *         right=ClassifierAssociationEnd 
	 *         properties=AssociationProperties? 
	 *         comment=[Comment|CommentBody]?
	 *     )
	 */
	protected void sequence_Association(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Member returns Attribute
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (visibility=Visibility? static?='static'? final?='final'? referencedElement=[Property|ID] type=TypeReference)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Cardinality returns Cardinality
	 *
	 * Constraint:
	 *     (lowerBound=CardinalityBound upperBound=CardinalityBound?)
	 */
	protected void sequence_Cardinality(ISerializationContext context, Cardinality semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassDiagram returns ClassDiagram
	 *
	 * Constraint:
	 *     (name=STRING packageImports+=PackageImport* classifiers+=Classifier* connectors+=Connector*)
	 */
	protected void sequence_ClassDiagram(ISerializationContext context, ClassDiagram semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Classifier returns Class
	 *     Class returns Class
	 *
	 * Constraint:
	 *     (visibility=Visibility? abstract?='abstract'? (longName=STRING | longName=ID)? referencedElement=[Class|ID] members+=Member*)
	 */
	protected void sequence_Class(ISerializationContext context, de.cooperateproject.modeling.textual.cls.cls.Class semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns CommentLink
	 *     CommentLink returns CommentLink
	 *
	 * Constraint:
	 *     (left=ClassifierAssociationEnd comment=[Comment|CommentBody])
	 */
	protected void sequence_CommentLink(ISerializationContext context, CommentLink semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ClsPackage.Literals.COMMENT_LINK__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ClsPackage.Literals.COMMENT_LINK__LEFT));
			if (transientValues.isValueTransient((EObject) semanticObject, ClsPackage.Literals.COMMENTABLE__COMMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ClsPackage.Literals.COMMENTABLE__COMMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getCommentLinkAccess().getLeftClassifierAssociationEndParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCommentLinkAccess().getCommentCommentCommentBodyParserRuleCall_2_0_1(), semanticObject.getComment());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeReference returns DataTypeReference
	 *     DataTypeReference returns DataTypeReference
	 *
	 * Constraint:
	 *     type=PrimitiveType
	 */
	protected void sequence_DataTypeReference(ISerializationContext context, DataTypeReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ClsPackage.Literals.DATA_TYPE_REFERENCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ClsPackage.Literals.DATA_TYPE_REFERENCE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getDataTypeReferenceAccess().getTypePrimitiveTypeEnumRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns Generalization
	 *     Generalization returns Generalization
	 *
	 * Constraint:
	 *     (left=ClassifierAssociationEnd right=ClassifierAssociationEnd)
	 */
	protected void sequence_Generalization(ISerializationContext context, Generalization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ClsPackage.Literals.TYPED_CONNECTOR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ClsPackage.Literals.TYPED_CONNECTOR__LEFT));
			if (transientValues.isValueTransient((EObject) semanticObject, ClsPackage.Literals.TYPED_CONNECTOR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ClsPackage.Literals.TYPED_CONNECTOR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getGeneralizationAccess().getLeftClassifierAssociationEndParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getGeneralizationAccess().getRightClassifierAssociationEndParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns Implementation
	 *     Implementation returns Implementation
	 *
	 * Constraint:
	 *     (left=ClassifierAssociationEnd right=ClassifierAssociationEnd)
	 */
	protected void sequence_Implementation(ISerializationContext context, Implementation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ClsPackage.Literals.TYPED_CONNECTOR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ClsPackage.Literals.TYPED_CONNECTOR__LEFT));
			if (transientValues.isValueTransient((EObject) semanticObject, ClsPackage.Literals.TYPED_CONNECTOR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ClsPackage.Literals.TYPED_CONNECTOR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getImplementationAccess().getLeftClassifierAssociationEndParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getImplementationAccess().getRightClassifierAssociationEndParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Classifier returns Interface
	 *     Interface returns Interface
	 *
	 * Constraint:
	 *     (visibility=Visibility? (longName=STRING | longName=ID)? referencedElement=[Interface|ID] members+=Member*)
	 */
	protected void sequence_Interface(ISerializationContext context, Interface semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MemberEnd returns MemberEnd
	 *
	 * Constraint:
	 *     (type=UMLTypeReference referencedElement=[Property|ID]? cardinality=Cardinality?)
	 */
	protected void sequence_MemberEnd(ISerializationContext context, MemberEnd semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Member returns Method
	 *     Method returns Method
	 *
	 * Constraint:
	 *     (
	 *         visibility=Visibility? 
	 *         abstract?='abstract'? 
	 *         static?='static'? 
	 *         final?='final'? 
	 *         referencedElement=[Operation|ID] 
	 *         (parameters+=Parameter parameters+=Parameter*)* 
	 *         type=TypeReference?
	 *     )
	 */
	protected void sequence_Method(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns MultiAssociation
	 *     MultiAssociation returns MultiAssociation
	 *
	 * Constraint:
	 *     (referencedElement=[Association|ID] connectorEnds+=MemberEnd+)
	 */
	protected void sequence_MultiAssociation(ISerializationContext context, MultiAssociation semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageImport returns PackageImport
	 *
	 * Constraint:
	 *     package=[Package|FQN]
	 */
	protected void sequence_PackageImport(ISerializationContext context, PackageImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ClsPackage.Literals.PACKAGE_IMPORT__PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ClsPackage.Literals.PACKAGE_IMPORT__PACKAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getPackageImportAccess().getPackagePackageFQNParserRuleCall_1_0_1(), semanticObject.getPackage());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (visibility=Visibility? static?='static'? final?='final'? referencedElement=[Parameter|ID] type=TypeReference)
	 */
	protected void sequence_Parameter(ISerializationContext context, de.cooperateproject.modeling.textual.cls.cls.Parameter semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeReference returns UMLTypeReference
	 *     UMLTypeReference returns UMLTypeReference
	 *     ClassifierAssociationEnd returns UMLTypeReference
	 *
	 * Constraint:
	 *     type=[Type|ID]
	 */
	protected void sequence_UMLTypeReference(ISerializationContext context, UMLTypeReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ClsPackage.Literals.UML_TYPE_REFERENCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ClsPackage.Literals.UML_TYPE_REFERENCE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getUMLTypeReferenceAccess().getTypeTypeIDTerminalRuleCall_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
}
