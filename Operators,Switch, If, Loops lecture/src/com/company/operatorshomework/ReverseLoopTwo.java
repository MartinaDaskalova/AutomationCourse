package com.company.operatorshomework;

import java.util.Arrays;

public class ReverseLoopTwo {
    public static void main(String[] args) {
        int [] array = {10,20,30,40,50};
        int maxIndex = array.length-1;
        int halfSize = array.length/2;
        System.out.println("Array = " + Arrays.toString(array));

        for (int i= 0; i <halfSize; i++){
            int temp = array [i];
            array[i] = array [maxIndex-i];
            array[maxIndex-i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));

    }
}
