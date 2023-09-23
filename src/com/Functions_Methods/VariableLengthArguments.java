package com.Functions_Methods;

import java.util.Arrays;
// Variable length Arguments: It refers to indefinite number of variables of same data type without declaring them.

public class VariableLengthArguments {
    public static void main(String[] args) {
        student("Laukik", "Kinam", "Ruchi", "Rishu");
        marks(4,5,6,7,8,9,3);
        multiplication(5,6,"Laukik");
    }
        static void marks(int ...v){
            System.out.println(Arrays.toString(v));
        }
       static void student(String ...v){
           System.out.println(Arrays.toString(v));
       }
    // ...v refers an array of characters: Here, it refers to an integer array. It is a variable name
       static void multiplication(int a, int b, String ...v){

       }
}
