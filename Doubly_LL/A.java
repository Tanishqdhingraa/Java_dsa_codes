package Doubly_LL;

// Class representing a node in Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1, Node prev1) {
        data = data1;
        next = next1;
        prev = prev1;
    }

    Node(int data1) {
        data = data1;
        next = null;
        prev = null;
    }
}

public class A {

    // Insert at head
    public static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        newNode.next = head;
        head.prev = newNode;

        return newNode; // new head
    }

    // Delete head
    public static Node deleteHead(Node head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null; // only one node
        }

        head = head.next;
        head.prev = null;

        return head;
    }

    // Print Doubly Linked List
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        int[] arr = { 2, 5, 8, 7 };

        // Create initial DLL
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;
            temp.prev = prev;
            prev = temp;
        }

        System.out.println("Original List:");
        printList(head);
        System.out.println("==============================");

        // Insert at head
        head = insertAtHead(head, 100);
        System.out.println("After Inserting 100 at Head:");
        printList(head);
        System.out.println("===============================");

        // Delete head
        head = deleteHead(head);
        System.out.println("After Deleting Head:");
        printList(head);
        System.out.println("==============================");

    }
}