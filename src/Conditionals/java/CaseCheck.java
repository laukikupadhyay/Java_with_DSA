package Conditionals.java;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch = input.next().trim().charAt(3);

        // charAT() returns a character out of a String or collection of words
        System.out.println(ch);
        System.out.println(input.next().trim());

        String word = "Rishu Khurrana";
        System.out.println(word.charAt(4));

        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
