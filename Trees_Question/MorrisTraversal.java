/*
========================================================
MORRIS TRAVERSAL (Binary Tree)
========================================================

Morris Traversal is a technique to traverse a Binary Tree
WITHOUT using recursion or a stack.

Normally:
- Inorder / Preorder traversal uses
  1) Recursion  OR
  2) Stack

Space Complexity = O(h) where h = height of tree.

But Morris Traversal achieves:

Time Complexity  : O(n)
Space Complexity : O(1)

Idea:
We temporarily modify the tree by creating a "thread"
from the rightmost node of the left subtree
(predecessor) to the current node.

Steps:
1. If left child is NULL
      visit node
      move to right

2. If left child exists
      find inorder predecessor
      create temporary link to current node

3. If link already exists
      remove link
      move right

Traversal Types:
1) Morris Inorder  : Left → Root → Right
2) Morris Preorder : Root → Left → Right

Advantage:
- No recursion
- No stack
- Constant extra space

Note:
The tree structure is restored after traversal.
========================================================
*/

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MorrisTraversal {

    // Morris Inorder Traversal
    public static List<Integer> morrisInorder(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null) {

            // Case 1: No left child
            if (curr.left == null) {
                result.add(curr.val);
                curr = curr.right;
            }

            // Case 2: Left child exists
            else {
                TreeNode pred = curr.left;

                // Find inorder predecessor
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                // Create thread
                if (pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                }

                // Thread exists → remove it
                else {
                    pred.right = null;
                    result.add(curr.val);
                    curr = curr.right;
                }
            }
        }

        return result;
    }

    // Morris Preorder Traversal
    public static List<Integer> morrisPreorder(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null) {

            // Case 1: No left child
            if (curr.left == null) {
                result.add(curr.val);
                curr = curr.right;
            }

            else {
                TreeNode pred = curr.left;

                // Find predecessor
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                // Create thread
                if (pred.right == null) {
                    result.add(curr.val); // preorder visit
                    pred.right = curr;
                    curr = curr.left;
                }

                // Thread exists
                else {
                    pred.right = null;
                    curr = curr.right;
                }
            }
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Morris Inorder  : " + morrisInorder(root));
        System.out.println("Morris Preorder : " + morrisPreorder(root));
    }
}