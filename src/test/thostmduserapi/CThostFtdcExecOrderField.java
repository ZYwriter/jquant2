/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcExecOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExecOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExecOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcExecOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setExecOrderRef(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_ExecOrderRef_set(swigCPtr, this, value);
  }

  public String getExecOrderRef() {
    return thostmdapiJNI.CThostFtdcExecOrderField_ExecOrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_UserID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    thostmdapiJNI.CThostFtdcExecOrderField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return thostmdapiJNI.CThostFtdcExecOrderField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmdapiJNI.CThostFtdcExecOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thostmdapiJNI.CThostFtdcExecOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    thostmdapiJNI.CThostFtdcExecOrderField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return thostmdapiJNI.CThostFtdcExecOrderField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thostmdapiJNI.CThostFtdcExecOrderField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thostmdapiJNI.CThostFtdcExecOrderField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionType(char value) {
    thostmdapiJNI.CThostFtdcExecOrderField_ActionType_set(swigCPtr, this, value);
  }

  public char getActionType() {
    return thostmdapiJNI.CThostFtdcExecOrderField_ActionType_get(swigCPtr, this);
  }

  public void setPosiDirection(char value) {
    thostmdapiJNI.CThostFtdcExecOrderField_PosiDirection_set(swigCPtr, this, value);
  }

  public char getPosiDirection() {
    return thostmdapiJNI.CThostFtdcExecOrderField_PosiDirection_get(swigCPtr, this);
  }

  public void setReservePositionFlag(char value) {
    thostmdapiJNI.CThostFtdcExecOrderField_ReservePositionFlag_set(swigCPtr, this, value);
  }

  public char getReservePositionFlag() {
    return thostmdapiJNI.CThostFtdcExecOrderField_ReservePositionFlag_get(swigCPtr, this);
  }

  public void setCloseFlag(char value) {
    thostmdapiJNI.CThostFtdcExecOrderField_CloseFlag_set(swigCPtr, this, value);
  }

  public char getCloseFlag() {
    return thostmdapiJNI.CThostFtdcExecOrderField_CloseFlag_get(swigCPtr, this);
  }

  public void setExecOrderLocalID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_ExecOrderLocalID_set(swigCPtr, this, value);
  }

  public String getExecOrderLocalID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_ExecOrderLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thostmdapiJNI.CThostFtdcExecOrderField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    thostmdapiJNI.CThostFtdcExecOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return thostmdapiJNI.CThostFtdcExecOrderField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    thostmdapiJNI.CThostFtdcExecOrderField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return thostmdapiJNI.CThostFtdcExecOrderField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmdapiJNI.CThostFtdcExecOrderField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thostmdapiJNI.CThostFtdcExecOrderField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_SettlementID_get(swigCPtr, this);
  }

  public void setExecOrderSysID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_ExecOrderSysID_set(swigCPtr, this, value);
  }

  public String getExecOrderSysID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_ExecOrderSysID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return thostmdapiJNI.CThostFtdcExecOrderField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return thostmdapiJNI.CThostFtdcExecOrderField_InsertTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return thostmdapiJNI.CThostFtdcExecOrderField_CancelTime_get(swigCPtr, this);
  }

  public void setExecResult(char value) {
    thostmdapiJNI.CThostFtdcExecOrderField_ExecResult_set(swigCPtr, this, value);
  }

  public char getExecResult() {
    return thostmdapiJNI.CThostFtdcExecOrderField_ExecResult_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thostmdapiJNI.CThostFtdcExecOrderField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thostmdapiJNI.CThostFtdcExecOrderField_SequenceNo_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    thostmdapiJNI.CThostFtdcExecOrderField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmdapiJNI.CThostFtdcExecOrderField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_SessionID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return thostmdapiJNI.CThostFtdcExecOrderField_UserProductInfo_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return thostmdapiJNI.CThostFtdcExecOrderField_StatusMsg_get(swigCPtr, this);
  }

  public void setActiveUserID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_ActiveUserID_set(swigCPtr, this, value);
  }

  public String getActiveUserID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_ActiveUserID_get(swigCPtr, this);
  }

  public void setBrokerExecOrderSeq(int value) {
    thostmdapiJNI.CThostFtdcExecOrderField_BrokerExecOrderSeq_set(swigCPtr, this, value);
  }

  public int getBrokerExecOrderSeq() {
    return thostmdapiJNI.CThostFtdcExecOrderField_BrokerExecOrderSeq_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_InvestUnitID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmdapiJNI.CThostFtdcExecOrderField_CurrencyID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thostmdapiJNI.CThostFtdcExecOrderField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thostmdapiJNI.CThostFtdcExecOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thostmdapiJNI.CThostFtdcExecOrderField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExecOrderField() {
    this(thostmdapiJNI.new_CThostFtdcExecOrderField(), true);
  }

}
