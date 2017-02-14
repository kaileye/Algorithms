package LeetCode.AddDigits;

// Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

// Brute force implementation
public class Solution {
    public int addDigits(int num) {
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += (num % 10);
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}

// Algorithmic implementation (solution always follows mod 9 pattern)
public class Solution {
    public int addDigits(int num) {
        return num == 0 ? 0 : (num % 9 == 0 ? 9 : num % 9);
    }
}