package com.example.policenotification.policenotification.service;

import com.example.policenotification.policenotification.bean.RegistrationRequest;
import com.example.policenotification.policenotification.model.RegistrationModel;
import com.example.policenotification.policenotification.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
@Transactional
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepositoryRepo;


    public RegistrationModel registerPolice(RegistrationRequest registrationRequest){
        if (registrationRepositoryRepo.existsByBeakenId(registrationRequest.getBeakenId())) {
            registrationRepositoryRepo.deleteByBeakenId(registrationRequest.getBeakenId());
        }
        RegistrationModel registrationModel
                = new RegistrationModel(registrationRequest.getBeakenId(),registrationRequest.getPhoneNo());
        RegistrationModel registrationModelSaved = registrationRepositoryRepo.save(registrationModel);
        return registrationModelSaved;
    }
}
