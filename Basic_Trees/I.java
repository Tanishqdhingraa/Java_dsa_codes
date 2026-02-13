class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

//?  Number of levels  
public class I {

    private static int LevelOrderTraversal(Node root) {
        if (root == null)
            return 0; // FOCUS HERE

        int leftmin = LevelOrderTraversal(root.left);
        int rightmin = LevelOrderTraversal(root.right);

        int ans = 1 + Math.max(leftmin, rightmin);

        return ans;
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

        System.out.println(LevelOrderTraversal(a)+" ");
    }
}
