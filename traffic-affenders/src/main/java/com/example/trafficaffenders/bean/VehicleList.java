package com.example.trafficaffenders.bean;

import java.util.ArrayList;
import java.util.List;

public class VehicleList {
    String beakenId;
    String cameraId;
    List<String> CarNos = new ArrayList<String>();

    public VehicleList(String beakenId, String cameraId, List<String> carNos) {
        this.beakenId = beakenId;
        this.cameraId = cameraId;
        this.CarNos = carNos;
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

    public List<String> getCarNos() {
        return CarNos;
    }

    public void setCarNos(List<String> carNos) {
        CarNos = carNos;
    }

    @Override
    public String toString() {
        return "VehicleList{" +
                "beakenId='" + beakenId + '\'' +
                ", cameraId='" + cameraId + '\'' +
                ", CarNos=" + CarNos +
                '}';
    }
}
