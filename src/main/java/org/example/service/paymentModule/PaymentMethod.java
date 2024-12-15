package org.example.service.paymentModule;

import org.example.error.PaymentError;

public interface PaymentMethod {
    Boolean pay(double value) throws PaymentError;
}
