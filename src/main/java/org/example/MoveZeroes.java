package main.java.org.example;

// https://leetcode.com/problems/move-zeroes/

public class MoveZeroes {

    public int[] moveZeroes(int[] nums) {

        int firstPointer = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        swap(nums, i, j);
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public void swap (int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
