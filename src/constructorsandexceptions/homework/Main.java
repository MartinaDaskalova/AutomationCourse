package constructorsandexceptions.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        int x,y;

        System.out.println("Enter X: ");
        System.out.println("Enter Y: ");
        if(scanner.hasNextInt()){

            x = scanner.nextInt();

            //y = scanner.nextInt();

//            System.out.println( "X/Y = " + x/y);
        }

        else {
            throw new IllegalArgumentException("Input must be an int value!");
        }



//        try {
//            System.out.println( "X/Y = " + x/y);
//        }
//        catch(Exception e){
//            e.printStackTrace();
//            System.out.println("Invalid value of Y=0 - /0 not allowed");
//        }
//        catch () {
//
//        }
    }

    public static void divideNumbers (double number1, double number2){

    }
}
