package com.example.demo.admin.user.model;

import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
@Mapper
public class UserLogin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.user_id
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.user_login_id
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String userLoginId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.account_type
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String accountType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.current_password
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String currentPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.password_hint
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private Integer passwordHint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.password_require_change
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String passwordRequireChange;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.user_name
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.last_name
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String lastName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.first_name
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String firstName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.is_internal
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String isInternal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.email
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.mobile
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.mobile_country_code
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String mobileCountryCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.user_type
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String userType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.has_logged_out
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String hasLoggedOut;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.last_locale
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String lastLocale;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.last_time_zone
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String lastTimeZone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.current_status
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String currentStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.disabled_time
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private Date disabledTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.disabled_by
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String disabledBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.created_time
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.created_user_login_id
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String createdUserLoginId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.last_updated_time
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private Date lastUpdatedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mx_user_login.last_updated_user_login_id
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    private String lastUpdatedUserLoginId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.user_id
     *
     * @return the value of mx_user_login.user_id
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.user_id
     *
     * @param userId the value for mx_user_login.user_id
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.user_login_id
     *
     * @return the value of mx_user_login.user_login_id
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getUserLoginId() {
        return userLoginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.user_login_id
     *
     * @param userLoginId the value for mx_user_login.user_login_id
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId == null ? null : userLoginId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.account_type
     *
     * @return the value of mx_user_login.account_type
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.account_type
     *
     * @param accountType the value for mx_user_login.account_type
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.current_password
     *
     * @return the value of mx_user_login.current_password
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getCurrentPassword() {
        return currentPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.current_password
     *
     * @param currentPassword the value for mx_user_login.current_password
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword == null ? null : currentPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.password_hint
     *
     * @return the value of mx_user_login.password_hint
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public Integer getPasswordHint() {
        return passwordHint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.password_hint
     *
     * @param passwordHint the value for mx_user_login.password_hint
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setPasswordHint(Integer passwordHint) {
        this.passwordHint = passwordHint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.password_require_change
     *
     * @return the value of mx_user_login.password_require_change
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getPasswordRequireChange() {
        return passwordRequireChange;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.password_require_change
     *
     * @param passwordRequireChange the value for mx_user_login.password_require_change
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setPasswordRequireChange(String passwordRequireChange) {
        this.passwordRequireChange = passwordRequireChange == null ? null : passwordRequireChange.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.user_name
     *
     * @return the value of mx_user_login.user_name
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.user_name
     *
     * @param userName the value for mx_user_login.user_name
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.last_name
     *
     * @return the value of mx_user_login.last_name
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.last_name
     *
     * @param lastName the value for mx_user_login.last_name
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.first_name
     *
     * @return the value of mx_user_login.first_name
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.first_name
     *
     * @param firstName the value for mx_user_login.first_name
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.is_internal
     *
     * @return the value of mx_user_login.is_internal
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getIsInternal() {
        return isInternal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.is_internal
     *
     * @param isInternal the value for mx_user_login.is_internal
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setIsInternal(String isInternal) {
        this.isInternal = isInternal == null ? null : isInternal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.email
     *
     * @return the value of mx_user_login.email
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.email
     *
     * @param email the value for mx_user_login.email
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.mobile
     *
     * @return the value of mx_user_login.mobile
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.mobile
     *
     * @param mobile the value for mx_user_login.mobile
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.mobile_country_code
     *
     * @return the value of mx_user_login.mobile_country_code
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getMobileCountryCode() {
        return mobileCountryCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.mobile_country_code
     *
     * @param mobileCountryCode the value for mx_user_login.mobile_country_code
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode == null ? null : mobileCountryCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.user_type
     *
     * @return the value of mx_user_login.user_type
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.user_type
     *
     * @param userType the value for mx_user_login.user_type
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.has_logged_out
     *
     * @return the value of mx_user_login.has_logged_out
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getHasLoggedOut() {
        return hasLoggedOut;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.has_logged_out
     *
     * @param hasLoggedOut the value for mx_user_login.has_logged_out
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setHasLoggedOut(String hasLoggedOut) {
        this.hasLoggedOut = hasLoggedOut == null ? null : hasLoggedOut.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.last_locale
     *
     * @return the value of mx_user_login.last_locale
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getLastLocale() {
        return lastLocale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.last_locale
     *
     * @param lastLocale the value for mx_user_login.last_locale
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setLastLocale(String lastLocale) {
        this.lastLocale = lastLocale == null ? null : lastLocale.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.last_time_zone
     *
     * @return the value of mx_user_login.last_time_zone
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getLastTimeZone() {
        return lastTimeZone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.last_time_zone
     *
     * @param lastTimeZone the value for mx_user_login.last_time_zone
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setLastTimeZone(String lastTimeZone) {
        this.lastTimeZone = lastTimeZone == null ? null : lastTimeZone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.current_status
     *
     * @return the value of mx_user_login.current_status
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.current_status
     *
     * @param currentStatus the value for mx_user_login.current_status
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus == null ? null : currentStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.disabled_time
     *
     * @return the value of mx_user_login.disabled_time
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public Date getDisabledTime() {
        return disabledTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.disabled_time
     *
     * @param disabledTime the value for mx_user_login.disabled_time
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setDisabledTime(Date disabledTime) {
        this.disabledTime = disabledTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.disabled_by
     *
     * @return the value of mx_user_login.disabled_by
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getDisabledBy() {
        return disabledBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.disabled_by
     *
     * @param disabledBy the value for mx_user_login.disabled_by
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setDisabledBy(String disabledBy) {
        this.disabledBy = disabledBy == null ? null : disabledBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.created_time
     *
     * @return the value of mx_user_login.created_time
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.created_time
     *
     * @param createdTime the value for mx_user_login.created_time
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.created_user_login_id
     *
     * @return the value of mx_user_login.created_user_login_id
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getCreatedUserLoginId() {
        return createdUserLoginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.created_user_login_id
     *
     * @param createdUserLoginId the value for mx_user_login.created_user_login_id
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setCreatedUserLoginId(String createdUserLoginId) {
        this.createdUserLoginId = createdUserLoginId == null ? null : createdUserLoginId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.last_updated_time
     *
     * @return the value of mx_user_login.last_updated_time
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.last_updated_time
     *
     * @param lastUpdatedTime the value for mx_user_login.last_updated_time
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mx_user_login.last_updated_user_login_id
     *
     * @return the value of mx_user_login.last_updated_user_login_id
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public String getLastUpdatedUserLoginId() {
        return lastUpdatedUserLoginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mx_user_login.last_updated_user_login_id
     *
     * @param lastUpdatedUserLoginId the value for mx_user_login.last_updated_user_login_id
     *
     * @mbggenerated Thu May 07 10:59:56 CST 2020
     */
    public void setLastUpdatedUserLoginId(String lastUpdatedUserLoginId) {
        this.lastUpdatedUserLoginId = lastUpdatedUserLoginId == null ? null : lastUpdatedUserLoginId.trim();
    }
}