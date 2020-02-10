import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层次遍历
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
/*class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            List<Integer> tmp = new LinkedList<>();
            int cnt = queue.size();
            for (int i = 0; i < cnt; i++) {
                TreeNode node = queue.poll();
                // System.out.println(node.val);
                if (depth % 2 == 0) tmp.add(node.val);
                else tmp.add(0, node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(tmp);
            depth++;
        }
        return res;
    }
}*/

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList();
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        List<List<Integer>> res = new ArrayList();
        stack.push(root);
        int depth = 0;
        while(!stack.isEmpty()) {
            List<Integer> ans = new LinkedList<Integer>();
            int cnt = stack.size();
            for(int i = 0; i < cnt; i++) {
                TreeNode tmp = stack.pop();
                if(depth % 2 == 0) ans.add(tmp.val);
                else ans.add(0, tmp.val);
                if(tmp.left != null) stack.add(tmp.left);
                if(tmp.right != null) stack.add(tmp.right);
            } 
            res.add(ans);
            depth += 1;
        }
        return res;
    }
}
// @lc code=end

