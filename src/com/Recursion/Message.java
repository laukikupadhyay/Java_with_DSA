package com.Recursion;
// Work hard on recursion, be consistent and practise questions

public class Message {
    public static void main(String[] args) {
        // write a function that prints Hello World 5 times

             message(); // we can call this function 5 times to achieve this but we shall avoid this
    }
    static void message() {
        System.out.println("Hello World!");
        message1();
    }
    static void message1(){
        System.out.println("Hello World");
        message2();
    }
    static void message2(){
        System.out.println("Hello World");
        message3();
    }
    static void message3(){
        System.out.println("Hello World");
        message4();
    }
    static void message4(){
        System.out.println("Hello World");
    }
}
