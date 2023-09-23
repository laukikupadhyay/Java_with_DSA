package com.Switch_Cases;

import java.util.Scanner;
public class Switch_cases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        System.out.println("Enter a fruit name: " + fruit);

//       Method 1: "IF ELSE STATEMENT" : if(statement)
        if (fruit.equals("mango")) // .equals method checks the value
        {
            System.out.println("King of Fruit");
        }
        if (fruit.equals("apple"))
        {
            System.out.println("An apple a day keeps the doctor away");
        }


//        Method 2: "Switch Statements" : switch(expression)

        switch (fruit){
            case "mango":
                System.out.println("King of Fruit");
                break; // break statement terminates the sequence
            case "apple":
                System.out.println("An apple a day keeps doctor away");
                break;
            case "orange":
                System.out.println("It is a round fruit");
                break;
            case "grapes":
                System.out.println("It is the smallest fruit");
                break;
            default: // this gives a default statement if the expression fruit have a different value than the cases specified.
                System.out.println("You have not entered a valid fruit name");
        }
        // Enhanced Switch Statement:
        switch (fruit) {
            case "mango" -> System.out.println("King of Fruit");
            case "apple" -> System.out.println("An apple a day keeps doctor away");
            case "orange" -> System.out.println("It is a round fruit");
            case "grapes" -> System.out.println("It is the smallest fruit");
            default -> System.out.println("You have not entered a valid fruit name");
        }

            int day = input.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a valid month");
        }

        int days = input.nextInt();
        if (days == 1) {
            System.out.println("Monday");
        } else if (days == 2) {
            System.out.println("Tuesday");
        } else if (days == 3) {
            System.out.println("Wednesday");
        } else if (days == 4) {
            System.out.println("Thursday");
        } else if (days == 5) {
            System.out.println("Friday");
        } else if (days == 6) {
            System.out.println("Saturday");
        } else if (days == 7) {
            System.out.println("Sunday");
        }

        int month = input.nextInt();
        switch (month){
            case 1,4,6,7 -> System.out.println("January");
            case 2,3,5 -> System.out.println("March");
            case 8,12,9 -> System.out.println("May");
            case 10,11 -> System.out.println("August");
            default -> System.out.println("Please enter a valid month");
        }
        }
    }


