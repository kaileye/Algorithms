package LeetCode.SingleNumber;

// Given an array of integers, every element appears twice except for one. Find that integer.

public class Solution {
    public int singleNumber(int[] nums) {
        int singlenum = 0;
        for (int i : nums) {
            singlenum ^= i;
        }
        return singlenum;
    }
}
