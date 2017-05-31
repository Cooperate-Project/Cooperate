/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.cls.serializer;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.Interface;
import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociationMemberEndReferencedType;
import de.cooperateproject.modeling.textual.cls.services.ClsGrammarAccess;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageImport;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
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
			case ClsPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case ClsPackage.CLASS:
				sequence_Class(context, (de.cooperateproject.modeling.textual.cls.cls.Class) semanticObject); 
				return; 
			case ClsPackage.CLASS_DIAGRAM:
				sequence_ClassDiagram(context, (ClassDiagram) semanticObject); 
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
			case ClsPackage.METHOD:
				sequence_Method(context, (Method) semanticObject); 
				return; 
			case ClsPackage.PACKAGE:
				if (rule == grammarAccess.getPackageRule()) {
					sequence_Package(context, (de.cooperateproject.modeling.textual.cls.cls.Package) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRootPackageRule()) {
					sequence_RootPackage(context, (de.cooperateproject.modeling.textual.cls.cls.Package) semanticObject); 
					return; 
				}
				else break;
			case ClsPackage.PARAMETER:
				sequence_Parameter(context, (de.cooperateproject.modeling.textual.cls.cls.Parameter) semanticObject); 
				return; 
			case ClsPackage.XTEXT_ASSOCIATION:
				sequence_XtextAssociation(context, (XtextAssociation) semanticObject); 
				return; 
			case ClsPackage.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE:
				sequence_XtextAssociationMemberEndReferencedType(context, (XtextAssociationMemberEndReferencedType) semanticObject); 
				return; 
			}
		else if (epackage == TextualCommonsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TextualCommonsPackage.CARDINALITY:
				sequence_Cardinality(context, (Cardinality) semanticObject); 
				return; 
			case TextualCommonsPackage.COMMENT:
				sequence_Comment(context, (Comment) semanticObject); 
				return; 
			case TextualCommonsPackage.PACKAGE_IMPORT:
				sequence_PackageImport(context, (PackageImport) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Member returns Attribute
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (visibility=Visibility? static?='static'? name=ID type=[Classifier|FQN])
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
	 *     (title=STRING rootPackage=RootPackage)
	 */
	protected void sequence_ClassDiagram(ISerializationContext context, ClassDiagram semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ClsPackage.Literals.CLASS_DIAGRAM__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ClsPackage.Literals.CLASS_DIAGRAM__TITLE));
			if (transientValues.isValueTransient((EObject) semanticObject, ClsPackage.Literals.CLASS_DIAGRAM__ROOT_PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ClsPackage.Literals.CLASS_DIAGRAM__ROOT_PACKAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getClassDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getClassDiagramAccess().getRootPackageRootPackageParserRuleCall_3_0(), semanticObject.getRootPackage());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Classifier returns Class
	 *     Class returns Class
	 *
	 * Constraint:
	 *     (visibility=Visibility? abstract?='abstract'? ((name=STRING alias=ID) | name=ID) (comments+=Comment | (comments+=Comment? members+=Member*))?)
	 */
	protected void sequence_Class(ISerializationContext context, de.cooperateproject.modeling.textual.cls.cls.Class semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comment returns Comment
	 *
	 * Constraint:
	 *     body=CommentBody
	 */
	protected void sequence_Comment(ISerializationContext context, Comment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, TextualCommonsPackage.Literals.COMMENT__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, TextualCommonsPackage.Literals.COMMENT__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getCommentAccess().getBodyCommentBodyParserRuleCall_1_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns Generalization
	 *     Generalization returns Generalization
	 *
	 * Constraint:
	 *     (left=[Classifier|FQN] right=[Classifier|FQN])
	 */
	protected void sequence_Generalization(ISerializationContext context, Generalization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ClsPackage.Literals.TYPED_CONNECTOR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ClsPackage.Literals.TYPED_CONNECTOR__LEFT));
			if (transientValues.isValueTransient((EObject) semanticObject, ClsPackage.Literals.TYPED_CONNECTOR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ClsPackage.Literals.TYPED_CONNECTOR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getGeneralizationAccess().getLeftClassifierFQNParserRuleCall_2_0_1(), semanticObject.eGet(ClsPackage.Literals.TYPED_CONNECTOR__LEFT, false));
		feeder.accept(grammarAccess.getGeneralizationAccess().getRightClassifierFQNParserRuleCall_4_0_1(), semanticObject.eGet(ClsPackage.Literals.TYPED_CONNECTOR__RIGHT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns Implementation
	 *     Implementation returns Implementation
	 *
	 * Constraint:
	 *     (left=[Classifier|FQN] right=[Classifier|FQN])
	 */
	protected void sequence_Implementation(ISerializationContext context, Implementation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ClsPackage.Literals.TYPED_CONNECTOR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ClsPackage.Literals.TYPED_CONNECTOR__LEFT));
			if (transientValues.isValueTransient((EObject) semanticObject, ClsPackage.Literals.TYPED_CONNECTOR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ClsPackage.Literals.TYPED_CONNECTOR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getImplementationAccess().getLeftClassifierFQNParserRuleCall_2_0_1(), semanticObject.eGet(ClsPackage.Literals.TYPED_CONNECTOR__LEFT, false));
		feeder.accept(grammarAccess.getImplementationAccess().getRightClassifierFQNParserRuleCall_4_0_1(), semanticObject.eGet(ClsPackage.Literals.TYPED_CONNECTOR__RIGHT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Classifier returns Interface
	 *     Interface returns Interface
	 *
	 * Constraint:
	 *     (visibility=Visibility? ((name=STRING alias=ID) | name=ID) (comments+=Comment | (comments+=Comment? members+=Member*))?)
	 */
	protected void sequence_Interface(ISerializationContext context, Interface semanticObject) {
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
	 *         name=ID 
	 *         (parameters+=Parameter parameters+=Parameter*)* 
	 *         type=[Classifier|FQN]?
	 *     )
	 */
	protected void sequence_Method(ISerializationContext context, Method semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageImport returns PackageImport
	 *
	 * Constraint:
	 *     importedPackage=[Package|FQN]
	 */
	protected void sequence_PackageImport(ISerializationContext context, PackageImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, TextualCommonsPackage.Literals.PACKAGE_IMPORT__IMPORTED_PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, TextualCommonsPackage.Literals.PACKAGE_IMPORT__IMPORTED_PACKAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getPackageImportAccess().getImportedPackagePackageFQNParserRuleCall_1_0_1(), semanticObject.eGet(TextualCommonsPackage.Literals.PACKAGE_IMPORT__IMPORTED_PACKAGE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Package returns Package
	 *
	 * Constraint:
	 *     (name=FQN packageImports+=PackageImport* classifiers+=Classifier* connectors+=Connector* packages+=Package*)
	 */
	protected void sequence_Package(ISerializationContext context, de.cooperateproject.modeling.textual.cls.cls.Package semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (visibility=Visibility? static?='static'? name=ID type=[Classifier|FQN])
	 */
	protected void sequence_Parameter(ISerializationContext context, de.cooperateproject.modeling.textual.cls.cls.Parameter semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RootPackage returns Package
	 *
	 * Constraint:
	 *     (name=FQN packageImports+=PackageImport* classifiers+=Classifier* connectors+=Connector* packages+=Package*)
	 */
	protected void sequence_RootPackage(ISerializationContext context, de.cooperateproject.modeling.textual.cls.cls.Package semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     XtextAssociationMemberEndReferencedType returns XtextAssociationMemberEndReferencedType
	 *
	 * Constraint:
	 *     type=[Classifier|FQN]
	 */
	protected void sequence_XtextAssociationMemberEndReferencedType(ISerializationContext context, XtextAssociationMemberEndReferencedType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ClsPackage.Literals.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ClsPackage.Literals.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getXtextAssociationMemberEndReferencedTypeAccess().getTypeClassifierFQNParserRuleCall_0_1(), semanticObject.eGet(ClsPackage.Literals.XTEXT_ASSOCIATION_MEMBER_END_REFERENCED_TYPE__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Connector returns XtextAssociation
	 *     XtextAssociation returns XtextAssociation
	 *
	 * Constraint:
	 *     (
	 *         twoSideBidirectionality?='bi'? 
	 *         twoSideAggregationKind=AggregationKind 
	 *         name=ID 
	 *         memberEndTypes+=XtextAssociationMemberEndReferencedType 
	 *         memberEndTypes+=XtextAssociationMemberEndReferencedType* 
	 *         (memberEndNames+=RoleName memberEndNames+=RoleName*)? 
	 *         (memberEndCardinalities+=Cardinality memberEndCardinalities+=Cardinality*)? 
	 *         comments+=Comment?
	 *     )
	 */
	protected void sequence_XtextAssociation(ISerializationContext context, XtextAssociation semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
}
