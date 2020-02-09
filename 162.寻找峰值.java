/*
 * @lc app=leetcode.cn id=162 lang=java
 *
 * [162] 寻找峰值
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 0) {
            return 0;
        } 
        int l = 0;
        int r = nums.length - 1;
        int mid;
        while(l < r) {
            mid = l + (r - l)/2;
            if(nums[mid] > nums[mid + 1]) {
                r = mid;
            } else {
                l = mid+1;
            }
        }
        return l;
    }
}
// @lc code=end

