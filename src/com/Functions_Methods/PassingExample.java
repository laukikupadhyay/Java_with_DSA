package com.Functions_Methods;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Laukik Upadhyay"; // Laukik is an object here
        changename(name); // here, in the function call argument name of the reference variable or any value is passed
        System.out.println(name);// here, a value of the reference variable is passed and is assigned to the greet method
    } // In java, there is only pass by value and not pass by reference.
    static void changename(String naam) {
        naam = "Anish Kumar Khullar";  //-> The value of the main function reference variable "name" is assigned to the String "naam".
   //     System.out.println(naam);
    }
}

