import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        if(n == 0) {
            return res;
        }
        String str = "";
        recursive(0, 0, res, str, n);
        return res;
    }

    private void recursive(int left, int right, List<String> res, String str, int n) {
        if(left == n && right == n) {
            res.add(str);
            return;
        }
        if(left < n) {
            recursive(left + 1, right, res, str+'(', n);
        } 
        if (left > right && right < n) {
            recursive(left, right+1, res, str+')', n);
        }
    }
}
// @lc code=end

