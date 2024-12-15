package org.example.service.orderModule;

import org.example.service.paymentModule.PaymentMethod;

public abstract class Order {
    private PaymentMethod paymentMethod;
    private double value;

    public Order(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public String finish() throws Exception{
        try{
            Boolean result = paymentMethod.pay(value);
            if(result){
                return "Sucesso";
            }else{
                return "Recusado";
            }
        }catch (Exception e){
            throw e;
        }
    }
}
