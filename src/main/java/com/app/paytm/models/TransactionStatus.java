package com.app.paytm.models;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public enum TransactionStatus {
    CREATED,
    SUCCESS,
    FAILED,
    REFUNDED,
    REFUND_INITIATED,
    PAYMENT_INITIATED,
    CANCELLED;
}
