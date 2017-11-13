/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.usecase.serializer;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.usecase.services.UsecaseGrammarAccess;
import de.cooperateproject.modeling.textual.usecase.usecase.Actor;
import de.cooperateproject.modeling.textual.usecase.usecase.Association;
import de.cooperateproject.modeling.textual.usecase.usecase.Extend;
import de.cooperateproject.modeling.textual.usecase.usecase.ExtensionPoint;
import de.cooperateproject.modeling.textual.usecase.usecase.Generalization;
import de.cooperateproject.modeling.textual.usecase.usecase.Include;
import de.cooperateproject.modeling.textual.usecase.usecase.RootPackage;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCase;
import de.cooperateproject.modeling.textual.usecase.usecase.UseCaseDiagram;
import de.cooperateproject.modeling.textual.usecase.usecase.UsecasePackage;
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
public class UsecaseSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UsecaseGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TextualCommonsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TextualCommonsPackage.CARDINALITY:
				sequence_Cardinality(context, (Cardinality) semanticObject); 
				return; 
			case TextualCommonsPackage.COMMENT:
				sequence_Comment(context, (Comment) semanticObject); 
				return; 
			}
		else if (epackage == UsecasePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UsecasePackage.ACTOR:
				sequence_Actor(context, (Actor) semanticObject); 
				return; 
			case UsecasePackage.ASSOCIATION:
				sequence_Association(context, (Association) semanticObject); 
				return; 
			case UsecasePackage.EXTEND:
				sequence_Extend(context, (Extend) semanticObject); 
				return; 
			case UsecasePackage.EXTENSION_POINT:
				sequence_ExtensionPoint(context, (ExtensionPoint) semanticObject); 
				return; 
			case UsecasePackage.GENERALIZATION:
				sequence_Generalization(context, (Generalization) semanticObject); 
				return; 
			case UsecasePackage.INCLUDE:
				sequence_Include(context, (Include) semanticObject); 
				return; 
			case UsecasePackage.ROOT_PACKAGE:
				sequence_RootPackage(context, (RootPackage) semanticObject); 
				return; 
			case UsecasePackage.SYSTEM:
				sequence_System(context, (de.cooperateproject.modeling.textual.usecase.usecase.System) semanticObject); 
				return; 
			case UsecasePackage.USE_CASE:
				sequence_UseCase(context, (UseCase) semanticObject); 
				return; 
			case UsecasePackage.USE_CASE_DIAGRAM:
				sequence_UseCaseDiagram(context, (UseCaseDiagram) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Actor returns Actor
	 *
	 * Constraint:
	 *     (visibility=Visibility? abstract?='abstract'? (name=ID | (alias=ID name=STRING)) type=ActorType? comments+=Comment?)
	 */
	protected void sequence_Actor(ISerializationContext context, Actor semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Relationship returns Association
	 *     Association returns Association
	 *
	 * Constraint:
	 *     (actor=[Actor|FQN] usecase=[UseCase|FQN] (actorCardinality=Cardinality useCaseCardinality=Cardinality?)?)
	 */
	protected void sequence_Association(ISerializationContext context, Association semanticObject) {
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
	 *     Relationship returns Extend
	 *     Extend returns Extend
	 *
	 * Constraint:
	 *     (extension=[UseCase|FQN] extendedCase=[UseCase|FQN] extensionLocation=[ExtensionPoint|ID] condition=STRING?)
	 */
	protected void sequence_Extend(ISerializationContext context, Extend semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExtensionPoint returns ExtensionPoint
	 *
	 * Constraint:
	 *     (name=ID | (alias=ID name=STRING))
	 */
	protected void sequence_ExtensionPoint(ISerializationContext context, ExtensionPoint semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Relationship returns Generalization
	 *     Generalization returns Generalization
	 *
	 * Constraint:
	 *     (specific=[BehavioredClassifier|FQN] general=[BehavioredClassifier|FQN])
	 */
	protected void sequence_Generalization(ISerializationContext context, Generalization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, UsecasePackage.Literals.GENERALIZATION__SPECIFIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, UsecasePackage.Literals.GENERALIZATION__SPECIFIC));
			if (transientValues.isValueTransient((EObject) semanticObject, UsecasePackage.Literals.GENERALIZATION__GENERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, UsecasePackage.Literals.GENERALIZATION__GENERAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getGeneralizationAccess().getSpecificBehavioredClassifierFQNParserRuleCall_2_0_1(), semanticObject.eGet(UsecasePackage.Literals.GENERALIZATION__SPECIFIC, false));
		feeder.accept(grammarAccess.getGeneralizationAccess().getGeneralBehavioredClassifierFQNParserRuleCall_4_0_1(), semanticObject.eGet(UsecasePackage.Literals.GENERALIZATION__GENERAL, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Relationship returns Include
	 *     Include returns Include
	 *
	 * Constraint:
	 *     (includingCase=[UseCase|FQN] addition=[UseCase|FQN])
	 */
	protected void sequence_Include(ISerializationContext context, Include semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, UsecasePackage.Literals.INCLUDE__INCLUDING_CASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, UsecasePackage.Literals.INCLUDE__INCLUDING_CASE));
			if (transientValues.isValueTransient((EObject) semanticObject, UsecasePackage.Literals.INCLUDE__ADDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, UsecasePackage.Literals.INCLUDE__ADDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getIncludeAccess().getIncludingCaseUseCaseFQNParserRuleCall_2_0_1(), semanticObject.eGet(UsecasePackage.Literals.INCLUDE__INCLUDING_CASE, false));
		feeder.accept(grammarAccess.getIncludeAccess().getAdditionUseCaseFQNParserRuleCall_4_0_1(), semanticObject.eGet(UsecasePackage.Literals.INCLUDE__ADDITION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RootPackage returns RootPackage
	 *
	 * Constraint:
	 *     (name=FQN? actors+=Actor* systems+=System* relationships+=Relationship*)
	 */
	protected void sequence_RootPackage(ISerializationContext context, RootPackage semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     System returns System
	 *
	 * Constraint:
	 *     (name=FQN (comments+=Comment | (comments+=Comment? usecases+=UseCase*))?)
	 */
	protected void sequence_System(ISerializationContext context, de.cooperateproject.modeling.textual.usecase.usecase.System semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UseCaseDiagram returns UseCaseDiagram
	 *
	 * Constraint:
	 *     (title=STRING rootPackage=RootPackage)
	 */
	protected void sequence_UseCaseDiagram(ISerializationContext context, UseCaseDiagram semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, UsecasePackage.Literals.USE_CASE_DIAGRAM__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, UsecasePackage.Literals.USE_CASE_DIAGRAM__TITLE));
			if (transientValues.isValueTransient((EObject) semanticObject, UsecasePackage.Literals.USE_CASE_DIAGRAM__ROOT_PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, UsecasePackage.Literals.USE_CASE_DIAGRAM__ROOT_PACKAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getUseCaseDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0(), semanticObject.getTitle());
		feeder.accept(grammarAccess.getUseCaseDiagramAccess().getRootPackageRootPackageParserRuleCall_3_0(), semanticObject.getRootPackage());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UseCase returns UseCase
	 *
	 * Constraint:
	 *     (
	 *         visibility=Visibility? 
	 *         abstract?='abstract'? 
	 *         (name=ID | (alias=ID name=STRING)) 
	 *         (comments+=Comment | (comments+=Comment? extensionPoints+=ExtensionPoint*))?
	 *     )
	 */
	protected void sequence_UseCase(ISerializationContext context, UseCase semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
}
