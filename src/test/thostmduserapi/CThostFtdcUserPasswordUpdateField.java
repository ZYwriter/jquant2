/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcUserPasswordUpdateField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcUserPasswordUpdateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcUserPasswordUpdateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcUserPasswordUpdateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcUserPasswordUpdateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcUserPasswordUpdateField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcUserPasswordUpdateField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcUserPasswordUpdateField_UserID_get(swigCPtr, this);
  }

  public void setOldPassword(String value) {
    thostmdapiJNI.CThostFtdcUserPasswordUpdateField_OldPassword_set(swigCPtr, this, value);
  }

  public String getOldPassword() {
    return thostmdapiJNI.CThostFtdcUserPasswordUpdateField_OldPassword_get(swigCPtr, this);
  }

  public void setNewPassword(String value) {
    thostmdapiJNI.CThostFtdcUserPasswordUpdateField_NewPassword_set(swigCPtr, this, value);
  }

  public String getNewPassword() {
    return thostmdapiJNI.CThostFtdcUserPasswordUpdateField_NewPassword_get(swigCPtr, this);
  }

  public CThostFtdcUserPasswordUpdateField() {
    this(thostmdapiJNI.new_CThostFtdcUserPasswordUpdateField(), true);
  }

}
