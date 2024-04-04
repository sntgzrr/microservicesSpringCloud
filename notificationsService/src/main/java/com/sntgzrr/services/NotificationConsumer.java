package com.sntgzrr.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {
    Logger logger = LoggerFactory.getLogger(NotificationConsumer.class);
    @RabbitListener(queues = "sendNotification")
    public void consume(String message){
        logger.info("Recibiendo mensaje del tópico sendNotification: "+ message);
    }
}
