// Queue<TreeNode> q = new LinkedList<>();
// q.offer(root);
// TreeNode curr = q.poll();
// if(curr.left/right != null) q.offer(...)
import java.util.*;

// Binary Tree BFS (Level Order Traversal)
class BFS {

    // Tree Node definition
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            // left = right = null;
        }
    }

    // BFS / Level Order Traversal
    static void bfs(TreeNode root) {

        // 1. If tree is empty, nothing to traverse
        if (root == null)
            return;

        // 2. Queue is used to process nodes level by level
        Queue<TreeNode> queue = new LinkedList<>();

        // 3. Start BFS from root
        queue.offer(root);

        // 4. Process nodes until queue is empty
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            System.out.print(curr.val + " ");

            // Add left child first
            if (curr.left != null) {
                queue.offer(curr.left);
            }

            // Add right child next
            if (curr.right != null) {
                queue.offer(curr.right);
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        /*
         *   1
         *  / \
         *  2  3
         * / \  \
         * 4 5   6 */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        bfs(root); // Output: 1 2 3 4 5 6
    }
}
