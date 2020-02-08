/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    private int len;
    public int search(int[] nums, int target) {
        this.len = nums.length;
        if(len == 0) {
            return -1;
        } else if (len == 1 && nums[0] != target) {
            return -1;
        }
        int start = 0;
        int end = len - 1;
        int mid = 0;
        while(start <= end) {
            mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[start] <= nums[mid]) {
                if(target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
// @lc code=end

