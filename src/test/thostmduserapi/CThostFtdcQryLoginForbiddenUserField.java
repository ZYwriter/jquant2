/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQryLoginForbiddenUserField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryLoginForbiddenUserField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryLoginForbiddenUserField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcQryLoginForbiddenUserField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcQryLoginForbiddenUserField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcQryLoginForbiddenUserField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcQryLoginForbiddenUserField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcQryLoginForbiddenUserField_UserID_get(swigCPtr, this);
  }

  public CThostFtdcQryLoginForbiddenUserField() {
    this(thostmdapiJNI.new_CThostFtdcQryLoginForbiddenUserField(), true);
  }

}
