package com.stackroute;

import java.util.Scanner;

public class Fraction {
/*Main class to find the fraction of 2 numbers. Throw exceptions if any*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 2 value separated by space:");
        String str = scan.nextLine();
        /*Split the string to 2 integer*/
        int numOne = Integer.parseInt(str.substring(0, str.indexOf(" ")));
        int numTwo = Integer.parseInt(str.substring(str.indexOf(" ")+1,str.length()));
        System.out.println(fractionCalculator(numOne,numTwo));
    }

 /*Method to find the fraction of 2 numbers and through exception if any*/
    public static String fractionCalculator(int numOne, int numTwo){
        String msg;
        /*Adding exception for arithmetic expression / by zero*/
        try{
            int sum = numOne/numTwo;
            msg = Integer.toString(sum);
            return msg;
        }catch (ArithmeticException e){
            msg = "java.lang.ArithmeticException: / by zero";
            return msg;
        }
    }
}
