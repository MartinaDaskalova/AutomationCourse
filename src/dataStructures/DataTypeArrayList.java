package dataStructures;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class DataTypeArrayList {
    public static void main(String[] args) {



        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.set(1,"Mercedes"); //change element
        cars.remove(2); //removes element
        System.out.println(cars);
        System.out.println(cars.get(1));
        Collections.sort(cars); //сортира листа


        LinkedList<String> cars2 = new LinkedList<String>();
        cars2.add("Volvo");
        cars2.addFirst("Volvo"); // adds on first position
        cars2.addLast("Ford"); // adds on last position
        cars2.add("BWM");
        cars.remove(""); // removes first element

        boolean isRemoved = cars.contains("Mazda"); //checks if the list contain the following element
        System.out.println(isRemoved);
        System.out.println(cars2.getFirst());
    }
}
