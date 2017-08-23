/**
 */
package de.cooperateproject.modeling.textual.cmp.cmp.provider;

import de.cooperateproject.modeling.textual.cmp.cmp.util.CmpAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CmpItemProviderAdapterFactory extends CmpAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CmpItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.cmp.cmp.ComponentDiagram} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComponentDiagramItemProvider componentDiagramItemProvider;

    /**
     * This creates an adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.ComponentDiagram}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createComponentDiagramAdapter() {
        if (componentDiagramItemProvider == null) {
            componentDiagramItemProvider = new ComponentDiagramItemProvider(this);
        }

        return componentDiagramItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.cmp.cmp.RootPackage} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RootPackageItemProvider rootPackageItemProvider;

    /**
     * This creates an adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.RootPackage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRootPackageAdapter() {
        if (rootPackageItemProvider == null) {
            rootPackageItemProvider = new RootPackageItemProvider(this);
        }

        return rootPackageItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.cmp.cmp.Connector} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectorItemProvider connectorItemProvider;

    /**
     * This creates an adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.Connector}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createConnectorAdapter() {
        if (connectorItemProvider == null) {
            connectorItemProvider = new ConnectorItemProvider(this);
        }

        return connectorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.cmp.cmp.Generalization} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GeneralizationItemProvider generalizationItemProvider;

    /**
     * This creates an adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.Generalization}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createGeneralizationAdapter() {
        if (generalizationItemProvider == null) {
            generalizationItemProvider = new GeneralizationItemProvider(this);
        }

        return generalizationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.cmp.cmp.Abstraction} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractionItemProvider abstractionItemProvider;

    /**
     * This creates an adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.Abstraction}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createAbstractionAdapter() {
        if (abstractionItemProvider == null) {
            abstractionItemProvider = new AbstractionItemProvider(this);
        }

        return abstractionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.cmp.cmp.Manifestation} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ManifestationItemProvider manifestationItemProvider;

    /**
     * This creates an adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.Manifestation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createManifestationAdapter() {
        if (manifestationItemProvider == null) {
            manifestationItemProvider = new ManifestationItemProvider(this);
        }

        return manifestationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.cmp.cmp.Substitution} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubstitutionItemProvider substitutionItemProvider;

    /**
     * This creates an adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.Substitution}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSubstitutionAdapter() {
        if (substitutionItemProvider == null) {
            substitutionItemProvider = new SubstitutionItemProvider(this);
        }

        return substitutionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.cmp.cmp.Dependency} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DependencyItemProvider dependencyItemProvider;

    /**
     * This creates an adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.Dependency}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDependencyAdapter() {
        if (dependencyItemProvider == null) {
            dependencyItemProvider = new DependencyItemProvider(this);
        }

        return dependencyItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.cmp.cmp.Component} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComponentItemProvider componentItemProvider;

    /**
     * This creates an adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.Component}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createComponentAdapter() {
        if (componentItemProvider == null) {
            componentItemProvider = new ComponentItemProvider(this);
        }

        return componentItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.cmp.cmp.Interface} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InterfaceItemProvider interfaceItemProvider;

    /**
     * This creates an adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.Interface}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createInterfaceAdapter() {
        if (interfaceItemProvider == null) {
            interfaceItemProvider = new InterfaceItemProvider(this);
        }

        return interfaceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.cmp.cmp.Method} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MethodItemProvider methodItemProvider;

    /**
     * This creates an adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.Method}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMethodAdapter() {
        if (methodItemProvider == null) {
            methodItemProvider = new MethodItemProvider(this);
        }

        return methodItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.cmp.cmp.Parameter} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParameterItemProvider parameterItemProvider;

    /**
     * This creates an adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.Parameter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createParameterAdapter() {
        if (parameterItemProvider == null) {
            parameterItemProvider = new ParameterItemProvider(this);
        }

        return parameterItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.cmp.cmp.Attribute} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeItemProvider attributeItemProvider;

    /**
     * This creates an adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.Attribute}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createAttributeAdapter() {
        if (attributeItemProvider == null) {
            attributeItemProvider = new AttributeItemProvider(this);
        }

        return attributeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.cmp.cmp.Provide} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProvideItemProvider provideItemProvider;

    /**
     * This creates an adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.Provide}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createProvideAdapter() {
        if (provideItemProvider == null) {
            provideItemProvider = new ProvideItemProvider(this);
        }

        return provideItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.cmp.cmp.Require} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RequireItemProvider requireItemProvider;

    /**
     * This creates an adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.Require}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRequireAdapter() {
        if (requireItemProvider == null) {
            requireItemProvider = new RequireItemProvider(this);
        }

        return requireItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.cooperateproject.modeling.textual.cmp.cmp.Port} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PortItemProvider portItemProvider;

    /**
     * This creates an adapter for a {@link de.cooperateproject.modeling.textual.cmp.cmp.Port}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPortAdapter() {
        if (portItemProvider == null) {
            portItemProvider = new PortItemProvider(this);
        }

        return portItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose() {
        if (componentDiagramItemProvider != null) componentDiagramItemProvider.dispose();
        if (rootPackageItemProvider != null) rootPackageItemProvider.dispose();
        if (connectorItemProvider != null) connectorItemProvider.dispose();
        if (generalizationItemProvider != null) generalizationItemProvider.dispose();
        if (abstractionItemProvider != null) abstractionItemProvider.dispose();
        if (manifestationItemProvider != null) manifestationItemProvider.dispose();
        if (substitutionItemProvider != null) substitutionItemProvider.dispose();
        if (dependencyItemProvider != null) dependencyItemProvider.dispose();
        if (componentItemProvider != null) componentItemProvider.dispose();
        if (interfaceItemProvider != null) interfaceItemProvider.dispose();
        if (methodItemProvider != null) methodItemProvider.dispose();
        if (parameterItemProvider != null) parameterItemProvider.dispose();
        if (attributeItemProvider != null) attributeItemProvider.dispose();
        if (provideItemProvider != null) provideItemProvider.dispose();
        if (requireItemProvider != null) requireItemProvider.dispose();
        if (portItemProvider != null) portItemProvider.dispose();
    }

}
