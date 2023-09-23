package com.Basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // print the first 5 natural numbers
        // while loop
        int count = 1;
        while(count<=5){
            System.out.println(count);
            count++;
        }
        System.out.println();

        // for loop
        for (int count_1 = 1; count_1 <= 5; count_1++)
        {
            System.out.println(count_1);
        }

        // if statements (Conditional Statements)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if(age<18){
            System.out.println("You are not eligible to vote!");
        } else if (age>18) {
            System.out.println("You are eligible to vote!");
        }

    }

}
