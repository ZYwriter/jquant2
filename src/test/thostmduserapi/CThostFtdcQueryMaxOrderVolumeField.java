/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQueryMaxOrderVolumeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQueryMaxOrderVolumeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQueryMaxOrderVolumeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcQueryMaxOrderVolumeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeField_InstrumentID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeField_Direction_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeField_HedgeFlag_get(swigCPtr, this);
  }

  public void setMaxVolume(int value) {
    thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeField_MaxVolume_set(swigCPtr, this, value);
  }

  public int getMaxVolume() {
    return thostmdapiJNI.CThostFtdcQueryMaxOrderVolumeField_MaxVolume_get(swigCPtr, this);
  }

  public CThostFtdcQueryMaxOrderVolumeField() {
    this(thostmdapiJNI.new_CThostFtdcQueryMaxOrderVolumeField(), true);
  }

}
