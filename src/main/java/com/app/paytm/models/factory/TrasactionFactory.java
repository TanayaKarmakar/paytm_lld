package com.app.paytm.models.factory;

import com.app.paytm.exception.InvalidTransactionTypeException;
import com.app.paytm.models.BankAccountTransaction;
import com.app.paytm.models.Transaction;
import com.app.paytm.models.TransactionType;
import com.app.paytm.models.WalletTransaction;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public class TrasactionFactory {
    public static Transaction getTransactionForType(TransactionType type) {
        switch (type) {
            case BANK:
                return new BankAccountTransaction();
            case WALLET:
                return new WalletTransaction();
            default:
                throw new InvalidTransactionTypeException("Invalid Transaction Type");
        }
    }
}
