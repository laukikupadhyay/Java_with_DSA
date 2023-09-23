package com.Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = input.next();

        boolean IsPal = palindrome(str);
        System.out.println("The word has a palindrome: " + IsPal);

    }
    static boolean palindrome(String str) {
        if (str.length() == 0){
            return false;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}