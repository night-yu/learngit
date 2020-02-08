/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        if(len <= 1) {
            return;
        }
        int count = 0;
        for(int i=0; i<len; i++) {
            if(nums[i] == 0) {
                count ++;
            } else {
                int tmp = nums[i-count];
                nums[i - count] = nums[i];
                nums[i] = tmp;
            }
        }
    }
}
// @lc code=end

