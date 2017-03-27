package com.realestate.model;

import java.util.List;

/**
 * Created by omererkan on 3/24/17.
 */
public class CorpUser {
    private String name;
    private String middleName;
    private String surname;
    private String password;
    private String username;
    private String country;
    private String city;
    private String postalCode;
    private String emailAddress;
    private String phoneInitiCode;
    private String phoneAreaCode;
    private String phoneNumber;
    private String mobilInitiCode;
    private String mobilAreaCode;
    private String mobilNumber;
    private List<String> workinArea;
    private String operationType;
    private String commertialTitel;
    // private Set<Role> roles;
    private String passwordConfirm;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneInitiCode() {
        return phoneInitiCode;
    }

    public void setPhoneInitiCode(String phoneInitiCode) {
        this.phoneInitiCode = phoneInitiCode;
    }

    public String getPhoneAreaCode() {
        return phoneAreaCode;
    }

    public void setPhoneAreaCode(String phoneAreaCode) {
        this.phoneAreaCode = phoneAreaCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMobilInitiCode() {
        return mobilInitiCode;
    }

    public void setMobilInitiCode(String mobilInitiCode) {
        this.mobilInitiCode = mobilInitiCode;
    }

    public String getMobilAreaCode() {
        return mobilAreaCode;
    }

    public void setMobilAreaCode(String mobilAreaCode) {
        this.mobilAreaCode = mobilAreaCode;
    }

    public String getMobilNumber() {
        return mobilNumber;
    }

    public void setMobilNumber(String mobilNumber) {
        this.mobilNumber = mobilNumber;
    }

    public List<String> getWorkinArea() {
        return workinArea;
    }

    public void setWorkinArea(List<String> workinArea) {
        this.workinArea = workinArea;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getCommertialTitel() {
        return commertialTitel;
    }

    public void setCommertialTitel(String commertialTitel) {
        this.commertialTitel = commertialTitel;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
}
