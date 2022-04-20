package dataStructures.homework;

import java.util.Arrays;
import java.util.Scanner;

public class MultiLevelMatrixWithInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        fillMatrix(scanner.nextInt(), scanner.nextInt());


    }

    public static void fillMatrix(int rows, int columns){
        Scanner scanner = new Scanner(System.in);
        int[][] myArray = new int[rows][columns];
        for (int i = 0; i < myArray.length ; i++) {
            for (int j = 0; j < myArray.length ; j++) {
                System.out.println("Enter values for matrix: ");
                myArray[i][j] = scanner.nextInt();
            }
        }
        for (int[] ints : myArray) {
            for (int b = 0; b < myArray.length; b++) {
                System.out.println("Matrix values are: " + ints[b]);
            }
        }
    }

}
