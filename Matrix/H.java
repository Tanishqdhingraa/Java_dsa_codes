package Matrix;

//! minelement in array 
public class H {
    public static void main(String[] args) {

        int[][] arr = {
                { 6, 2, 0, 7, 6 },
                { 1 , 3, 7, 2, 2 },
                { 9, 9, 4, 5, 2 }
        };

        int minelement = arr[0][0];

        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr[i].length; j++) { // columns
                if (arr[i][j] < minelement) {
                    minelement = arr[i][j];
                }
            }
        }

        System.out.println("minelement in array  -> " + minelement);
    }
}