import java.util.Stack;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class P {

    // Postorder Traversal using 2 Stacks
    // Order: Left → Right → Root
    // Stack1 builds reverse preorder
    // Stack2 gives final postorder

    //? First coming pop() the element from stack1 and put in stack2
    //? and put right left of popped element's into the stack 1
    //? after stack1 is empty after all the steps  
    //? pop the stack 2 and print it 

    private static void postOrderUsingTwoStacks(Node root) {

        if (root == null)
            return;

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {

            Node current = stack1.pop();
            stack2.push(current);

            // Push left and right into stack1
            if (current.left != null) {
                stack1.push(current.left);
            }

            if (current.right != null) {
                stack1.push(current.right);
            }
        }

        // Print postorder
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().val + " ");
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

        postOrderUsingTwoStacks(a);
    }
}
