/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcTransferQryDetailRspField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcTransferQryDetailRspField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferQryDetailRspField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcTransferQryDetailRspField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeDate(String value) {
    thostmdapiJNI.CThostFtdcTransferQryDetailRspField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thostmdapiJNI.CThostFtdcTransferQryDetailRspField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thostmdapiJNI.CThostFtdcTransferQryDetailRspField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thostmdapiJNI.CThostFtdcTransferQryDetailRspField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeCode(String value) {
    thostmdapiJNI.CThostFtdcTransferQryDetailRspField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thostmdapiJNI.CThostFtdcTransferQryDetailRspField_TradeCode_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    thostmdapiJNI.CThostFtdcTransferQryDetailRspField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return thostmdapiJNI.CThostFtdcTransferQryDetailRspField_FutureSerial_get(swigCPtr, this);
  }

  public void setFutureID(String value) {
    thostmdapiJNI.CThostFtdcTransferQryDetailRspField_FutureID_set(swigCPtr, this, value);
  }

  public String getFutureID() {
    return thostmdapiJNI.CThostFtdcTransferQryDetailRspField_FutureID_get(swigCPtr, this);
  }

  public void setFutureAccount(String value) {
    thostmdapiJNI.CThostFtdcTransferQryDetailRspField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return thostmdapiJNI.CThostFtdcTransferQryDetailRspField_FutureAccount_get(swigCPtr, this);
  }

  public void setBankSerial(int value) {
    thostmdapiJNI.CThostFtdcTransferQryDetailRspField_BankSerial_set(swigCPtr, this, value);
  }

  public int getBankSerial() {
    return thostmdapiJNI.CThostFtdcTransferQryDetailRspField_BankSerial_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thostmdapiJNI.CThostFtdcTransferQryDetailRspField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thostmdapiJNI.CThostFtdcTransferQryDetailRspField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    thostmdapiJNI.CThostFtdcTransferQryDetailRspField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return thostmdapiJNI.CThostFtdcTransferQryDetailRspField_BankBrchID_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    thostmdapiJNI.CThostFtdcTransferQryDetailRspField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return thostmdapiJNI.CThostFtdcTransferQryDetailRspField_BankAccount_get(swigCPtr, this);
  }

  public void setCertCode(String value) {
    thostmdapiJNI.CThostFtdcTransferQryDetailRspField_CertCode_set(swigCPtr, this, value);
  }

  public String getCertCode() {
    return thostmdapiJNI.CThostFtdcTransferQryDetailRspField_CertCode_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    thostmdapiJNI.CThostFtdcTransferQryDetailRspField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return thostmdapiJNI.CThostFtdcTransferQryDetailRspField_CurrencyCode_get(swigCPtr, this);
  }

  public void setTxAmount(double value) {
    thostmdapiJNI.CThostFtdcTransferQryDetailRspField_TxAmount_set(swigCPtr, this, value);
  }

  public double getTxAmount() {
    return thostmdapiJNI.CThostFtdcTransferQryDetailRspField_TxAmount_get(swigCPtr, this);
  }

  public void setFlag(char value) {
    thostmdapiJNI.CThostFtdcTransferQryDetailRspField_Flag_set(swigCPtr, this, value);
  }

  public char getFlag() {
    return thostmdapiJNI.CThostFtdcTransferQryDetailRspField_Flag_get(swigCPtr, this);
  }

  public CThostFtdcTransferQryDetailRspField() {
    this(thostmdapiJNI.new_CThostFtdcTransferQryDetailRspField(), true);
  }

}