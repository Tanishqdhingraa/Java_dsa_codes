

public class BinaryTreeArray {

    int[] tree;
    int size;

    BinaryTreeArray(int size) {
        tree = new int[size];
        this.size = size;
    }

    // Preorder
    void preorder(int index) {
        if (index >= size || tree[index] == 0)
            return;
        System.out.print(tree[index] + " ");
        preorder(2 * index + 1);
        preorder(2 * index + 2);
    }

    // Inorder
    void inorder(int index) {
        if (index >= size || tree[index] == 0)
            return;
        inorder(2 * index + 1);
        System.out.print(tree[index] + " ");
        inorder(2 * index + 2);
    }

    // Postorder
    void postorder(int index) {
        if (index >= size || tree[index] == 0)
            return;
        postorder(2 * index + 1);
        postorder(2 * index + 2);
        System.out.print(tree[index] + " ");
    }

    public static void main(String[] args) {
        BinaryTreeArray bt = new BinaryTreeArray(10);

        bt.tree[0] = 1;
        bt.tree[1] = 2;
        bt.tree[2] = 3;
        bt.tree[3] = 4;
        bt.tree[4] = 5;

        bt.preorder(0);
        System.out.println();
        bt.inorder(0);
        System.out.println();
        bt.postorder(0);
    }
}
