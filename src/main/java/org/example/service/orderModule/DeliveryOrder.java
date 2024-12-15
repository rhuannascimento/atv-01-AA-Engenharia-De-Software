package org.example.service.orderModule;

import org.example.service.deliveryModule.DeliveryMan;
import org.example.service.paymentModule.PaymentMethod;

public class DeliveryOrder extends Order{
    private DeliveryMan deliveryMan;

    public DeliveryOrder(PaymentMethod paymentMethod, DeliveryMan deliveryMan) {
        super(paymentMethod);
        this.deliveryMan = deliveryMan;
    }

    public void initOerder(){
        deliveryMan.callDeliveryMan();
    }
}
