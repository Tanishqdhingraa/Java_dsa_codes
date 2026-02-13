import java.util.Stack;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class O {

    // Inorder Traversal using Stack (Iterative)
    // Order: Left → Root → Right
    // Go left until null, then process, then go right

    private static void inOrderUsingStack(Node root) {

        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {

            // Go to extreme left
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Process node
            current = stack.pop();
            System.out.print(current.val + " ");

            // Move to right subtree
            current = current.right;
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

        inOrderUsingStack(a);
    }
}
