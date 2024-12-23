package Coding_Practice;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};

        int maxSum = kadane(arr);
        System.out.println("Maximum Sum Subarray: " + maxSum);
    }

    public static int kadane(int[] arr) {
        int maxSum = arr[0];  // Initialize maxSum with the first element
        int currentSum = arr[0];  // Initialize currentSum with the first element

        // Iterate over the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            currentSum=Math.max(arr[i],currentSum+arr[i]);
           maxSum= Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
