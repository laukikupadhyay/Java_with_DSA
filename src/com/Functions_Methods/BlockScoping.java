package com.Functions_Methods;

public class BlockScoping {
    public static void main(String[] args) {
        int a = 10;
        String name = "Laukik";
        System.out.println(a);

/* NOTE: 1. Every function(or method) has its own scope.
         2. Anything that is initialised outside the block, can be used inside
         the block(without any initialisation) but anything initialised inside the
         block cannot be used outside the block(until and unless it is initialised again)
         3. Values of the Initialised variable in the main method can be updated in
         the methods defined under that main function.(without initialising it)
         4. {....} -> This can be referred as blocks
*/
        {
//              int a = 23;  -> a cannot be initialised since it's already initialised outside the block in the same method.
                a = 54; // reassign the original ref variable to some other value
                System.out.println(a);

                name = "Anish"; // String name value is updated
                System.out.println(name);

                int c = 67;
                System.out.println(c);
                // values initialised in this block will remain in this block
        }
        System.out.println(a);
       // System.out.println(c); -> Cannot be used since its defined and initialised inside a different method

        //  FOR loop will also have its own scope
            for (int i=0; i<5; i++){
                System.out.println(i);
                int num = 90;
                a  = 10; // updating
            }

        System.out.println(a);
        //       System.out.println(c); -> cannot use outside the block.

    }
}


