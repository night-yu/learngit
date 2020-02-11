import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=173 lang=java
 *
 * [173] 二叉搜索树迭代器
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
class BSTIterator {
    class colorNode {
        public char color;
        public TreeNode node;
        public colorNode(TreeNode _node, char _color) {
            this.color = _color;
            this.node = _node;
        }
    }
    private Deque<colorNode> stack;
    public BSTIterator(TreeNode root) {
        this.stack = new LinkedList<colorNode>();
        if(root != null) {
            stack.push(new colorNode(root, 'w'));
        }
    }
    
    /** @return the next smallest number */
    public int next() {
        while(!stack.isEmpty()) {
            colorNode aux = stack.pop();
            
            if(aux.color == 'w') {
                if(aux.node.right != null) stack.push(new colorNode(aux.node.right, 'w'));
                stack.push(new colorNode(aux.node,'g'));
                if(aux.node.left != null) stack.push(new colorNode(aux.node.left, 'w'));
            } else {
                return aux.node.val;
            }
        }
        return -1;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
// @lc code=end

