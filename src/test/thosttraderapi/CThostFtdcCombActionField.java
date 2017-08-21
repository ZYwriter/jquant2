/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcCombActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcCombActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCombActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcCombActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcCombActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcCombActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttradeapiJNI.CThostFtdcCombActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttradeapiJNI.CThostFtdcCombActionField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttradeapiJNI.CThostFtdcCombActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttradeapiJNI.CThostFtdcCombActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setCombActionRef(String value) {
    thosttradeapiJNI.CThostFtdcCombActionField_CombActionRef_set(swigCPtr, this, value);
  }

  public String getCombActionRef() {
    return thosttradeapiJNI.CThostFtdcCombActionField_CombActionRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttradeapiJNI.CThostFtdcCombActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttradeapiJNI.CThostFtdcCombActionField_UserID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thosttradeapiJNI.CThostFtdcCombActionField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thosttradeapiJNI.CThostFtdcCombActionField_Direction_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    thosttradeapiJNI.CThostFtdcCombActionField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return thosttradeapiJNI.CThostFtdcCombActionField_Volume_get(swigCPtr, this);
  }

  public void setCombDirection(char value) {
    thosttradeapiJNI.CThostFtdcCombActionField_CombDirection_set(swigCPtr, this, value);
  }

  public char getCombDirection() {
    return thosttradeapiJNI.CThostFtdcCombActionField_CombDirection_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thosttradeapiJNI.CThostFtdcCombActionField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thosttradeapiJNI.CThostFtdcCombActionField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    thosttradeapiJNI.CThostFtdcCombActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return thosttradeapiJNI.CThostFtdcCombActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttradeapiJNI.CThostFtdcCombActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttradeapiJNI.CThostFtdcCombActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thosttradeapiJNI.CThostFtdcCombActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thosttradeapiJNI.CThostFtdcCombActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thosttradeapiJNI.CThostFtdcCombActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thosttradeapiJNI.CThostFtdcCombActionField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thosttradeapiJNI.CThostFtdcCombActionField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thosttradeapiJNI.CThostFtdcCombActionField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thosttradeapiJNI.CThostFtdcCombActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thosttradeapiJNI.CThostFtdcCombActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thosttradeapiJNI.CThostFtdcCombActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thosttradeapiJNI.CThostFtdcCombActionField_InstallID_get(swigCPtr, this);
  }

  public void setActionStatus(char value) {
    thosttradeapiJNI.CThostFtdcCombActionField_ActionStatus_set(swigCPtr, this, value);
  }

  public char getActionStatus() {
    return thosttradeapiJNI.CThostFtdcCombActionField_ActionStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    thosttradeapiJNI.CThostFtdcCombActionField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return thosttradeapiJNI.CThostFtdcCombActionField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttradeapiJNI.CThostFtdcCombActionField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttradeapiJNI.CThostFtdcCombActionField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thosttradeapiJNI.CThostFtdcCombActionField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thosttradeapiJNI.CThostFtdcCombActionField_SettlementID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thosttradeapiJNI.CThostFtdcCombActionField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thosttradeapiJNI.CThostFtdcCombActionField_SequenceNo_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    thosttradeapiJNI.CThostFtdcCombActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thosttradeapiJNI.CThostFtdcCombActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thosttradeapiJNI.CThostFtdcCombActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thosttradeapiJNI.CThostFtdcCombActionField_SessionID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    thosttradeapiJNI.CThostFtdcCombActionField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return thosttradeapiJNI.CThostFtdcCombActionField_UserProductInfo_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    thosttradeapiJNI.CThostFtdcCombActionField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return thosttradeapiJNI.CThostFtdcCombActionField_StatusMsg_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thosttradeapiJNI.CThostFtdcCombActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thosttradeapiJNI.CThostFtdcCombActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thosttradeapiJNI.CThostFtdcCombActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thosttradeapiJNI.CThostFtdcCombActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcCombActionField() {
    this(thosttradeapiJNI.new_CThostFtdcCombActionField(), true);
  }

}
