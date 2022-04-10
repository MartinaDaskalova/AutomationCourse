package com.company.operatorshomework;

import java.util.Arrays;

public class ReverseLoop {
    public static void main(String[] args) {

        int [] array = {10,20,30,40,50};
        int [] reverse = new int[array.length];
        int counter = 0;

        for ( int i = array.length-1; i >= 0; i--){
            reverse[counter] = array [i];
            counter++;
        }

        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Reverse Array = " + Arrays.toString(reverse));
    }
}
