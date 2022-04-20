package oopprinciples.homework.shapes;

import oopprinciples.homework.shapes.Circle;
import oopprinciples.homework.shapes.Shape;
import oopprinciples.homework.shapes.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double myNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a number: ");
        myNumber = scanner.nextDouble();
        Circle s1 = new Circle();
        System.out.println(s1.getArea(myNumber));
        System.out.println(s1.getPerimeter(myNumber));

        Shape s2 = new Circle();
        System.out.println(s2.getArea(myNumber));
        System.out.println(s2.getPerimeter(myNumber));
        System.out.println(s2);
        Circle s3 = (Circle) s2; // downcasting back to Circle
        System.out.println(s2.getPerimeter(myNumber));

        Square s5 = new Square();
        System.out.println(s5.getArea(myNumber));
        System.out.println(s5.getPerimeter(myNumber));
    }
}
