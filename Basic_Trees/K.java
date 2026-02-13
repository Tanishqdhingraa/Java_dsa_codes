import java.util.LinkedList;
import java.util.Queue;

//?  Queue<TreeNode> q = new LinkedList<>();
//?  q.offer(root);
//?  TreeNode curr = q.poll();
//?  if(curr.left/right != null) q.offer(...)
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class K{

    private static void levelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size() >0){
            Node Front = q.remove();
            System.out.println(Front.val);
            if(Front.left != null) q.add(Front.left);
            if (Front.right != null)q.add(Front.right);

        }
        System.out.println();
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

        levelOrderTraversal(a);

    }
}
