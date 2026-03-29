package Graphs;

import java.util.ArrayList;
import java.util.List;

public class D {
    class Pair {
        int node;
        int weight;

        Pair(int n, int w) {
            node = n;
            weight = w;
        }

        // (node, weight)
        @Override
        public String toString() {
            return "(" + node + "," + weight + ")";
        }
    }
    int adjMatrix[][];

    List<List<Integer>> adjList;  


    List<List<Pair>> adjListWithWeight;
     

    D(int nodes){
        adjMatrix = new int[nodes][nodes]; //4*4 [0..]
        adjList = new ArrayList<>();
        adjListWithWeight = new ArrayList<>();
        for(int i=0;i<nodes;i++){
            adjList.add(new ArrayList<>());
            adjListWithWeight.add(new ArrayList<>());
        }
    }

    public void addEdgesInList(int edges[][], boolean isDirected) {
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            // directed
            if (isDirected) {
                adjList.get(u).add(v);
            } else {
                // undirected
                adjList.get(u).add(v);
                adjList.get(v).add(u);
            }
        }
    }

    public void addEdgesWithWeightInList(int edges[][], boolean isDirected) {
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            // directed
            if (isDirected) {
                Pair pair = new Pair(v, w);
                adjListWithWeight.get(u).add(pair);
            } else {
                // undirected
                Pair pair1 = new Pair(v, w);
                Pair pair2 = new Pair(u, w);
                adjListWithWeight.get(u).add(pair1);
                adjListWithWeight.get(v).add(pair2);
            }
        }
    }

    public static void main(String[] args) {

        int nodes = 4;

        D graph = new D(nodes);

        // -------- Unweighted Graph --------
        int edges1[][] = {
                { 0, 2 },
                { 0, 1 },
                { 1, 3 }
        };

        graph.addEdgesInList(edges1, false);

        System.out.println("Unweighted Adjacency List:");
        for (int i = 0; i < graph.adjList.size(); i++) {
            System.out.println(i + " -> " + graph.adjList.get(i));
        }

        // -------- Weighted Graph --------
        int edges2[][] = {
                { 0, 2, 5 },
                { 0, 1, 3 },
                { 1, 3, 7 }
        };

        graph.addEdgesWithWeightInList(edges2, false);

        System.out.println("\nWeighted Adjacency List:");
        for (int i = 0; i < graph.adjListWithWeight.size(); i++) {
            System.out.println(i + " -> " + graph.adjListWithWeight.get(i));
        }
    }

}
