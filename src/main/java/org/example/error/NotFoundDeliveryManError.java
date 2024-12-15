package org.example.error;

public class NotFoundDeliveryManError extends RuntimeException {
    public NotFoundDeliveryManError(String message) {
        super(message);
    }
}
