package com.example.policenotification.policenotification.controller;

import com.example.policenotification.policenotification.bean.NotificationDetails;
import com.example.policenotification.policenotification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class policeNotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/police-notify")
    public String searchAffenders(@RequestBody @Valid NotificationDetails notificationDetails){
        System.out.println("Notification  details:" + notificationDetails.toString());
        return notificationService.sendNotification(notificationDetails);

    }
}
