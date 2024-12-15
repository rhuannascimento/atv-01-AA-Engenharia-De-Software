package org.example.service.deliveryModule;

public class IfoodDeliveryFactory implements DeliveryFactory{

    @Override
    public DeliveryMan getDeliveryMan() {
        return new IfooDeliveryMan();
    }
}
