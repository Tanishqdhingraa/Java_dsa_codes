package Matrix;

//! Transpose of matrix
public class Tranpose {

    public static void main(String[] args) {

        int[][] arr = {
                { 2, 6, 3},
                { 4, 8, 0},
                { 2, 6, 13}
        };

        transpose(arr);
    }

    public static void transpose(int[][] arr) {

        int m = arr.length; // rows
        int n = arr[0].length; // columns

        int[][] trans = new int[n][m];

        //!Transposing the matrix 
        //! swappinng the i and j only 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                trans[j][i] = arr[i][j];
            }
        }

        //! Print transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}