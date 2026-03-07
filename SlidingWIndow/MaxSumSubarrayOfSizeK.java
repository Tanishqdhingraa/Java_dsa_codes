package SlidingWIndow;
//todo https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
public class MaxSumSubarrayOfSizeK {

    public static int maxSubarraySum(int[] arr, int k) {

        int n = arr.length;
        int sum = 0;

        // Step 1: First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxsum = sum;

        // Step 2: Slide window
        for (int i = k; i < n; i++) {

            sum -= arr[i - k]; // remove left
            sum += arr[i]; // add right

            maxsum = Math.max(maxsum, sum);
        }

        return maxsum;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 3;

        int result = maxSubarraySum(arr, k);

        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}
