package com.Functions_Methods;
//
public class Swap {
    public static void main(String[] args) {
//        int a =10;
//        int b = 20;
//
//        // swapping the numbers
//        int temp = a;
//        a = b;
//        b = temp;

        // This function method is not swapping the numbers. Why? We'll see it
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        /*
       1. The numbers were not swapped here coz change in the value of the object will
        be just in this method and will not affect the main function value.

       2. For primitive data types, the value will be passed and hence the original
          value will not change and for object references and complex data types, it's
           pass by value of the reference variable.
         */
    }
}
