/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcProductExchRateField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcProductExchRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcProductExchRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcProductExchRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProductID(String value) {
    thostmdapiJNI.CThostFtdcProductExchRateField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return thostmdapiJNI.CThostFtdcProductExchRateField_ProductID_get(swigCPtr, this);
  }

  public void setQuoteCurrencyID(String value) {
    thostmdapiJNI.CThostFtdcProductExchRateField_QuoteCurrencyID_set(swigCPtr, this, value);
  }

  public String getQuoteCurrencyID() {
    return thostmdapiJNI.CThostFtdcProductExchRateField_QuoteCurrencyID_get(swigCPtr, this);
  }

  public void setExchangeRate(double value) {
    thostmdapiJNI.CThostFtdcProductExchRateField_ExchangeRate_set(swigCPtr, this, value);
  }

  public double getExchangeRate() {
    return thostmdapiJNI.CThostFtdcProductExchRateField_ExchangeRate_get(swigCPtr, this);
  }

  public CThostFtdcProductExchRateField() {
    this(thostmdapiJNI.new_CThostFtdcProductExchRateField(), true);
  }

}
