package com.example.policenotification.policenotification.service;

import com.example.policenotification.policenotification.bean.NotificationDetails;
import com.example.policenotification.policenotification.model.RegistrationModel;
import com.example.policenotification.policenotification.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    RegistrationRepository registrationRepository;

    @Autowired
    TwilioNotificationService twilioNotificationService;

    public String sendNotification(NotificationDetails notificationDetails){
        RegistrationModel registrationModel = registrationRepository.getOneByBeakenId(notificationDetails.getBeakenId());
        if(registrationModel == null){
            System.out.println("Beaken Not registere!");
            return"Failed to send Notification : Beaken not found";
        }
        System.out.println(notificationDetails.toString());
        if(notificationDetails.getMessageTobeSent() != null) {
            System.out.println("Message to be sent:" + notificationDetails.getMessageTobeSent());
            twilioNotificationService.sendSNSNotification(registrationModel.getPhoneNo(), notificationDetails.getMessageTobeSent());
        }else{
            String errMessage= "Messagesare empty!. Message Could not be sent";
            System.out.println(errMessage);
            return errMessage;
        }
        return "Success";
    }
}
