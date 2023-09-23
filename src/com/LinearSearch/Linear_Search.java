package com.LinearSearch;

import java.util.Scanner;

// Linear Search is used for searching elements in an array or any data structure.
// Maximum Comparisons is N where it is the number of elements.
public class Linear_Search {
    public static void main(String[] args) {
        // Q1: Search for the element and return the index number
        int[] arr = {18, 12, 9, 14, 77, 50};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int val = LinearSearch(arr, num);
        System.out.println("The element is present at index no: " + val + " in the array!");

        int val2 = LinearSearch1(arr, num);
        System.out.println("The element is: " + val2);

        boolean val3 = LinearSearch2(arr, num);
        System.out.println(val3);
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int LinearSearch(int[] arr, int num){
        if (arr.length == 0){
            return -1;
        }
        // this loop will check at every index if number is equal to the array element
        for (int i=0; i<arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1; // index can never be negative so returning -1 will not be an issue
    }

    // Q2: Search the target and return the element
    static int LinearSearch1(int[] arr, int num){
        if(arr.length == 0){
            return -1;
        }
        for (int element : arr) { // here, element is arr[i]
            if (element == num) {
                return element;
            }
        }
      //  return -1; -> But, here, -1 can be an element of the array
        return Integer.MAX_VALUE;
    }

    // Q3: Search for the element and return true and false accordingly
    static boolean LinearSearch2(int[] arr, int num){
        if (arr.length == 0){
            return false;
        }
        for (int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element == num){
                return true;
            }
        }
        return false;
    }
}
