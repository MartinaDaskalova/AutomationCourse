package dataStructures;

import java.util.Stack;

public class DataTypesStack {
    public static void main(String[] args) {

        Stack<String> elements = new Stack();
        elements.push("Test1"); //adds on top of the last added element. Works like MtG Stack
        elements.push("Test2");
        elements.push("Test3");
        elements.push("Test4");
        System.out.println(elements);

        elements.pop(); // removes the last added element
        System.out.println(elements);
    }
}
