package Doubly_LL;

public class F {
    //! Insertition at head in Doubly LL 

    public static class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    
    public static void display(Node head) {
        Node temp = head;
        System.out.print("null-> ");
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static Node Insertition_At_head(Node head, int newhead) {

        Node f = new Node(newhead);

        if (head == null) {
            return f;
        }

        f.next = head;
        head.prev = f;

        return f; // return new head
    }
    

    public static void main(String[] args) {

        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.prev = null;
        a.next = b;

        b.prev = a;
        b.next = c;

        c.prev = b;
        c.next = d;

        d.prev = c;
        d.next = e;

        e.prev = d;
        e.next = null;

        // Node f = new Node(1);


        Node head = a;

        head = Insertition_At_head(head, 10);
        display(head);
    }
}