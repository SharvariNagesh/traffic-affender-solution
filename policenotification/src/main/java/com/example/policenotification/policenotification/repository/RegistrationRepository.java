package com.example.policenotification.policenotification.repository;

import com.example.policenotification.policenotification.model.RegistrationModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RegistrationRepository extends JpaRepository<RegistrationModel,Integer> {
    public void deleteByBeakenId(String beakenId);

    public boolean existsByBeakenId(String beakenId);

}
