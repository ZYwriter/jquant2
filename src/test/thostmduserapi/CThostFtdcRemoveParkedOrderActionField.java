/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcRemoveParkedOrderActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcRemoveParkedOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRemoveParkedOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcRemoveParkedOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcRemoveParkedOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcRemoveParkedOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcRemoveParkedOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcRemoveParkedOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setParkedOrderActionID(String value) {
    thostmdapiJNI.CThostFtdcRemoveParkedOrderActionField_ParkedOrderActionID_set(swigCPtr, this, value);
  }

  public String getParkedOrderActionID() {
    return thostmdapiJNI.CThostFtdcRemoveParkedOrderActionField_ParkedOrderActionID_get(swigCPtr, this);
  }

  public CThostFtdcRemoveParkedOrderActionField() {
    this(thostmdapiJNI.new_CThostFtdcRemoveParkedOrderActionField(), true);
  }

}
