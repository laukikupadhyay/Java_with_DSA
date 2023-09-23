package com.Functions_Methods;

// Scope: It means that you can access a variable inside the function where it has been declared and not outside
public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

      //  System.out.println(marks);  -> Here, marks does not have a scope in this main function. Hence, it cannot be declared.
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
    }



