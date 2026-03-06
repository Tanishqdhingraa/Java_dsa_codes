package Matrix;

//! Column wise printing in 2d array 
public class K {
    public static void main(String[] args) {

        int[][] arr = {
                { 6, 2, 0, 7, 6 },
                { 1, 3, 7, 2, 2 },
                { 9, 9, 4, 5, 2 }
        };

        int m = arr.length, n = arr[0].length;
        for(int j=0;j<n;j++){ // cols
            for(int i=0;i<m;i++){ // rows
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
        
    }
}