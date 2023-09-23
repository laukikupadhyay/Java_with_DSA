package com.Strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        // % -> It is known as placeholder and is different for all primitive data types
        float a = 34.12345f; // provide f for float numbers
        int b = 24;
        System.out.printf("The formatted number is: %.2f", a); // for formatted String, we use printf
        System.out.printf("%f %s", a, b);

        System.out.println();
        System.out.println(Math.PI);
        System.out.println("Pie: %.2f" + Math.PI);
    }
}

/*
There are many format specifiers we can use. Here are some common ones:

%c - Character
%d - Decimal number (base 10)
%e - Exponential floating-point number
%f - Floating-point number
%i - Integer (base 10)
%o - Octal number (base 8)
%s - String
%u - Unsigned decimal (integer) number
%x - Hexadecimal number (base 16)
%t - Date/time
%n - Newline
 */