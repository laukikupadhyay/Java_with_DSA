package com.Basics;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:  ");
        float cel = input.nextFloat();
        float fah = (cel * 9/5) + 32; // formula to convert celsius to fahrenheit
        System.out.println("The temperature in Fahrenheit is: " + fah);
    }
}
