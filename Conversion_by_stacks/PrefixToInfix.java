// Top 4 things to keep in mind

// Scan prefix from right to left.
// Operands are pushed to stack as strings.
// On operator, pop left operand first, then right.
// Form "(left operator right)" and push back.



// PrefixToInfix
// Direct conversion using stack
// Scan expression from right to left
// Time Complexity: O(n)

import java.util.*;

class PrefixToInfix {

    static String prefixToInfix(String exp) {
        Stack<String> st = new Stack<>();

        // Traverse from right to left
        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);

            // 1. If operand, push to stack
            if (Character.isLetterOrDigit(ch)) {
                st.push(ch + "");
            }
            // 2. If operator
            else {
                String left = st.pop();
                String right = st.pop();

                String combined = "(" + left + ch + right + ")";
                st.push(combined);
            }
        }

        // 3. Final infix expression
        return st.peek();
    }

    public static void main(String[] args) {
        String prefix = "*+abc";
        System.out.println("Infix: " + prefixToInfix(prefix));
    }
}
