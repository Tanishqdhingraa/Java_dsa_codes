package Graphs;

import java.util.ArrayList;
import java.util.List;

/*
========================================
CLASS E → Directed Graph Degree Concept
========================================

In Directed Graph:

Out-degree of a node = number of edges going OUT of that node
In-degree of a node  = number of edges coming INTO that node

Example:
Edge: 0 → 1

Out-degree(0) = 1
In-degree(1)  = 1
*/

public class E {

    List<List<Integer>> adjList;
    int nodes;

    // Constructor
    E(int nodes) {
        this.nodes = nodes;

        adjList = new ArrayList<>();

        // Create empty list for each node
        for (int i = 0; i < nodes; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add edges (DIRECTED)
    public void addEdges(int edges[][]) {

        /*
         * Each edge is {u, v}
         * Meaning: u → v
         */

        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];

            adjList.get(u).add(v); // only one direction
        }
    }

    // Calculate Out-Degree
    public void outDegree() {

        /*
         * Out-degree = size of adjacency list of that node
         */

        System.out.println("Out-Degree:");

        for (int i = 0; i < nodes; i++) {
            System.out.println("Node " + i + " → " + adjList.get(i).size());
        }
    }

    // Calculate In-Degree
    public void inDegree() {

        /*
         * In-degree calculation:
         * Count how many times a node appears
         * in all adjacency lists.
         */

        int indegree[] = new int[nodes];

        // Traverse entire adjacency list
        for (int i = 0; i < nodes; i++) {

            for (int neighbor : adjList.get(i)) {
                indegree[neighbor]++;
            }
        }

        System.out.println("In-Degree:");

        for (int i = 0; i < nodes; i++) {
            System.out.println("Node " + i + " → " + indegree[i]);
        }
    }

    public static void main(String[] args) {

        int nodes = 4;

        E graph = new E(nodes);

        /*
         * Directed edges:
         * 0 → 1
         * 0 → 2
         * 1 → 3
         */

        int edges[][] = {
                { 0, 1 },
                { 0, 2 },
                { 1, 3 }
        };

        graph.addEdges(edges);

        graph.outDegree();
        System.out.println();
        graph.inDegree();
    }
}