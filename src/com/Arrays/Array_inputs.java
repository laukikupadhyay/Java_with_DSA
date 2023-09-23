package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Array of Primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 23;
        arr[2] = 23;
        arr[3] = 23;
        arr[4] = 23;
        System.out.println(Arrays.toString(arr));

        // ASSIGN DIRECTLY
        int[] arr_1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr_1));

        // Taking inputs using FOR LOOP
        int[] arr_2 = new int[4];
        for (int i=0; i<4; i++){
            arr_2[i] = input.nextInt();
        }
        // 1st Method to print
//        for (int j=0; j<arr.length; j++){ // arr.length is the length of the array which n-1 from the size of the array.
//            System.out.print(arr[j]);
//        }

        // 2nd Method to print: Enhanced FOR Loop
        for (int num: arr_2){ // for every element in array, print the element
            System.out.print(num + " "); // here num represents element of the array
        }
        System.out.println();

        // 3rd Method to print
        System.out.println(Arrays.toString(arr_2));

 //       System.out.println(arr[5]); // index out of bound exception or error

        // ARRAY OF OBJECTS
        String[] str = new String[5];
        for (int k=0; k<str.length; k++){
            str[k] = input.next();
        }
        System.out.println(Arrays.toString(str));
        //  modify the object of the string
        str[3] = "Laukik Upadhyay";
        System.out.println(Arrays.toString(str));
    }
}
