package com.app.paytm.models;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public abstract class Transaction extends BaseModel{
    private User from;
    private BigDecimal amount;
    private List<Payment> payments;
    private TransactionStatus status;

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }
}
