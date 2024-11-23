package main.java.org.example;

// https://leetcode.com/problems/maximum-average-subarray-i/
// Sliding window algorithm

public class MaxAverageSubarray {

    public double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return (double) maxSum/k;
    }
}
