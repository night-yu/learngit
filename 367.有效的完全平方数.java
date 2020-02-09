/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        else if(num <= 3) return false;
        int l = 0;
        int r = num / 2;
        int mid = 0;
        long sq = 0;
        while(l <= r) {
            mid = l  + (r - l)/2;
            sq = (long)Math.pow(mid, 2);
            if(sq == num) return true;
            else if (num < sq) r = mid - 1;
            else l = mid + 1; 
        }
        return false;
    }
}
// @lc code=end

