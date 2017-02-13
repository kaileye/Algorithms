package LeetCode.TwoSum;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//Naive implementation 
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sumPair = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int n = i + 1; n < nums.length; n++) {
                if (nums[i] + nums[n] == target) {
                    sumPair[0] = i;
                    sumPair[1] = n;
                }
            }
        }
        return sumPair;
    }
} 

//Better, O(n) implementation
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}