/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQryCombInstrumentGuardField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryCombInstrumentGuardField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryCombInstrumentGuardField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcQryCombInstrumentGuardField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcQryCombInstrumentGuardField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcQryCombInstrumentGuardField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcQryCombInstrumentGuardField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcQryCombInstrumentGuardField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcQryCombInstrumentGuardField() {
    this(thostmdapiJNI.new_CThostFtdcQryCombInstrumentGuardField(), true);
  }

}
