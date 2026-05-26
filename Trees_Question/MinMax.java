

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class MinMax {

    // 🔹 Find Minimum in BST
    public int findMin(Node root) {

        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }

        // Keep moving left
        while (root.left != null) {
            root = root.left;
        }

        return root.data;
    }

    // 🔹 Find Maximum in BST
    public int findMax(Node root) {

        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }

        // Keep moving right
        while (root.right != null) {
            root = root.right;
        }

        return root.data;
    }
}