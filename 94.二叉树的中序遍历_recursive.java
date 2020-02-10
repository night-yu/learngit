import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList();
        Deque<Integer> stack = new LinkedList<>();
        recursive(root, stack);
        //List<Integer> res = new ArrayList<>();
        return new ArrayList(stack);
    }

    private void recursive(TreeNode root, Deque stack) {
        if(root == null) return;
        recursive(root.left, stack);
        stack.add(root.val);
        recursive(root.right, stack);
    }
}
// @lc code=end

