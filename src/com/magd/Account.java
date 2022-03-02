package com.magd;

import java.math.BigDecimal;

public class Account {

    private BigDecimal balance = new BigDecimal("1000");


    public void addMoney(BigDecimal money) {
        this.balance = this.balance.add(money);
    }

    public void removeMoney(BigDecimal money) {
        this.addMoney(money.negate());
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
