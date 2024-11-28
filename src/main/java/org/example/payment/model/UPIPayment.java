package org.example.payment.model;

import org.springframework.stereotype.Component;

@Component("upiPayment")
public class UPIPayment implements PaymentType {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of amount: " + amount);
    }
}
