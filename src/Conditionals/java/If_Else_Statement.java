package Conditionals.java;

public class If_Else_Statement {
    public static void main(String[] args) {
        /* Syntax of IF Statement
            if (boolean expression-> T or F) {
            // body
            } else {
                // do this
         */
        int salary = 25400;
        if (salary > 10000) {
            salary = salary + 2000; // salary += 3000; -> it means the same
        } else {
            salary = salary + 1000;
        }
        System.out.println(salary);

        // Multiple IF statement
        String grades;
        int marks = 75;
        if (marks > 90) {
            grades = "A";
        } else if (marks > 75) {
            grades = "B+";
        } else if (marks < 75) {
            grades = "C";
        } else if (marks == 75) {
            grades = "C+";
        } else { // no parameters are mentioned for else as in the case of "else if"
            grades = "FAIL";
        }
        System.out.println(grades);

        // Conditions on IF ELSE statement using BITWISE operator

        int a = 10;
        int b = 20;

        if (a == 10 || b==20){ // OR OPERATOR(||)
            System.out.println("Hello World!");
        }

        if(a==10 && b==20){ // AND OPERATOR (&&)
            System.out.println("Hello World!");
        }

        if (a!=35){ // Not equals to 35. Hence, it will print Hello World!
            System.out.println("Hello World!");
        }
    }
}