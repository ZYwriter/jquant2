/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQryTraderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryTraderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryTraderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcQryTraderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    thostmdapiJNI.CThostFtdcQryTraderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmdapiJNI.CThostFtdcQryTraderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thostmdapiJNI.CThostFtdcQryTraderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thostmdapiJNI.CThostFtdcQryTraderField_ParticipantID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thostmdapiJNI.CThostFtdcQryTraderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thostmdapiJNI.CThostFtdcQryTraderField_TraderID_get(swigCPtr, this);
  }

  public CThostFtdcQryTraderField() {
    this(thostmdapiJNI.new_CThostFtdcQryTraderField(), true);
  }

}
