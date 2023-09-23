package com.Arrays;

import java.util.Scanner;
import java.util.ArrayList;

// ARRAY LIST: to input any number of elements without specifying the length of array
public class Array_List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Syntax: Integer is a type here and ArrayList Object
        ArrayList<Integer> list = new ArrayList<>(10);
        // here, list is the name of the array list
// We cannot pass primitive data types but wrapper classes.

//        list.add(45);
//        list.add(463);
//        list.add(56);
//
//        System.out.println(list.contains(56));
//
//        System.out.println(list);
//        list.set(0, 99); //  we can update values here in the specified index
//
//        list.remove(2); // we can remove any particular index here
//
//        System.out.println(list);

        // for taking inputs in array list
        for (int i=0; i<5; i++){
            list.add(in.nextInt());
        }
        // 1st method to print
        System.out.println(list);

        // 2nd method to print
        for (int i=0; i<5; i++){
            System.out.print(list.get(i) + " "); // pass index here, list[index] syntax will not work here
        }
        System.out.println();
    }
}
