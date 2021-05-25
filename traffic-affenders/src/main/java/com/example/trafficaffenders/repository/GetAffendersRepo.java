package com.example.trafficaffenders.repository;

import com.example.trafficaffenders.model.VehicleDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface GetAffendersRepo extends JpaRepository<VehicleDetails,Integer> {

    @Query(
            value = "SELECT * FROM VEHICLE_DETAILS  inner join TRAFFIC_AFFENCE"
            + " on vehicle_details.id = traffic_affence.vehicle_details_id"
            + " where vehicle_details.vehicle_no in ?1",
            nativeQuery = true)
    Optional<List<VehicleDetails>> findAllAffenders(List<String> carNos); //List<String> vehicleList
}
