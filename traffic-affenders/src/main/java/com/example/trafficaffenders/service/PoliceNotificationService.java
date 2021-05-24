package com.example.trafficaffenders.service;

import com.example.trafficaffenders.bean.PoliceNotification;
import com.example.trafficaffenders.bean.VehicleList;
import com.example.trafficaffenders.model.VehicleDetails;
import com.example.trafficaffenders.proxy.PoliceNotificationProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PoliceNotificationService {

    @Autowired
    PoliceNotificationProxy policeNotificationProxy;

    public String sendPoliceNotification(List<VehicleDetails> vehicleDetails, VehicleList vehicleList){
        PoliceNotification policeNotification = new PoliceNotification();
        policeNotification.setBeakenId(vehicleList.getBeakenId());
        policeNotification.setCameraId(vehicleList.getCameraId());
        List<String> vehicleDetailsForNotification = new ArrayList<>();
        for (VehicleDetails vehicleDetail :vehicleDetails) {
            String vehicleInfo = vehicleDetail.getVehicleNo() +":"+vehicleDetail.getVehicleMake() +":"+vehicleDetail.getColor();
            vehicleDetailsForNotification.add(vehicleInfo);
        }
        policeNotification.setListOfVehicles(vehicleDetailsForNotification);
        String response = policeNotificationProxy.sendPoliceNotification(policeNotification);
        return response;
    }
}
