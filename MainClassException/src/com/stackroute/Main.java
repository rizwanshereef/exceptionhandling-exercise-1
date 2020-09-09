package com.stackroute;

public class Main extends Exception {
    public Main(String message) {
        super(message);
    }
    public static void main(String[] args) {
        try{
            throw new Main("exception occured in main method.");
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("this is a finally block.");
        }
        System.out.println("this is after try-catch-finally block.");
    }
}