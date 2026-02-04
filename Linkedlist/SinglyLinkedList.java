package Linkedlist;

public class SinglyLinkedList {

    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head; // head of list

    // Insert at beginning
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
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
    }

    // Insert at given position (1-based index)
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
        temp.next = newNode;
    }

    // Delete by value
    public void deleteByValue(int key) {
        if (head == null)
            return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
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

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
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

    // Reverse the list
    public void reverse() {
        Node prev = null, curr = head, next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Main method for testing
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtStart(5);
        list.insertAtPosition(15, 3);

        System.out.println("Linked List:");
        list.display(); // 5 -> 10 -> 15 -> 20

        System.out.println("Length: " + list.length());

        System.out.println("Search 15: " + list.search(15));

        list.deleteByValue(10);
        System.out.println("After deleting 10:");
        list.display();

        list.reverse();
        System.out.println("After reversing:");
        list.display();
    }
}
