/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除排序数组中的重复项 II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1) {
            return nums.length;
        }
        int len = nums.length;
        
        int l = 1;
        int r = l + 1;
        while ( r < len) {
            if(nums[r] != nums[l - 1]) {
                l ++;
                
                nums[l] = nums[r];
            }
            r ++;
        }
        return l + 1;
    }
}
// @lc code=end

