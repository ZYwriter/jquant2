/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcReqCancelAccountField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcReqCancelAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqCancelAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcReqCancelAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_Password_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setCashExchangeCode(char value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_CashExchangeCode_set(swigCPtr, this, value);
  }

  public char getCashExchangeCode() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_CashExchangeCode_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_OperNo_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_TID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_UserID_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    thostmdapiJNI.CThostFtdcReqCancelAccountField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return thostmdapiJNI.CThostFtdcReqCancelAccountField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcReqCancelAccountField() {
    this(thostmdapiJNI.new_CThostFtdcReqCancelAccountField(), true);
  }

}
