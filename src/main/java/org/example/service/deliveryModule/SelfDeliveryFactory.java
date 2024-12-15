package org.example.service.deliveryModule;

public class SelfDeliveryFactory implements DeliveryFactory{
    @Override
    public DeliveryMan getDeliveryMan() {
        return new SelfDeliveyMan();
    }
}
