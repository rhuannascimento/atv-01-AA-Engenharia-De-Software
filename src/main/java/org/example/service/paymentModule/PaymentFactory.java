package org.example.service.paymentModule;

public class PaymentFactory {
    public static PaymentMethod getPaymentMethod(String paymentMethod) {
        Class classAux = null;
        Object objectAux = null;
        try {
            classAux = Class.forName("org.example.service.paymentModule" + paymentMethod);
            objectAux = classAux.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Método de pagamento inexistente");
        }
        if (!(objectAux instanceof PaymentMethod)) {
            throw new IllegalArgumentException("Método de pagamento inválido");
        }
        return (PaymentMethod) objectAux;
    }
}
