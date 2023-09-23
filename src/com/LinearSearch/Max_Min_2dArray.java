package com.LinearSearch;

public class Max_Min_2dArray {
    public static void main(String[] args) {
        int[][] arr2d = {
                {23, 24, 76}, {45, 87, 41}, {46, 98, 11}
        };
        int maxval = maxVal(arr2d);
        System.out.println("The largest element in the array is: " + maxval);

        int minval = minVal(arr2d);
        System.out.println("The smallest element in the array is: " + minval);
    }
    static int maxVal(int[][] arr2d){
        if (arr2d.length != 0){
            int max = Integer.MIN_VALUE; // minimum value that the integer can hold
            for (int i=0; i<arr2d.length; i++){
                for (int j=0; j<arr2d[i].length; j++){
                    if (max < arr2d[i][j]){
                        max = arr2d[i][j];
                    }
                }
            }
            return max;
        }
        return -1;
    }
    static int minVal(int[][] arr2d){
        if (arr2d.length != 0){
            int min = Integer.MAX_VALUE; // Maximum value that the integer can hold
            for (int i=0; i<arr2d.length; i++){
                for (int j=0; j<arr2d[i].length; j++){
                    if (min > arr2d[i][j]){
                        min = arr2d[i][j];
                    }
                }
            }
            return min;
        }
        return -1;
    }
}
