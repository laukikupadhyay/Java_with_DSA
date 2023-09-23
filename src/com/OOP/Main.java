package com.OOP;
/*
Class:  A class is a named group of property and functions.
 */
public class Main {
    public static void main(String[] args) {
        // Store 5 numbers
        int[] numbers = new int[5];

        // Store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] roll_no = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // If we want to combine all these data types into a single entity, we can do via classes
        // creating an own data type which contains all of them


        Student[] students = new Student[5];

    }
        class Student {
            int[] roll_no  = new int[5];
            String[] name = new String[5];
            float[] marks  = new float[5];
        }



    }
}
