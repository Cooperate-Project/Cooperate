/**
 */
package de.cooperateproject.modeling.textual.cmp.cmp.provider;


import de.cooperateproject.modeling.textual.cmp.cmp.ClassifierRelation;
import de.cooperateproject.modeling.textual.cmp.cmp.CmpPackage;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.provider.AliasedElementItemProvider;

import de.cooperateproject.modeling.textual.component.metamodel.provider.ComponentEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.ClassifierRelation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassifierRelationItemProvider extends AliasedElementItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClassifierRelationItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addLeftClassifierPropertyDescriptor(object);
            addRightClassifierPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Left Classifier feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLeftClassifierPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ClassifierRelation_leftClassifier_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ClassifierRelation_leftClassifier_feature", "_UI_ClassifierRelation_type"),
                 CmpPackage.Literals.CLASSIFIER_RELATION__LEFT_CLASSIFIER,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Right Classifier feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRightClassifierPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_ClassifierRelation_rightClassifier_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_ClassifierRelation_rightClassifier_feature", "_UI_ClassifierRelation_type"),
                 CmpPackage.Literals.CLASSIFIER_RELATION__RIGHT_CLASSIFIER,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((ClassifierRelation<?, ?>)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_ClassifierRelation_type") :
            getString("_UI_ClassifierRelation_type") + " " + label;
    }
    

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ComponentEditPlugin.INSTANCE;
    }

}
