public class MaximumSubArraySum {
    // Largest possible sum of a sequence of consequtive value in the array

    // SubArray means => array that is inside another array and it should be
    // contigeous

    // Sample Input
    // arr = {1, 2, -5, 4, 3, 8, 5}

    // Sample Output
    // 4
    public static int MaximumSum(int[] arr) {
        int maxSum = arr[0];
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (sum < 0) {
                sum = arr[i];
            } else {
                sum += arr[i];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, -5, 4, 3, 8, 5 };
        int maxSum = MaximumSum(arr);
        System.out.println(maxSum);
    }
}
