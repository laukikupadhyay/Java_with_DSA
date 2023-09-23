package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Occurence_P1 {
    // Find the number of occurence of an integer in an array?
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3,};
        System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int occ = 0;
        int val = Occurences(arr, num, occ);
        System.out.print("The number of occurences are: " + val);
    }


    static int Occurences(int[] arr, int num, int occ) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                occ++; // occ = ooc + 1;
            }
        }
        return occ;
    }
}
