package Binary_Seach_Tree;
//  Floor = greatest value ≤ X

// If node == x → return it.
// If node < x → store it and go right.
// If node > x → go left.
// At end → return stored floor.
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
public class Floor {
    public static int floor(Node root, int x) {

        int floor = -1; // to store answer

        while (root != null) {

            if (root.data == x) {
                return root.data; // exact match
            }

            if (root.data < x) {
                floor = root.data; // possible floor
                root = root.right; // try to find larger value
            } else {
                root = root.left; // move left
            }
        }

        return floor; // return best found value
    }
}
