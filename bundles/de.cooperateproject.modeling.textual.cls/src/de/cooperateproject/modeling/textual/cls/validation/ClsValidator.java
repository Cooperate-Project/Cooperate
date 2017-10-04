/*
 * generated by Xtext 2.10.0
 */
package de.cooperateproject.modeling.textual.cls.validation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

import de.cooperateproject.modeling.textual.cls.cls.Association;
import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.Classifier;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Interface;
import de.cooperateproject.modeling.textual.cls.cls.Package;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.AliasedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.xtext.runtime.issues.IIssueCodeRegistry;
import de.cooperateproject.modeling.textual.xtext.runtime.validator.ICooperateAutomatedValidator;

/**
 * Cls-validator for the editor.
 */
public class ClsValidator extends AbstractClsValidator {

    private static final String NOT_AN_INTERFACE = "not_an_interface";
    private static final String NOT_A_CLASS = "not_a_class";
    private static final String ALIAS_TAKEN = "alias_taken";
    private static final String NAME_TAKEN = "name_taken";
    private static final String NOT_ENOUGH_ROLE_NAMES = "not_enough_role_names";

    @Inject
    @SuppressWarnings("unused")
    private ICooperateAutomatedValidator automatedValidator;

    @Inject
    private IIssueCodeRegistry issueCodeRegistry;

    @Check
    private void checkCorrectClassifierType(de.cooperateproject.modeling.textual.cls.cls.Class classifier) {
        Element element = classifier.getReferencedElement();
        if (element != null && !(element instanceof org.eclipse.uml2.uml.Class)) {
            error(classifier.getName() + " should be an interface but it's not!",
                    TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, NOT_A_CLASS);
        }
    }

    @Check
    private void checkUniqueNamedElementInItsPackage(NamedElement element) {
        if (element instanceof AssociationMemberEnd) {
            Association association = ((AssociationMemberEnd) element).getAssociation();
            checkUniqueElements(element, association.getMemberEnds());
            return;
        }

        PackageBase<?> nearestPackage = element.getNearestPackage();
        if (!(nearestPackage instanceof Package)) {
            return;
        }

        checkUniqueElements(element, getNamedElementsFromPackage((Package) nearestPackage));
    }

    private static List<? extends NamedElement> getNamedElementsFromPackage(Package nearestPackage) {

        return Stream
                .concat(nearestPackage.getClassifiers().stream(),
                        nearestPackage.getConnectors().stream().filter(x -> x instanceof NamedElement)
                                .map(x -> (NamedElement) x).collect(Collectors.toList()).stream())
                .collect(Collectors.toList());
    }

    private void checkUniqueElements(NamedElement element, List<? extends NamedElement> namedElements) {

        for (NamedElement namedElement : namedElements) {
            if (element.equals(namedElement)) {
                continue;
            }
            if (element.getName().equals(namedElement.getName())) {
                error("\"" + element.getName() + "\"" + " no duplicates!",
                        TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, NAME_TAKEN);
            }
        }

    }

    @Check
    private void checkUniqueAliasInItsPackage(AliasedElement aliasedElement) {
        PackageBase<?> nearestPackage = aliasedElement.getNearestPackage();
        if (!(nearestPackage instanceof Package)) {
            return;
        }
        List<? extends AliasedElement> classifiers = ((Package) nearestPackage).getClassifiers();

        checkUniqueAlias(aliasedElement, classifiers);
    }

    private void checkUniqueAlias(AliasedElement aliasedElement, List<? extends AliasedElement> aliasedElements) {
        for (AliasedElement alias : aliasedElements) {
            if (alias.equals(aliasedElement)) {
                continue;
            }
            String classifierAlias = aliasedElement.getAlias();
            if (alias.getAlias().equals(classifierAlias)) {
                error("\"" + classifierAlias + "\"" + " Alias is taken!",
                        TextualCommonsPackage.Literals.ALIASED_ELEMENT__ALIAS, ALIAS_TAKEN);
            }
        }
    }

    @Check
    private void checkCorrectClassifierType(Interface classifier) {
        Element element = classifier.getReferencedElement();
        if (element != null && !(element instanceof org.eclipse.uml2.uml.Interface)) {
            error(classifier.getName() + " should be a class but it's not!",
                    TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, NOT_AN_INTERFACE);
        }
    }

    @Check
    private void checkUnambiguousMemberEnds(XtextAssociation asc) {
        List<Classifier<?>> memberEndTypes = asc.collectMemberEndTypes();

        Set<Classifier<?>> duplicatedTypes = new HashSet<>();

        Set<Classifier<?>> seenTypes = new HashSet<>();
        for (Classifier<?> type : memberEndTypes) {
            if (seenTypes.contains(type)) {
                duplicatedTypes.add(type);
            }
            seenTypes.add(type);
        }

        for (Classifier<?> type : duplicatedTypes) {
            List<Integer> duplicatedIndices = new ArrayList<>();
            for (int i = 0; i < memberEndTypes.size(); ++i) {
                if (memberEndTypes.get(i) == type) {
                    duplicatedIndices.add(i);
                }
            }
            int maxIndex = duplicatedIndices.stream().max(Integer::compare).get();
            if (asc.getMemberEndNames().size() <= maxIndex) {
                error("Not enough role names given to distinguish the involved association participants unambiguously!",
                        ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_NAMES, NOT_ENOUGH_ROLE_NAMES);
            } else {
                Set<String> roleNames = duplicatedIndices.stream().map(i -> asc.getMemberEndNames().get(i))
                        .collect(Collectors.toSet());
                if (roleNames.size() != duplicatedIndices.size()) {
                    error("Role names for the same type have to be unambiguous!",
                            ClsPackage.Literals.XTEXT_ASSOCIATION__MEMBER_END_NAMES, NOT_ENOUGH_ROLE_NAMES);
                }
            }

        }

    }

    private void error(String message, EStructuralFeature feature, String code) {
        if (!issueCodeRegistry.hasIssueCode(code)) {
            issueCodeRegistry.registerIssueCode(code);
        }
        error(message, feature, code, new String[0]);
    }

}
