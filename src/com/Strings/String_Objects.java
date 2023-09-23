package com.Strings;
/*
1. Everything that starts with a capital letter is a Class.
2. String pool: It is a separate memory structure inside the heap which avoids creating multiple objects when more
   than one reference variable have the same value and creates a single memory structure to which all the reference variable points.
   This helps in better optimization

   We cannot modify String Objects!
   for security reasons, strings are immutable .i.e., they cannot be modified
 */

public class String_Objects {
    public static void main(String[] args) { // here, String[] args are known as Command Line Arguments
        String a = "Laukik";
        String b = "Laukik";
        String c = a; // this new String variable also points to the same object
        System.out.println(c);
// here, it will return true because both the reference variables are pointing to the same object and have the same value
        System.out.println(a == b);

// here, two different objects have been created for both the reference variables
        String name = new String("Laukik");
        String name1 = new String("Laukik");
        String name3 = name;
        System.out.println(name3);

// It will return false because for comparator operators, the value and the object should be same for both the reference variable to be equal
        System.out.println(name == name1);

        System.out.println(name.equals(name1)); // This method will just check the value and not the object.

        // STRING IS A COLLECTION OF CHARACTERS BUT WE CANNOT ->
        String naam = "Pushkal";
        System.out.println(naam.charAt(3));

    }
}
