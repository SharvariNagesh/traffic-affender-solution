package com.example.policenotification.policenotification.model;

import javax.persistence.*;

@Entity
public class RegistrationModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String beakenId;
    private String phoneNo;

    public RegistrationModel(long id, String beakenId, String phoneNo) {
        this.id = id;
        this.beakenId = beakenId;
        this.phoneNo = phoneNo;
    }

    public RegistrationModel() {
    }

    public RegistrationModel(String beakenId, String phoneNo) {
        this.beakenId = beakenId;
        this.phoneNo = phoneNo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return "RegistrationModel{" +
                "id=" + id +
                ", beanId='" + beakenId + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
