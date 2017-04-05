package com.realestate.model;

/**
 * Created by omererkan on 4/5/17.
 */
public class Status {
    private String statusCode;
    private String status;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String statusName) {
        this.status= statusName;
    }
}
