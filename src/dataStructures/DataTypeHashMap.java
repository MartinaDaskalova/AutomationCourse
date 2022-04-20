package dataStructures;

import java.util.HashMap;
import java.util.Map;

public class DataTypeHashMap {

    public static void main(String[] args) {
        // creating a "key, value" pair
        HashMap<Integer,String> map = new HashMap<>();
       // adds a key and value to the map
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");
        map.put(5,"Grapes");

        for (Integer i: map.keySet()) {
            System.out.println(i + " " + map.get(i));

        }

        for(Map.Entry myMapEntry :map.entrySet()){
            System.out.println("Original List " + myMapEntry.getKey() + " " + myMapEntry.getValue());
        }

        map.replace(2,"Strawberry");

        for (Map.Entry m: map.entrySet()){
            System.out.println("Updated list " + m.getKey() + " " + m.getValue());
        }


    }
}
