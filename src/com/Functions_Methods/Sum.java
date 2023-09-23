package com.Functions_Methods;

import java.util.Scanner;

// Functions are block of codes executed to avoid repetition and lengthy code.
// Method: they are functions within a class.
public class Sum {
    public static void main(String[] args) {
       int ans = sum2();// sum is the name of the function and paranthesis is used to call a function. this is known as function call
        System.out.println(ans);
    }
        /*
        Syntax for Function Declaration:
            return_type name (arguments) {
            // body
            return statement; } return statement data type should be same as function data type
         */

    // return the value
        static int sum2() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the First Number:");
            int num1 = input.nextInt();;
            System.out.print("Enter the Second Number:");
            int num2 = input.nextInt();
            int sum = num1 + num2;
            return sum; // function terminates after passing return statement.
        }
    // return type: It is the type of data that would be returned at the end of a function.
        static void sum() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the First Number:");
            int num1 = input.nextInt();;
            System.out.print("Enter the Second Number:");
            int num2 = input.nextInt();
            int sum = num1 + num2;
            System.out.println(sum);
        }
}
