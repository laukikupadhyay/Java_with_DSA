package com.Arrays;
import java.util.Scanner;

public class Deleting {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.println("Specify the size of the array: ");
 int size = input.nextInt();
 int[] arr = new int[size];

        System.out.println("Enter the target element to be deleted: ");
        int target = input.nextInt();

        deleteElement(arr, target);

    }

    static void deleteElement(int[] arr, int target){

    }
}