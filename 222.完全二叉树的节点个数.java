/*
 * @lc app=leetcode.cn id=222 lang=java
 *
 * [222] 完全二叉树的节点个数
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int left_height = 0;
        int right_height = 0;
        TreeNode l = root;
        TreeNode r = root;
        while(l != null) {
            left_height++;
            l = l.left;
        }
        while(r != null) {
            right_height ++;
            r = r.right;
        }
        if(left_height == right_height) return (int)Math.pow(2, left_height) - 1;
        else {
            return countNodes(root.left) + countNodes(root.right) +1;
        }
    }
}
// @lc code=end

