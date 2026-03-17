// Goal:
// Find Topological Ordering of a Directed Acyclic Graph (DAG).

// Key Concept:
// Use IN-DEGREE of nodes.

// Steps:

// 1. Calculate in-degree of all vertices.
// 2. Add all nodes with in-degree = 0 into queue.
// 3. While queue is not empty:
//       → Remove node
//       → Add it to result
//       → Reduce in-degree of its neighbours
//       → If neighbour’s in-degree becomes 0, add to queue
// 4. If result size != V → graph has cycle.

// Why this works?
// Because nodes with in-degree 0 have no dependencies.


package Topological_sort;

import java.util.*;

// Kahn's Algorithm (Topological Sort using BFS)


class KahnSolution {

    ArrayList<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj) {

        int[] indegree = new int[V];

        // Step 1: Calculate indegree of each node
        for (int i = 0; i < V; i++) {
            for (int neighbour : adj.get(i)) {
                indegree[neighbour]++;
            }
        }

        // Step 2: Add all nodes with indegree 0 into queue
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        // Step 3: BFS
        while (!queue.isEmpty()) {

            int node = queue.poll();
            result.add(node);

            // Reduce indegree of neighbours
            for (int neighbour : adj.get(node)) {
                indegree[neighbour]--;

                if (indegree[neighbour] == 0) {
                    queue.offer(neighbour);
                }
            }
        }
        if (result.size() != V) {
            System.out.println("Cycle detected! Topological sort not possible.");
        }

        return result;
    }
}

// Driver Code


public class Kahn {

    public static void main(String[] args) {

        int V = 6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        /*
         * Graph Edges:
         * 5 → 0
         * 5 → 2
         * 4 → 0
         * 4 → 1
         * 2 → 3
         * 3 → 1
         */

        adj.get(5).add(0);
        adj.get(5).add(2);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        KahnSolution obj = new KahnSolution();
        ArrayList<Integer> topoOrder = obj.topoSort(V, adj);

        System.out.print("Topological Sort (Kahn's BFS): ");
        for (int node : topoOrder) {
            System.out.print(node + " ");
        }
    }
}