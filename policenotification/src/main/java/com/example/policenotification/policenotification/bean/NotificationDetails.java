package com.example.policenotification.policenotification.bean;

import javax.validation.constraints.NotNull;
import java.util.List;


public class NotificationDetails {

    @NotNull
    private String beakenId;
    private String cameraId;
    private List<String> listOfVehicles;

    public NotificationDetails() {
    }

    public NotificationDetails(String beakenId, String cameraId, List<String> listOfVehicles) {
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

    public List<String> getListOfVehicles() {
        return listOfVehicles;
    }

    public void setListOfVehicles(List<String> listOfVehicles) {
        this.listOfVehicles = listOfVehicles;
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
