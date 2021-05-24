package com.example.trafficaffenders.bean;

import java.util.List;

public class PoliceNotification {
    private String beakenId;
    private String cameraId;
    private List<String> listOfVehicles;

    public PoliceNotification() {
    }

    public PoliceNotification(String beakenId, String cameraId, List<String> listOfVehicles) {
        this.beakenId = beakenId;
        this.cameraId = cameraId;
        this.listOfVehicles = listOfVehicles;
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
        return listOfVehicles;
    }

    public void setListOfVehicles(List<String> listOfCars) {
        this.listOfVehicles = listOfCars;
    }

    @Override
    public String toString() {
        return "NotificationDetails{" +
                "beakenId='" + beakenId + '\'' +
                ", cameraId='" + cameraId + '\'' +
                ", listOfVehicles=" + listOfVehicles +
                '}';
    }
}
