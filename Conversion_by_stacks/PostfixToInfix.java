// Top 4 things to keep in mind

// Operands are pushed to stack as strings.
// On operator, pop right operand first, then left.
// Form "(left operator right)" and push back.
// Final stack top is the infix expression.

// PostfixToInfix
// Direct conversion using stack (no prefix involved)
// On operator: pop right, then left, combine
// Time Complexity: O(n)

import java.util.*;

class PostfixToInfix {

    static String postfixToInfix(String exp) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // 1. If operand, push to stack
            if (Character.isLetterOrDigit(ch)) {
                st.push(ch + "");
            }
            // 2. If operator
            else {
                String right = st.pop();
                String left = st.pop();

                String combined = "(" + left + ch + right + ")";
                st.push(combined);
            }
        }

        // 3. Final infix expression
        return st.peek();
    }

    public static void main(String[] args) {
        String postfix = "ab+c*";
        System.out.println("Infix: " + postfixToInfix(postfix));
    }
}
