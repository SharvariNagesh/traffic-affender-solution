package com.example.trafficoffenders.service;

import com.example.trafficoffenders.bean.VehicleList;
import com.example.trafficoffenders.model.VehicleDetails;
import com.example.trafficoffenders.repository.GetOffendersRepo;
//import com.example.trafficaffenders.service.GetTrafficOffenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GetTrafficOffenderService {

    @Autowired
    private GetOffendersRepo getOffendersRepo;

    @Autowired
    private PoliceNotificationService policeNotificationService;

    public List<VehicleDetails> getTrafficOffenders(VehicleList vehicleList){
        Optional<List<VehicleDetails>> vehicleDetails =  getOffendersRepo.findAllOffenders(vehicleList.getVehicleNos());

        if (vehicleDetails.isPresent()){
            String notificationResponse =
                    policeNotificationService.sendPoliceNotification(vehicleDetails.get(),vehicleList);
            System.out.println("Police Notification Response:" + notificationResponse);
            return vehicleDetails.get();
        }
        return new ArrayList<VehicleDetails>() ;
    }
}
