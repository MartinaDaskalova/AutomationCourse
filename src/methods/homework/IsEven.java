package methods.homework;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        System.out.println("Is the number even: " + isEven(scanner.nextInt()));
    }

    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }
        else return false;
    }
}
