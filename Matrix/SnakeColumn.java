package Matrix;

public class SnakeColumn {

    public static void snakeColumn(int[][] arr) {

        int m = arr.length; // rows
        int n = arr[0].length; // columns

        for (int j = 0; j < n; j++) {

            if (j % 2 == 0) {
                //! top to bottom
                for (int i = 0; i < m; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                //! bottom to top
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }

            System.out.println(); //! optional (for clean format)
        }
    }

    public static void main(String[] args) {

        int[][] arr = {
                { 2, 6, 3, 15, 12 },
                { 4, 8, 0, 16, 2 },
                { 2, 6, 13, 70, 1 }
        };

        snakeColumn(arr);
    }
}