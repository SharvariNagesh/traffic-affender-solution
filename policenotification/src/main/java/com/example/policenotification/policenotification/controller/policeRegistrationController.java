package com.example.policenotification.policenotification.controller;

import com.example.policenotification.policenotification.bean.RegistrationRequest;
import com.example.policenotification.policenotification.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class policeRegistrationController {

    @Autowired
    RegistrationService registrationService;

    @PostMapping("/police-register")
    public String policeRegisterForNotification(@Valid RegistrationRequest registrationRequest){

        return registrationService.registerPolice(registrationRequest);
    }
}
