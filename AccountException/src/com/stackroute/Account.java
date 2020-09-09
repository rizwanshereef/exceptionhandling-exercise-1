package com.stackroute;

/*Class Account which stores balance*/
public class Account {

    /*Instance variable declaration*/
    private double accountBalance;


    /*Parameterized constructor*/
    public Account(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    /*Default constructor*/
    public Account() {
    }


    /*Getter and Setter*/
    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
