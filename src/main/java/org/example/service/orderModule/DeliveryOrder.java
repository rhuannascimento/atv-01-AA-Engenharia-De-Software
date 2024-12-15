package org.example.service.orderModule;

import org.example.service.deliveryModule.DeliveryFactory;
import org.example.service.deliveryModule.DeliveryMan;
import org.example.service.paymentModule.PaymentMethod;

public class DeliveryOrder extends Order{
    private DeliveryMan deliveryMan;

    public DeliveryOrder(PaymentMethod paymentMethod, DeliveryFactory deliveryFactory) {
        super(paymentMethod);
        this.deliveryMan = deliveryFactory.getDeliveryMan();
    }

    public String initOrder(){
        return deliveryMan.callDeliveryMan();
    }
}
