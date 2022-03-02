package com.magd;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("hi, here the amount of transaction money is 100");
        Account account = new Account();

        System.out.println("Balance before the Transaction BUY = " + account.getBalance());
        TransactionType.BUY.doTransactionOperation(account, BigDecimal.valueOf(100));
        System.out.println("Balance after the Transaction BUY = " + account.getBalance());

        account.setBalance(new BigDecimal(1000));
        System.out.println("Balance before the Transaction SELL = " + account.getBalance());
        TransactionType.SELL.doTransactionOperation(account, BigDecimal.valueOf(100));
        System.out.println("Balance after the Transaction SELL = " + account.getBalance());

        account.setBalance(new BigDecimal(1000));
        System.out.println("Balance before the Transaction DEPOSIT = " + account.getBalance());
        TransactionType.DEPOSIT.doTransactionOperation(account, BigDecimal.valueOf(100));
        System.out.println("Balance after the Transaction DEPOSIT = " + account.getBalance());

        account.setBalance(new BigDecimal(1000));
        System.out.println("Balance before the Transaction WITHDRAW = " + account.getBalance());
        TransactionType.WITHDRAwAL.doTransactionOperation(account, BigDecimal.valueOf(100));
        System.out.println("Balance after the Transaction WITHDRAW = " + account.getBalance());

    }
}
