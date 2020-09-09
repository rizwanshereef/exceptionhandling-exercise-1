package com.stackroute;


public class ExceptionHandling {
    /*Main class which will display the message stored on the exception object*/

    public static void main(String[] args) {
        int arr[] = null;
        int result = 0;
        int arrsize = 3;
        int negsize = -4;
        /*Generating each exception cases*/
        for (int ch = 1; ch < 4; ch++) {
            try {
                switch (ch) {
                    case 1:
                        result = arr[0];
                        break;
                    case 2:
                        arr = new int[negsize];
                        break;
                    case 3:
                        arr = new int[3];
                        result = arr[3];

                }
            } catch (NullPointerException ne) {
                System.out.println("NullPointerException. Add contents!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundException. Check the array size length!");
            } catch (NegativeArraySizeException e) {
                System.out.println("Negative Array Exception. Enter a valid size for the array!");
            }
        }
    }
}