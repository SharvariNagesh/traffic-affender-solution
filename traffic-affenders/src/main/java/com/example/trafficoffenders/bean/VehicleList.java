package com.example.trafficoffenders.bean;

import java.util.List;

public class VehicleList {
    String beakenId;
    String cameraId;
    List<String> vehicleNos;

    public VehicleList(String beakenId, String cameraId, List<String> vehicleNos) {
        this.beakenId = beakenId;
        this.cameraId = cameraId;
        this.vehicleNos = vehicleNos;
    }

    public VehicleList() {
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

    public List<String> getVehicleNos() {
        return vehicleNos;
    }

    public void setVehicleNos(List<String> vehicleNos) {
        this.vehicleNos = vehicleNos;
    }

    @Override
    public String toString() {
        return "VehicleList{" +
                "beakenId='" + beakenId + '\'' +
                ", cameraId='" + cameraId + '\'' +
                ", vehicleNos=" + vehicleNos +
                '}';
    }
}
