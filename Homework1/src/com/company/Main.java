package com.company;

public class Main {

    public static void main(String[] args) {
        // 1 задача

        String firstName = new String ("Martina");
        String middleName = new String ("Boikova");
        String lastName = new String ("Daskalova");

        System.out.println("My full name is " + firstName + " " + middleName + " " + lastName);


        // 2 задача

        double sideA = 5;
        double sideB = 6;
        double sideC = 7;

        double triangleParam = sideA + sideB + sideC;
        System.out.println("The parameter of the triangle is: " + triangleParam);

        // 3 задача

        double sideA = 14.5;
        double sideB = 53.53;
        double S = sideA*sideB/2;

        System.out.println("The surface of the triangle is: " + triangleParam);

        // 4 задача

//        System.out.print(" ");
//        System.out.print(" ");
//        System.out.print("*");
//        System.out.print(" ");
//
//        System.out.println();
//
//        System.out.print(" ");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//
//        System.out.println();
//
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");
//        System.out.print("*");



        printChristmasTree(5);
    }

    static void printChristmasTree (int treeHeight){

        for (int i = 1; i<= treeHeight; i++){
            for (int j = treeHeight -i; j> 0; j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

