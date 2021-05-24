package com.example.trafficaffenders.proxy;

import com.example.trafficaffenders.bean.PoliceNotification;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="police-notification",url="localhost:8081")
public interface PoliceNotificationProxy {

    @PostMapping("/police-notify")
    public String sendPoliceNotification(PoliceNotification policeNotification);
}
