package org.example.payment.service;

import org.example.payment.factory.PaymentFactory;
import org.example.payment.model.PaymentType;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentFactory paymentFactory;

    public PaymentService(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    public void processPayment(String type, double amount) {
        PaymentType paymentType = paymentFactory.getPaymentType(type);
        paymentType.processPayment(amount);
    }
}
