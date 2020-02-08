/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<Character>();
        Hashtable<Character,Character> table = new Hashtable<Character, Character>();
        table.put('{', '}');
        table.put('(',')');
        table.put('[',']');
        if (s.length() == 0) {
            return true;
        }
        char []arr = s.toCharArray();

        for(int i=0;i<s.length();i++) {
            if(table.containsKey(arr[i])) {
                stack.push(arr[i]);
            } else {
                if (stack.empty()) {
                    return false;
                } else if (table.get(stack.peek()) != arr[i]) {
                    return false;
                } else {
                    stack.pop();
                }

            }
        }
        if (!stack.empty()) {
            return false;
        }
        return true;
    }
}
// @lc code=end

