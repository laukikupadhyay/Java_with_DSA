package com.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearStringSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character that you want to find in the name: ");
        char ch = in.next().charAt(0); // it means from 0 to the maximum integer value
        String name = "Laukik Upadhyay";

        boolean val = search(name, ch); // alternative way: System.out.println(search(name, ch));
        System.out.println(val);

        System.out.println(search2(name, ch));

        System.out.println(Arrays.toString(name.toCharArray())); //  word cannot be used in place of ch because scope of word is local and not global
    }
        static boolean search(String name, char word){ //  it is not necessary that the variable names should be same, because a copy of the value of the reference variable from the main function is pointed to the function method corresponding variable
        if (name.length() == 0){ // length() is a method of String class
            return false;
        }
        for (int i=0; i<name.length(); i++){
            if (word == name.charAt(i)){ // charAt(i) is used for finding the character at a particular string provided the index
                return true;
            }
        }
        return false;
        }
    static boolean search2(String str, char word){
        if (str.length() == 0){
            return false;
        } // use of FOR EACH LOOP -> we have to convert String into character array in case of FOR EACH LOOP using ".toCharArray()"
        for(char ch : str.toCharArray()){
            if (ch == word) {
                return true;
            }
            }
        return false;
    }
    }

