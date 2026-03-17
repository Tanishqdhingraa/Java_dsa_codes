package Topological_sort;

import java.util.*;

class DirectedCyclic {

    // Function to detect cycle in a directed graph
    public boolean isCyclic(int V, int[][] edges) {

        // Step 1️⃣: Build adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
        }

        // Step 2️⃣: Compute indegree
        int[] indegree = new int[V];

        for (int[] edge : edges) {
            int v = edge[1];
            indegree[v]++;
        }

        // Step 3️⃣: Add 0 indegree nodes to queue
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int count = 0;

        // Step 4️⃣: Kahn's Algorithm
        while (!queue.isEmpty()) {

            int node = queue.poll();
            count++;

            for (int neighbour : adj.get(node)) {

                indegree[neighbour]--;

                if (indegree[neighbour] == 0) {
                    queue.offer(neighbour);
                }
            }
        }

        // If not all nodes processed → cycle exists
        return count != V;
    }
}
