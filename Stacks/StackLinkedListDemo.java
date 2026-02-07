package Stacks;

class StackLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    Node top;

    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    int peek() {
        if (top == null)
            return -1;
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }

    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackLinkedListDemo {
    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(5);
        s.push(15);
        s.push(25);
        s.display();
        System.out.println("Peek: " + s.peek());
        s.pop();
        s.display();
    }
}
