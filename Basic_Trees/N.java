//? Preorder Traversal using Stack (Iterative)
//? Order: Root → Left → Right
//? Use Stack (LIFO)
//? Push Right first, then Left (so Left is processed first)

import java.util.Stack;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class N {


private static void PreOrderUsingStack(Node root) {

    if (root == null) return;

    Stack<Node> stack = new Stack<>();
    stack.push(root);

    while (!stack.isEmpty()) {
        // ! IMPORTANT STATEMENT
        Node current = stack.pop();
        System.out.print(current.val + " ");

        // ! IMPORTANT STATEMENT
        if (current.right != null) {
            stack.push(current.right);
        }

        if (current.left != null) {
            stack.push(current.left);
        }
    }
}


    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        PreOrderUsingStack(a);

    }
}
