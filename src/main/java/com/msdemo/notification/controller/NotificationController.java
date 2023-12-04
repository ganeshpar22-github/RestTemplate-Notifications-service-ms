package com.msdemo.notification.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msdemo.notification.model.Notifications;

@RestController
@RequestMapping("/notification")
public class NotificationController {
	
	@GetMapping(value="/{notificationId}")
	public Notifications getNotifications(@PathVariable("notificationId") String notificationId) {
		
		Notifications notificationsOne = new Notifications(notificationId, "This is notification for" + notificationId);
		return notificationsOne;
	}

}
