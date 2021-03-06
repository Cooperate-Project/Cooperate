package de.cooperateproject.modeling.textual.cls.derivedstate.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsFactory;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.cls.utils.AssociationMatcher;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Cardinality;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.Applicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.AtomicDerivedStateProcessorBase;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.DerivedStateProcessorApplicability;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IAtomicDerivedStateProcessor;
import de.cooperateproject.modeling.textual.xtext.runtime.derivedstate.initializer.IAtomicDerivedStateProcessorRegistry;

/**
 * State calculation for Xtext associations.
 */
@Applicability(applicabilities = DerivedStateProcessorApplicability.CALCULATION)
public class XtextAssociationCalculator extends AtomicDerivedStateProcessorBase<XtextAssociation> {

    @Inject
    private IAtomicDerivedStateProcessorRegistry stateProcessorRegistry;

    /**
     * Constructs the calculator.
     */
    public XtextAssociationCalculator() {
        super(XtextAssociation.class);
    }

    @Override
    protected void applyTyped(XtextAssociation object) {
        setReferencedElement(object);

        List<Classifier<?>> types = object.collectMemberEndTypes();
        List<String> names = object.getMemberEndNames();
        List<Cardinality> cardinalities = object.getMemberEndCardinalities();

        if (object.getMemberEnds().size() > types.size()) {
            Collection<AssociationMemberEnd> memberEndToBeDeleted = new ArrayList<>(
                    object.getMemberEnds().subList(types.size(), object.getMemberEnds().size()));
            memberEndToBeDeleted.stream().forEach(EcoreUtil::delete);
        }
        for (int i = 0; i < types.size(); ++i) {
            AssociationMemberEnd memberEnd;
            if (object.getMemberEnds().size() > i) {
                memberEnd = object.getMemberEnds().get(i);
            } else {
                memberEnd = ClsFactory.eINSTANCE.createAssociationMemberEnd();
                object.getMemberEnds().add(memberEnd);
            }
            memberEnd.setType(types.get(i));
            if (cardinalities.size() > i) {
                Optional<IAtomicDerivedStateProcessor<Cardinality>> cardinalityCalculator = stateProcessorRegistry
                        .findCalculator(Cardinality.class);
                if (cardinalityCalculator.isPresent()) {
                    cardinalityCalculator.get().accept(cardinalities.get(i));
                }
                if (memberEnd.getCardinality() != null) {
                    memberEnd.getCardinality().setLowerBound(cardinalities.get(i).getLowerBound());
                    memberEnd.getCardinality().setUpperBound(cardinalities.get(i).getUpperBound());
                } else {
                    memberEnd.setCardinality(EcoreUtil.copy(cardinalities.get(i)));
                }
            }
            if (names.size() > i) {
                memberEnd.setName(names.get(i));
            }
            memberEnd.setNavigable(false);
        }
        if (types.size() == 2) {
            AssociationMemberEnd firstMemberEnd = object.getMemberEnds().get(0);
            firstMemberEnd.setNavigable(object.isTwoSideBidirectionality());
            AssociationMemberEnd secondMemberEnd = object.getMemberEnds().get(1);
            secondMemberEnd.setNavigable(true);
            secondMemberEnd.setAggregationKind(object.getTwoSideAggregationKind());
        }

        object.getMemberEnds().forEach(XtextAssociationCalculator::process);
    }

    private static void setReferencedElement(XtextAssociation object) {
        if (StringUtils.isNotEmpty(object.getName())) {
            // UMLReferencingElementCalculator handles this case
            return;
        }

        Collection<Association> candidates = Optional.ofNullable(object.getOwningPackage().getReferencedElement())
                .map(umlPackage -> AssociationMatcher.findUMLElements(object, umlPackage))
                .orElse(Collections.emptySet());
        if (candidates.size() == 1) {
            object.setReferencedElement((Association) candidates.iterator().next());
        }
    }

    private static void process(AssociationMemberEnd object) {
        Optional<Property> umlMemberEnd = getUmlMemberEnd(object);
        if (!umlMemberEnd.isPresent()) {
            object.setReferencedElement(null);
            Optional.ofNullable(object.getCardinality()).ifPresent(c -> c.setReferencedElement(null));
        } else {
            object.setReferencedElement(umlMemberEnd.get());
            Optional.ofNullable(object.getCardinality())
                    .ifPresent(cardinality -> cardinality.setReferencedElement(umlMemberEnd.get()));
        }
    }

    private static Optional<Property> getUmlMemberEnd(AssociationMemberEnd object) {
        int index = object.getAssociation().getMemberEnds().indexOf(object);
        if (index == -1) {
            return Optional.empty();
        }
        index = AssociationMatcher.mapIndexTxt2Uml(index, object.getAssociation().getMemberEnds().size());
        Association umlAssociation = object.getAssociation().getReferencedElement();
        if (umlAssociation == null || umlAssociation.getMemberEnds().size() <= index) {
            return Optional.empty();
        }
        return Optional.of(umlAssociation.getMemberEnds().get(index));
    }

    @Override
    public Collection<Class<? extends EObject>> getRequirements() {
        return Arrays.asList(UMLReferencingElement.class);
    }

}
