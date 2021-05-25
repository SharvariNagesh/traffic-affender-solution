package com.example.trafficoffenders.bean;

public class PoliceNotification {
    private String beakenId;
    private String messageTobeSent;


    public PoliceNotification() {
    }

    public PoliceNotification(String beakenId, String messageTobeSent) {
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
                ", messageTobeSent=" + messageTobeSent +
                '}';
    }
}
