package com.Basics;

import java.util.Scanner;

public class Inputs
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Here, "new" keyword is used to create an object of the class.
        // Scanner: It is a class which allows you to read any input from the user.
        // We create an object of the Scanner class which takes input from the keyboard.
        System.out.println("What is your name?");
        input.hasNextLong();

        System.out.print("Please enter your name?");
        String name_ = input.next();
        System.out.print("Please enter your Roll Number:");
        int roll_no = input.nextInt();
        System.out.println("Your name is " + name_ + " and your Roll number is " + roll_no);

        Scanner age = new Scanner(System.in);
        System.out.println("What is your age?");
        age.nextInt();
        Scanner gender = new Scanner(System.in);
        System.out.println("What is your gender?");
        System.out.println("Your gender is: " + gender.nextLine());

        // Literals: Synthetic representation of boolean, character, numeric, or string data.
        // Identifier: They are names given to a class, package, method or an interface.

        int a = 234_345_543;
        // Here, int is a primitive data type, "a" is a literal and the value assigned is an identifier.
        System.out.println(a);

        String name = input.next();
        System.out.println(name);

        String s1 = "Laukik";
        String s2 = "Praiya";
        System.out.println(s1.length()); // prints the length of the string
        System.out.println(s2.length());

    }
}
