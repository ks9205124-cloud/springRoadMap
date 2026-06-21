package com.shaurya.spring.ch10springbootrestservices.Controller;

import com.shaurya.spring.ch10springbootrestservices.Model.PaymentDetails;
import com.shaurya.spring.ch10springbootrestservices.NotEnoughMoneyException;
import com.shaurya.spring.ch10springbootrestservices.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentService paymentService;
    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @PostMapping("/payment")
    public ResponseEntity<?> makePayment(){
        try {
            PaymentDetails paymentDetails = paymentService.processPayment();
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);
        }catch (NotEnoughMoneyException e){
            System.out.println("Not enough money");
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
}
