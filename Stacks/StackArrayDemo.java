package Stacks;

// Stack implementation using Array
class StackArray {

    int[] arr; // array to store stack elements
    int top; // index of top element
    int capacity; // maximum size of stack

    // Constructor
    StackArray(int size) {
        capacity = size;
        arr = new int[size];
        top = -1; // stack is empty initially
    }

    // Push element into stack
    void push(int x) {
        if (top == capacity - 1) { // stack is full
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x; // increment top, then insert
    }

    // Pop element from stack
    int pop() {
        if (top == -1) { // stack is empty
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--]; // return top, then decrement
    }

    // Get top element without removing it
    int peek() {
        if (top == -1)
            return -1;
        return arr[top];
    }

    // Check if stack is empty
    boolean isEmpty() {
        return top == -1;
    }

    // Display stack elements
    void display() {
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Driver class
public class StackArrayDemo {
    public static void main(String[] args) {

        // passing capacity of stack
        StackArray s = new StackArray(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Popped: " + s.pop());

        s.display();
    }
}
