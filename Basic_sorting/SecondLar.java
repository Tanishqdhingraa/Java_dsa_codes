package Basic_sorting;

class SecondLar {

    public static int secondLargest(int[] arr) {

        if (arr.length < 2) {
            return -1; // Not possible
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            // Update largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // If no valid second largest found
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 5, 8, 20 };

        System.out.println(secondLargest(arr));
    }
}
