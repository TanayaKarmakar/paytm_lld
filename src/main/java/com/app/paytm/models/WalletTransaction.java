package com.app.paytm.models;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public class WalletTransaction extends Transaction {
    private User receiver;

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
}
