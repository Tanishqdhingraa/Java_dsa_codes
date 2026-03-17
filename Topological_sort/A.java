// Goal:
// Find a linear ordering of vertices in a Directed Acyclic Graph (DAG)
// such that for every directed edge u → v,
// u appears before v in ordering.

// Approach (DFS + Stack):

// 1. Create a visited array.
// 2. For every unvisited node:
//       → Perform DFS.
// 3. In DFS:
//       → Visit all neighbours first.
//       → After visiting neighbours, push node into stack.
// 4. Pop elements from stack.
//    That gives topological order.

// Why push after DFS?
// Because a node should come after its dependencies.
package Topological_sort;

import java.util.*;

//! Topological Sort using DFS + Stack

class Solution {

    // ? DFS Function
    void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited,
            Stack<Integer> stack) {

        visited[node] = true;                          

        // Visit all neighbours
        for (int neighbour : adj.get(node)) {
            if (!visited[neighbour]) {
                dfs(neighbour, adj, visited, stack);
            }
        }

        // Push after visiting neighbours 
        stack.push(node);
    }

    // Topological Sort Function
    ArrayList<Integer> topoSort(int V,
            ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        // Perform DFS for all vertices
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, stack);
            }
        }
        // Pop stack to get result
        ArrayList<Integer> result = new ArrayList<>();

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }
}

// Driver Code

public class A {

    public static void main(String[] args) {

        int V = 6;

        // Create adjacency list
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

        // DirectedCyclic obj = new DirectedCyclic();
        // ArrayList<Integer> topoOrder = obj.topoSort(V, adj);

        // System.out.print("Topological Sort: ");
        // for (int node : topoOrder) {
        //     System.out.print(node + " ");
        // }
    }
}