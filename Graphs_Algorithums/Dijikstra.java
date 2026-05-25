package Graphs_Algorithums;



import java.util.*;

public class Dijikstra {


    public int[] dijkstra(int V, int[][] edges, int src) {

        // Step 1️⃣: Build adjacency list
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // edges[i] = {u, v, w}
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            adj.get(u).add(new int[] { v, w });
            adj.get(v).add(new int[] { u, w }); // remove if directed
        }

        // Step 2️⃣: Min Heap -> {node, distance}
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[1] - b[1]);

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[src] = 0;
        pq.offer(new int[] { src, 0 });

        // Step 3️⃣: Dijkstra
        while (!pq.isEmpty()) {

            int[] pair = pq.poll();
            int u = pair[0];
            int d = pair[1];

            if (d > dist[u])
                continue;

            for (int[] neighbour : adj.get(u)) {

                int v = neighbour[0]; 
                int w = neighbour[1];

                if (dist[u] + w < dist[v]) {

                    dist[v] = dist[u] + w;
                    pq.offer(new int[] { v, dist[v] });
                }
            }
        }

        return dist;
    }
}