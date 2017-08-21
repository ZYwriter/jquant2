/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcParkedOrderActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcParkedOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcParkedOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcParkedOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOrderActionRef(int value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_OrderActionRef_set(swigCPtr, this, value);
  }

  public int getOrderActionRef() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_OrderActionRef_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_OrderRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_OrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeChange(int value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_VolumeChange_set(swigCPtr, this, value);
  }

  public int getVolumeChange() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_VolumeChange_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setParkedOrderActionID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_ParkedOrderActionID_set(swigCPtr, this, value);
  }

  public String getParkedOrderActionID() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_ParkedOrderActionID_get(swigCPtr, this);
  }

  public void setUserType(char value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_UserType_set(swigCPtr, this, value);
  }

  public char getUserType() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_UserType_get(swigCPtr, this);
  }

  public void setStatus(char value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_Status_set(swigCPtr, this, value);
  }

  public char getStatus() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_Status_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_ErrorMsg_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thostmdapiJNI.CThostFtdcParkedOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thostmdapiJNI.CThostFtdcParkedOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcParkedOrderActionField() {
    this(thostmdapiJNI.new_CThostFtdcParkedOrderActionField(), true);
  }

}
