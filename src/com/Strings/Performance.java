package com.Strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i=0; i<26; i++){ // complexity here was 0(N^2)
            char ch = (char)('a' + i); // if (char) is not provided then it will add the ASCII Values.
            series = series + ch; // series+=ch -> here, series = "" + a = a and it goes so on
            System.out.println(ch);
        }
        System.out.println(series);
        /*
         We know, that string objects are immutable i.e., they cannot be modified so in the above case different objects are
         created at every iteration by appending(adding) a new object to the old one which takes a lot of time and memory.
         This method can be implemented using StringBuilders concept because it helps in modifying the String objects without
         creating different objects.
         */

    }
}






