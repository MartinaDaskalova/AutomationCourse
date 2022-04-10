package com.company;

public class ArrayLoop {
    public static void main(String[] args) {

        int [] arr = {2,3,4,5,6};

        for (int i =0; i< arr.length; i++){
            System.out.println("Element value is " + i);

        }

        for (int i =0; i <= 5; i++){
            System.out.println( "i from outer loop is " + i);

            for (int j = 0; j< 3; j++){
                System.out.println( "j from inner loop is " + j);
            }
        }


        for (int i =0; i <= 10; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("i from loop is " + i);
        }

        int int1;
    }

}

