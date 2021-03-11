package com.example.awssnslistener.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.config.annotation.NotificationMessage;
import org.springframework.cloud.aws.messaging.config.annotation.NotificationSubject;
import org.springframework.cloud.aws.messaging.endpoint.NotificationStatus;
import org.springframework.cloud.aws.messaging.endpoint.annotation.NotificationMessageMapping;
import org.springframework.cloud.aws.messaging.endpoint.annotation.NotificationSubscriptionMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/endpoint")
public class SnsController {

    @NotificationMessageMapping
    public void receiveNotification(@NotificationMessage String message,
                                    @NotificationSubject String subject) {

        log.info(String.format("message : %s \nsubject : %s",message,subject));
    }

    @NotificationSubscriptionMapping
    public void confirmSubscription(NotificationStatus notificationStatus) {
        log.info("subscription confirming...");
        notificationStatus.confirmSubscription();
        log.info("subscription confirmed!");
    }

}
