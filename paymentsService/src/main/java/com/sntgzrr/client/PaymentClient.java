package com.sntgzrr.client;

import com.sntgzrr.models.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentClient {
    public Boolean createPayment(Payment payment){
        return true;
    }
}
