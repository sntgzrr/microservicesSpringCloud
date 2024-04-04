package com.sntgzrr.services;

import com.sntgzrr.client.PaymentClient;
import com.sntgzrr.models.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PublishNotificationImpl publishNotification;
    @Autowired
    private PaymentClient paymentClient;

    public void createPayment(Payment payment){
        // Create payment
        paymentClient.createPayment(payment);
        publishNotification.sendMessageToTopic(payment.getClientId());
    }
}
