package Stacks;

import java.util.*;

class StackUsingDeque {
    Deque<Integer> stack = new ArrayDeque<>();

    void push(int x) {
        stack.push(x);
    }

    int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack.pop();
    }

    int peek() {
        if (stack.isEmpty())
            return -1;
        return stack.peek();
    }

    boolean isEmpty() {
        return stack.isEmpty();
    }

    void display() {
        for (int x : stack)
            System.out.print(x + " ");
        System.out.println();
    }
}

public class StackUsingDequeDemo {
    public static void main(String[] args) {
        StackUsingDeque s = new StackUsingDeque();
        s.push(100);
        s.push(200);
        s.push(300);
        s.display();
        System.out.println("Pop: " + s.pop());
        s.display();
    }
}
