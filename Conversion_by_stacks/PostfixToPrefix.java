// Top 4 things to keep in mind

// Scan postfix left to right.
// Operands are pushed to stack as strings.
// On operator, pop right first, then left.
// Form "operator + left + right" and push back.


// PostfixToPrefix
// Direct conversion using stack
// No infix or prefix intermediate steps
// Time Complexity: O(n)

import java.util.*;

class PostfixToPrefix {

    static String postfixToPrefix(String exp) {
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

                String combined = ch + left + right;
                st.push(combined);
            }
        }

        // 3. Final prefix expression
        return st.peek();
    }

    public static void main(String[] args) {
        String postfix = "ab+c*";
        System.out.println("Prefix: " + postfixToPrefix(postfix));
    }
}
