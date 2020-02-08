/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int above = m - 1;
        int below = n - 1;
        int empty = nums1.length - 1;
        while (above >= 0 && below >= 0) {
            if (nums1[above] <= nums2[below]) {
                nums1[empty] = nums2[below];
                below -- ;
            } else {
                nums1[empty] = nums1[above];
                above --;
            }
            empty --;
        }
        while(empty >= 0 && below >= 0) {
            nums1[empty] = nums2[below];
            below --;
            empty --;
        }
    }
}
// @lc code=end

