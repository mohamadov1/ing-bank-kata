package com.bank.ing.exception;

public class InvalidRequestOperationException extends IllegalArgumentException {
    public InvalidRequestOperationException() {
        super("Invalid request operation exception");
    }
}
