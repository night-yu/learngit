/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 0) {
            return false;
        } else {
            int k = 0;
            for(int i=0; k < nums.length && i<nums.length;i++) {
                if(i > k) {
                    return false;
                } else {
                    k = Math.max(k, i+nums[i]);
                }
            }
            return true;
        }
        
    }
}
// @lc code=end

