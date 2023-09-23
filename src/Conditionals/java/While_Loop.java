package Conditionals.java;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        /* LOOPS: 2. While Loop
        Syntax:
        initialisation;
        While(condition){
             body statement;
             increment/decrement;
         }*/

        //  Q1: print numbers from 1 to 5
        int num = 1;
        while (num<=5){
            System.out.println(num);
            num+=1;
        }

        // print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = in.nextInt();

        int i = 1;
        while(i<=n){
            System.out.println(i);
            i+=1;
        }


    }
}
