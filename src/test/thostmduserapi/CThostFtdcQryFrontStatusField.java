/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQryFrontStatusField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryFrontStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryFrontStatusField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcQryFrontStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrontID(int value) {
    thostmdapiJNI.CThostFtdcQryFrontStatusField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thostmdapiJNI.CThostFtdcQryFrontStatusField_FrontID_get(swigCPtr, this);
  }

  public CThostFtdcQryFrontStatusField() {
    this(thostmdapiJNI.new_CThostFtdcQryFrontStatusField(), true);
  }

}
