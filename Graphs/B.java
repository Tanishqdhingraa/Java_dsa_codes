package Graphs;

//! Adding weight with edges code 
public class B {

    int adjMatrix[][];

    // Constructor
    B(int nodes) {
        adjMatrix = new int[nodes][nodes];
    }

    // Unweighted edges
    public void addEdgesInMatrix(int edges[][], boolean isDirected) {
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];

            if (isDirected) {
                adjMatrix[u][v] = 1;
            } else {
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
        }
    }

    // Weighted edges
    public void addEdgesWithWeight(int edges[][], boolean isDirected) {
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2]; 

            if (isDirected) {
                adjMatrix[u][v] = w;
            } else {
                adjMatrix[u][v] = w;
                adjMatrix[v][u] = w;
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < adjMatrix.length; i++) {
            System.out.print("Row " + i + " -> ");
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int nodes = 4;

        // Weighted edges: {u, v, weight}
        int edges[][] = {
                { 0, 2, 5 },
                { 0, 1, 3 },
                { 1, 3, 7 }
        };

        B graph = new B(nodes); 

        graph.addEdgesWithWeight(edges, false); // false = undirected

        graph.printMatrix();
    }
}