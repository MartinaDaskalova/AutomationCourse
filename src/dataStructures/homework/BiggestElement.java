package dataStructures.homework;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter array size: ");
        int arraySize= scanner.nextInt();
        biggestNumber(arraySize);

    }


 public static void biggestNumber (int arraySize) {
     Scanner scanner = new Scanner(System.in);
     int[] myArray = new int[arraySize];
     int largestNum = 0;

     for (int i = 0; i < myArray.length; i++) {
         System.out.println("Enter Array elements: ");
         myArray[i] = scanner.nextInt();
         if (largestNum < myArray[i]) {
             largestNum = myArray[i];
         }
     }
     System.out.println(Arrays.toString(myArray));
     System.out.println("Largest number of the array is: " + largestNum);
 }

}