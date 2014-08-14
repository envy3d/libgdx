/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btHingeConstraintDoubleData2 extends BulletBase {
	private long swigCPtr;
	
	protected btHingeConstraintDoubleData2(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btHingeConstraintDoubleData2, normally you should not need this constructor it's intended for low-level usage. */ 
	public btHingeConstraintDoubleData2(long cPtr, boolean cMemoryOwn) {
		this("btHingeConstraintDoubleData2", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btHingeConstraintDoubleData2 obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				DynamicsJNI.delete_btHingeConstraintDoubleData2(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setTypeConstraintData(btTypedConstraintDoubleData value) {
    DynamicsJNI.btHingeConstraintDoubleData2_typeConstraintData_set(swigCPtr, this, btTypedConstraintDoubleData.getCPtr(value), value);
  }

  public btTypedConstraintDoubleData getTypeConstraintData() {
    long cPtr = DynamicsJNI.btHingeConstraintDoubleData2_typeConstraintData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTypedConstraintDoubleData(cPtr, false);
  }

  public void setRbAFrame(btTransformDoubleData value) {
    DynamicsJNI.btHingeConstraintDoubleData2_rbAFrame_set(swigCPtr, this, btTransformDoubleData.getCPtr(value), value);
  }

  public btTransformDoubleData getRbAFrame() {
    long cPtr = DynamicsJNI.btHingeConstraintDoubleData2_rbAFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformDoubleData(cPtr, false);
  }

  public void setRbBFrame(btTransformDoubleData value) {
    DynamicsJNI.btHingeConstraintDoubleData2_rbBFrame_set(swigCPtr, this, btTransformDoubleData.getCPtr(value), value);
  }

  public btTransformDoubleData getRbBFrame() {
    long cPtr = DynamicsJNI.btHingeConstraintDoubleData2_rbBFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformDoubleData(cPtr, false);
  }

  public void setUseReferenceFrameA(int value) {
    DynamicsJNI.btHingeConstraintDoubleData2_useReferenceFrameA_set(swigCPtr, this, value);
  }

  public int getUseReferenceFrameA() {
    return DynamicsJNI.btHingeConstraintDoubleData2_useReferenceFrameA_get(swigCPtr, this);
  }

  public void setAngularOnly(int value) {
    DynamicsJNI.btHingeConstraintDoubleData2_angularOnly_set(swigCPtr, this, value);
  }

  public int getAngularOnly() {
    return DynamicsJNI.btHingeConstraintDoubleData2_angularOnly_get(swigCPtr, this);
  }

  public void setEnableAngularMotor(int value) {
    DynamicsJNI.btHingeConstraintDoubleData2_enableAngularMotor_set(swigCPtr, this, value);
  }

  public int getEnableAngularMotor() {
    return DynamicsJNI.btHingeConstraintDoubleData2_enableAngularMotor_get(swigCPtr, this);
  }

  public void setMotorTargetVelocity(double value) {
    DynamicsJNI.btHingeConstraintDoubleData2_motorTargetVelocity_set(swigCPtr, this, value);
  }

  public double getMotorTargetVelocity() {
    return DynamicsJNI.btHingeConstraintDoubleData2_motorTargetVelocity_get(swigCPtr, this);
  }

  public void setMaxMotorImpulse(double value) {
    DynamicsJNI.btHingeConstraintDoubleData2_maxMotorImpulse_set(swigCPtr, this, value);
  }

  public double getMaxMotorImpulse() {
    return DynamicsJNI.btHingeConstraintDoubleData2_maxMotorImpulse_get(swigCPtr, this);
  }

  public void setLowerLimit(double value) {
    DynamicsJNI.btHingeConstraintDoubleData2_lowerLimit_set(swigCPtr, this, value);
  }

  public double getLowerLimit() {
    return DynamicsJNI.btHingeConstraintDoubleData2_lowerLimit_get(swigCPtr, this);
  }

  public void setUpperLimit(double value) {
    DynamicsJNI.btHingeConstraintDoubleData2_upperLimit_set(swigCPtr, this, value);
  }

  public double getUpperLimit() {
    return DynamicsJNI.btHingeConstraintDoubleData2_upperLimit_get(swigCPtr, this);
  }

  public void setLimitSoftness(double value) {
    DynamicsJNI.btHingeConstraintDoubleData2_limitSoftness_set(swigCPtr, this, value);
  }

  public double getLimitSoftness() {
    return DynamicsJNI.btHingeConstraintDoubleData2_limitSoftness_get(swigCPtr, this);
  }

  public void setBiasFactor(double value) {
    DynamicsJNI.btHingeConstraintDoubleData2_biasFactor_set(swigCPtr, this, value);
  }

  public double getBiasFactor() {
    return DynamicsJNI.btHingeConstraintDoubleData2_biasFactor_get(swigCPtr, this);
  }

  public void setRelaxationFactor(double value) {
    DynamicsJNI.btHingeConstraintDoubleData2_relaxationFactor_set(swigCPtr, this, value);
  }

  public double getRelaxationFactor() {
    return DynamicsJNI.btHingeConstraintDoubleData2_relaxationFactor_get(swigCPtr, this);
  }

  public void setPadding1(String value) {
    DynamicsJNI.btHingeConstraintDoubleData2_padding1_set(swigCPtr, this, value);
  }

  public String getPadding1() {
    return DynamicsJNI.btHingeConstraintDoubleData2_padding1_get(swigCPtr, this);
  }

  public btHingeConstraintDoubleData2() {
    this(DynamicsJNI.new_btHingeConstraintDoubleData2(), true);
  }

}
