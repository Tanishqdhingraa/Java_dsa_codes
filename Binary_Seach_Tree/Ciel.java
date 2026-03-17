package Binary_Seach_Tree;

 class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} 
public class Ciel {
    

    
        int findCeil(Node root, int x) {
            // code here
            int ceil = -1;

            while (root != null) {
                if (root.data == x) {
                    return x;
                }

                if (root.data > x) {
                    ceil = root.data;
                    root = root.left;
                } else {
                    root = root.right;
                }
            }
            return ceil;
        }
    
}
