package com.Sorting;

import java.util.Arrays;
/*
SORTING: Arranging elements in the data structure either in ascending or descending order.
Bubble Sort: It is a comparison sort method where in every step we compare the corresponding elements. It is a step-by-step process.
It is also known as sinking sort or exchange sort. With every pass through the entire array, it takes the largest element at the end.
Space Complexity is constant: No extra space is required or copying the array is also not required.\
Time Complexity:
Best Case: O(N)
Worst Case: O(N^2) where n can be the number of comparisons
With the size of array, the number of comparisons increases.                      */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr) {
        boolean swapped; // boolean function has been provided so that the loop do not unnecessarily iterates when it has been completed sorted in the first pass where i=3
        // Every new pass will start from here
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // For each pass, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) { // or j <= arr.length-i-1
                // swap if the item is smaller than the previous one.
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
// if you did not swap for a particular value of i, it means the array is sorted and hence stop the iteration
            if (!swapped) { // swapped == false -> This will end the iteration if there's no more swapping in line 30 since it satisfies the condition arr[j] < arr[j-1]
                break;
            }
        }
    }
}
