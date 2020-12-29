package com.lovetocode.maps;

import java.util.Map;

public class HashMap {

    public static Map<Integer, String> phoneToName = new java.util.HashMap<> ();

    /**
     *
     * advantages include constant lookup, add and delete operations.
     * Disadvantages include time complexity increases in case of collisions occur in case of large data.
     */
    public static void main( String[] args ) {
        phoneToName.put (12345, "Sam");
        phoneToName.put (12347, "Sam");
        phoneToName.put (12346, "Sam");

        phoneToName.forEach ((x,y) -> System.out.println ("Key "+x+" value "+y));
    }


}
