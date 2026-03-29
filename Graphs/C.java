package Graphs;

import java.util.ArrayList;
import java.util.List;

//! Adjancy list represnattion of graph  
public class C {

    List<List<Integer>> adjlist;

    // ! Constructor
    C(int nodes) {

        adjlist = new ArrayList<>();

        for (int i = 0; i < nodes; i++) {
            adjlist.add(new ArrayList<>());
        }
    }

    // ! Unweighted edges (FIXED)
    public void addEdgesInList(int edges[][], boolean isDirected) {
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];

            if (isDirected) {
                adjlist.get(u).add(v); // ✅ FIXED
            } else {
                adjlist.get(u).add(v); // ✅ FIXED
                adjlist.get(v).add(u); // ✅ FIXED
            }
        }
    }

    

    /*
     * 0 -> [1,2]
     * 1 -> [0]
     */
    public void printList() {
        for (int i = 0; i < adjlist.size(); i++) {
            System.out.print(i + " -> ");
            System.out.print("[");
            for (int j = 0; j < adjlist.get(i).size(); j++) {
                System.out.print(adjlist.get(i).get(j));
                if (j != adjlist.get(i).size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int nodes = 4;

        // Unweighted edges {u, v}
        int edges[][] = {
                { 0, 2 },
                { 0, 1 },
                { 1, 3 }
        };

        C graph = new C(nodes);

        graph.addEdgesInList(edges, false); // false = undirected

        graph.printList();
    }
}