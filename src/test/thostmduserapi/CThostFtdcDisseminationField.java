/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcDisseminationField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcDisseminationField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcDisseminationField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcDisseminationField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSequenceSeries(short value) {
    thostmdapiJNI.CThostFtdcDisseminationField_SequenceSeries_set(swigCPtr, this, value);
  }

  public short getSequenceSeries() {
    return thostmdapiJNI.CThostFtdcDisseminationField_SequenceSeries_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thostmdapiJNI.CThostFtdcDisseminationField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thostmdapiJNI.CThostFtdcDisseminationField_SequenceNo_get(swigCPtr, this);
  }

  public CThostFtdcDisseminationField() {
    this(thostmdapiJNI.new_CThostFtdcDisseminationField(), true);
  }

}
