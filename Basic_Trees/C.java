class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

//All the traversing techniques 


public class C {
    
    
    static void Preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        Preorder(root.left);
        Preorder(root.right);

    }
    
    static void Postorder(Node root) {
        if (root == null)
            return;
        
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.val + " ");

    }
    
    static void Inorder(Node root) {
        if (root == null)
            return;
        
        Inorder(root.left);
        System.out.print(root.val + " ");
        Inorder(root.right);

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

        System.out.println("Preorder ");
        Preorder(a);
        System.out.println();

        System.out.println("Postorder ");
        Postorder(a);
        System.out.println();

        System.out.println("Inorder ");
        Inorder(a);
        System.out.println();

    }
}
