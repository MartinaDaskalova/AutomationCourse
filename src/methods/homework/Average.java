package methods.homework;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values:");
        System.out.println("Average of three numbers is: " + calculateAvg(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
    }

    public static double calculateAvg(int a, int b, int c){
        return (a + b+ c /3 );
    }
}
