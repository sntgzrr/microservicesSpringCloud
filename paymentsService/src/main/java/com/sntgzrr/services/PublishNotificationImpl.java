package com.sntgzrr.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublishNotificationImpl {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    public void sendMessageToTopic(String message){
        rabbitTemplate.convertAndSend("sendNotification", message);
    }
}
