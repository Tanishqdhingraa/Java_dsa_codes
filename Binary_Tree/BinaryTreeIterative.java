import java.util.Stack;

class BinaryTreeIterative {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    // Inorder (Left → Root → Right)
    void inorder() {
        Stack<Node> stack = new Stack<>();
        Node curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) { // go left
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop(); // visit
            System.out.print(curr.data + " ");
            curr = curr.right; // go right
        }
    }

    // Preorder (Root → Left → Right)
    void preorder() {
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            System.out.print(curr.data + " "); // visit

            if (curr.right != null)
                stack.push(curr.right); // push right
            if (curr.left != null)
                stack.push(curr.left); // push left
        }
    }

    // Postorder (Left → Right → Root)
    void postorder() {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {
            Node curr = stack1.pop();
            stack2.push(curr);

            if (curr.left != null)
                stack1.push(curr.left);
            if (curr.right != null)
                stack1.push(curr.right);
        }

        while (!stack2.isEmpty())
            System.out.print(stack2.pop().data + " ");
    }

    // Main
    public static void main(String[] args) {
        BinaryTreeIterative tree = new BinaryTreeIterative();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Inorder: ");
        tree.inorder();

        System.out.print("\nPreorder: ");
        tree.preorder();

        System.out.print("\nPostorder: ");
        tree.postorder();
    }
}
