package Binary_Seach_Tree;

import java.util.*;


//! Remember this always 
//! Binary seach tree inorder is always sorted 
public class D {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    //! Insert into BST
    Node insert(Node root, int value) {
        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);

        return root;
    }

    //! Inorder traversal (stores sorted values)
    void inorder(Node root, ArrayList<Integer> list) {
        if (root == null)
            return;

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    // ! Kth smallest elememt in a BST 
    // //? Find the inorder and store it on array
    // //? and return that in arr[k-1]
    int kthSmallest(Node root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);

        if (k <= 0 || k > list.size())
            return -1;

        return list.get(k - 1);
    }

    public static void main(String[] args) {

        D tree = new D();
        Node root = null;

        int[] values = { 50, 30, 70, 20, 40, 60, 80 };

        for (int val : values) {
            root = tree.insert(root, val);
        }

        int k = 3;

        int result = tree.kthSmallest(root, k);

        System.out.println(k + "th smallest element: " + result);
    }
}
