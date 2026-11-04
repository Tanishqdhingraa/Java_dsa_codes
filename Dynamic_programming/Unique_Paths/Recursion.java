public class Recursion {
     // Function to solve the problem using recursion
    private int func(int i, int j) {
        // Base case
        if (i == 0 && j == 0) return 1;

        // If we go out of bounds, there are no ways
        if (i < 0 || j < 0) return 0;
        
        // Recursive calls for up and left moves
        int up = func(i - 1, j);
        int left = func(i, j - 1);
        
        // Store the result and return
        return  up + left;
    }
    
    // Function to count total unique paths
    public int uniquePaths(int m, int n) {
    
    return func(m - 1, n - 1);
    }
}
