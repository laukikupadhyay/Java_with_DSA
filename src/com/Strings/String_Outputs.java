package com.Strings;

import java.util.Arrays;
// Heap requires more complex memory management and more storage space whereas Stack takes less space and is faster to execute

public class String_Outputs {
    public static void main(String[] args) {
        System.out.println(183); // out is a variable of Print_stream which has a method to print anything
        Integer num = new Integer("78"); //It is a wrapper class and it has its own functions.
        System.out.println(num.toString());
/* The main function of the program has a predefined Command line argument of type String which takes String values at the end.
So, all the data types are converted to its String representation by the internal ".toString()" method
                                  "." is used by objects to call any method or function                                                                         */
        // Here, the String was directly passed and printed
        System.out.println("Kunal");

        // here, to convert array to a String type, we use Arrays.toString() method
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5})); // use the two String method available in Arrays

        String name = "null";
        System.out.println(name);

    }
}
