/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcSyncFundMortgageField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcSyncFundMortgageField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncFundMortgageField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcSyncFundMortgageField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMortgageSeqNo(String value) {
    thostmdapiJNI.CThostFtdcSyncFundMortgageField_MortgageSeqNo_set(swigCPtr, this, value);
  }

  public String getMortgageSeqNo() {
    return thostmdapiJNI.CThostFtdcSyncFundMortgageField_MortgageSeqNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcSyncFundMortgageField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcSyncFundMortgageField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcSyncFundMortgageField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcSyncFundMortgageField_InvestorID_get(swigCPtr, this);
  }

  public void setFromCurrencyID(String value) {
    thostmdapiJNI.CThostFtdcSyncFundMortgageField_FromCurrencyID_set(swigCPtr, this, value);
  }

  public String getFromCurrencyID() {
    return thostmdapiJNI.CThostFtdcSyncFundMortgageField_FromCurrencyID_get(swigCPtr, this);
  }

  public void setMortgageAmount(double value) {
    thostmdapiJNI.CThostFtdcSyncFundMortgageField_MortgageAmount_set(swigCPtr, this, value);
  }

  public double getMortgageAmount() {
    return thostmdapiJNI.CThostFtdcSyncFundMortgageField_MortgageAmount_get(swigCPtr, this);
  }

  public void setToCurrencyID(String value) {
    thostmdapiJNI.CThostFtdcSyncFundMortgageField_ToCurrencyID_set(swigCPtr, this, value);
  }

  public String getToCurrencyID() {
    return thostmdapiJNI.CThostFtdcSyncFundMortgageField_ToCurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcSyncFundMortgageField() {
    this(thostmdapiJNI.new_CThostFtdcSyncFundMortgageField(), true);
  }

}
