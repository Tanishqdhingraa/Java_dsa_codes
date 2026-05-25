package Graphs_Algorithums;

public class Flyod1 {
    public void floydWarshall(int[][] dist) {

        int V = dist.length;
        int INF = (int) 1e8;

        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {

                    if (dist[i][k] != INF && dist[k][j] != INF) {
                        dist[i][j] = Math.min(dist[i][j],
                                dist[i][k] + dist[k][j]);
                    }

                }
            }
        }
    }
}