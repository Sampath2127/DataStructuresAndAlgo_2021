package com.lovetocode.graphs;

public class Main {

    public static void main( String[] args ) {
        Graph graph = new Graph ();
        graph.addVertex (1);
        graph.addVertex (3);
        graph.addVertex (7);
        graph.addVertex (9);
        graph.addVertex (11);
        graph.addEdge (1,3);
        graph.addEdge (1,7);
        graph.addEdge (3,7);
        graph.addEdge (3, 9);
        graph.addEdge (9,11);
        graph.showConnections ();
    }
}
