/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcErrOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcErrOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcErrOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcErrOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcErrOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcErrOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcErrOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return thostmdapiJNI.CThostFtdcErrOrderField_OrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcErrOrderField_UserID_get(swigCPtr, this);
  }

  public void setOrderPriceType(char value) {
    thostmdapiJNI.CThostFtdcErrOrderField_OrderPriceType_set(swigCPtr, this, value);
  }

  public char getOrderPriceType() {
    return thostmdapiJNI.CThostFtdcErrOrderField_OrderPriceType_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thostmdapiJNI.CThostFtdcErrOrderField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thostmdapiJNI.CThostFtdcErrOrderField_Direction_get(swigCPtr, this);
  }

  public void setCombOffsetFlag(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_CombOffsetFlag_set(swigCPtr, this, value);
  }

  public String getCombOffsetFlag() {
    return thostmdapiJNI.CThostFtdcErrOrderField_CombOffsetFlag_get(swigCPtr, this);
  }

  public void setCombHedgeFlag(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_CombHedgeFlag_set(swigCPtr, this, value);
  }

  public String getCombHedgeFlag() {
    return thostmdapiJNI.CThostFtdcErrOrderField_CombHedgeFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    thostmdapiJNI.CThostFtdcErrOrderField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return thostmdapiJNI.CThostFtdcErrOrderField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeTotalOriginal(int value) {
    thostmdapiJNI.CThostFtdcErrOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
  }

  public int getVolumeTotalOriginal() {
    return thostmdapiJNI.CThostFtdcErrOrderField_VolumeTotalOriginal_get(swigCPtr, this);
  }

  public void setTimeCondition(char value) {
    thostmdapiJNI.CThostFtdcErrOrderField_TimeCondition_set(swigCPtr, this, value);
  }

  public char getTimeCondition() {
    return thostmdapiJNI.CThostFtdcErrOrderField_TimeCondition_get(swigCPtr, this);
  }

  public void setGTDDate(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_GTDDate_set(swigCPtr, this, value);
  }

  public String getGTDDate() {
    return thostmdapiJNI.CThostFtdcErrOrderField_GTDDate_get(swigCPtr, this);
  }

  public void setVolumeCondition(char value) {
    thostmdapiJNI.CThostFtdcErrOrderField_VolumeCondition_set(swigCPtr, this, value);
  }

  public char getVolumeCondition() {
    return thostmdapiJNI.CThostFtdcErrOrderField_VolumeCondition_get(swigCPtr, this);
  }

  public void setMinVolume(int value) {
    thostmdapiJNI.CThostFtdcErrOrderField_MinVolume_set(swigCPtr, this, value);
  }

  public int getMinVolume() {
    return thostmdapiJNI.CThostFtdcErrOrderField_MinVolume_get(swigCPtr, this);
  }

  public void setContingentCondition(char value) {
    thostmdapiJNI.CThostFtdcErrOrderField_ContingentCondition_set(swigCPtr, this, value);
  }

  public char getContingentCondition() {
    return thostmdapiJNI.CThostFtdcErrOrderField_ContingentCondition_get(swigCPtr, this);
  }

  public void setStopPrice(double value) {
    thostmdapiJNI.CThostFtdcErrOrderField_StopPrice_set(swigCPtr, this, value);
  }

  public double getStopPrice() {
    return thostmdapiJNI.CThostFtdcErrOrderField_StopPrice_get(swigCPtr, this);
  }

  public void setForceCloseReason(char value) {
    thostmdapiJNI.CThostFtdcErrOrderField_ForceCloseReason_set(swigCPtr, this, value);
  }

  public char getForceCloseReason() {
    return thostmdapiJNI.CThostFtdcErrOrderField_ForceCloseReason_get(swigCPtr, this);
  }

  public void setIsAutoSuspend(int value) {
    thostmdapiJNI.CThostFtdcErrOrderField_IsAutoSuspend_set(swigCPtr, this, value);
  }

  public int getIsAutoSuspend() {
    return thostmdapiJNI.CThostFtdcErrOrderField_IsAutoSuspend_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thostmdapiJNI.CThostFtdcErrOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmdapiJNI.CThostFtdcErrOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmdapiJNI.CThostFtdcErrOrderField_RequestID_get(swigCPtr, this);
  }

  public void setUserForceClose(int value) {
    thostmdapiJNI.CThostFtdcErrOrderField_UserForceClose_set(swigCPtr, this, value);
  }

  public int getUserForceClose() {
    return thostmdapiJNI.CThostFtdcErrOrderField_UserForceClose_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    thostmdapiJNI.CThostFtdcErrOrderField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return thostmdapiJNI.CThostFtdcErrOrderField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return thostmdapiJNI.CThostFtdcErrOrderField_ErrorMsg_get(swigCPtr, this);
  }

  public void setIsSwapOrder(int value) {
    thostmdapiJNI.CThostFtdcErrOrderField_IsSwapOrder_set(swigCPtr, this, value);
  }

  public int getIsSwapOrder() {
    return thostmdapiJNI.CThostFtdcErrOrderField_IsSwapOrder_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmdapiJNI.CThostFtdcErrOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thostmdapiJNI.CThostFtdcErrOrderField_InvestUnitID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmdapiJNI.CThostFtdcErrOrderField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmdapiJNI.CThostFtdcErrOrderField_CurrencyID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thostmdapiJNI.CThostFtdcErrOrderField_ClientID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thostmdapiJNI.CThostFtdcErrOrderField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thostmdapiJNI.CThostFtdcErrOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thostmdapiJNI.CThostFtdcErrOrderField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcErrOrderField() {
    this(thostmdapiJNI.new_CThostFtdcErrOrderField(), true);
  }

}
