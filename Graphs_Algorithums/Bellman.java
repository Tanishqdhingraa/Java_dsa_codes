package Graphs_Algorithums;


    


import java.util.*;

public class Bellman {

    public int[] bellmanFord(int V, int[][] edges, int src) {

        int[] dist = new int[V];
        int INF = (int) 1e8;

        Arrays.fill(dist, INF);
        dist[src] = 0;

        // Step 1️⃣: Relax edges V-1 times
        for (int i = 0; i < V - 1; i++) {

            boolean isChanged = false;

            for (int[] edge : edges) {

                int u = edge[0];
                int v = edge[1];
                int w = edge[2];

                if (dist[u] != INF && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    isChanged = true;
                }
            }

            // Optimization: stop early if no update
            if (!isChanged)
                break;
        }

        // Step 2️⃣: Check for Negative Cycle
        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            if (dist[u] != INF && dist[u] + w < dist[v]) {
                return new int[] { -1 }; // Negative cycle detected
            }
        }

        return dist;
    }
}