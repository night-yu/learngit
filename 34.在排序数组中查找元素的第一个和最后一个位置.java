/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    private int len;
    public int[] searchRange(int[] nums, int target) {
        this.len = nums.length;
        if(len == 0) {
            return new int [] {-1, -1};
        }
        int left = findLeft(nums, target);
        int right = findRight(nums, target);
        return new int [] {left, right};
    }

    private int findLeft(int [] nums, int target) {
        int l = 0;
        int r = len;
        int mid = 0;
        while(l < r) {
            mid = l + (r - l) /2;
            if(target == nums[mid]) {
                r = mid;
            } else if (target < nums[mid]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        // l 的取值区间为[0，len) , 循环终止时，l == r which is l == len
        // 最后return的是l，所以l == len可能越界，因此要check l == len
        if(l == len) return -1;
        return nums[l] == target ? l:-1;
    }

    private int findRight(int [] nums, int target) {
        int l = 0;
        int r = len;
        int mid = 0;
        while(l < r) {
            mid = l + (r - l) / 2;
            if(nums[mid] == target) {
                l = mid + 1;
            } else if (target < nums[mid]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        // l 的取值区间为[0，len) , 循环终止时，l == r which is l == len
        // 最后return的是l - 1，所以l == 0可能越界，因此要check l == 0
        if(l == 0) return -1;
        return nums[l-1] == target? l - 1 : -1;
    }
}
// @lc code=end

