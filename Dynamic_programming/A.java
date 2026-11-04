package Dynamic_programming;
//! recursion + memorization 
public class A {
    
        public int fib(int n) {
            int[] dp = new int[n + 1];
            return fibo(n, dp);
        }

        public int fibo(int n, int[] dp) {
            if (n <= 1)
                return n;
            //! if present in array
            if (dp[n] != 0)
                return dp[n];
            //! not present so we are calculating
            int ans = fibo(n - 1, dp) + fibo(n - 2, dp);
            //! storing in an array
            dp[n] = ans;

            return ans;
        }
    }
