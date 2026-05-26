//! What are we doing in this code?(childSum)
//? Calculate childSum Add the value of left child and right child(if they exist)

//? Compare childSum with parent value
//?         If childSum ≥ parent.val  
//?             → Update parent=childSum
//?         If childSum<parent.val
//?              →Update child = parent.val(increase child)

//? Recursively apply same logic to left and right subtree.

//? After recursion,again calculate children sum
//?         →Set parent=left.val+right.val



//! Children Sum Property in Binary Tree
//! If children sum is smaller → children are increased.
//! If children sum is larger → parent is increased.

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
    }
}

// Class to enforce Children Sum Property
class Main {

    // Convert tree so that every node follows:
    // node.val = left.val + right.val
    public void changeTree(TreeNode root) {

        // Base case
        if (root == null)
            return;

        // Step 1: Calculate sum of children
        int childSum = 0;
        if (root.left != null)
            childSum += root.left.val;
        if (root.right != null)
            childSum += root.right.val;

        // Step 2: Update node or children
        if (childSum >= root.val) {
            root.val = childSum; // Increase parent
        } else {
            // Increase child (if exists)
            if (root.left != null) root.left.val = root.val;

            else if (root.right != null) root.right.val = root.val;
        }

        // Step 3: Recur for left and right subtree
        changeTree(root.left);
        changeTree(root.right);

        // Step 4: After recursion, update parent again
        int total = 0;
        if (root.left != null) total += root.left.val;

        if (root.right != null) total += root.right.val;

        // Update only if not a leaf node
        if (root.left != null || root.right != null) root.val = total;
    }
}

// Utility class for inorder traversal
class TreeTraversal {

    // Print tree in inorder (Left → Root → Right)
    public static void inorderTraversal(TreeNode root) {
        if (root == null)
            return;

        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }
}

// Driver class
public class A {
    public static void main(String[] args) {

        // Construct sample tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        Main sol = new Main();

        // Before modification
        System.out.print("Before: ");
        TreeTraversal.inorderTraversal(root);
        System.out.println();

        // Apply Children Sum Property
        sol.changeTree(root);

        // After modification
        System.out.print("After:  ");
        TreeTraversal.inorderTraversal(root);
    }
}
