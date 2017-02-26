package LeetCode.SymmetricTree;

/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
*/

//Recursive solution
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isEqual(root.left, root.right);
    }
    
    public boolean isEqual(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        } else {
            return left.val == right.val && isEqual(left.left, right.right) && isEqual(left.right, right.left);
        }
    }
}

//Iterative solution
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null || right == null) {
                if (left != right) {
                    return false;
                }
            } else if (left.val != right.val) {
                return false;
            } else {
                queue.offer(left.left);
                queue.offer(right.right);
                queue.offer(left.right);
                queue.offer(right.left);
            }
        }
        return true;
    }
}