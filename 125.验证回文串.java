/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() <= 1) {
            return true;
        }
        int i=0;
        int j=s.length() - 1;
        char[] aux = s.toCharArray();
        while(i < j) {
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))) {
                j --;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
// @lc code=end

