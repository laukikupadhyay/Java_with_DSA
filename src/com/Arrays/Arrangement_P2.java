package com.Arrays;

import java.util.Arrays;

public class Arrangement_P2 {
    // QUESTION: Sort an array of 0s, 1s and 2s

//    public static void main(String[] args) {
//        int[] arr = {0, 1, 2, 0, 1, 2};
//        sorting(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void sorting(int[] arr){
//        for (int i=0; i<arr.length; i++){ // loop for one complete pass.
//            for (int j=1; j<arr.length-i; j++){ // here, -i because one every single pass the last index is occupied with the largest element
//                if (arr[j] < arr[j-1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//        }
//    }

    // Alternate Method: Using different functions
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        int start = 0;
        int end = 1;
//        int[] sort = sorting(arr, start, end); // you can either pass an integer array reference and store the sorted array
//        System.out.println(Arrays.toString(sort));

        sorting(arr, start, end);
        System.out.println(Arrays.toString(arr)); // here, that array is passed which is sorted
    }

    static int[] sorting(int[] arr, int start, int end){
        for (start=0; start<arr.length; start++){
            comparison(arr, start);
            exchange(arr, end);
        }
        return arr;
    }
    static void comparison(int[] arr, int i){
        for (int j=1; j<arr.length-i; j++){
            if (arr[j] < arr[j-1]){
                exchange(arr, j);
            }
        }
    }
    static void exchange(int[] arr, int j){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
}
