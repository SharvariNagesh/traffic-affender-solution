package com.example.policenotification.policenotification.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.*;

@Entity
public class RegistrationModel {
    @Id
    @GeneratedValue
    private long id;
    private String beanId;
    private String phoneNo;

    public RegistrationModel(long id, String beanId, String phoneNo) {
        this.id = id;
        this.beanId = beanId;
        this.phoneNo = phoneNo;
    }

    public RegistrationModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBeanId() {
        return beanId;
    }

    public void setBeanId(String beanId) {
        this.beanId = beanId;
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
                ", beanId='" + beanId + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
