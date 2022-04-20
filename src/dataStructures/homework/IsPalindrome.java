package dataStructures.homework;

import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        isPalindrome(scanner.nextLine());
    }

    public static void isPalindrome (String word){
        int j = word.length()-1;
        for (int i = 0; i < word.length();i++) {
            char charA = word.charAt(i);
            char charB = word.charAt(j);
            j--;
            if(charA != charB){
                System.out.println("Not a Palindrome!");
            }
        }
        System.out.println("Word is a Palindrome.");
    }
}
