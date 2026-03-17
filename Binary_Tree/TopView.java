import java.util.*;
// Stores node with its horizontal distance (column)
class CustomNode {
    Node node;
    int col;

    CustomNode(Node node, int col) {
        this.node = node;
        this.col = col;
    }
}

class TopView {

    // Returns top view of binary tree
    static ArrayList<Integer> topView(Node root) {

        ArrayList<Integer> res = new ArrayList<>();
      
        // If tree is empty
        if (root == null)
            return res;

        // BFS queue storing node + column
        Queue<CustomNode> queue = new LinkedList<>();

        // Map to store first node at each column
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Start with root at column 0
        queue.offer(new CustomNode(root, 0));

        while (!queue.isEmpty()) {

            CustomNode curr = queue.poll();
            Node node = curr.node;
            int col = curr.col;

            // Store first node seen at this column
            if (!map.containsKey(col)) {
                map.put(col, node.data);
            }

            // Left child → column - 1
            if (node.left != null) {
                queue.offer(new CustomNode(node.left, col - 1));
            }

            // Right child → column + 1
            if (node.right != null) {
                queue.offer(new CustomNode(node.right, col + 1));
            }
        }

        // Add values from left to right (sorted by column)
        for (int value : map.values()) { 
            res.add(value);
        }

        return res;
    }
}