import java.util.Stack;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class Q {
    //? Postorder Traversal using One Stack
    //?  Order: Left → Right → Root
    //? Use lastVisited to track right subtree processing

    private static void postOrderUsingOneStack(Node root) {

        if (root == null)
            return;

        Stack<Node> stack = new Stack<>();
        Node current = root;
        Node lastVisited = null;

        while (current != null || !stack.isEmpty()) {

            // Go to extreme left
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                Node peekNode = stack.peek();

                // If right child exists and not processed yet
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    current = peekNode.right;
                } else {
                    // Both children processed → print root
                    System.out.print(peekNode.val + " ");
                    lastVisited = stack.pop();
                }
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

        postOrderUsingOneStack(a);
    }
}
