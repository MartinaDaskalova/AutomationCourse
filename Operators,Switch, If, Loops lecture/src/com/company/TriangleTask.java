package com.company;

import java.util.Scanner;

public class TriangleTask {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner (System.in);
        System.out.println("enter value for angle A: ");
        int angleA = myScanner.nextInt();
        System.out.println("The value of angle A is: " + angleA);

        System.out.println("enter value for angle B: ");
        int angleB = myScanner.nextInt();
        System.out.println("The value of angle B is: " + angleB);

        System.out.println("enter value for angle C: ");
        int angleC = myScanner.nextInt();
        System.out.println("The value of angle C is: " + angleC);

        if(angleA <=0 || angleB <= 0 || angleC <= 0){
            System.out.println("This is not a valid triangle!");
        }
        else if (angleA + angleB + angleC != 180){
            System.out.println("This is not a valid triangle!");
        }
        else {
            System.out.println("This is a valid triangle.");
        }
        if (angleA < 90 || angleB < 90 || angleC <90){
            System.out.println("Тригълънкика е остроъгълен.");
        }
    }

}
