package org.example.service.deliveryModule;

import org.example.error.NotFoundDeliveryManError;

public class SelfDeliveyMan implements DeliveryMan {
    public String callDeliveryMan() throws NotFoundDeliveryManError {
        try{
            return "FOI ENCONTRADO UM ENTREGADOR DA LOJA";
        } catch (Exception e) {
            throw new NotFoundDeliveryManError("Um entregador da  loja não foi encontrado");
        }
    }
}
