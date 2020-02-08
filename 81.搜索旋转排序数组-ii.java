/*
 * @lc app=leetcode.cn id=81 lang=java
 *
 * [81] 搜索旋转排序数组 II
 */

// @lc code=start
class Solution {
    private int len;
    public boolean search(int[] nums, int target) {
        this.len = nums.length;
        if(len == 0) return false;
        int left = 0;
        int right = len - 1;
        int mid = 0;
        while( left <= right) {
            mid = left + (right - left) / 2;

            if(nums[mid] == target) return true;
            while(left < mid && nums[left] == nums[mid]) left++;
            while(right > mid && nums[right] == nums[mid]) right--;
            if(nums[left] <= nums[mid]) {   // *
                if(target < nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if(target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
// @lc code=end

