package com.shaurya.spring.ch10springbootrestservices.Service;

import com.shaurya.spring.ch10springbootrestservices.Model.PaymentDetails;
import com.shaurya.spring.ch10springbootrestservices.NotEnoughMoneyException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
