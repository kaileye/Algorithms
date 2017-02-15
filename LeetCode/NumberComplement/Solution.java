package LeetCode.NumberComplement;

// Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
// Ex: 5 is 101, complement is 010, so output 2


// Naive implementation
public class Solution {
    public int findComplement(int num) {
        char[] binary = Integer.toBinaryString(num).toCharArray();
        int sum = 0;
        int bit = 1;
        for (int i = 0; i < binary.length; i++) {
            binary[i] = binary[i] == '0' ? '1' : '0';
        }
        for (int i = binary.length - 1; i >= 0; i--) {
            sum += bit * (binary[i] - '0');
            bit *= 2;
        }
        return sum;
    }
}

// Much cooler solution
public class Solution {
    public int findComplement(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }
}