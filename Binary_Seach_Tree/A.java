package Binary_Seach_Tree;



//? INSERTING IN BINARY SEARCH TREE 

public class A {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    // Insert into BST
    public Node insert(Node root, int value) {

        // If tree is empty
        if (root == null) {
            return new Node(value);
        }

        // Go left if value smaller
        if (value < root.data) {
            root.left = insert(root.left, value);
        }

        // Go right if value greater
        else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Inorder Traversal (Sorted order)
    public void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Main method
    public static void main(String[] args) {

        A tree = new A();

        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);
    }
}
