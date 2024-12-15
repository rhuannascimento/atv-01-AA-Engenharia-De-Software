package org.example.service.paymentModule;

import org.example.error.PaymentError;

public class CashPayment implements PaymentMethod{

    @Override
    public Boolean pay(double value) throws PaymentError {
        try{
            return true;
        }catch (Exception e){
            throw new PaymentError("Erro de pagamento");
        }
    }
}
