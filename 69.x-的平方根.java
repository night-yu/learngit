/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if(x == 0) {
            return 0;
        }
        if(x < 4) {
            return 1;
        }
        long left = 0;
        long right = x / 2;
        long mid;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(Math.pow(mid, 2) == x) {
                return (int) mid;
            } else if(Math.pow(mid, 2) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) left-1;
    }
}
// @lc code=end

