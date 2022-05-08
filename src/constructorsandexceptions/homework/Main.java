package constructorsandexceptions.homework;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    divideNumbers();


    }

    public static void divideNumbers (){
       Scanner scanner = new Scanner(System.in);
       int x,y;
        System.out.println("Enter X: ");

        if(scanner.hasNextInt()){

             x = scanner.nextInt();
        }
        else {
            throw new IllegalArgumentException("Input must be an int value!");
        }
        System.out.println("Enter Y: ");
        if(scanner.hasNextInt()){

            y = scanner.nextInt();

        }
        else {
            throw new IllegalArgumentException("Input must be an int value!");
        }

        try {
            double result = x/y;
            System.out.println("x/y = " + result);

        }
        catch (ArithmeticException e){
            System.out.println("Error: Division by zero!");

        }
    }

}
