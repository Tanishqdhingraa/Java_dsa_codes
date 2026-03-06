package Matrix;

//! Find the row with maximum sum (tell the row number and sum too ) 
public class I {
    public static void main(String[] args) {

        int[][] arr = {
                { 6, 2, 0, 7, 6 },
                { 1, 3, 7, 2, 2 },
                { 9, 9, 4, 5, 2 }
        };
        int maxsum = 0;
        int rownumber = -1;
        for (int i = 0; i < arr.length; i++) { //rows
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) { //columns
                sum+=arr[i][j];//!Sum of individual row 
            }
            if(sum > maxsum){
                maxsum = sum;
                rownumber = i;
            }
        }
        System.out.println(maxsum);
        System.out.println(rownumber);

    }
}