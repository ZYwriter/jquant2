/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

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
        thosttradeapiJNI.delete_CThostFtdcTraderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    thosttradeapiJNI.CThostFtdcTraderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttradeapiJNI.CThostFtdcTraderField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thosttradeapiJNI.CThostFtdcTraderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thosttradeapiJNI.CThostFtdcTraderField_TraderID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thosttradeapiJNI.CThostFtdcTraderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thosttradeapiJNI.CThostFtdcTraderField_ParticipantID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thosttradeapiJNI.CThostFtdcTraderField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thosttradeapiJNI.CThostFtdcTraderField_Password_get(swigCPtr, this);
  }

  public void setInstallCount(int value) {
    thosttradeapiJNI.CThostFtdcTraderField_InstallCount_set(swigCPtr, this, value);
  }

  public int getInstallCount() {
    return thosttradeapiJNI.CThostFtdcTraderField_InstallCount_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcTraderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcTraderField_BrokerID_get(swigCPtr, this);
  }

  public CThostFtdcTraderField() {
    this(thosttradeapiJNI.new_CThostFtdcTraderField(), true);
  }

}
