package org.example.error;

public class PaymentError extends Exception {
    public PaymentError(String message) {
        super(message);
    }
}
