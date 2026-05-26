//! What This Code Does

// !If key is found:
//      !Predecessor → rightmost node in left subtree
//      !Successor → leftmost node in right subtree

//! If key not found:
//! While searching:
//!     If we go left → current node can be successor
//!     If we go right → current node can be predecessor

// We keep updating possibilities.
import java.util.*;

class Success {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static ArrayList<Node> findPreSuc(Node root, int key) {

        Node predecessor = null;
        Node successor = null;

        Node current = root;

        while (current != null) {

            if (current.data == key) {

                //! Find predecessor (max in left subtree)
                if (current.left != null) {
                    Node temp = current.left;
                    while (temp.right != null) {
                        temp = temp.right;
                    }
                    predecessor = temp;
                }

                //! Find successor (min in right subtree)
                if (current.right != null) {
                    Node temp = current.right;
                    while (temp.left != null) {
                        temp = temp.left;
                    }
                    successor = temp;
                }

                break;
            }

            else if (key < current.data) {
                successor = current; //! possible successor
                current = current.left;
            }

            else { // key > current.data
                predecessor = current; //! possible predecessor
                current = current.right;
            }
        }

        return new ArrayList<>(Arrays.asList(predecessor, successor));
    }
}
