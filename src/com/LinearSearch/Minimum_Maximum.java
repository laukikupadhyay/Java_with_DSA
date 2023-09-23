package com.LinearSearch;

import java.util.Scanner;

public class Minimum_Maximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[8];
        System.out.println("Enter an array of elements of length 8: ");
        for (int j = 0; j < arr.length; j++) {
            arr[j] = in.nextInt();
            System.out.print(" ");
        }
        System.out.println("The smallest number in the array:" + minVal(arr));
        int val = maxVal(arr);
        System.out.println("The greatest number in the array is: " + val);

    }

    static int minVal(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static int maxVal(int[] arr) {
        if (arr.length > 0) {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        }
        return -1;
    }
}