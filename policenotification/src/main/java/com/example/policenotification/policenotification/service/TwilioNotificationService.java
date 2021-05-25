package com.example.policenotification.policenotification.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Service;

@Service
public class TwilioNotificationService {

    private static final String ACCOUNT_SID = "ACd9a7551434c70ca6f898d1c5bd68dbcc";
    private static final String AUTH_TOKEN = "7109a77b9a2b55fab17c66a856061f8f";
    private static final String COUNTRY_CODE = "+91";

    public String sendSNSNotification(String phoneNo, String message){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        System.out.println("Twilio Message is being sent to the no:" + COUNTRY_CODE + phoneNo);
        try {
            Message twilioMessage = Message.creator(new PhoneNumber(COUNTRY_CODE + phoneNo),
                    new PhoneNumber("+18573239279"),
                    message).create();

            System.out.println(twilioMessage.getSid());
        }catch (Exception e){
            System.out.println("Sending message through Twilio failed! "+ e.getMessage());
            return "Sending message through Twilio failed! "+ e.getMessage();
        }
        return "Success";
    }


}
