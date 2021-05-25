package com.example.policenotification.policenotification.bean;

import javax.validation.constraints.NotNull;


public class NotificationDetails {

    @NotNull
    private String beakenId;
    private String messageTobeSent;


    public NotificationDetails() {
    }

    public NotificationDetails(String beakenId, String cameraId, String messageTobeSent) {
        this.beakenId = beakenId;
        this.messageTobeSent = messageTobeSent;

    }

    public String getBeakenId() {
        return beakenId;
    }

    public void setBeakenId(String beakenId) {
        this.beakenId = beakenId;
    }

    public String getMessageTobeSent() {
        return messageTobeSent;
    }

    public void setMessageTobeSent(String messageTobeSent) {
        this.messageTobeSent = messageTobeSent;
    }

    @Override
    public String toString() {
        return "NotificationDetails{" +
                "beakenId='" + beakenId + '\'' +
                ", MessageTobeSent=" + messageTobeSent +
                '}';
    }
}
