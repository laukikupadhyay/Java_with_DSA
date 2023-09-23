package com.Strings;

import java.util.Arrays;

public class Methods_In_String {
    public static void main(String[] args) {
        String name = "Laukik Upadhyay";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('U'));
        System.out.println(name.strip());
        System.out.println("   Rishu Khurana   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));


    }
}
