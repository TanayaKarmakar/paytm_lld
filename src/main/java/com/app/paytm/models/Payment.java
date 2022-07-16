package com.app.paytm.models;

import java.math.BigDecimal;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public class Payment extends BaseModel {
    private Transaction transaction;
    private BigDecimal amount;
    private PaymentStatus status;
    private PaymentStrategy paymentStrategy;

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStrategy getPaymentMethod() {
        return paymentStrategy;
    }

    public void setPaymentMethod(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
