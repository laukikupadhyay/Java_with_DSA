package com.Basics;

import java.util.Scanner;

// Any name which starts with a capital letter is a class coz it's a convention.
public class Sum_and_Difference{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();

//        float num1 = input.nextFloat();
//        float num2 = input.nextFloat();

        float num1 = input.nextInt(); // This is known as Type Casting and Type Conversion.
        float num2 = input.nextInt();

        float sum = num1 + num2;
        float  diff = num1 - num2;

        System.out.println("The sum of the number " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The difference between the number " + num1 + " and" + num2 + " is: " + diff);


    }
}
