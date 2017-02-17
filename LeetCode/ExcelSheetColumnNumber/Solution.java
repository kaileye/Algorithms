package LeetCode.ExcelSheetColumnNumber;

/*
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
*/

// Initial solution
public class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        char[] col = s.toCharArray();
        for (int i = 0; i < col.length; i++) {
            sum += (col[col.length - i - 1] - 'A' + 1) * Math.pow(26, i);
        }
        return sum;
    }
}

// Without using Math.pow
public class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum * 26 + s.charAt(i) - 'A' + 1;
        }
        return sum;
    }
}