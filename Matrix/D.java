package Matrix;

//!  Second way of Output in 2d array 
public class D {
    public static void main(String[] args) {
        int[][] arr = {{6,2,0,7,6},{1,3,7,2,2},{9,9,4,5,2}};

        for (int i = 0; i < 3; i++) {// ! rows
        for (int j = 0; j < 4; j++) { // ! columns
            System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
