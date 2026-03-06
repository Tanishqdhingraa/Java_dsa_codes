package Matrix;
// ! Print the rows in snake pattern 
public class Snake {

    public static void snake(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {

            if (i % 2 == 0) {
                //! left to right (Normal printing )
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                //! right to left (Reverse Printing )
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }

            System.out.println(); //! Move to next line after each row
        }
    }

    public static void main(String[] args) {

        int[][] arr = {
                { 2, 6, 3, 15, 12 },
                { 4, 8, 0, 16, 2 },
                { 2, 6, 13, 70, 1 }
        };

        snake(arr);
    }
}