import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

import org.graalvm.compiler.core.common.util.IntList;

/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [144] 二叉树的后序遍历
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
    class colorNode{
        char color;
        TreeNode node;
        public colorNode(TreeNode _node, char _color) {
            this.color = _color;
            this.node = _node;
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList();
        Deque<colorNode>stack = new LinkedList<colorNode>();
        List<Integer> res = new ArrayList<Integer>();
        stack.push(new colorNode(root, 'w'));
        while(!stack.isEmpty()) {
            colorNode tmp = stack.pop();
            if(tmp.color == 'w') {
                stack.push(new colorNode(tmp.node,'g'));
                if(tmp.node.right != null) stack.push(new colorNode(tmp.node.right, 'w'));
                if(tmp.node.left != null) stack.push(new colorNode(tmp.node.left, 'w'));
                //stack.push(new colorNode(tmp.node,'g'));
            } else {
                res.add(tmp.node.val);
            }
        }
        return res;
    }
}
// @lc code=end

