/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcTraderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcTraderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTraderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcTraderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    thostmdapiJNI.CThostFtdcTraderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmdapiJNI.CThostFtdcTraderField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thostmdapiJNI.CThostFtdcTraderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thostmdapiJNI.CThostFtdcTraderField_TraderID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thostmdapiJNI.CThostFtdcTraderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thostmdapiJNI.CThostFtdcTraderField_ParticipantID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thostmdapiJNI.CThostFtdcTraderField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thostmdapiJNI.CThostFtdcTraderField_Password_get(swigCPtr, this);
  }

  public void setInstallCount(int value) {
    thostmdapiJNI.CThostFtdcTraderField_InstallCount_set(swigCPtr, this, value);
  }

  public int getInstallCount() {
    return thostmdapiJNI.CThostFtdcTraderField_InstallCount_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcTraderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcTraderField_BrokerID_get(swigCPtr, this);
  }

  public CThostFtdcTraderField() {
    this(thostmdapiJNI.new_CThostFtdcTraderField(), true);
  }

}
