package com.example.trafficoffenders.service;

import com.example.trafficoffenders.bean.PoliceNotification;
import com.example.trafficoffenders.bean.VehicleList;
import com.example.trafficoffenders.model.TrafficOffence;
import com.example.trafficoffenders.model.VehicleDetails;
import com.example.trafficoffenders.proxy.PoliceNotificationProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoliceNotificationService {

    @Autowired
    private PoliceNotificationProxy policeNotificationProxy;

    private static final int SMS_LEN = 140;

    public String sendPoliceNotification(List<VehicleDetails> vehicleDetails, VehicleList vehicleList){
        try {
            for (VehicleDetails vehicleDetail : vehicleDetails) {
                PoliceNotification policeNotification = new PoliceNotification();
                policeNotification.setBeakenId(vehicleList.getBeakenId());
                String vehicleInfo = "CameraId:" + vehicleList.getCameraId()
                        + "; " + vehicleDetail.getVehicleNo()
                        + ":" + vehicleDetail.getVehicleMake()
                        + ":" + vehicleDetail.getColor()
                        + "(";

                for (TrafficOffence trafficOffence : vehicleDetail.getTrafficOffences()) {
                    vehicleInfo = vehicleInfo + trafficOffence.getViolationComment()
                            + " ON: " + trafficOffence.getViolationDate()
                            + " Fine: " + trafficOffence.getPenaltyAmount();
                }
                vehicleInfo = vehicleInfo + ")";
                if (vehicleInfo.length() >= SMS_LEN) {
                    System.out.println("SMS Length longer than " + SMS_LEN + " removing excess lines");
                    vehicleInfo = vehicleInfo.substring(0, 139);
                    System.out.println("SMS Length After cropping " + vehicleInfo);

                }
                policeNotification.setMessageTobeSent(vehicleInfo);
                System.out.println(policeNotification.toString());
                String response = policeNotificationProxy.sendPoliceNotification(policeNotification);
                System.out.println("Response from Notification microservice:" + response);
                return response;

            }
        }catch (Exception e){
            System.out.println("Sending message failed!: "+ e.getMessage());
            return "Sending message failed!: "+ e.getMessage();
        }

        return "success";
    }
}
