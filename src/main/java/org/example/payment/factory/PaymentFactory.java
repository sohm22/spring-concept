package org.example.payment.factory;

import org.example.payment.model.PaymentType;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PaymentFactory {

    private final Map<String, PaymentType> paymentTypeMap;

    /**
     * Spring automatically injects all beans implementing PaymentType
     * into the Map<String, PaymentType> when you use the constructor-based injection.
     * The key in the map will be the name of the bean (cardPayment, upiPayment, etc.).
     */
    public PaymentFactory(Map<String, PaymentType> paymentTypeMap) {
        this.paymentTypeMap = paymentTypeMap;
    }

    public PaymentType getPaymentType(String type) {
        PaymentType paymentType = paymentTypeMap.get(type);
        if (paymentType == null) {
            throw new IllegalArgumentException("Invalid payment type: " + type);
        }
        return paymentType;
    }
}

