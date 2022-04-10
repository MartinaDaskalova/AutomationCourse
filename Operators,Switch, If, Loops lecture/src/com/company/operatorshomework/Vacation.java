package com.company.operatorshomework;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vacation location:");
        String vacationType = (scanner.next());
        int budget;

        switch (vacationType){
            case "Beach":
                System.out.println("Enter budget per day per person:");
                budget = scanner.nextInt();
            if (budget < 50){
                System.out.println("Your vacation location is Bulgaria!");
            } else System.out.println("You should go outside Bulgaria");
            break;

            case "Mountain":
                System.out.println("Enter budget per day per person:");
                budget = scanner.nextInt();
                if(budget < 30){
                    System.out.println("Your vacation location is Bulgaria!");
                } else System.out.println("You should go outside Bulgaria");
                break;

            default :
                System.out.println("No information about this type of location!");
        }

    }
}
