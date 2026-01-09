package Stack_and_Queue;
class StackArray {
    
    int[] stack;
    int top;
    int size;

    // Constructor
    StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1; // stack is empty
    }

    // Push element
    void push(int value) {
        if (top == size - 1) { // overflow check
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
        System.out.println(value + " pushed");
    }

    // Pop element
    int pop() {
        if (top == -1) { // underflow check
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Peek top element
    int peek() {
        if (top == -1)
            return -1;
        return stack[top];
    }

    // Main method (Example)
    public static void main(String[] args) {
        StackArray s = new StackArray(3);

        s.push(10); // push 10
        s.push(20); // push 20
        s.push(30); // push 30

        System.out.println("Top: " + s.peek()); // 30
        System.out.println("Popped: " + s.pop()); // remove 30
        System.out.println("Top after pop: " + s.peek()); // 20
    }
}
