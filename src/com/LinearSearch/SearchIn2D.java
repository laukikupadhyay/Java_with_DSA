package com.LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr2d = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}  };
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number that you want to find in the given array: ");
        int num = input.nextInt();

        int[] ans = searchIn2D(arr2d, num);
        System.out.println("The element is present at the indices: "  + Arrays.toString(ans));
    }
    static int[] searchIn2D(int[][] arr2d, int target){
        if (arr2d.length != 0){
            for (int i=0; i<arr2d.length; i++){ // here, i refers the row
                for (int j=0; j<arr2d[i].length; j++){ // here, refers the column
                    if (arr2d[i][j] == target){
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{-1, -1};
    }
}