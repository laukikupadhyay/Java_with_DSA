package com.Functions_Methods;

public class Shadowing {
    // static is object independent
    static int x = 60; // this has the highest scope since it can be accessed in all the sub methods and function
    public static void main(String[] args) {
        System.out.println(x); // 60
// value of variable should be initialised so that scope begins.
        int x = 30; // the class variable at line 4 is shadowed by this
        System.out.println(x); // 30
        fun(); // 10
    }
    static void fun(){
        System.out.println(x); // 60
    }

/*
NOTE: int num = 90; can be break into
int num; -> This is known as variable declaration.
num = 90; -> This is known as variable initialisation.
 */
}
