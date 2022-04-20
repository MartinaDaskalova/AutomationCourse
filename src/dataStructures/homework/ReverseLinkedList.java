package dataStructures.homework;

import com.sun.jdi.connect.spi.TransportService;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter list size: ");
        reverseLinkedList(scanner.nextInt());

    }

    public static void reverseLinkedList (int listSize){
        Scanner scanner = new Scanner(System.in);
        LinkedList <String> Dragons = new LinkedList<>();
        for (int i = 0; i < listSize ; i++) {
            System.out.println("Enter a dragon: ");
            Dragons.add(scanner.nextLine());
        }
        System.out.println("Linked List is: " + Dragons);

        int halfSize = listSize/2;
        String tempElement;
        for (int i = 0; i < halfSize ; i++) {
            tempElement = Dragons.get(i);
            System.out.println("Temp is " + tempElement);
            Dragons.set(i,Dragons.get(listSize-1));
            Dragons.set(listSize-1,tempElement);
            listSize--;
        }
        System.out.println("Reverse Linked List is: " + Dragons);
    }


}
