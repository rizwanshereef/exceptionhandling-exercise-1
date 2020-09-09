package com.stackroute;

import java.util.Scanner;

/*User defined exception*/
class ExceptionThrow extends Exception {
    public ExceptionThrow(String msg) {
        System.out.println(msg);
    }
}


public class MyCalculator {

    public static void main(String[] args) throws ExceptionThrow {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the  value of na nd p separated by space:");
        String str = scan.nextLine();
        /*Split the string to 2 integer*/
        int numOne = Integer.parseInt(str.substring(0, str.indexOf(" ")));
        int numTwo = Integer.parseInt(str.substring(str.indexOf(" ") + 1, str.length()));
        /*Check for exception*/
        if (numOne > 0 && numTwo > 0) {
            System.out.println(power(numOne, numTwo));
        } else if (numOne == 0 && numTwo == 0)
            throw new ExceptionThrow("n and p should not be zero!");
        else
            throw new ExceptionThrow("n and p should not be negative!");
    }

    /*Method to calculate power of the given number*/
    public static long power(int numOne, int numTwo) {
        long result = 1;
        while (numTwo != 0) {
            result *= numOne;
            --numTwo;
        }
        return result;
    }

}


