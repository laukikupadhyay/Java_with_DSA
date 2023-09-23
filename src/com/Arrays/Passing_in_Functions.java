package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Static: the static keyword is a non-access modifier used for methods and attributes.
// It can be accessed without creating an object of a class.
public class Passing_in_Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // For 1D Array
        int[] num = {23, 24, 25, 26, 27};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    // Arrays are mutable in java whereas strings are not. That is, the value can be changed
    static void change(int[] arr){
        arr[2] = 183; // value gets updated

            }
            }
