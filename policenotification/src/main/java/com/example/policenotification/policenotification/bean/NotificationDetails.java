package com.example.policenotification.policenotification.bean;

import java.util.Date;
import java.util.List;


public class NotificationDetails {

    private String beakenId;
    private String cameraId;
    private List<String> listOfCars;

    public NotificationDetails() {
    }

    public NotificationDetails(String beakenId, String cameraId, List<String> listOfCars) {
        this.beakenId = beakenId;
        this.cameraId = cameraId;
        this.listOfCars = listOfCars;
    }

    public String getBeakenId() {
        return beakenId;
    }

    public void setBeakenId(String beakenId) {
        this.beakenId = beakenId;
    }

    public String getCameraId() {
        return cameraId;
    }

    public void setCameraId(String cameraId) {
        this.cameraId = cameraId;
    }

    public List<String> getListOfCars() {
        return listOfCars;
    }

    public void setListOfCars(List<String> listOfCars) {
        this.listOfCars = listOfCars;
    }

    @Override
    public String toString() {
        return "NotificationDetails{" +
                "beakenId='" + beakenId + '\'' +
                ", cameraId='" + cameraId + '\'' +
                ", listOfCars=" + listOfCars +
                '}';
    }
}
