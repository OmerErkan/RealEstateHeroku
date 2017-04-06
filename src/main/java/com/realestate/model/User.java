package com.realestate.model;

/**
 * Created by omererkan on 3/24/17.
 */
public class User {
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

    private String name;
   private String middleName;
    private String surname;
    private String password;
    private String confirmPassword;
    private String username;
    //private Set<Role> roles;


    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
