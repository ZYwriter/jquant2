/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcSyncingTradingCodeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcSyncingTradingCodeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingTradingCodeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcSyncingTradingCodeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcSyncingTradingCodeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcSyncingTradingCodeField_InvestorID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcSyncingTradingCodeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcSyncingTradingCodeField_BrokerID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmdapiJNI.CThostFtdcSyncingTradingCodeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmdapiJNI.CThostFtdcSyncingTradingCodeField_ExchangeID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thostmdapiJNI.CThostFtdcSyncingTradingCodeField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thostmdapiJNI.CThostFtdcSyncingTradingCodeField_ClientID_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    thostmdapiJNI.CThostFtdcSyncingTradingCodeField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return thostmdapiJNI.CThostFtdcSyncingTradingCodeField_IsActive_get(swigCPtr, this);
  }

  public void setClientIDType(char value) {
    thostmdapiJNI.CThostFtdcSyncingTradingCodeField_ClientIDType_set(swigCPtr, this, value);
  }

  public char getClientIDType() {
    return thostmdapiJNI.CThostFtdcSyncingTradingCodeField_ClientIDType_get(swigCPtr, this);
  }

  public CThostFtdcSyncingTradingCodeField() {
    this(thostmdapiJNI.new_CThostFtdcSyncingTradingCodeField(), true);
  }

}
