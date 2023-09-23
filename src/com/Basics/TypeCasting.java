package com.Basics;

import java.util.Scanner;
/* TypeCasting: It is when you assign a value of one primitive type to another.
Two types of casting: Widening and Narrowing.
Widening: Converting a smaller type to a larger type. It happens automatically
Narrowing: Converting a larger type to a smaller type.
                                                                            */
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // This is Widening casting. It happens automatically
        float marks = input.nextInt(); // float is larger value type and hence it can store integer values as well automatically
        System.out.println(marks);

        // This is Narrowing Casting
        int num = (int)(65.75f); // here, int is a smaller data type and hence typecasting is required
        System.out.println(num);

        float decimal = (float)(479.4926656289658236805628965d);
        System.out.println(decimal);

        // automatic type promotion in expressions
        int a = 257;
        // the maximum range of byte variables is 256.
        byte b = (byte)(a);
        System.out.println(b); // ans: 257 % 256 = 1

        byte c = 50;
        byte d = 40;
        byte e = 100;
        int f = c * d / e;
        /* Here, byte has a range of 256 and the intermediate term "c*d"
         already exceeds the byte operator range. But, the operation is still performed
         because java automatically converts the expression c*d into an integer.*/
        System.out.println(f);

        int number = 'a';
        System.out.println(number); // It prints the ASCII value in this case

        float  numb = 'A';
        System.out.println(numb);

        System.out.println(3 * 5.66856378f); // this will generate a float number.

        byte z = 56;
        System.out.println(z);

    }
}
