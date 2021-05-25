package com.example.trafficoffenders.repository;

import com.example.trafficoffenders.model.VehicleDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface GetOffendersRepo extends JpaRepository<VehicleDetails,Integer> {

    @Query(
            value = "SELECT * FROM VEHICLE_DETAILS  inner join TRAFFIC_OFFENCE"
            + " on vehicle_details.id = traffic_offence.vehicle_details_id"
            + " where vehicle_details.vehicle_no in ?1",
            nativeQuery = true)
    Optional<List<VehicleDetails>> findAllOffenders(List<String> vehicleNos); //List<String> vehicleList
}
