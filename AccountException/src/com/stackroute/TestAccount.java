package com.stackroute;


import java.util.Scanner;

/*User-defined exception to handle NegativeIntegerException */
class NegativeIntegerException extends Exception {
    public NegativeIntegerException() {
        System.out.println("Withdrawing money less than 0!");
    }
}


/*User-defined exception to handle InsufficientFundException */
class InsufficientFundException extends Exception {
    public InsufficientFundException() {
        System.out.println("Withdrawing money greater than balance!");
    }
}

/*Main class to test check withdraw and return new balance*/
public class TestAccount {

    private static Account accOne = new Account();

    public static void main(String[] args) throws NegativeIntegerException, InsufficientFundException {
        Scanner scan = new Scanner(System.in);
        accOne.setAccountBalance(1000);
        System.out.println("Enter the amount to be withdrawn:");
        double num = scan.nextInt();
        double bal = accOne.getAccountBalance();

        /*Throws exception if the withdrawal amount is less than 0 or larger than balance */
        if (num < 0) {
            throw new NegativeIntegerException();
        } else if (num > bal) {
            throw new InsufficientFundException();
        } else {
            System.out.println("New Balance: " + withdraw(num));
        }
    }

    /*Method to withdraw from account and return balance amount*/
    public static double withdraw(double amount) {
        double newBal = accOne.getAccountBalance() - amount;
        accOne.setAccountBalance(newBal);
        return newBal;
    }
}
