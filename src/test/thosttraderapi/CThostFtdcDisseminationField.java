/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

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
        thosttradeapiJNI.delete_CThostFtdcDisseminationField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSequenceSeries(short value) {
    thosttradeapiJNI.CThostFtdcDisseminationField_SequenceSeries_set(swigCPtr, this, value);
  }

  public short getSequenceSeries() {
    return thosttradeapiJNI.CThostFtdcDisseminationField_SequenceSeries_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thosttradeapiJNI.CThostFtdcDisseminationField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thosttradeapiJNI.CThostFtdcDisseminationField_SequenceNo_get(swigCPtr, this);
  }

  public CThostFtdcDisseminationField() {
    this(thosttradeapiJNI.new_CThostFtdcDisseminationField(), true);
  }

}
