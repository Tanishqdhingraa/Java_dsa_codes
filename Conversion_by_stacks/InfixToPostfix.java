// Top 4 things to keep in mind

// Operands go directly to the result.
// Operators are pushed to stack based on precedence.
// ‘(’ is always pushed, ‘)’ pops until ‘(’ is found.
// At the end, pop all remaining operators from stack

// ------------------------------------------------------------

// InfixToPostfix
// Uses stack to handle operators based on precedence
// Operands are added directly to result
// Time Complexity: O(n)

import java.util.*;

class InfixToPostfix {

    // Method to return precedence of operators
    static int precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        if (ch == '*' || ch == '/')
            return 2;
        if (ch == '^')
            return 3;
        return -1;
    }

    static String infixToPostfix(String exp) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // 1. If operand, add to result
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }
            // 2. If '(', push to stack
            else if (ch == '(') {
                st.push(ch);
            }
            // 3. If ')', pop until '('
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop(); // remove '('
            }
            // 4. If operator
            else {
                while (!st.isEmpty() && precedence(st.peek()) >= precedence(ch)) {
                    result.append(st.pop());
                }
                st.push(ch);
            }
        }

        // 5. Pop remaining operators
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String infix = "a+b*(c-d)";
        System.out.println("Postfix: " + infixToPostfix(infix));
    }
}
