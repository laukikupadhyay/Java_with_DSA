package Conditionals.java;
// LOOPS: They are used for completing long computing task efficiently and quickly
public class Do_While {
    public static void main(String[] args) {
        /*
        // LOOPS: Do While
        Syntax:
        initialisation;
        do{
            body statement;
         } while(condition)
         */
        // Q1: print numbers from 1 to 10
//        int num = 1;
//        do{
//            System.out.println("Hello World!");
//            num++;
//        } while(num<=10);

        // Q2: WAP to calculate the sum of first 10 natural numbers.

        int sum = 0;
        int no = 1;
         do{
            sum = sum + no; // the value of LHS sum will be updated on every iteration
            no+=1;
         }while(no<=10);
        System.out.print("The sum of the first 10 natural numbers are: " + sum );
    }
}
