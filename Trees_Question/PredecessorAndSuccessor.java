// Node Structure
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Main {

    // Returns an array where:
    // index 0 -> predecessor
    // index 1 -> successor
    public Node[] findPreSuc(Node root, int key) {

        Node pre = null;
        Node suc = null;

        Node curr = root;

        while (curr != null) {

            if (key > curr.data) {
                //! Current node can be predecessor
                pre = curr;
                curr = curr.right;
            } else if (key < curr.data) {
                //! Current node can be successor
                suc = curr;
                curr = curr.left;
            } else {
                //! If key is found

                //!Find maximum in left subtree (predecessor)
                if (curr.left != null) {
                    Node temp = curr.left;
                    while (temp.right != null) {
                        temp = temp.right;
                    }
                    pre = temp;
                }

                //! Find minimum in right subtree (successor)
                if (curr.right != null) {
                    Node temp = curr.right;
                    while (temp.left != null) {
                        temp = temp.left;
                    }
                    suc = temp;
                }

                break;
            }
        }

        return new Node[] { pre, suc };
    }
}

// ---------------- DRIVER CODE ----------------

public class PredecessorAndSuccessor {

    public static void main(String[] args) {

        // Create BST:
        // 50
        // / \
        // 30 70
        // / \ / \
        // 20 40 60 80

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        int key = 65;

        Main obj = new Main();
        Node[] result = obj.findPreSuc(root, key);

        Node pre = result[0];
        Node suc = result[1];

        System.out.println(
                (pre != null ? pre.data : "NULL") + " " +
                        (suc != null ? suc.data : "NULL"));
    }
}