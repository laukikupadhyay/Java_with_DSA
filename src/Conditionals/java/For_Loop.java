package Conditionals.java;

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
        // LOOPS: 1. For Loop
        /*
         Syntax:
         for (initialisation; condition; increment/decrement) {
               statement body
         */
        // Q1: print numbers from 1 to 5
         for(int i=1; i<=5; i++) { // , here, i++ can also be written as i += 1
             System.out.println(i);
         }
         // Q2: print numbers from 1 to n
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number:");
         int n = input.nextInt();

         for (int num=1; num<=n; num+=1){
             System.out.print(num);
         }

        // Q3: print Hello World 5 times
         String intro = "Hello World";
         for(int i=1; i<=5; i++){
             System.out.println(intro);
         }
    }
}
