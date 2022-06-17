package com.week2.exception;

public class PaymentException extends Throwable {

    private String message;

    public PaymentException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}