package Stack_and_Queue;
import java.util.Stack;

class StackLibraryExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // create stack

        stack.push(5); // push 5
        stack.push(15); // push 15
        stack.push(25); // push 25

        System.out.println("Top: " + stack.peek()); // 25
        System.out.println("Popped: " + stack.pop()); // remove 25
        System.out.println("Top after pop: " + stack.peek()); // 15
        System.out.println("Is Empty: " + stack.isEmpty()); // false
    }
}
