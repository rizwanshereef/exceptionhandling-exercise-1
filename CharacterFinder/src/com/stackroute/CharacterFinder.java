package com.stackroute;

import java.util.Scanner;

public class CharacterFinder {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*Create exception if the string is not entered correctly*/
        try {
            System.out.println("Enter the string and index value separated by ',': ");
            String str = scan.nextLine();
            /*Splitting the string to 2 substring to find the element of the index */
            String strOne = str.substring(0, str.indexOf(","));
            String value = str.substring(str.indexOf(",") + 2, str.length());
            char out = characterLocator(strOne, value);
            System.out.println(out);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Enter the string in correct format!");
        }

    }

    /*Method to find the character at the given index value*/
    public static char characterLocator(String str, String value) {
        char ch = ' ';
        /*Adding exception for NumberformatException and StringIndexOutOfBoundsException*/
        try {
            char[] charOne = str.toCharArray();
            char out = (str.charAt(Integer.parseInt(value)));
            return out;
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException!");
            return ch;
        } catch (StringIndexOutOfBoundsException ae) {
            System.out.println("StringIndexOutOfBoundsException!");
            return ch;
        }
    }
}

