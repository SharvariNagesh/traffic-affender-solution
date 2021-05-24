package com.example.policenotification.policenotification.bean;

import javax.validation.constraints.Pattern;


public class RegistrationRequest {
    String beakenId;

    @Pattern(regexp="(^[0-9]{10}$)", message ="Invalid Phone number. Please Enter 10 digit phone no")
    String phoneNo;

    public RegistrationRequest() {
    }

    public RegistrationRequest(String beakenId, String phoneNo) {
        this.beakenId = beakenId;
        this.phoneNo = phoneNo;
    }

    public String getBeakenId() {
        return beakenId;
    }

    public void setBeakenId(String beakenId) {
        this.beakenId = beakenId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "RegistrationRequest{" +
                "beanId='" + beakenId + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
