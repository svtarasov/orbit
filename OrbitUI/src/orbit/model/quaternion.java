/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package orbit.model;

public class quaternion {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected quaternion(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(quaternion obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OrbitSimulatorJNI.delete_quaternion(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setW(double value) {
    OrbitSimulatorJNI.quaternion_w_set(swigCPtr, this, value);
  }

  public double getW() {
    return OrbitSimulatorJNI.quaternion_w_get(swigCPtr, this);
  }

  public void setX(double value) {
    OrbitSimulatorJNI.quaternion_x_set(swigCPtr, this, value);
  }

  public double getX() {
    return OrbitSimulatorJNI.quaternion_x_get(swigCPtr, this);
  }

  public void setY(double value) {
    OrbitSimulatorJNI.quaternion_y_set(swigCPtr, this, value);
  }

  public double getY() {
    return OrbitSimulatorJNI.quaternion_y_get(swigCPtr, this);
  }

  public void setZ(double value) {
    OrbitSimulatorJNI.quaternion_z_set(swigCPtr, this, value);
  }

  public double getZ() {
    return OrbitSimulatorJNI.quaternion_z_get(swigCPtr, this);
  }

  public quaternion normalize() {
    return new quaternion(OrbitSimulatorJNI.quaternion_normalize(swigCPtr, this), true);
  }

  public quaternion multiply(quaternion multiplier) {
    return new quaternion(OrbitSimulatorJNI.quaternion_multiply(swigCPtr, this, quaternion.getCPtr(multiplier), multiplier), true);
  }

  public quaternion invert() {
    return new quaternion(OrbitSimulatorJNI.quaternion_invert(swigCPtr, this), true);
  }

  public quaternion() {
    this(OrbitSimulatorJNI.new_quaternion(), true);
  }

}
