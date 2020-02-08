import java.util.ArrayList;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    private char[][] key = new char[][]{{},{},{'a','b','c'},{'d','e','f'},
                                            {'g','h','i'}, {'j','k','l'},
                                            {'m','n','o'}, {'p','q','r','s'},
                                            {'t','u','v'}, {'w','x','y','z'}};
    private StringBuilder str = new StringBuilder();

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(digits.length() == 0) {
            return res;
        }
        int len = digits.length();
        recursive(0,len, res, digits);
        return res;
    }
    private void recursive(int depth, int len, List<String> res, String digits) {
        if(depth == len) {
            res.add(str.toString());
            return;
        }
        
        for(int i=0; i<key[digits.charAt(depth) - '0'].length; i++) {
            
            str.append(key[digits.charAt(depth) - '0'][i]);
            recursive(depth+1, len, res, digits);
            str.deleteCharAt(depth);
        }
    }
}
// @lc code=end

