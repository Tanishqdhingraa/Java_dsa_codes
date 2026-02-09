// Top 4 things to keep in mind

// Reverse the infix expression (swap ( with )).
// Convert the reversed infix to postfix.
// Reverse the postfix → that becomes prefix.
// Operator precedence rules remain the same.

// InfixToPrefix
// Reverse infix → convert to postfix → reverse result
// Stack is used to handle operators
// Time Complexity: O(n)

import java.util.*;

class InfixToPrefix {

    // Operator precedence
    static int precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        if (ch == '*' || ch == '/')
            return 2;
        if (ch == '^')
            return 3;
        return -1;
    }

    static String infixToPrefix(String exp) {

        // 1. Reverse the infix expression
        StringBuilder reversed = new StringBuilder(exp).reverse();

        // 2. Replace '(' with ')' and vice-versa
        for (int i = 0; i < reversed.length(); i++) {
            if (reversed.charAt(i) == '(')
                reversed.setCharAt(i, ')');
            else if (reversed.charAt(i) == ')')
                reversed.setCharAt(i, '(');
        }

        Stack<Character> st = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        // 3. Convert reversed infix to postfix
        for (int i = 0; i < reversed.length(); i++) {
            char ch = reversed.charAt(i);

            // Operand → add to postfix
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }
            // '(' → push to stack
            else if (ch == '(') {
                st.push(ch);
            }
            // ')' → pop until '('
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    postfix.append(st.pop());
                }
                st.pop(); // remove '('
            }
            // Operator
            else {
                while (!st.isEmpty() && precedence(st.peek()) > precedence(ch)) {
                    postfix.append(st.pop());
                }
                st.push(ch);
            }
        }

        // 4. Pop remaining operators
        while (!st.isEmpty()) {
            postfix.append(st.pop());
        }

        // 5. Reverse postfix → prefix
        return postfix.reverse().toString();
    }

    public static void main(String[] args) {
        String infix = "(a-b/c)*(a/k-l)";
        System.out.println("Prefix: " + infixToPrefix(infix));
    }
}
