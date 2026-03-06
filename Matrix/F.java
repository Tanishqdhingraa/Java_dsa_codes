package Matrix;

//! SUM OF ALL ELEMENTS 2D array
public class F {
    public static void main(String[] args) {

        int[][] arr = {
                { 6, 2, 0, 7, 6 },
                { 1, 3, 7, 2, 2 },
                { 9, 9, 4, 5, 2 }
        };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr[i].length; j++) { // columns
                sum += arr[i][j];
            }
        }

        System.out.println("SUM OF ALL ELEMENTS -> " + sum);
    }
}