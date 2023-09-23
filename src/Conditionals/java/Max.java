package Conditionals.java;

import java.util.Scanner;
// Program to find the largest number out of three
public class Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first no: ");
        int a = input.nextInt();
        System.out.print("Enter the second no: ");
        int b = input.nextInt();
        System.out.print("Enter the third no: ");
        int c = input.nextInt();
// METHOD: 1 -> Comparing all the values
//        if (a > b) {
//            if (a > c) {
//                System.out.println(a + " is the largest number!");
//            }
//        }
//        if (b > c) {
//            System.out.println(b + " is the largest number!");
//        } else System.out.println(c + " is the largest number!");
//    }
// METHOD 2: -> taking a max value variable storing the largest number
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(max + " is the largest number");
//    }

// METHOD 3: ->
        int maxx = 0;
        if (a > b) {
            if (a > c) {
                maxx = a;
            }
        }
        if (b > c) {
            maxx = b;
        } else {
            maxx = c;
        }
        System.out.println(maxx + " is the largest number");

//Method 5: Using class Math.max

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}
