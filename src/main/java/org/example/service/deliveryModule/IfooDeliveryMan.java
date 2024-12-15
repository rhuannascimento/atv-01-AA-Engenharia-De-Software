package org.example.service.deliveryModule;

import org.example.error.NotFoundDeliveryManError;

public class IfooDeliveryMan implements DeliveryMan {

    @Override
    public String callDeliveryMan() throws NotFoundDeliveryManError {
        try{
            return "FOI ENCONTRADO UM ENTREGADOR DO IFOOD";
        } catch (Exception e) {
            throw new NotFoundDeliveryManError("Um entregador do ifood não foi encontrado");
        }
    }
}
