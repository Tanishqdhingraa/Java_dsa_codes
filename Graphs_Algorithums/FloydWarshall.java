package Graphs_Algorithums;


//! When we use this algo ?
//* When we want to find the shortest distance of each node to th other  
//* we will use this algorithum  


//!How we perform this algo ? 
//* Find the distance bw all 2 nodes and than find minimum of all of them 

//! Some basic problems solved by this algorithum 
//* To find the Shortest path fom every node to every node
//* Multi-Source shortest path algorithum 
//* It can detect negative cycle 
//* Easiest to code 
//* Uses DP

public class FloydWarshall {
    
    public void shortest_distance(int[][] matrix) {
        // Code here
        //! matrix[i][j] == -1 no path to infinity
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 1001; //! check the contraints and assign acc.
                }
            }
        }
        //? O(N^3)
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (matrix[i][i] < 0) {
                System.out.println("negative cycle detected");
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1001) {
                    matrix[i][j] = -1; //! check the contraints and assign acc.
                }
            }
        }
    }
}
