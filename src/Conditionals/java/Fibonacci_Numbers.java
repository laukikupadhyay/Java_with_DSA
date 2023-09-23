package Conditionals.java;

import java.util.Scanner;

// Fibonacci Series: The sequence of numbers where the exactly two previous numbers are added together
public class Fibonacci_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth Fibonacci number: ");
        int num = input.nextInt();
        System.out.println();
            int a = 0;
            int b = 1;
// Find the nth Fibonacci Numbers?
            for (int i=2; i<=num; i++) // i is the index of the array which starts
            {
                int temp = b;
                b = a + b;
                a = temp;
                }
        System.out.println(b);
            }
    }

