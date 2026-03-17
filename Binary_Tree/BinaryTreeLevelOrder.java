// package Binary_Tree; 
import java.util.*;

// import BinaryTree.Node;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class BinaryTreeLevelOrder {

    Node root;

    // Level Order Traversal
    void levelOrder() {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");

            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrder tree = new BinaryTreeLevelOrder();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.levelOrder();
    }
}
