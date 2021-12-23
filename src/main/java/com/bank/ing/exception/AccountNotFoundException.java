package com.bank.ing.exception;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException() {
        super("Account not found exception");
    }
}
