package Matrix;

//!  Output in 2d array 
public class B {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        
        for (int i = 0; i < 3; i++) {//! rows
            for (int j = 0; j < 4; j++) { //! columns
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
