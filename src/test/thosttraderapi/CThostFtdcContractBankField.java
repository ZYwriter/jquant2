/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcContractBankField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcContractBankField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcContractBankField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcContractBankField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcContractBankField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcContractBankField_BrokerID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thosttradeapiJNI.CThostFtdcContractBankField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thosttradeapiJNI.CThostFtdcContractBankField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    thosttradeapiJNI.CThostFtdcContractBankField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return thosttradeapiJNI.CThostFtdcContractBankField_BankBrchID_get(swigCPtr, this);
  }

  public void setBankName(String value) {
    thosttradeapiJNI.CThostFtdcContractBankField_BankName_set(swigCPtr, this, value);
  }

  public String getBankName() {
    return thosttradeapiJNI.CThostFtdcContractBankField_BankName_get(swigCPtr, this);
  }

  public CThostFtdcContractBankField() {
    this(thosttradeapiJNI.new_CThostFtdcContractBankField(), true);
  }

}
