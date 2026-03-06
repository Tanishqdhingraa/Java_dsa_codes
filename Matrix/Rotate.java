package Matrix;

public class Rotate {

    // Function 1: Transpose matrix (in-place)
    public static void transpose(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    // Function 2: Reverse each row
    public static void reverseRows(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    // Utility function to print matrix
    public static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Original Matrix:");
        printMatrix(arr);

        //! Step 1: Transpose
        transpose(arr);

        //! Step 2: Reverse each row
        reverseRows(arr);

        System.out.println("\nMatrix After 90° Clockwise Rotation:");
        printMatrix(arr);
    }
}