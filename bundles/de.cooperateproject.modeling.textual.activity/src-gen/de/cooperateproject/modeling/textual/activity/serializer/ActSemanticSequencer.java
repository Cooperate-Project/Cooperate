/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.activity.serializer;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.activity.act.ActPackage;
import de.cooperateproject.modeling.textual.activity.act.ActivityDiagram;
import de.cooperateproject.modeling.textual.activity.services.ActGrammarAccess;
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
public class ActSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ActGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ActPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ActPackage.ACTIVITY_DIAGRAM:
				sequence_ActivityDiagram(context, (ActivityDiagram) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActivityDiagram returns ActivityDiagram
	 *
	 * Constraint:
	 *     title=STRING
	 */
	protected void sequence_ActivityDiagram(ISerializationContext context, ActivityDiagram semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, ActPackage.Literals.ACTIVITY_DIAGRAM__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, ActPackage.Literals.ACTIVITY_DIAGRAM__TITLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getActivityDiagramAccess().getTitleSTRINGTerminalRuleCall_2_0(), semanticObject.getTitle());
		feeder.finish();
	}
	
	
}