package com.Functions_Methods;

import java.util.Arrays;

// OVERLOADING: It means when you have two functions with the same name but different arguments and parameters.
public class Function_Overloading {
    public static void main(String[] args) {
        demo(4);
        demo("Laukik Bhardwaj");
        sum(4,5);
        sum(5,8,9);
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void sum(int a, int b, int c){
        int sum = a + b + c;
        System.out.println(sum);
    }
    static void sum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
}
