package LeetCode.MissingNumber;

/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.
*/

// Math solution
public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return nums.length * (nums.length + 1) / 2 - sum;
    }
}

// Bitwise solution
public class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor ^ nums.length;
    }
}