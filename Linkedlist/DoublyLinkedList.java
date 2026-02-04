package Linkedlist;

public class DoublyLinkedList {

    // Node structure
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            prev = next = null;
        }
    }

    Node head; // start of list

    // Insert at beginning
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert at position (1-based)
    public void insertAtPosition(int data, int pos) {
        if (pos == 1) {
            insertAtStart(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; temp != null && i < pos - 1; i++)
            temp = temp.next;

        if (temp == null)
            return; // invalid position

        newNode.next = temp.next;
        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete by value
    public void deleteByValue(int key) {
        if (head == null)
            return;

        Node temp = head;

        // If head to be deleted
        if (temp.data == key) {
            head = temp.next;
            if (head != null)
                head.prev = null;
            return;
        }

        while (temp != null && temp.data != key)
            temp = temp.next;

        if (temp == null)
            return; // not found

        if (temp.next != null)
            temp.next.prev = temp.prev;

        if (temp.prev != null)
            temp.prev.next = temp.next;
    }

    // Search element
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    // Display forward
    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display backward
    public void displayBackward() {
        if (head == null)
            return;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // Length of list
    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtStart(5);
        list.insertAtPosition(15, 3);

        System.out.println("Forward:");
        list.displayForward(); // 5 <-> 10 <-> 15 <-> 20

        System.out.println("Backward:");
        list.displayBackward(); // 20 <-> 15 <-> 10 <-> 5

        System.out.println("Length: " + list.length());

        System.out.println("Search 15: " + list.search(15));

        list.deleteByValue(10);
        System.out.println("After deleting 10:");
        list.displayForward();
    }
}
