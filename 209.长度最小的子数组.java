/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        if(len == 0) {
            return 0;
        }
        int l = 0;
        int r = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(r < len) {
            sum += nums[r];
            r++;
            while(sum >= s) {
                min = Math.min(min, r-l);
                sum -= nums[l];
                l++;
            }
        }
        return min == Integer.MAX_VALUE ? 0:min;
    }
}
// @lc code=end

