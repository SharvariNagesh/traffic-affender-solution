package com.example.trafficaffenders.service.impl;

import com.example.trafficaffenders.bean.VehicleList;
import com.example.trafficaffenders.model.VehicleDetails;
import com.example.trafficaffenders.repository.GetAffenders;
//import com.example.trafficaffenders.service.GetTrafficAffenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class GetTrafficAffenderServiceImpl  {

    @Autowired
    private GetAffenders getAffenders;

    public List<VehicleDetails> getTrafficAffenders(VehicleList vehicleList){
        Optional<List<VehicleDetails>> vehicleDetails =  getAffenders.findAllAffenders(vehicleList.getCarNos());
      //  System.out.println(vehicleDetails);
        if (vehicleDetails.isPresent()){
            return vehicleDetails.get();
        }
        return new ArrayList<VehicleDetails>() ;
    }
}
