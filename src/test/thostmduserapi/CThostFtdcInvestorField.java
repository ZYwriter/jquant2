/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcInvestorField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcInvestorField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcInvestorField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcInvestorField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcInvestorField_InvestorID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcInvestorField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcInvestorField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorGroupID(String value) {
    thostmdapiJNI.CThostFtdcInvestorField_InvestorGroupID_set(swigCPtr, this, value);
  }

  public String getInvestorGroupID() {
    return thostmdapiJNI.CThostFtdcInvestorField_InvestorGroupID_get(swigCPtr, this);
  }

  public void setInvestorName(String value) {
    thostmdapiJNI.CThostFtdcInvestorField_InvestorName_set(swigCPtr, this, value);
  }

  public String getInvestorName() {
    return thostmdapiJNI.CThostFtdcInvestorField_InvestorName_get(swigCPtr, this);
  }

  public void setIdentifiedCardType(char value) {
    thostmdapiJNI.CThostFtdcInvestorField_IdentifiedCardType_set(swigCPtr, this, value);
  }

  public char getIdentifiedCardType() {
    return thostmdapiJNI.CThostFtdcInvestorField_IdentifiedCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thostmdapiJNI.CThostFtdcInvestorField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thostmdapiJNI.CThostFtdcInvestorField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    thostmdapiJNI.CThostFtdcInvestorField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return thostmdapiJNI.CThostFtdcInvestorField_IsActive_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    thostmdapiJNI.CThostFtdcInvestorField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return thostmdapiJNI.CThostFtdcInvestorField_Telephone_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    thostmdapiJNI.CThostFtdcInvestorField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return thostmdapiJNI.CThostFtdcInvestorField_Address_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    thostmdapiJNI.CThostFtdcInvestorField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return thostmdapiJNI.CThostFtdcInvestorField_OpenDate_get(swigCPtr, this);
  }

  public void setMobile(String value) {
    thostmdapiJNI.CThostFtdcInvestorField_Mobile_set(swigCPtr, this, value);
  }

  public String getMobile() {
    return thostmdapiJNI.CThostFtdcInvestorField_Mobile_get(swigCPtr, this);
  }

  public void setCommModelID(String value) {
    thostmdapiJNI.CThostFtdcInvestorField_CommModelID_set(swigCPtr, this, value);
  }

  public String getCommModelID() {
    return thostmdapiJNI.CThostFtdcInvestorField_CommModelID_get(swigCPtr, this);
  }

  public void setMarginModelID(String value) {
    thostmdapiJNI.CThostFtdcInvestorField_MarginModelID_set(swigCPtr, this, value);
  }

  public String getMarginModelID() {
    return thostmdapiJNI.CThostFtdcInvestorField_MarginModelID_get(swigCPtr, this);
  }

  public CThostFtdcInvestorField() {
    this(thostmdapiJNI.new_CThostFtdcInvestorField(), true);
  }

}
