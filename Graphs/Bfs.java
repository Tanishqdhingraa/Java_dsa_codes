package Graphs;

import java.util.*;

public class Bfs {

    //?  Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       

        boolean[] visited = new boolean[V]; // To track visited nodes
        Queue<Integer> queue = new LinkedList<>(); // BFS uses Queue
        ArrayList<Integer> res = new ArrayList<>(); // Stores BFS result
    
        //! Step 1: Start from node 0
        visited[0] = true;
        queue.offer(0);

        //! Step 2: Standard BFS Loop
        while (!queue.isEmpty()) {

            int node = queue.poll(); //* Remove front element
            res.add(node); //*  Add to answer

            //  *Traverse neighbours in given order
            for (int neighbour : adj.get(node)) {

                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }  
            }
        }

        return res;
    }
}

