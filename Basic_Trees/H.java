class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

// Min value in Binary Tree
public class H {

    private static int Minvalue(Node root) {
        if (root == null)
            return Integer.MAX_VALUE; // FOCUS HERE

        int leftmin = Minvalue(root.left);
        int rightmin = Minvalue(root.right);

        return Math.min(root.val, Math.min(leftmin, rightmin));
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

        System.out.println(Minvalue(a));
    }
}
