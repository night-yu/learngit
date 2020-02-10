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
    class colorNode{
        char color;
        TreeNode Node;
        public colorNode(TreeNode _node, char _color) {
            this.color = _color;
            this.Node = _node;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList();
        List<Integer> res = new ArrayList();
        Deque <colorNode> stack = new LinkedList<colorNode>();
        stack.push(new colorNode(root, 'W'));
        while(!stack.isEmpty()) {
            colorNode tmp = stack.pop();
            if(tmp.color=='W') {
                if(tmp.Node.right != null) stack.push(new colorNode(tmp.Node.right, 'W'));
                stack.push(new colorNode(tmp.Node, 'G'));
                if(tmp.Node.left != null) stack.push(new colorNode(tmp.Node.left, 'W'));
            } else {
                res.add(tmp.Node.val);
            }
        }
        return res;
    }
}
// @lc code=end

