package methods.homework;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values:");
        System.out.println("Smallest number is: " + smallestNumber(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
    }

    public static int smallestNumber (int num1, int num2, int num3){
        if(num1 < num3 && num1<num2){
            return num1;
        }
        else if(num2< num1 && num2< num3){
            return num2;
        }
        else return num3;
    }
}
