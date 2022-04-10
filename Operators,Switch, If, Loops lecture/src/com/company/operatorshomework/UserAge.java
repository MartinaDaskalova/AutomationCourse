package com.company.operatorshomework;

import java.util.Scanner;

public class UserAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your age: ");
        int age = scanner.nextInt();

        if (age >=16){
            System.out.println(" You are eligible for work!");
        } else {
            System.out.println("You are not old enough to work,yet :)");
        }
    }
}
