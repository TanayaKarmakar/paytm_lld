package com.app.paytm.models;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public class CardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;
    private String accountHolderName;
    private CardType type;
    private String validity;
    private String cvv;

    @Override
    public void executePayment() {

    }
}
