package Graphs;


//! https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
import java.util.*;

class Dfs {

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> res = new ArrayList<>();

        int V = adj.size(); // number of vertices
        boolean[] visited = new boolean[V];

        // Start DFS from vertex 0
        dfsHelper(0, visited, adj, res);

        return res;
    }

    public void dfsHelper(int node,
            boolean[] visited,
            ArrayList<ArrayList<Integer>> adj,
            ArrayList<Integer> res) {

        visited[node] = true; // mark visited
        res.add(node); // add to result

        // visit neighbours in given order (left to right)
        for (int neighbour : adj.get(node)) {

            if (!visited[neighbour]) {
                dfsHelper(neighbour, visited, adj, res);
            }
        }
    }
}