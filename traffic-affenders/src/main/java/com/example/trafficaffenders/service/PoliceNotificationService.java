package com.example.trafficaffenders.service;

import com.example.trafficaffenders.bean.PoliceNotification;
import com.example.trafficaffenders.bean.VehicleList;
import com.example.trafficaffenders.model.TrafficAffence;
import com.example.trafficaffenders.model.VehicleDetails;
import com.example.trafficaffenders.proxy.PoliceNotificationProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PoliceNotificationService {

    @Autowired
    private PoliceNotificationProxy policeNotificationProxy;

    private static final int SMS_LEN = 140;

    public String sendPoliceNotification(List<VehicleDetails> vehicleDetails, VehicleList vehicleList){
        for (VehicleDetails vehicleDetail :vehicleDetails) {
            PoliceNotification policeNotification = new PoliceNotification();
            policeNotification.setBeakenId(vehicleList.getBeakenId());
            String vehicleInfo = "CameraId:" + vehicleList.getCameraId()
                    + "; " + vehicleDetail.getVehicleNo()
                    +":"+vehicleDetail.getVehicleMake()
                    +":"+vehicleDetail.getColor()
                    +"(";

            for (TrafficAffence trafficAffence: vehicleDetail.getTrafficAffences()) {
                vehicleInfo = vehicleInfo + trafficAffence.getViolationComment()
                        +" ON: " + trafficAffence.getViolationDate()
                        + " Fine: " + trafficAffence.getPenaltyAmount();
            }
            vehicleInfo= vehicleInfo + ")";
            if(vehicleInfo.length()>=SMS_LEN ){
                vehicleInfo = vehicleInfo.substring(0,139);
            }
            policeNotification.setMessageTobeSent(vehicleInfo);
            System.out.println(policeNotification.toString());
            String response = policeNotificationProxy.sendPoliceNotification(policeNotification);
        }


        return "success";
    }
}
