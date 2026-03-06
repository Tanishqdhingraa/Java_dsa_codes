package Matrix;


// Find the minimum element out of all the maximum elements of 
// each row
public class J {
    public static void main(String[] args) {
    
    int[][] arr = {
        { 6, 2, 0, 7, 6 },
        { 1, 3, 7, 2, 2 },
        { 9, 9, 4, 5, 2 }
        };

        int minOfMax = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            //! Step 1: Find max of current row
            int rowMax = arr[i][0];

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > rowMax) {
                    rowMax = arr[i][j];
                }
            }

            //! Step 2: Update minimum among row maximums
            if (rowMax < minOfMax) {
                minOfMax = rowMax;
            }
        }

        System.out.println("Minimum among row maximums -> " + minOfMax);
    }
}
