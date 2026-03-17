/*//!Morris Traversal performs inorder traversal without 
//!using recursion or stack.
It uses temporary threading by connecting
inorder predecessor to current node.
//!Time Complexity is O(N) and Space Complexity is O(1). */


//!! Core Idea
//? If left is null → visit node → go right
//?Else:
//? Find inorder predecessor
//? Create temporary link
//? After finishing left subtree → remove link 



import java.util.*;

public class Morris {

    // Definition for TreeNode
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Morris Inorder Traversal (O(1) Space)
    public static List<Integer> morrisInorder(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        TreeNode current = root;

        while (current != null) {

            // Case 1: No left child
            if (current.left == null) {
                result.add(current.val);
                current = current.right;
            } else {
                //! Find inorder predecessor
                TreeNode predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }

                //! Make left subtree predecssor to root 
                if (predecessor.right == null) {
                    predecessor.right = current;
                    current = current.left;
                }
                //! This means we are on root so we broke the temporary variable
                else {
                    predecessor.right = null;
                    result.add(current.val);
                    current = current.right;
                }
            }
        }

        return result;
    }
}
