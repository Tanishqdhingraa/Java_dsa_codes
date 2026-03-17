
import java.util.*;


class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class Solution {

    ArrayList<Integer> boundary(Node node) {

        ArrayList<Integer> res = new ArrayList<>();

        if (node == null)
            return res;

        if (!isLeaf(node)) {
            res.add(node.data);
        }

        insertLeftBoundary(res, node);
        insertLeafNode(res, node);
        insertRightBoundary(res, node);

        return res;
    }

    public boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }

    public void insertLeftBoundary(ArrayList<Integer> res, Node root) {
        Node curr = root.left;

        while (curr != null) {
            if (!isLeaf(curr)) {
                res.add(curr.data);
            }

            if (curr.left != null)
                curr = curr.left;
            else
                curr = curr.right;
        }
    }

    public void insertRightBoundary(ArrayList<Integer> res, Node root) {
        Node curr = root.right;
        Stack<Integer> stack = new Stack<>();

        while (curr != null) {
            if (!isLeaf(curr)) {
                stack.push(curr.data);
            }

            if (curr.right != null)
                curr = curr.right;
            else
                curr = curr.left;
        }

        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
    }

    public void insertLeafNode(ArrayList<Integer> res, Node root) {
        if (root == null)
            return;

        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }

        insertLeafNode(res, root.left);
        insertLeafNode(res, root.right);
    }
}

public class Boundary {
    public static void main(String[] args) {

        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Solution sol = new Solution();
        ArrayList<Integer> result = sol.boundary(root);

        System.out.println("Boundary Traversal:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
