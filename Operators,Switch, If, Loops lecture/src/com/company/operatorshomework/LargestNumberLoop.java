package com.company.operatorshomework;

import java.util.Scanner;

public class LargestNumberLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int [] arr = new int [5];

        for (int i = 0; i < 8; i++){
            System.out.println(" Enter number for array: ");
            arr[i] = scanner.nextInt();
        }


        int largestNumber = arr[0];
        for (int j = 1; j < arr.length;j++){
            if(largestNumber < arr[j]){
                largestNumber = arr[j];
            }
        }
        System.out.println("Largest number in arrays is "+ largestNumber);
    }
        }
