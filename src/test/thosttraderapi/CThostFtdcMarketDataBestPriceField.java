/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcMarketDataBestPriceField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcMarketDataBestPriceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataBestPriceField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcMarketDataBestPriceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBidPrice1(double value) {
    thosttradeapiJNI.CThostFtdcMarketDataBestPriceField_BidPrice1_set(swigCPtr, this, value);
  }

  public double getBidPrice1() {
    return thosttradeapiJNI.CThostFtdcMarketDataBestPriceField_BidPrice1_get(swigCPtr, this);
  }

  public void setBidVolume1(int value) {
    thosttradeapiJNI.CThostFtdcMarketDataBestPriceField_BidVolume1_set(swigCPtr, this, value);
  }

  public int getBidVolume1() {
    return thosttradeapiJNI.CThostFtdcMarketDataBestPriceField_BidVolume1_get(swigCPtr, this);
  }

  public void setAskPrice1(double value) {
    thosttradeapiJNI.CThostFtdcMarketDataBestPriceField_AskPrice1_set(swigCPtr, this, value);
  }

  public double getAskPrice1() {
    return thosttradeapiJNI.CThostFtdcMarketDataBestPriceField_AskPrice1_get(swigCPtr, this);
  }

  public void setAskVolume1(int value) {
    thosttradeapiJNI.CThostFtdcMarketDataBestPriceField_AskVolume1_set(swigCPtr, this, value);
  }

  public int getAskVolume1() {
    return thosttradeapiJNI.CThostFtdcMarketDataBestPriceField_AskVolume1_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataBestPriceField() {
    this(thosttradeapiJNI.new_CThostFtdcMarketDataBestPriceField(), true);
  }

}
