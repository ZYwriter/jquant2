/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcSettlementInfoField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcSettlementInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSettlementInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcSettlementInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    thostmdapiJNI.CThostFtdcSettlementInfoField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmdapiJNI.CThostFtdcSettlementInfoField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thostmdapiJNI.CThostFtdcSettlementInfoField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thostmdapiJNI.CThostFtdcSettlementInfoField_SettlementID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcSettlementInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcSettlementInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcSettlementInfoField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcSettlementInfoField_InvestorID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thostmdapiJNI.CThostFtdcSettlementInfoField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thostmdapiJNI.CThostFtdcSettlementInfoField_SequenceNo_get(swigCPtr, this);
  }

  public void setContent(String value) {
    thostmdapiJNI.CThostFtdcSettlementInfoField_Content_set(swigCPtr, this, value);
  }

  public String getContent() {
    return thostmdapiJNI.CThostFtdcSettlementInfoField_Content_get(swigCPtr, this);
  }

  public CThostFtdcSettlementInfoField() {
    this(thostmdapiJNI.new_CThostFtdcSettlementInfoField(), true);
  }

}
