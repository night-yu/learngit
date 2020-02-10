import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=150 lang=java
 *
 * [150] 逆波兰表达式求值
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        Deque <Integer> stack = new LinkedList<Integer>();
        for(String item : tokens) {
            if(item.equals("+")) {
                stack.push(stack.poll() + stack.poll());
            } else if(item.equals("-")) {
                stack.push(-stack.poll() + stack.poll());
            } else if (item.equals("*")) {
                stack.push(stack.poll() * stack.poll());
            } else if(item.equals("/")) {
                int tmp = stack.poll();
                stack.push(stack.poll()/tmp);
            } else {
                stack.push(Integer.parseInt(item));
            }
        }
        return stack.poll();
    }
}
// @lc code=end

