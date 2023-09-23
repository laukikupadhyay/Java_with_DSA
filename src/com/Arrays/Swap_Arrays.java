package com.Arrays;

import java.util.Arrays;

public class Swap_Arrays {
    public static void main(String[] args) {
        int[] arr = {1, 23, 54, 56, 78, 65};
        swap(arr, 2, 4);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a]; // a, b can be user defined indexes
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
