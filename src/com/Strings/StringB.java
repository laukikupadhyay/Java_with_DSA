package com.Strings;
/*
We know, that string objects are immutable i.e., they cannot be modified so in the above case different objects are
         created at every iteration by appending(adding) a new object to the old one which takes a lot of time and memory.
         This method can be implemented using StringBuilders concept because it helps in modifying the String objects without
         creating different objects.
         Time Complexity: O(N)
 */
public class StringB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<26; i++){
            char ch = (char)('a' + i);
            builder.append(ch); // append means to add something
        }
        System.out.println(builder);
        System.out.println(builder.toString());

        builder.reverse();
        System.out.println(builder);

        builder.insert(2, 'A');
        System.out.println(builder);

        builder.delete(1, 7);
        System.out.println(builder);

        builder.deleteCharAt(7);
        System.out.println(builder);

    }
}
