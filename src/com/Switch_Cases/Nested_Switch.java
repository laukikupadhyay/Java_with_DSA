package com.Switch_Cases;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your StudentID No:");
        int studentID = input.nextInt();

        // Enhanced Nested Switch Statement: better and more efficient way
        switch (studentID) {
            case 1 -> System.out.println("Anish Kumar Khullar");
            case 2 -> System.out.println("Jitesh Kumar");
            case 3 -> {
                System.out.println("Laukik Upadhyay");
                System.out.print("Please enter your department:");
                String dept = input.next();

                switch (dept) {
                    case "IT" -> System.out.println("Information Technology");
                    case "CSE" -> System.out.println("Computer Science");
                    case "AI" -> System.out.println("Artificial Intelligence");
                    case "ML" -> System.out.println("Machine Learning");
                    default -> System.out.println("Did not enter a valid department name!");
                }
            }
            default -> System.out.println("Enter a valid Employee ID number!");
        }

        // Switch Statement: standard switch
        switch (studentID){
            case 1:
                System.out.println("Anish Kumar Khullar");
                break;
            case 2:
                System.out.println("Jitesh Kumar");
                break;
            case 3:
                System.out.println("Laukik Upadhyay");
                String dept = input.next();
                System.out.println("Please enter your department:");
                switch (dept){
                    case "IT":
                        System.out.println("Information Technology");
                        break;
                    case "CSE":
                        System.out.println("Computer Science");
                        break;
                    case "AI":
                        System.out.println("Artificial Intelligence");
                        break;
                    case "ML":
                        System.out.println("Machine Learning");
                        break;
                    default:
                        System.out.println("Did not enter a valid department name!");
                }
                break;
            default:
                System.out.println("Enter a valid Employee ID number!");
        }
    }
}
