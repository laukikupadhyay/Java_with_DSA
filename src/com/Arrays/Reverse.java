package com.Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {23, 54, 76, 37, 83, 26};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
     static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){ // condition in while loop
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
