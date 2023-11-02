package com.denismiagkov.walletservice.application.dto;

import java.math.BigDecimal;

public class AccountDto {
    public String name;
    public String surname;
    public String number;
    public BigDecimal balance;

    public AccountDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account{" +
                "player: " + name +
                " " + surname +
                ", account number: " + number +
                ", balance: " + balance +
                '}' + "\n";
    }
}
