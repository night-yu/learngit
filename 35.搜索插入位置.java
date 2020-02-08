/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    private int len;
    public int searchInsert(int[] nums, int target) {
        this.len = nums.length;
        if(len == 0) {
            return 0;
        }
        int left = 0;
        int right = len - 1;
        int mid = 0;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
// @lc code=end

