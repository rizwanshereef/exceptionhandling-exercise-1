# Exception Handling Exercise-1 on 09/09/2020


### Program1
- Create a class with a main( ) that throws an object of class Exception inside a try block.
a. Give the constructor for Exception a ​ String​ argument.
b. Catch the exception inside a catch clause and print the ​ String​ argument.
c. Add a finally clause and print a message to prove you were there.
---
### Program2
Write a program that will generate ​ exceptions​ of type NegativeArraySizeException,
IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by displaying the message stored in the exception object.

---
### Program3
Problem Statement: Find character at specified location in a string

- *Given a string find the character in particular location in the string*

- *This exercise contains a class named CharacterFinder with the following method:*

     **+characterLocator(String, String)** : character  
         - Should take two String values as input and return a character as result
         - Should also handle exception thrown by logic using try and catch 

----
    Sample Input:
    This is a demo sentence, 8    
    
    Expected Output:
    a
--------------------------------------------------------
    Sample Input:
    This is a demo sentence, xyz
        
    Expected Output:
    NumberFormatException
--------------------------------------------------------

    Sample Input:
    This is a demo sentence, 40
        
    Expected Output:
    StringIndexOutOfBoundsException



### Program 4
 Problem Statement: Find the fraction of two integers

- *Given two integers find the fraction and handle runtime exception using try and catch*

- *This exercise contains a class named Fraction with the following method:*

     **+fractionCalculator(int, int)** : String  
         - Should take two integer values as input and return a string as result
         - Should also handle exceptions thrown by logic using try and catch 

 **Example**
    
    Sample Input:
    120 3       
    
    Expected Output:
    40
```
    Sample Input:
    1200 0
        
    Expected Output:
    java.lang.ArithmeticException: / by zero
```
---
### Program 5
Create a class Account. That has following variable and method

   **accountBalance** : double
- Write the Constructor
- Write Getter and Setter for the variable accountBalance

***Implement the method:***

**withdraw(double amount)** : double
	
 - This method returns the new balance deducting the withdraw amount from the balance
 - Throws NegativeIntegerException when amount to withdraw is less than zero
- Throws InsufficientFundException when amount to withdraw is greater than the balance
```
     * @param amount
     * @return
     * @throws InsufficientFundException
     * @throws NegativeIntegerException
```
- Custom exceptions should be used for below scenarios
            
	 - Withdrawing amount from the given bank account less than zero should throw NegativeIntegerException
	-	Withdrawing amount from the given bank account greater than the balance should throw InsufficientFundException

---
     

### Program 6
You are required to compute the power of a number by implementing a calculator.
- Create a class MyCalculator which consists of a single method **long power(int, int)**.
- This method takes two integers n  and p, as parameters and finds n^p. 
- If either n or p  is negative, then the method must throw an exception which says  " n or p should not be negative".
- If both n and p  are zero, then the method must throw an exception which says  "n and p should not be zero"
*For example, -4 and -5 would result in “ java.lang.Exception: n or p should not be negative”*
- Complete the function power in class MyCalculator and return the appropriate result after the power operation or an appropriate exception as detailed above.

```
Sample Input 0
3 5
2 4
0 0
-1 -2
-1 3
Sample Output 0
243
16
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.
java.lang.Exception: n or p should not be negative.
```
