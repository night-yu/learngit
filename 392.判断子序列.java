/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int lens = s.length();
        int lent = t.length();
        
        int ptrs = 0;
        int ptrt = 0;
        while(ptrs < lens && ptrt < lent) {
            if(s.charAt(ptrs) == t.charAt(ptrt)) {
                ptrs ++;
                ptrt ++;
            } else {
                ptrt++;
            }
        }
        return ptrs == lens;
    }
}
// @lc code=end

