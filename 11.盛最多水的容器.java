/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        if(len == 2) {
            return Math.min(height[0],height[1]) * 1;
        } else {
            int l = 0;
            int r = len-1;
            int max = 0;
            while(l!=r) {
                max = Math.max(max, (r-l)*Math.min(height[l],height[r]));
                if(height[l] <= height[r]) {
                    l ++;
                } else {
                    r --;
                }
            }
            return max;
        }
    }
}
// @lc code=end

