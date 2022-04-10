package com.company.operatorshomework;

import java.util.Scanner;

public class RevenueCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double discount;
        double revenue;

        System.out.println("Enter unit price: ");
        double unitPrice = scanner.nextInt();

        System.out.println("Enter quantity: ");
        double unitQuantity = scanner.nextInt();

        if (100 <= unitQuantity && unitQuantity <= 120){
            discount = ((unitPrice * unitQuantity) * 15) / 100;
            revenue = (unitPrice * unitQuantity) - discount ;

            System.out.println("Revenue from sale is: " + revenue + "\n"
            + "Your discount is: " + discount);
        } else if (unitQuantity > 120){
            discount = ((unitPrice * unitQuantity) * 20) / 100;
            revenue = (unitPrice * unitQuantity) - discount ;

            System.out.println("Revenue from sale is: " + revenue + "\n"
                    + "Your discount is: " + discount);
        } else if (unitQuantity < 100){
            revenue = unitPrice * unitQuantity ;

            System.out.println("Revenue from sale is: " + revenue + "\n"
                    + "You have no discount");
        }

    }
}
