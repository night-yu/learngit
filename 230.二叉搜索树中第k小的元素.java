/*
 * @lc app=leetcode.cn id=230 lang=java
 *
 * [230] 二叉搜索树中第K小的元素
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
    public int kthSmallest(TreeNode root, int k) {
      LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
  
      while (true) {
        while (root != null) {
          stack.add(root);
          root = root.left;
        }
        root = stack.removeLast();
        if (--k == 0) return root.val;
        root = root.right;
      }
    }
  }
// @lc code=end

