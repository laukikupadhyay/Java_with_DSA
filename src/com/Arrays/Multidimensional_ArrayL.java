package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Multidimensional_ArrayL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // array list of array list of integers

        // initialisation
        for (int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }

        // adding elements
        for (int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                    list.get(i).add(input.nextInt());
                }
        }

        System.out.println(list);

    }
}
