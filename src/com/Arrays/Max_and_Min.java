package com.Arrays;

public class Max_and_Min {
    public static void main(String[] args) {
        int[] arr = {99, 23, 98, 45, 101};
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(Min(arr));
        System.out.println(maxRange(arr, 2, 4));

    }
    // To find the maximum value
    static int max(int[] arr) {
        int max_val = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_val) {
                max_val = arr[i];
            }
        }
        return max_val;
    }

    // To find the minimum value
    static int min(int[] arr){
        int minVal = 10000;
        for (int i=0; i<arr.length; i++){
            if(arr[i] < minVal){
                minVal = arr[i];
            }
        }
        return minVal;
    }
    //  Alternative way to find the minimum value

    static int Min(int[] arr) {
        if (arr.length != 0){
            int min = arr[0];
            for (int i=0; i<arr.length; i++){
                if (min > arr[i]){
                    min = arr[i];
                }
            }
            return min;
        }
        return -1;
    }

    // to find the largest number in a range
    static int maxRange(int[] arr, int start, int end){
        int maxVal = 0;
        for (int i=start; i<=end; i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}