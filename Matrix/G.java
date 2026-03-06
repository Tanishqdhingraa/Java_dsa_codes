package Matrix;

//! maxelement in array 
public class G {
    public static void main(String[] args) {

        int[][] arr = {
                { 6, 2, 0, 7, 6 },
                { 1, 3, 7, 2, 2 },
                { 9, 9, 4, 5, 2 }
        };

        int maxelement = arr[0][0];

        for (int i = 0; i < arr.length; i++) { // rows
            for (int j = 0; j < arr[i].length; j++) { // columns
                if(arr[i][j] > maxelement){
                    maxelement = arr[i][j];
                }
            }
        }

        System.out.println("maxelement in array  -> " + maxelement);
    }
}