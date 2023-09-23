package com.Recursion;
/*
Function Call: When a function is called it is stored in the stack memory
Main function is the 1st function that will go into the stack memory and last function that will come out
HOW FUNCTION CALLS WORK INTERNALLY:
1. When a function is not finished executing, it will remain in a stack which means the function call
is currently going on inside the stack
2. In the below example, all the number functions are stored in the stack memory during the function call.
3. When a function is finished executing, it is removed from the stack memory and the flow of program is
restored to where that function got called.
Example: When a function is called, the values of that function is also called and returned to that function
from where it was called. That returned value is stored in a variable and printed
 */


public class NumbersExample {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers

        number(1);
    }
    static void number(int n){
        System.out.println(n);
        number1(2);
    }

    static void number1(int n){
        System.out.println(n);
        number2(3);
    }

    static void number2(int n){
        System.out.println(n);
        number3(4);
    }
    static void number3(int n){
        System.out.println(n);
        number4(5);
    }

    static void number4(int n){
        System.out.println(n);
    }
}
