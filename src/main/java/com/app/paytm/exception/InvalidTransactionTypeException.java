package com.app.paytm.exception;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public class InvalidTransactionTypeException extends RuntimeException{
    public InvalidTransactionTypeException(String message) {
        super(message);
    }
}
