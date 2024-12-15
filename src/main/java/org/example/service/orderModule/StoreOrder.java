package org.example.service.orderModule;

import org.example.service.paymentModule.PaymentMethod;

public class StoreOrder extends Order{
    public StoreOrder(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }
}
