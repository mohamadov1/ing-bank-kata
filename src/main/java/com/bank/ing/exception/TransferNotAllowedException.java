package com.bank.ing.exception;

public class TransferNotAllowedException extends RuntimeException {
    public TransferNotAllowedException() {
        super("Transfer Not Allowed exception");
    }
}
