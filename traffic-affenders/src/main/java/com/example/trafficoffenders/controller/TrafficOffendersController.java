package com.example.trafficoffenders.controller;

import com.example.trafficoffenders.bean.VehicleList;
import com.example.trafficoffenders.model.VehicleDetails;
import com.example.trafficoffenders.service.GetTrafficOffenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrafficOffendersController {

    @Autowired
    private GetTrafficOffenderService getTrafficOffenderService;

    @PostMapping("/vehicleList")
    @ResponseBody
    public List<VehicleDetails> searchOffenders(@RequestBody VehicleList vehicleList){
        System.out.println(vehicleList.toString());
        return getTrafficOffenderService.getTrafficOffenders(vehicleList);
    }
}
