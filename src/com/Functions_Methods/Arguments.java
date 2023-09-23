package com.Functions_Methods;

public class Arguments {
    public static void main(String[] args) {
         // you have to pass the value in the order of declaration of the data types in the arguments
        int ans = add(4, 5);
        System.out.println(ans);

    }
  // pass the value of numbers when you are calling the method in main function.
  static int add(int a, int b){
      int sum = a + b;
      return sum;
  }

}
