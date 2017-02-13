package LeetCode.HammingDistance;

// The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

// Can also use Integer.bitCount() to find number of one bits in binary

public class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while (xor != 0) {
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }
}