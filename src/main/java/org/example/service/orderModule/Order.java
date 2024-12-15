package org.example.service.orderModule;

import org.example.service.paymentModule.PaymentMethod;

public abstract class Order {
    private PaymentMethod paymentMethod;

    public Order(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }
}
