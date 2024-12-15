package org.example.service.deliveryModule;

import org.example.error.NotFoundDeliveryManError;

public interface DeliveryMan {
    String callDeliveryMan() throws NotFoundDeliveryManError;
}
