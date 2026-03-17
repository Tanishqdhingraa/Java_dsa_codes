
import java.util.*;


//? What’s happening?
// For every node,we push it into the stack
//  with a state number:

// !Stat = 1→Preorder
// Visit the node
// Move to left child

// !State = 2→Inorder
// Visit the node
// Move to right child

//! State = 3→Postorder
// Visit the node
// Done with this node

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class Solution {

    static class Pair {
        TreeNode node;
        int state;

        Pair(TreeNode node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void allTraversals(TreeNode root) {

        if (root == null)
            return;

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));

        while (!stack.isEmpty()) {

            Pair it = stack.pop();

            // Preorder
            if (it.state == 1) {
                pre.add(it.node.val);
                it.state++;
                stack.push(it);

                if (it.node.left != null) {
                    stack.push(new Pair(it.node.left, 1));
                }
            }

            // Inorder
            else if (it.state == 2) {
                in.add(it.node.val);
                it.state++;
                stack.push(it);

                if (it.node.right != null) {
                    stack.push(new Pair(it.node.right, 1));
                }
            }

            // Postorder
            else {
                post.add(it.node.val);
            }
        }

        System.out.println("Preorder  : " + pre);
        System.out.println("Inorder   : " + in);
        System.out.println("Postorder : " + post);
    }

    public static void main(String[] args) {

        /*
         * 1
         * / \
         * 2 3
         * / \
         * 4 5
         */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        allTraversals(root);
    }
}
