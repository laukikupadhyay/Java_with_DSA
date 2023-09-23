package com.Arrays;

import java.util.Scanner;

public class Column_not_fixed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // for unspecified column length of 2D Array, we take the individual length of each row array by arr[row].length and iterate the loop over that
        int[][] arr_2d = new int[3][3];

        for (int row = 0; row < arr_2d.length; row++){ //; since, array length is taken in row
            for (int col = 0; col < arr_2d[row].length; col++){
                arr_2d[row][col] = in.nextInt();
                System.out.print(arr_2d[row][col] + " ");
                // arr[row].length -> Individual size of the row, only that many amount of columns are required
            }
            System.out.println(); // to print the elements of the upcoming row in the next line
        }
    }
}
