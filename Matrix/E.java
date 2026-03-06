package Matrix;

import java.util.Scanner;

//! Taking input in 2D array
public class E {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = 3;
        int cols = 4;

        int[][] arr1 = new int[rows][cols];

        // Input of array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Printing of array
        for (int i = 0; i < rows; i++) { // rows
            for (int j = 0; j < cols; j++) { // columns
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        sc.close(); // Close scanner
    }
}