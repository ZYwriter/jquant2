/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcDepositResultInformField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcDepositResultInformField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcDepositResultInformField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcDepositResultInformField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDepositSeqNo(String value) {
    thostmdapiJNI.CThostFtdcDepositResultInformField_DepositSeqNo_set(swigCPtr, this, value);
  }

  public String getDepositSeqNo() {
    return thostmdapiJNI.CThostFtdcDepositResultInformField_DepositSeqNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcDepositResultInformField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcDepositResultInformField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcDepositResultInformField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcDepositResultInformField_InvestorID_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    thostmdapiJNI.CThostFtdcDepositResultInformField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return thostmdapiJNI.CThostFtdcDepositResultInformField_Deposit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmdapiJNI.CThostFtdcDepositResultInformField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmdapiJNI.CThostFtdcDepositResultInformField_RequestID_get(swigCPtr, this);
  }

  public void setReturnCode(String value) {
    thostmdapiJNI.CThostFtdcDepositResultInformField_ReturnCode_set(swigCPtr, this, value);
  }

  public String getReturnCode() {
    return thostmdapiJNI.CThostFtdcDepositResultInformField_ReturnCode_get(swigCPtr, this);
  }

  public void setDescrInfoForReturnCode(String value) {
    thostmdapiJNI.CThostFtdcDepositResultInformField_DescrInfoForReturnCode_set(swigCPtr, this, value);
  }

  public String getDescrInfoForReturnCode() {
    return thostmdapiJNI.CThostFtdcDepositResultInformField_DescrInfoForReturnCode_get(swigCPtr, this);
  }

  public CThostFtdcDepositResultInformField() {
    this(thostmdapiJNI.new_CThostFtdcDepositResultInformField(), true);
  }

}
