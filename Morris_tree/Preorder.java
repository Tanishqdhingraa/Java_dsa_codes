
//! Morris Traversal performs preorder traversal without 
//! using recursion or stack.
//! Time Complexity: O(N)
//! Space Complexity: O(1)


//!! Core Idea
//? If left is null → visit node → go right
//? Else:
//? Visit node
//? Find inorder predecessor
//? Create temporary link
//? After finishing left subtree → remove link

package Morris_tree;

import java.util.*;

public class Preorder {

    // Definition for TreeNode
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Morris Preorder Traversal (O(1) Space)
    public static List<Integer> morrisPreorder(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        TreeNode current = root;

        while (current != null) {

            // Case 1: No left child
            if (current.left == null) {
                result.add(current.val);
                current = current.right;
            } else {

                // Find inorder predecessor
                TreeNode predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }

                // If thread not created
                if (predecessor.right == null) {
                    result.add(current.val); // 🔥 Visit BEFORE going left
                    predecessor.right = current;
                    current = current.left;
                }
                // If thread already exists → remove it
                else {
                    predecessor.right = null;
                    current = current.right;
                }
            }
        }

        return result;
    }
}
