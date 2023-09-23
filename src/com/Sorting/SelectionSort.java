package com.Sorting;

/* SELECTION SORT: In this type of sorting algorithm, one item is selected from an index and placed(or swapped) at its correct position or index.
Time Complexity(Total Comparisons made): O(n^2)
Best Case: O(n^2)
Worst Case: O(n^2)
Stable: NO
It performs well on small lists/array.                                                                                                  */

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
         int[] arr = {3, 1, 5, 2, 4};
         selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
           int end = arr.length - i - 1; // the last index will keep changing on every iteration
           int maxIndex = getMaxIndex(arr, 0, end);
           swapping(arr, end, maxIndex);
        }
    }
    static void swapping(int[] arr, int last, int max){ // swapping takes place between values and not indices
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int last){
        int max = start; // here, max is taken as start which is equal to 0
        for (int i=start; i<=last; i++){
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}


