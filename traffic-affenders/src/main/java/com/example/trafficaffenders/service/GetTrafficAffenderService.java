package com.example.trafficaffenders.service;

import com.example.trafficaffenders.bean.VehicleList;
import com.example.trafficaffenders.model.VehicleDetails;

import java.util.Collection;
import java.util.List;

public interface GetTrafficAffenderService {
    public List<VehicleDetails> getTrafficAffenders(VehicleList vehicleList);
}
