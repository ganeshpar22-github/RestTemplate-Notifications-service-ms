package com.msdemo.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NotificationServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceMsApplication.class, args);
	}

}
