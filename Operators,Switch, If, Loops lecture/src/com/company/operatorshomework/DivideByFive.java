package com.company.operatorshomework;

public class DivideByFive {
    public static void main(String[] args) {

        int [] array = {12,15, 32, 42, 55, 75, 122, 132, 150, 180, 200};


        for (int j : array) {
            if (j % 5 == 0) {
                System.out.println("All numbers divided by 5 are: " + j);
                if (j == 150) {
                    break;
                }

            }
        }

    }
}
