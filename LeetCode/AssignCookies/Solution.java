package LeetCode.AssignCookies;

/*
Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie. 
Each child i has a greed factor gi, which is the minimum size of a cookie that the child will be content with; and each cookie j has a size sj.
If sj >= gi, we can assign the cookie j to the child i, and the child i will be content. 
Your goal is to maximize the number of your content children and output the maximum number.
*/

// Initial solution
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int cookiePointer = 0;
        int contentChildren = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i : g) {
            while (cookiePointer < s.length) {
                if (s[cookiePointer] >= i) {
                    contentChildren++;
                    cookiePointer++;
                    break;
                }
                cookiePointer++;
            }
        }
        return contentChildren;
    }
}

// Cleaner solution (can just return i pointer as solution)
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for (int j = 0; i < g.length && j < s.length; j++) {
            if (s[j] >= g[i]) {
                i++;
            }
        }
        return i;
    }
}