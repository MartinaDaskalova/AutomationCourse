package dataStructures.homework;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Matrix size: ");
        diagonalSum(scanner.nextInt(), scanner.nextInt());

    }

 public static void diagonalSum(int rows, int columns){
     int[][] myArray = new int[rows][columns];
     Scanner scanner = new Scanner(System.in);
     int diagonalSum =0;
     for (int i = 0; i < myArray.length ; i++) {
         for (int j = 0; j < myArray.length ; j++) {
             System.out.println("Enter values for Matrix: ");
             myArray[i][j] = scanner.nextInt();
             if ( i == j){
                 diagonalSum += myArray[i][j];
             }
         }
     }
     System.out.println("Sum of the diagonals is " + diagonalSum);
     }


 }
