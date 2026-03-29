package Graphs;


//! Basic implematiation of graph in adj mtrix 
public class A {
    int adjMatrix[][];

    A(int nodes){
        adjMatrix = new int[nodes][nodes]; // 4*4 matrix 
    }


    // ->[[0,2],[0,1],[2,0]]

    public void addEdgesInmatrix(int edges[][],boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];

            if (isDirected){
                adjMatrix[u][v]=1;
            }else {
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }

        }
    }
    public void printmatrix(){
        for (int i = 0; i < adjMatrix.length; i++) {
            System.out.print("rows "+i+"-> ");
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int edges[][] = {{0,2},{0,1},{1,3}};
        int nodes = 4;
        A r = new A(nodes);
        r.addEdgesInmatrix(edges, false);
        r.printmatrix();
        System.out.println("--------------------------");
        A r1 = new A(nodes);
        r1.addEdgesInmatrix(edges, true);
        r1.printmatrix();
    }
}
