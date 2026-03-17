

import java.util.*;

// TreeNode class
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {

    // Common DFS for both left & right view
    private void dfs(TreeNode node, int level, List<Integer> res, boolean isLeftView) {

        if (node == null)
            return;

        // First node visited at this level
        if (res.size() == level) {
            res.add(node.val);
        }

        if (isLeftView) {
            dfs(node.left, level + 1, res, true);
            dfs(node.right, level + 1, res, true);
        } else {
            dfs(node.right, level + 1, res, false);
            dfs(node.left, level + 1, res, false);
        }
    }

    public List<Integer> leftView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, 0, res, true);
        return res;
    }

    public List<Integer> rightView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, 0, res, false);
        return res;
    }
}

        //     1
        //    / \
        //   2   3
        //    \
        //     4
        //      \
        //       5
        //        \
        //         6


public class Views {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);

        Solution sol = new Solution();

        System.out.println("Left View: " + sol.leftView(root));
        // System.out.println("Right View: " + sol.rightView(root));
    }
}
