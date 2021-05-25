package com.example.trafficoffenders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TrafficAffendersApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrafficAffendersApplication.class, args);
	}

}
