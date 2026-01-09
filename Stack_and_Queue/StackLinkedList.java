package Stack_and_Queue;

class StackLinkedList {

    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top; // top of stack

    // Constructor
    StackLinkedList() {
        top = null; // stack is empty
    }

    // Push element
    void push(int value) {
        Node newNode = new Node(value); // create node
        newNode.next = top; // point to previous top
        top = newNode; // update top
        System.out.println(value + " pushed");
    }

    // Pop element
    int pop() {
        if (top == null) { // underflow check
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data; // store top value
        top = top.next; // move top
        return popped;
    }

    // Peek top element
    int peek() {
        if (top == null)
            return -1;
        return top.data;
    }

    // Example
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Top after pop: " + stack.peek()); // 20
    }
}
