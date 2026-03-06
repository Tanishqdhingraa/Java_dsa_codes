package Binary_Seach_Tree;



//? IN THIS QUESTION LIMITS WILL BE GIVEN LEFT AND RIGHT
//? RETURN THE VALE COMES BEETWEEN THEM 



public class C {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert into BST
    Node insert(Node root, int value) {
        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);

        return root;
    }

    // Count nodes in range [l, r]
    int getCount(Node root, int l, int r) {
        if (root == null)
            return 0;

        if (root.data < l) // RIGHT SIDE MAIN MILAGA ROOT CHOTA HAIN 
            return getCount(root.right, l, r);

        else if (root.data > r) // LEFT SIDE MAIN MILAGA ROOT BADA HAIN
            return getCount(root.left, l, r);

        else
            return 1 // ROOT RANGE KA BEECH MAIN HAIN 
                    + getCount(root.left, l, r)
                    + getCount(root.right, l, r);
    }

    public static void main(String[] args) {

        C tree = new C();
        Node root = null;

        // Insert values
        int[] values = { 10, 5, 15, 3, 7, 18 };

        for (int val : values) {
            root = tree.insert(root, val);
        }

        int l = 7;
        int r = 15;

        int count = tree.getCount(root, l, r);

        System.out.println("Count of nodes in range [" + l + ", " + r + "] = " + count);
    }
}
