import java.util.*;

// Stores node with its horizontal distance
class CustomNode {
    Node node;
    int col;

    CustomNode(Node node, int col) {
        this.node = node;
        this.col = col;
    }
}

public class BottomView {


    // Returns bottom view of binary tree
    static ArrayList<Integer> bottomView(Node root) {

        ArrayList<Integer> res = new ArrayList<>();

        if (root == null)
            return res;

        // BFS queue
        Queue<CustomNode> queue = new LinkedList<>();

        // Column → node value (sorted by column)
        TreeMap<Integer, Integer> map = new TreeMap<>();

        queue.offer(new CustomNode(root, 0));

        while (!queue.isEmpty()) {

            CustomNode curr = queue.poll();
            Node node = curr.node;
            int col = curr.col;

            // 🔥 Difference from top view:
            // Always update (last node at column wins)
            map.put(col, node.data);

            // Left → column - 1
            if (node.left != null) {
                queue.offer(new CustomNode(node.left, col - 1));
            }

            // Right → column + 1
            if (node.right != null) {
                queue.offer(new CustomNode(node.right, col + 1));
            }
        }

        // Add values left → right
        for (int value : map.values()) {
            res.add(value);
        }

        return res;
    }
}