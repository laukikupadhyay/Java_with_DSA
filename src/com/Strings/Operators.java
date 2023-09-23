package com.Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //  it gives the summation of the ASCII Values of the characters
        System.out.println("a" + "b"); // it concatenates the String
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3)); // it adds 3 letter to the character 'a'
        System.out.println("a" + 3); // if one of the data type is string, it is string

        System.out.println("Pushkal" + new Integer(56));

        System.out.println("Pushkal" + new ArrayList<>());
// The operator + is defined for Primitives and Strings, but they can be used for complex objects if at least one object is a String

        System.out.println(new Integer(56) + " " + new ArrayList<>());
        // adding an empty String will print this entire object in type String only.

    }
}