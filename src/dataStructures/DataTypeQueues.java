package dataStructures;

import java.util.PriorityQueue;
import java.util.Queue;

public class DataTypeQueues {

    public static void main(String[] args) {

        Queue <String> pq = new PriorityQueue<>();
        pq.add("TestA");
        pq.add("TestB");
        pq.add("TestC");
        pq.add("TestD");
        System.out.println(pq);
        pq.remove(); // removes first element

        System.out.println(pq);

        for (String i: pq) {
            System.out.println(i);
        }
    }
}
