package LeetCode.LongestPalindromicSubstring;

/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
Example:

Input: "cbbd"

Output: "bb"
*/

// Naive, recursive solution
public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int left = 0, right = s.length() - 1;
        boolean palindrome = true;
        while (right > left) {
            if (s.charAt(left) != s.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (palindrome) {
            return s;
        } else {
            String s1 = longestPalindrome(s.substring(0, s.length() - 1));
            String s2 = longestPalindrome(s.substring(1, s.length()));
            return s1.length() > s2.length() ? s1 : s2;
        }
    }
}

