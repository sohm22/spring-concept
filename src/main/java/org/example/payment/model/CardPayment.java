package org.example.payment.model;

import org.springframework.stereotype.Component;

@Component("cardPayment")
public class CardPayment implements PaymentType {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing card payment of amount: " + amount);
    }
}
