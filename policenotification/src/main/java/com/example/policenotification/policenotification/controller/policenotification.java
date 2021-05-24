package com.example.policenotification.policenotification.controller;

import com.example.policenotification.policenotification.bean.NotificationDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class policenotification {

    @PostMapping("/police-notify")
    public String searchAffenders(NotificationDetails notificationDetails){
        System.out.println(notificationDetails.toString());

        return "success";
    }
}
