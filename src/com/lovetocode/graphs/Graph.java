package com.lovetocode.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private int numberOfNodes;
    private Map<Integer, List<Integer>> adjacentMap;

    public Graph() {
        this.numberOfNodes = 0;
        this.adjacentMap = new HashMap<> ();
    }

    public void addVertex( int node ) {
        adjacentMap.put (node, new ArrayList<> ());
        numberOfNodes++;
    }

    //This is for undirected Graph
    public void addEdge( int node1, int node2 ) {
        adjacentMap.get (node1).add (node2);
        adjacentMap.get (node2).add (node1);
    }

    public void showConnections() {
        Object[] keys = adjacentMap.keySet ().toArray ();
        for ( int key : adjacentMap.keySet ()
        ) {
            System.out.println (key + " ---> "+ adjacentMap.get (key));
        }
    }


}
