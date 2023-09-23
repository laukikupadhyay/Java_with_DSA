package com.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchINRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the starting index: ");
        int start = in.nextInt();;
        System.out.print("Enter the ending index: ");
        int end = in.nextInt();
        System.out.print("Enter the number that you want to find: ");
        int num = in.nextInt();

        int[] arr = {23, 34, 65, 98, 44, 69, 24, 11};
        int val = search(arr, num, start, end);
        System.out.println("The number " + num + " is present at index no: " + val + " in the given array!" );

    }
// the sequence of variable declaration in the method should be same as in the function call.
    static int search(int[] arr, int no, int start, int end){
        if (arr.length == 0){
            return -1; // NOTE: in an integer type function we cannot return other data type values.
        }

        for (int i=start; i<=end; i++){
            if (arr[i] == no){
                return i; // this return value is passed in the function call
            }
        }
        return -1; // this is the return type when the input do not satisfy the condition mentioned above.
    }
}
