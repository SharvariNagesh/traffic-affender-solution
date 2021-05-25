package com.example.trafficaffenders.proxy;

import com.example.trafficaffenders.bean.PoliceNotification;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name="police-notification",url="localhost:8081")
public interface PoliceNotificationProxy {

    @PostMapping(value = "/police-notify", consumes = "application/json")
    public String sendPoliceNotification(@RequestBody PoliceNotification policeNotification);
}
