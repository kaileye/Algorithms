package LeetCode.MaxConsecutiveOnes;

// Return number of max consecutive ones in binary array

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currentmax = 0;
        
        for (int i : nums) {
            if (i == 1) {
                currentmax++;
                max = Math.max(max, currentmax);
            } else if (i == 0) {
                currentmax = 0;
            }
        }
        return max;
    }
}