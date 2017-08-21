/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcSyncingInvestorField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcSyncingInvestorField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingInvestorField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcSyncingInvestorField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcSyncingInvestorField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcSyncingInvestorField_InvestorID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcSyncingInvestorField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcSyncingInvestorField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorGroupID(String value) {
    thostmdapiJNI.CThostFtdcSyncingInvestorField_InvestorGroupID_set(swigCPtr, this, value);
  }

  public String getInvestorGroupID() {
    return thostmdapiJNI.CThostFtdcSyncingInvestorField_InvestorGroupID_get(swigCPtr, this);
  }

  public void setInvestorName(String value) {
    thostmdapiJNI.CThostFtdcSyncingInvestorField_InvestorName_set(swigCPtr, this, value);
  }

  public String getInvestorName() {
    return thostmdapiJNI.CThostFtdcSyncingInvestorField_InvestorName_get(swigCPtr, this);
  }

  public void setIdentifiedCardType(char value) {
    thostmdapiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardType_set(swigCPtr, this, value);
  }

  public char getIdentifiedCardType() {
    return thostmdapiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thostmdapiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thostmdapiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    thostmdapiJNI.CThostFtdcSyncingInvestorField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return thostmdapiJNI.CThostFtdcSyncingInvestorField_IsActive_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    thostmdapiJNI.CThostFtdcSyncingInvestorField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return thostmdapiJNI.CThostFtdcSyncingInvestorField_Telephone_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    thostmdapiJNI.CThostFtdcSyncingInvestorField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return thostmdapiJNI.CThostFtdcSyncingInvestorField_Address_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    thostmdapiJNI.CThostFtdcSyncingInvestorField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return thostmdapiJNI.CThostFtdcSyncingInvestorField_OpenDate_get(swigCPtr, this);
  }

  public void setMobile(String value) {
    thostmdapiJNI.CThostFtdcSyncingInvestorField_Mobile_set(swigCPtr, this, value);
  }

  public String getMobile() {
    return thostmdapiJNI.CThostFtdcSyncingInvestorField_Mobile_get(swigCPtr, this);
  }

  public void setCommModelID(String value) {
    thostmdapiJNI.CThostFtdcSyncingInvestorField_CommModelID_set(swigCPtr, this, value);
  }

  public String getCommModelID() {
    return thostmdapiJNI.CThostFtdcSyncingInvestorField_CommModelID_get(swigCPtr, this);
  }

  public void setMarginModelID(String value) {
    thostmdapiJNI.CThostFtdcSyncingInvestorField_MarginModelID_set(swigCPtr, this, value);
  }

  public String getMarginModelID() {
    return thostmdapiJNI.CThostFtdcSyncingInvestorField_MarginModelID_get(swigCPtr, this);
  }

  public CThostFtdcSyncingInvestorField() {
    this(thostmdapiJNI.new_CThostFtdcSyncingInvestorField(), true);
  }

}
