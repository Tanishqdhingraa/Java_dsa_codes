package Graphs_Algorithums;

    


import java.util.*;

public class Prisms {
    public int spanningTree(int V, int[][] edges) {

        // Step 1: Build adjacency list
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int w = e[2];

            adj.get(u).add(new int[] { v, w });
            adj.get(v).add(new int[] { u, w }); // because graph is undirected
        }

        // Step 2: Min Heap -> {parent, node, weight}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);

        boolean visited[] = new boolean[V];
        int sum = 0;

        pq.offer(new int[] { -1, 0, 0 });

        while (!pq.isEmpty()) {
            int[] obj = pq.poll();
            int parent = obj[0];
            int node = obj[1];
            int weight = obj[2];

            if (visited[node])
                continue;

            visited[node] = true;

            if (parent != -1) {
                sum += weight;
            }

            for (int[] neighbour : adj.get(node)) {
                int nextNode = neighbour[0];
                int nextWeight = neighbour[1];

                if (!visited[nextNode]) {
                    pq.offer(new int[] { node, nextNode, nextWeight });
                }
            }
        }

        return sum;
    }
}                                                                                                        