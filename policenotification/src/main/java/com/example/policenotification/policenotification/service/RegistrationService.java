package com.example.policenotification.policenotification.service;

import com.example.policenotification.policenotification.bean.RegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public String registerPolice(RegistrationRequest registrationRequest){
        return "success";
    }
}
