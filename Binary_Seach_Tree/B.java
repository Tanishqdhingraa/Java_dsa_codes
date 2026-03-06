package Binary_Seach_Tree;


//? INSERTING IN BINARY SEARCH TREE 
//? BOOLEAN RESPONSE WHETER THE VALUE EXISTS IN BINARY SEARCH TREE


class B {

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
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // 🔎 Search in BST (returns true/false)
    public boolean search(Node root, int key) {

        if (root == null) {
            return false; // Not found
        }
        if (root.data == key) {
            return true; // Found
        }
        if (key < root.data) {
            return search(root.left, key); // Search left
        } else {
            return search(root.right, key); // Search right
        }
    }

    public static void main(String[] args) {

        B tree = new B();

        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);

        System.out.println(tree.search(tree.root, 40)); // true
        System.out.println(tree.search(tree.root, 100)); // false
    }
}
