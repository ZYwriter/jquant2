/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcMMInstrumentCommissionRateField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcMMInstrumentCommissionRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMMInstrumentCommissionRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcMMInstrumentCommissionRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_InvestorID_get(swigCPtr, this);
  }

  public void setOpenRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_OpenRatioByMoney_set(swigCPtr, this, value);
  }

  public double getOpenRatioByMoney() {
    return thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_OpenRatioByMoney_get(swigCPtr, this);
  }

  public void setOpenRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_OpenRatioByVolume_set(swigCPtr, this, value);
  }

  public double getOpenRatioByVolume() {
    return thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_OpenRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_CloseRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseRatioByMoney() {
    return thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_CloseRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_CloseRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseRatioByVolume() {
    return thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_CloseRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByMoney(double value) {
    thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_CloseTodayRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByMoney() {
    return thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_CloseTodayRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByVolume(double value) {
    thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_CloseTodayRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByVolume() {
    return thostmdapiJNI.CThostFtdcMMInstrumentCommissionRateField_CloseTodayRatioByVolume_get(swigCPtr, this);
  }

  public CThostFtdcMMInstrumentCommissionRateField() {
    this(thostmdapiJNI.new_CThostFtdcMMInstrumentCommissionRateField(), true);
  }

}
