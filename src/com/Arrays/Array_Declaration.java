package com.Arrays;
import java.util.Scanner;

/* ARRAYS: An array is a collection of data types: Primitives, object and complex data types
    All the data types in an array should be same be it integer, strings, boolean

    1. Array objects are in heap
    2. heap objects are not continuous in java unlike c++
    3. Declaration happens in compile time and the reference variable is stored
    in the stack memory which points to the objects that have been created in the heap memory
    4. Initialisation happens in runtime (Dynamic Memory Allocation)
    5. The new keyword is basically used to create an object in the heap memory of array, size 5 -> arr[5]
    */
public class Array_Declaration {
    public static void main(String[] args) {
    /*
    SYNTAX:
            datatype[] variable_name = new datatype[size];                         */
        // Q: Store 5 roll numbers:
      //  Scanner roll_nos = new Scanner(System.in);
        int[] roll = new int[5];
      // or directly
        int[] p = {1,2,3,4,5,6,7,8,10};
        System.out.println(p[2]);

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation of array: actually here object is being created in the memory(heap) of size 5

        System.out.println(ros[4]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
// null is a special literal usually displayed for String arrays if the value is not assigned.
    }
}
