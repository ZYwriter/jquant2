/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQryOptionInstrTradeCostField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryOptionInstrTradeCostField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryOptionInstrTradeCostField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcQryOptionInstrTradeCostField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcQryOptionInstrTradeCostField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcQryOptionInstrTradeCostField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcQryOptionInstrTradeCostField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcQryOptionInstrTradeCostField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcQryOptionInstrTradeCostField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcQryOptionInstrTradeCostField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thostmdapiJNI.CThostFtdcQryOptionInstrTradeCostField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thostmdapiJNI.CThostFtdcQryOptionInstrTradeCostField_HedgeFlag_get(swigCPtr, this);
  }

  public void setInputPrice(double value) {
    thostmdapiJNI.CThostFtdcQryOptionInstrTradeCostField_InputPrice_set(swigCPtr, this, value);
  }

  public double getInputPrice() {
    return thostmdapiJNI.CThostFtdcQryOptionInstrTradeCostField_InputPrice_get(swigCPtr, this);
  }

  public void setUnderlyingPrice(double value) {
    thostmdapiJNI.CThostFtdcQryOptionInstrTradeCostField_UnderlyingPrice_set(swigCPtr, this, value);
  }

  public double getUnderlyingPrice() {
    return thostmdapiJNI.CThostFtdcQryOptionInstrTradeCostField_UnderlyingPrice_get(swigCPtr, this);
  }

  public CThostFtdcQryOptionInstrTradeCostField() {
    this(thostmdapiJNI.new_CThostFtdcQryOptionInstrTradeCostField(), true);
  }

}
