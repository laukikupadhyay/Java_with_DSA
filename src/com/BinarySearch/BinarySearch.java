package com.BinarySearch;

import java.util.Scanner;

/*
Binary Search: Type of searching technique which is used for sorted array only either in ascending order or descending order.
                 1. Find the middle element
                 2. Check if the value exist before or after the middle element
                 3. if middle element == target, the element has been founded.
                 Total comparisons in the best case is constant
                 Total Comparisons in the worst case = logN
                 and k = logN to the base 2
                 where k is the level of operation of how many times the original array got divided
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArr = {-56, -45, -6, 0, 1, 56, 98, 324, 453};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = in.nextInt();

        int index = binarySearch(sortedArr, target);
        System.out.println("The index of the target element is: " + index);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            //         int mid = (start + end) / 2; -> this can exceed the range of integers in JAVA on adding both so we can use the below expression
            int mid = (start) + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1; // starting index will be shifted to mid + 1
            } else if (target < arr[mid]) {
                end = mid - 1; // ending index will be shifted to mid - 1
            } else {
                return mid;
            }
        }
        return -1;
}
}
