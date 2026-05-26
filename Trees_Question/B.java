
//! Boundary Traversal of binary trees 
//! Not present on leetcode 
//? Root → Left Boundary → Leaves → Right Boundary (reverse)

// Steps:
//? Add root(if not leaf).
//? Add left boundary(excluding leaves).
//? Add all leaf nodes(left to right).
//? Add right boundary(excluding leaves,in reverse).

import java.util.*;

// Node structure
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class B {

    //! Check if node is leaf
    boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    //! Add left boundary (excluding leaf nodes)
    void addLeftBoundary(Node root, List<Integer> res) {
        Node curr = root.left;

        while (curr != null) {
            if (!isLeaf(curr))
                res.add(curr.data);

            // Prefer left, else go right
            if (curr.left != null)
                curr = curr.left;
            else
                curr = curr.right;
        }
    }

    //! Add right boundary (excluding leaf nodes)
    void addRightBoundary(Node root, List<Integer> res) {
        Node curr = root.right;
        List<Integer> temp = new ArrayList<>();

        while (curr != null) {
            if (!isLeaf(curr))
                temp.add(curr.data);

            // Prefer right, else go left
            if (curr.right != null)
                curr = curr.right;
            else
                curr = curr.left;
        }

        //! Add in reverse order
        for (int i = temp.size() - 1; i >= 0; i--)
            res.add(temp.get(i));
    }

    //! Add all leaf nodes (left to right)
    void addLeaves(Node root, List<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }

        if (root.left != null)
            addLeaves(root.left, res);

        if (root.right != null)
            addLeaves(root.right, res);
    }

    //! Boundary Traversal main function
    List<Integer> printBoundary(Node root) {
        List<Integer> res = new ArrayList<>();

        if (root == null)
            return res;

        // Add root (if not leaf)
        if (!isLeaf(root))
            res.add(root.data);

        addLeftBoundary(root, res); // Left boundary
        addLeaves(root, res); // All leaves
        addRightBoundary(root, res); // Right boundary

        return res;
    }

    //! Print result
    void printResult(List<Integer> list) {
        for (int val : list)
            System.out.print(val + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {

        // Sample tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        B sol = new B();

        List<Integer> result = sol.printBoundary(root);

        System.out.print("Boundary Traversal: ");
        sol.printResult(result);
    }
}
