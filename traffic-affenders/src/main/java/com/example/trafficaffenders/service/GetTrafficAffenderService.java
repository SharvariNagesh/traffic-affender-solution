package com.example.trafficaffenders.service;

import com.example.trafficaffenders.bean.VehicleList;
import com.example.trafficaffenders.model.VehicleDetails;
import com.example.trafficaffenders.repository.GetAffenders;
//import com.example.trafficaffenders.service.GetTrafficAffenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GetTrafficAffenderService {

    @Autowired
    private GetAffenders getAffenders;

    @Autowired
    private PoliceNotificationService policeNotificationService;

    public List<VehicleDetails> getTrafficAffenders(VehicleList vehicleList){
        Optional<List<VehicleDetails>> vehicleDetails =  getAffenders.findAllAffenders(vehicleList.getVehicleNos());

        if (vehicleDetails.isPresent()){
            String notificationResponse =
                    policeNotificationService.sendPoliceNotification(vehicleDetails.get(),vehicleList);
            System.out.println("Police Notification Response:" + notificationResponse);
            return vehicleDetails.get();
        }
        return new ArrayList<VehicleDetails>() ;
    }
}
