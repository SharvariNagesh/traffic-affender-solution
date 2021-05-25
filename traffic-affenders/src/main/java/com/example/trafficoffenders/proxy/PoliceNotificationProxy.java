package com.example.trafficoffenders.proxy;

import com.example.trafficoffenders.bean.PoliceNotification;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="police-notification",url="localhost:8081")
public interface PoliceNotificationProxy {

    @PostMapping(value = "/police-notify", consumes = "application/json")
    public String sendPoliceNotification(@RequestBody PoliceNotification policeNotification);
}
