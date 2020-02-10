import java.util.Deque;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=71 lang=java
 *
 * [71] 简化路径
 */

// @lc code=start
class Solution {
    public String simplifyPath(String path) {
        Deque <String> stack = new LinkedList<>();
        for(String item:path.split("/")) {
            if(!stack.isEmpty() && item.equals("..")) stack.pop();
            else if (!item.equals("..") && !item.equals(".") && !item.isEmpty()) stack.push(item);
        }
        String res = "";
        for(String d : stack) res = "/" + d + res;
        return res.isEmpty() ? "/":res;
    }
}
// @lc code=end

