package Doubly_LL;

public class G {
    // ! Insertition at Tail in Doubly LL

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

    public static Node Insertition_At_Tail(Node head, int newtail) {

        Node t = new Node(newtail);

        // If list is empty
        if (head == null) {
            return t;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = t;
        t.prev = temp;

        return head; // head remains same
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

        head = Insertition_At_Tail(head, 10);
        display(head);
    }
}