package Stacks;

import java.util.*;

public class Main {

    /*
     * Monotonic Stack (Decreasing)
     * Edge cases:
     * 1) No greater element → -1
     * 2) Last element → -1
     * 3) Duplicate elements → handled by <=
     */

    static int[] nextGreaterRight(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = { 4, 5, 2, 10, 8 };

        int[] ans = nextGreaterRight(arr);

        System.out.println(Arrays.toString(ans));
    }
}
