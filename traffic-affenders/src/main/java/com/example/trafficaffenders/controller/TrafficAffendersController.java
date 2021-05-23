package com.example.trafficaffenders.controller;

import com.example.trafficaffenders.bean.VehicleList;
import com.example.trafficaffenders.model.VehicleDetails;
import com.example.trafficaffenders.service.impl.GetTrafficAffenderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class TrafficAffendersController {

    @Autowired
    private GetTrafficAffenderServiceImpl getTrafficAffenderService;

    @PostMapping("/vehicleList")
    @ResponseBody
    public List<VehicleDetails> searchAffenders(VehicleList vehicleList){
        System.out.println(vehicleList.toString());
        for (String vehicle:vehicleList.getCarNos()) {
            System.out.println(vehicle);
        }
        return getTrafficAffenderService.getTrafficAffenders(vehicleList);
    }
}
