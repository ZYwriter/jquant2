/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcMarketDataBaseField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcMarketDataBaseField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataBaseField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcMarketDataBaseField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    thostmdapiJNI.CThostFtdcMarketDataBaseField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmdapiJNI.CThostFtdcMarketDataBaseField_TradingDay_get(swigCPtr, this);
  }

  public void setPreSettlementPrice(double value) {
    thostmdapiJNI.CThostFtdcMarketDataBaseField_PreSettlementPrice_set(swigCPtr, this, value);
  }

  public double getPreSettlementPrice() {
    return thostmdapiJNI.CThostFtdcMarketDataBaseField_PreSettlementPrice_get(swigCPtr, this);
  }

  public void setPreClosePrice(double value) {
    thostmdapiJNI.CThostFtdcMarketDataBaseField_PreClosePrice_set(swigCPtr, this, value);
  }

  public double getPreClosePrice() {
    return thostmdapiJNI.CThostFtdcMarketDataBaseField_PreClosePrice_get(swigCPtr, this);
  }

  public void setPreOpenInterest(double value) {
    thostmdapiJNI.CThostFtdcMarketDataBaseField_PreOpenInterest_set(swigCPtr, this, value);
  }

  public double getPreOpenInterest() {
    return thostmdapiJNI.CThostFtdcMarketDataBaseField_PreOpenInterest_get(swigCPtr, this);
  }

  public void setPreDelta(double value) {
    thostmdapiJNI.CThostFtdcMarketDataBaseField_PreDelta_set(swigCPtr, this, value);
  }

  public double getPreDelta() {
    return thostmdapiJNI.CThostFtdcMarketDataBaseField_PreDelta_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataBaseField() {
    this(thostmdapiJNI.new_CThostFtdcMarketDataBaseField(), true);
  }

}