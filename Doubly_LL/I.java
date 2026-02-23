package Doubly_LL;

public class I {
    // ! Insertition at any Index in Doubly LL

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

    public static Node insertAtIndex(Node head, int index, int value) {

        Node newNode = new Node(value);

        // Case 1: Insert at head (index 0)
        if (index == 0) {
            if (head != null) {
                newNode.next = head;
                head.prev = newNode;
            }
            return newNode;
        }

        Node temp = head;
        int count = 0;

        // Traverse to (index - 1) position
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        // Invalid index
        if (temp == null) {
            System.out.println("Index out of bounds");
            return head;
        }

        // Insert in between or at tail
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;

        return head;
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

        head = insertAtIndex(head, 2, 50);
        display(head);
    }
}