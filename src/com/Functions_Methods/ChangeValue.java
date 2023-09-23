package com.Functions_Methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // Create an array
        int[] arr = {1, 67, 32, 12, 96}; // "arr" can also be called object reference
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[3] = 76; // if you make a change to the array object via this ref variable, same object will be changed.
    }
// nums will be an object(at some random index) of the reference variable "arr" pointing to the object of the array.
}
