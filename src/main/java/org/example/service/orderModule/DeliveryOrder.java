package org.example.service.orderModule;

import org.example.service.paymentModule.PaymentMethod;

public class DeliveryOrder extends Order{
    public DeliveryOrder(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }
}
