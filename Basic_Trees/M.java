import java.util.LinkedList;
import java.util.Queue;

// Level wise printing 

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class M {

    private static void levelOrderTraversal(Node root) {

        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            int size = q.size(); // number of nodes at current level

            for (int i = 0; i < size; i++) {
                Node front = q.remove();
                System.out.print(front.val + " ");

                if (front.left != null)
                    q.add(front.left);

                if (front.right != null)
                    q.add(front.right);
            }

            System.out.println(); // move to next level
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

        levelOrderTraversal(a);
    }
}
