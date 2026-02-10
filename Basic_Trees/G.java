class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

// Max value in Binary Tree
public class G {

    private static int Maxvlaue(Node root) {
        if (root == null)
            return Integer.MIN_VALUE; // FOCUS HERE

        int leftmax = Maxvlaue(root.left);
        int rightmax = Maxvlaue(root.right);

        return Math.max(root.val, Math.max(leftmax, rightmax));
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

        System.out.println(Maxvlaue(a));
    }
}
