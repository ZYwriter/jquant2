/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcReqChangeAccountField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcReqChangeAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqChangeAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcReqChangeAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setNewBankAccount(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_NewBankAccount_set(swigCPtr, this, value);
  }

  public String getNewBankAccount() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_NewBankAccount_get(swigCPtr, this);
  }

  public void setNewBankPassWord(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_NewBankPassWord_set(swigCPtr, this, value);
  }

  public String getNewBankPassWord() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_NewBankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_Password_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_TID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_Digest_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    thostmdapiJNI.CThostFtdcReqChangeAccountField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return thostmdapiJNI.CThostFtdcReqChangeAccountField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcReqChangeAccountField() {
    this(thostmdapiJNI.new_CThostFtdcReqChangeAccountField(), true);
  }

}
