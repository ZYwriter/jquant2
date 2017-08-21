/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcTradeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcTradeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcTradeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcTradeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcTradeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcTradeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcTradeField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcTradeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcTradeField_InstrumentID_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    thostmdapiJNI.CThostFtdcTradeField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return thostmdapiJNI.CThostFtdcTradeField_OrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcTradeField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcTradeField_UserID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmdapiJNI.CThostFtdcTradeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmdapiJNI.CThostFtdcTradeField_ExchangeID_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    thostmdapiJNI.CThostFtdcTradeField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return thostmdapiJNI.CThostFtdcTradeField_TradeID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thostmdapiJNI.CThostFtdcTradeField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thostmdapiJNI.CThostFtdcTradeField_Direction_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    thostmdapiJNI.CThostFtdcTradeField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return thostmdapiJNI.CThostFtdcTradeField_OrderSysID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thostmdapiJNI.CThostFtdcTradeField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thostmdapiJNI.CThostFtdcTradeField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thostmdapiJNI.CThostFtdcTradeField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thostmdapiJNI.CThostFtdcTradeField_ClientID_get(swigCPtr, this);
  }

  public void setTradingRole(char value) {
    thostmdapiJNI.CThostFtdcTradeField_TradingRole_set(swigCPtr, this, value);
  }

  public char getTradingRole() {
    return thostmdapiJNI.CThostFtdcTradeField_TradingRole_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thostmdapiJNI.CThostFtdcTradeField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thostmdapiJNI.CThostFtdcTradeField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    thostmdapiJNI.CThostFtdcTradeField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return thostmdapiJNI.CThostFtdcTradeField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thostmdapiJNI.CThostFtdcTradeField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thostmdapiJNI.CThostFtdcTradeField_HedgeFlag_get(swigCPtr, this);
  }

  public void setPrice(double value) {
    thostmdapiJNI.CThostFtdcTradeField_Price_set(swigCPtr, this, value);
  }

  public double getPrice() {
    return thostmdapiJNI.CThostFtdcTradeField_Price_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    thostmdapiJNI.CThostFtdcTradeField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return thostmdapiJNI.CThostFtdcTradeField_Volume_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thostmdapiJNI.CThostFtdcTradeField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thostmdapiJNI.CThostFtdcTradeField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thostmdapiJNI.CThostFtdcTradeField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thostmdapiJNI.CThostFtdcTradeField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeType(char value) {
    thostmdapiJNI.CThostFtdcTradeField_TradeType_set(swigCPtr, this, value);
  }

  public char getTradeType() {
    return thostmdapiJNI.CThostFtdcTradeField_TradeType_get(swigCPtr, this);
  }

  public void setPriceSource(char value) {
    thostmdapiJNI.CThostFtdcTradeField_PriceSource_set(swigCPtr, this, value);
  }

  public char getPriceSource() {
    return thostmdapiJNI.CThostFtdcTradeField_PriceSource_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thostmdapiJNI.CThostFtdcTradeField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thostmdapiJNI.CThostFtdcTradeField_TraderID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    thostmdapiJNI.CThostFtdcTradeField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return thostmdapiJNI.CThostFtdcTradeField_OrderLocalID_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    thostmdapiJNI.CThostFtdcTradeField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return thostmdapiJNI.CThostFtdcTradeField_ClearingPartID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thostmdapiJNI.CThostFtdcTradeField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thostmdapiJNI.CThostFtdcTradeField_BusinessUnit_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thostmdapiJNI.CThostFtdcTradeField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thostmdapiJNI.CThostFtdcTradeField_SequenceNo_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmdapiJNI.CThostFtdcTradeField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmdapiJNI.CThostFtdcTradeField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thostmdapiJNI.CThostFtdcTradeField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thostmdapiJNI.CThostFtdcTradeField_SettlementID_get(swigCPtr, this);
  }

  public void setBrokerOrderSeq(int value) {
    thostmdapiJNI.CThostFtdcTradeField_BrokerOrderSeq_set(swigCPtr, this, value);
  }

  public int getBrokerOrderSeq() {
    return thostmdapiJNI.CThostFtdcTradeField_BrokerOrderSeq_get(swigCPtr, this);
  }

  public void setTradeSource(char value) {
    thostmdapiJNI.CThostFtdcTradeField_TradeSource_set(swigCPtr, this, value);
  }

  public char getTradeSource() {
    return thostmdapiJNI.CThostFtdcTradeField_TradeSource_get(swigCPtr, this);
  }

  public CThostFtdcTradeField() {
    this(thostmdapiJNI.new_CThostFtdcTradeField(), true);
  }

}
