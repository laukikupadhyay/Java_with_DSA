package com.Functions_Methods;

import java.util.Scanner;

public class Arguments2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        String intro = myIntro(name); // declaring a string reference variable so that it can store the  String function value
        System.out.println(intro);
    }
    // Strings are immutable in java
    static String myIntro(String name)
    {
        // in arguments we declare data type and name of the reference variable.
        String Intro = "Hello " + name;
        return Intro;
    }
}
