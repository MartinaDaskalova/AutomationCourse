package methods.homework;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        System.out.println("Is the number a palindrome: " + isPalindrome(scanner.nextInt()));
    }

    public static boolean isPalindrome (int number){
        int temp = number;
        int leftover = 0;
        int reverse =0;

        while(temp > 0){

            leftover = temp % 10;
            reverse = (reverse * 10) + leftover;
            temp = temp/10;
        }
        if (number == reverse){
            return true;
        }
        else return false;
    }
}
