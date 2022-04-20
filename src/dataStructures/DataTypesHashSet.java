package dataStructures;

import java.lang.reflect.Array;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class DataTypesHashSet {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Six");
        set.add("Six");
        set.add("ten");
        set.add("2");
        System.out.println("Set is: " + set);

        set.remove("Two");
        System.out.println("Set after removing is: " + set);

        ArrayList<String> copyHashSet = new ArrayList<>(); //create an empty ArrayList

        for (String i: set) {  //use this loop to copy all elements from the HashSet to the empty ArrayList
            copyHashSet.add(i);
        }
        Collections.sort(copyHashSet); // orders ArrayList by ascending
        System.out.println("Copied HashSet to ArrayList: " + copyHashSet);

        Collections.reverse(copyHashSet); // order the ArrayList by descending
        System.out.println("Reverse order for ArrayList "+ copyHashSet);


        Iterator<String> myIterator = set.iterator();
        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }
    }
}
