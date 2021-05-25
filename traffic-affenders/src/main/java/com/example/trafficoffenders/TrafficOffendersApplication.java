package com.example.trafficoffenders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TrafficOffendersApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrafficOffendersApplication.class, args);
	}

}
