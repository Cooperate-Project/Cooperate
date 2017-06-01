/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence.impl;

import de.cooperateproject.modeling.textual.sequence.sequence.DurationConstraint;
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;
import de.cooperateproject.modeling.textual.sequence.sequence.TimeIntervalSelector;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.DurationConstraintImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.DurationConstraintImpl#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DurationConstraintImpl extends ConstraintImpl implements DurationConstraint {
    /**
     * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDuration()
     * @generated
     * @ordered
     */
    protected static final String DURATION_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DurationConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequencePackage.Literals.DURATION_CONSTRAINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDuration() {
        return (String)eDynamicGet(SequencePackage.DURATION_CONSTRAINT__DURATION, SequencePackage.Literals.DURATION_CONSTRAINT__DURATION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDuration(String newDuration) {
        eDynamicSet(SequencePackage.DURATION_CONSTRAINT__DURATION, SequencePackage.Literals.DURATION_CONSTRAINT__DURATION, newDuration);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeIntervalSelector getInterval() {
        return (TimeIntervalSelector)eDynamicGet(SequencePackage.DURATION_CONSTRAINT__INTERVAL, SequencePackage.Literals.DURATION_CONSTRAINT__INTERVAL, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInterval(TimeIntervalSelector newInterval, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newInterval, SequencePackage.DURATION_CONSTRAINT__INTERVAL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInterval(TimeIntervalSelector newInterval) {
        eDynamicSet(SequencePackage.DURATION_CONSTRAINT__INTERVAL, SequencePackage.Literals.DURATION_CONSTRAINT__INTERVAL, newInterval);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SequencePackage.DURATION_CONSTRAINT__INTERVAL:
                return basicSetInterval(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SequencePackage.DURATION_CONSTRAINT__DURATION:
                return getDuration();
            case SequencePackage.DURATION_CONSTRAINT__INTERVAL:
                return getInterval();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SequencePackage.DURATION_CONSTRAINT__DURATION:
                setDuration((String)newValue);
                return;
            case SequencePackage.DURATION_CONSTRAINT__INTERVAL:
                setInterval((TimeIntervalSelector)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case SequencePackage.DURATION_CONSTRAINT__DURATION:
                setDuration(DURATION_EDEFAULT);
                return;
            case SequencePackage.DURATION_CONSTRAINT__INTERVAL:
                setInterval((TimeIntervalSelector)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SequencePackage.DURATION_CONSTRAINT__DURATION:
                return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
            case SequencePackage.DURATION_CONSTRAINT__INTERVAL:
                return getInterval() != null;
        }
        return super.eIsSet(featureID);
    }

} //DurationConstraintImpl
