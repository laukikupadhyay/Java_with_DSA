package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/* 2D Array: It is an array of array.
 Syntax:
        int[i][j] arr = new int[2][2]; -> Specifying the size of 2D array
        i-> row && j-> column.
 */
public class Multidimensional {
    public static void main(String[] args) {
     //   int[][] arr = new int[3][1];

        Scanner in = new Scanner(System.in);
        int[][] arr2d = {
                {1, 2, 3}, // 0th index
                {4, 5, 6}, // 1st index
                {7, 8, 9} // 2nd index -> arr2D[2] = {6, 7, 8, 9}
        };
        // Taking inputs in 2d array

        int[][] arr = new int[3][2]; // i = 3, j = 2
//      NOTE: Outer loop is iterating for each row and then the inner loop iterates for each column in that row.
        for (int row = 0; row < arr.length; row++){ // length of any array is taken in row
            // for each column in every row.
            for (int col = 0; col < arr[row].length; col++){ // here, every row is an array of 2 columns
                arr[row][col] = in.nextInt();
               // System.out.print(arr[row][col] + " "); -> 1st method
            }
           // System.out.println();
        }
        // to print the array after inputting the elements
        for (int row = 0; row < arr.length; row++){ // -> 2nd Method
            System.out.println(Arrays.toString(arr[row]));
        }

        // Enhanced For loop -> for printing the output -> 3rd method to print
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        // For String arrays

        String[][] str = new String[3][3];

        for (int row=0; row < str.length; row++){
            for (int col=0; col < str[row].length; col++){
                str[row][col] = in.next();
                // 1st Method to print
                System.out.print(str[row][col] + " ");
            }
            System.out.println();

            // 2nd Method to print
            for (int rows=0; rows<str.length; rows++){
                System.out.println(Arrays.toString(str[rows]));
            }

            // 3RD Method: Enhanced For loop
            /* Syntax:
            for (array_datatype element : array_name){
            System.out.println(Arrays.toString(arrayname[element]))
            }
             */

            for (String[] element : str){
                System.out.println(Arrays.toString(element));
            }
    }
    }
}
