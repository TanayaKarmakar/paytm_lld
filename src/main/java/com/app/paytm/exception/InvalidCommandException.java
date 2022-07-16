package com.app.paytm.exception;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public class InvalidCommandException extends RuntimeException{
    public InvalidCommandException(String message) {
        super(message);
    }
}
