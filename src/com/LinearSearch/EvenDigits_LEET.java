package com.LinearSearch;
/*
    Q1: Given an array nums of integers, return how many of them contain an even number of digits
    Input: nums = [12, 345, 2, 6, 7896]
                                                                                                                                                    */
public class EvenDigits_LEET {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        int EvenDigits = findNumbers(nums);
        System.out.println("The Integer with Even Number of Digits are: " + EvenDigits);

        System.out.println("The Integer with Even Number of Digits are: " + findNumb(nums));
    }

    static int findNumbers(int[] arr){
        int count = 0;
        for (int i=0; i<arr.length; i++){
            if (evenDigits(arr[i])){
                count+=1;
            }
        }
        return count;
    }
// We will check here if the digits is even or not
    static boolean evenDigits(int num){
        //  case if the numbers are negative
        if (num < 0){
            num = num * -1;
        }
        int NumberOfDigits = NumberEven(num);
        if (NumberOfDigits % 2 == 0){
            return true;
        }
        return false; // -> You can either do anyone of the following
       //  return NumberOfDigits % 2 == 0; -> Simplified form of the above
    }

// We will count here the number of digits
    static int NumberEven(int num){
        int count = 0;
        while(num > 0){
            num = num / 10;
            count+=1; // count++; same as
        }
        return count;
    }


    // ALTERNATIVE METHOD -> Converting Integer to String type

    static int findNumb(int[] arr){
        int count = 0;
        for (int i=0; i<arr.length; i++){
            String num = Integer.toString(arr[i]); // converting Integer type to String type
            if (num.length() % 2 == 0){
                count+=1;
            }
        }
        return count;
    }

}