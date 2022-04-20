package methods.homework;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");

        middleChar(scanner.nextLine());
    }
    public static void middleChar (String myString){
        int length = myString.length();

        if (length % 2 ==0){
            System.out.println(myString.charAt(length / 2));
            System.out.println(myString.charAt((length / 2) -1));
        } else {
            System.out.println((myString.charAt( length / 2)));
        }
    }
}
