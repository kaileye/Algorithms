package LeetCode.RomanToInteger;

/*
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
*/

public class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int prev = Integer.MAX_VALUE;
        int curr = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'I':
                    curr = 1;
                    break;
                case 'V':
                    curr = 5;
                    break;
                case 'X':
                    curr = 10;
                    break;
                case 'L':
                    curr = 50;
                    break;
                case 'C':
                    curr = 100;
                    break;
                case 'D': 
                    curr = 500;
                    break;
                case 'M':
                    curr = 1000;
                    break;
            }
            sum += curr <= prev ? curr : curr - 2 * prev;
            prev = curr;
        }
        return sum;
    }
}