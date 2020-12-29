package com.lovetocode.priorityqueue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    public static void main( String[] args ) {
        PriorityQueue<Integer> pq = new PriorityQueue<> ();

        pq.add (23);
        pq.add (25);
        pq.add (78);
        pq.add (17);
        pq.add (7);
        pq.add (67);

        List<Integer> pqList = new ArrayList<> ();

        for(int i=0 ; i<pq.size (); i++){
            pqList.add (pq.poll ());
        }

        pqList.forEach (System.out::println);
    }
}
