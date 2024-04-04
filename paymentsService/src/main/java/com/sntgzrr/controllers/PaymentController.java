package com.sntgzrr.controllers;

import com.netflix.discovery.converters.Auto;
import com.sntgzrr.models.Payment;
import com.sntgzrr.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @PostMapping()
    public void createPayment(@RequestBody Payment payment){
        paymentService.createPayment(payment);
    }
}
